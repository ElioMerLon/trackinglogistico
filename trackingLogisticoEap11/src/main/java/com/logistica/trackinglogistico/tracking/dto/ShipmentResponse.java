package com.logistica.trackinglogistico.tracking.dto;

import java.time.LocalDateTime;

public class ShipmentResponse {

    private int id;
    private int trackingId;
    private int idOperator;
    private int idPackage;
    private String status;
    private LocalDateTime createdAt;

    public ShipmentResponse(int id, int trackingId, int idOperator, int idPackage, String status, LocalDateTime createdAt) {
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

    public int getSenderName() {
        return idOperator;
    }

    public int getReceiverName() {
        return idPackage;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}