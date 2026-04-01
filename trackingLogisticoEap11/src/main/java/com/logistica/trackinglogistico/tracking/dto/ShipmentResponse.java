package com.logistica.trackinglogistico.tracking.dto;

import java.time.LocalDateTime;

public class ShipmentResponse {

    private Long id;
    private String trackingId;
    private String senderName;
    private String receiverName;
    private String status;
    private LocalDateTime createdAt;

    public ShipmentResponse() {
    }

    public ShipmentResponse(Long id, String trackingId, String senderName, String receiverName, String status, LocalDateTime createdAt) {
        this.id = id;
        this.trackingId = trackingId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}