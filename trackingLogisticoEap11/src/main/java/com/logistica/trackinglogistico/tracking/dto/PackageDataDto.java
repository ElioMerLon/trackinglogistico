package com.logistica.trackinglogistico.tracking.dto;

import jakarta.validation.constraints.NotNull;

public class PackageDataDto {

    @NotNull
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}