package com.logistica.trackinglogistico.tracking.controller;

import com.logistica.trackinglogistico.tracking.dto.RegisterShipmentRequest;
import com.logistica.trackinglogistico.tracking.dto.ShipmentResponse;
import com.logistica.trackinglogistico.tracking.dto.StatusUpdateRequest;
import com.logistica.trackinglogistico.tracking.model.Shipment;
import com.logistica.trackinglogistico.tracking.service.ShipmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @GetMapping("/ping")
    public String ping() {
        return "API funcionando";
    }

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }

    @GetMapping("/{trackingId}")
    public ShipmentResponse getShipmentByTrackingId(@PathVariable Integer trackingId) {
        return shipmentService.getShipmentByTrackingId(trackingId);
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ShipmentResponse registerShipment(@Valid @RequestBody RegisterShipmentRequest request) {
        return shipmentService.registerShipment(request);
    }

    @PatchMapping("/{trackingId}/status")
    public ShipmentResponse updateStatus(
            @PathVariable Integer trackingId,
            @Valid @RequestBody StatusUpdateRequest request
    ) {
        return shipmentService.updateStatus(trackingId, request);
    }
}