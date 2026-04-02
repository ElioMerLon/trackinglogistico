package com.logistica.trackinglogistico.tracking.service;

import com.logistica.trackinglogistico.tracking.dto.CreateShipmentRequest;
import com.logistica.trackinglogistico.tracking.dto.ShipmentResponse;
import com.logistica.trackinglogistico.tracking.model.Shipment;
import com.logistica.trackinglogistico.tracking.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public ShipmentResponse createShipment(CreateShipmentRequest request) {
        Shipment shipment = new Shipment();
        shipment.setTrackingId(generateTrackingId());
        shipment.setIdOperator(request.getIdOperator());
        shipment.setIdPackage(request.getIdPackage());
        shipment.setStatus("REGISTERED");
        shipment.setCreatedAt(LocalDateTime.now());

        Shipment savedShipment = shipmentRepository.save(shipment);

        return new ShipmentResponse(
                savedShipment.getId(),
                savedShipment.getTrackingId(),
                savedShipment.getIdOperator(),
                savedShipment.getIdPackage(),
                savedShipment.getStatus(),
                savedShipment.getCreatedAt()
        );
    }

    public ShipmentResponse getShipmentByTrackingId(Integer trackingId) {
        Shipment shipment = shipmentRepository.findByTrackingId(trackingId)
                .orElseThrow(() -> new RuntimeException("No se encontró el envío con trackingId: " + trackingId));

        return new ShipmentResponse(
                shipment.getId(),
                shipment.getTrackingId(),
                shipment.getIdOperator(),
                shipment.getIdPackage(),
                shipment.getStatus(),
                shipment.getCreatedAt()
        );
    }

    private Integer generateTrackingId() {
        return 100000 + new Random().nextInt(900000);
    }

    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}