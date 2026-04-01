package com.logistica.trackinglogistico.tracking.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateShipmentRequest {

    @NotBlank
    private int idOperator;

    @NotBlank
    private int idPackage;

    public CreateShipmentRequest() {
    }

    public int getSenderName() {
        return idOperator;
    }

    public void setSenderName(Integer senderName) {
        this.idOperator = senderName;
    }

    public int getReceiverName() {
        return idPackage;
    }

    public void setReceiverName(Integer receiverName) {
        this.idPackage = receiverName;
    }
}

