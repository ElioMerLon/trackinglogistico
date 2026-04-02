package com.logistica.trackinglogistico.tracking.dto;

import java.time.LocalDateTime;

import com.logistica.trackinglogistico.orders.model.Package;
import com.logistica.trackinglogistico.users.model.Operator;

public class ShipmentResponse {

    private int id;
    private int trackingId;
    private Operator idOperator;
    private Package idPackage;
    private String status;
    private LocalDateTime createdAt;

    public ShipmentResponse(Integer id, Integer trackingId, Operator idOperator, Package idPackage, String status, LocalDateTime createdAt) {
        this.id = id;
        this.trackingId = trackingId;
        this.idOperator = idOperator;
        this.idPackage = idPackage;
        this.status = status;
        this.createdAt = createdAt;
    }

    


    public int getId() {
        return id;
    }

    public int getTrackingId() {
        return trackingId;
    }

    public Operator getIdOperator() {
        return idOperator;
    }

    public Package getIdPackage() {
        return idPackage;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}