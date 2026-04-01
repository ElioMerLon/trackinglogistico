package com.logistica.trackinglogistico.tracking.dto;


import jakarta.validation.constraints.NotNull;

public class CreateShipmentRequest {

    @NotNull
    private int idOperator;

    @NotNull
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

