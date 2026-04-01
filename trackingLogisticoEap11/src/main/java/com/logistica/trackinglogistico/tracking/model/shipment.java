package com.logistica.trackinglogistico.tracking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "envio")
public class shipment {

    @Id
    @Column(name = "idenvio")
    private int id;

    @Column(name = "numseguimiento", nullable = false, unique = true)
    private int trackingId;

    @Column(name = "idoperador", nullable = false)
    private int idOperator;

    @Column(name = "idpaquete", nullable = false)
    private int idPackage;

    @Column(name = "estado", nullable = false)
    private String status;

    @Column(name = "fecharegistro", nullable = false)
    private LocalDateTime createdAt;

    public shipment() {
    }

    public int getId() {
        return id;
    }

    public int getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(int trackingId) {
        this.trackingId = trackingId;
    }

    public int getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(int idOperator) {
        this.idOperator = idOperator;
    }

    public int getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(int idPackage) {
        this.idPackage = idPackage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}