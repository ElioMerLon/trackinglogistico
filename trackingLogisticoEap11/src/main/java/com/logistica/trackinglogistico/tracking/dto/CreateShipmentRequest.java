package com.logistica.trackinglogistico.tracking.dto;


import com.logistica.trackinglogistico.orders.model.Package;
import com.logistica.trackinglogistico.users.model.Operator;

import jakarta.validation.constraints.NotNull;

public class CreateShipmentRequest {

    @NotNull
    private Operator idOperator;

    @NotNull
    private Package idPackage;

    public CreateShipmentRequest() {
    }

    public Operator getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(@NotNull Operator idOperator) {
        this.idOperator = idOperator;
    }

    public Package getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(@NotNull Package idPackage) {
        this.idPackage = idPackage;
    }
}

