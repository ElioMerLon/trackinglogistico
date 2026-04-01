package com.logistica.trackinglogistico.tracking.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateShipmentRequest {

    @NotBlank
    private String senderName;

    @NotBlank
    private String receiverName;

    public CreateShipmentRequest() {
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}

