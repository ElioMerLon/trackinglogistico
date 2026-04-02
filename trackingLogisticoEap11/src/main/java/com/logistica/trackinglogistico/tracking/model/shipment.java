package com.logistica.trackinglogistico.tracking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "envio")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idenvio")
    private Integer id;

    @Column(name = "numseguimiento", nullable = false, unique = true)
    private Integer trackingId;

    @Column(name = "idoperador", nullable = false)
    private Integer idOperator;

    @Column(name = "idpaquete", nullable = false)
    private Integer idPackage;

    @Column(name = "estado", nullable = false)
    private String status;

    @Column(name = "fecharegistro", nullable = false)
    private LocalDateTime createdAt;

    public Shipment() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(Integer trackingId) {
        this.trackingId = trackingId;
    }

    public Integer getIdOperator() {
        return idOperator;
    }

    public void setIdOperator(Integer idOperator) {
        this.idOperator = idOperator;
    }

    public Integer getIdPackage() {
        return idPackage;
    }

    public void setIdPackage(Integer idPackage) {
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