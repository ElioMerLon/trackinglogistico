package com.logistica.trackinglogistico.tracking.dto;


import jakarta.validation.constraints.NotNull;

public class CreateShipmentRequest {

    @NotNull
    private int idOperator;

    @NotNull
    private int idPackage;

    public CreateShipmentRequest() {
    }

    public int getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(Integer idOperator) {
        this.idOperator = idOperator;
    }

    public int getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(Integer idPackage) {
        this.idPackage = idPackage;
    }
}

