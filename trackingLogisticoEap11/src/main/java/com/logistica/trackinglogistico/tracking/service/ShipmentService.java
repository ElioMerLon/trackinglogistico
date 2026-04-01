package com.logistica.trackinglogistico.tracking.service;

import com.logistica.trackinglogistico.tracking.dto.CreateShipmentRequest;
import com.logistica.trackinglogistico.tracking.dto.ShipmentResponse;
import com.logistica.trackinglogistico.tracking.model.shipment;
import com.logistica.trackinglogistico.tracking.repository.ShipmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentService(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public ShipmentResponse createShipment(CreateShipmentRequest request) {
        shipment shipment = new shipment();
        shipment.setTrackingId(generateTrackingId());
        shipment.setSenderName(request.getSenderName());
        shipment.setReceiverName(request.getReceiverName());
        shipment.setStatus("REGISTERED");
        shipment.setCreatedAt(LocalDateTime.now());

        shipment savedShipment = shipmentRepository.save(shipment);

        return new ShipmentResponse(
                savedShipment.getId(),
                savedShipment.getTrackingId(),
                savedShipment.getSenderName(),
                savedShipment.getReceiverName(),
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
                shipment.getSenderName(),
                shipment.getReceiverName(),
                shipment.getStatus(),
                shipment.getCreatedAt()
        );
    }

    private String generateTrackingId() {
        return UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 12)
                .toUpperCase();
    }
}