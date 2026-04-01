package com.logistica.trackinglogistico.tracking.service;

import com.logistica.trackinglogistico.tracking.dto.CreateShipmentRequest;
import com.logistica.trackinglogistico.tracking.dto.ShipmentResponse;
import com.logistica.trackinglogistico.tracking.model.shipment;
import com.logistica.trackinglogistico.tracking.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public ShipmentResponse createShipment(CreateShipmentRequest request) {
        shipment shipment = new shipment();
        shipment.setTrackingId((int) generateTrackingId());
        shipment.setIdOperator(request.getSenderName());
        shipment.setIdPackage((int) request.getReceiverName());
        shipment.setStatus("REGISTERED");
        shipment.setCreatedAt(LocalDateTime.now());

        shipment savedShipment = shipmentRepository.save(shipment);

        return new ShipmentResponse(
                savedShipment.getId(),
                savedShipment.getTrackingId(),
                savedShipment.getIdOperator(),
                savedShipment.getIdPackage(),
                savedShipment.getStatus(),
                savedShipment.getCreatedAt()
        );
    }

    public ShipmentResponse getShipmentByTrackingId(String trackingId) {
        shipment shipment = shipmentRepository.findByTrackingId(trackingId)
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

    private long generateTrackingId() {
    long timestamp = System.currentTimeMillis();
    int random = new java.util.Random().nextInt(1000);
    return Long.parseLong(timestamp + "" + random);
}
}