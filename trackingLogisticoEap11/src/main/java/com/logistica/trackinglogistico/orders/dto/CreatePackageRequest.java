package com.logistica.trackinglogistico.orders.dto;

import jakarta.validation.constraints.NotNull;

public class CreatePackageRequest {

    @NotNull
    private Integer idRemitente;

    @NotNull
    private Integer idDestinatario;

    @NotNull
    private Double peso;

    public Integer getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(Integer idRemitente) {
        this.idRemitente = idRemitente;
    }

    public Integer getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(Integer idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}