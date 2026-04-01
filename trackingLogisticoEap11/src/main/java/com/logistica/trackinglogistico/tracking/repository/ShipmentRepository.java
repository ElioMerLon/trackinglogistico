package com.logistica.trackinglogistico.tracking.repository;

import com.logistica.trackinglogistico.tracking.model.shipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<shipment, Long> {
    Optional<shipment> findByTrackingId(String trackingId);
}
