package com.logistica.trackinglogistico.tracking.model;

import com.logistica.trackinglogistico.orders.model.Package;
import com.logistica.trackinglogistico.users.model.Operator;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "envio")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idenvio")
    private Integer id;

    @Column(name = "numseguimiento", unique = true)
    private Integer trackingId;

    @ManyToOne
    @JoinColumn(name = "idoperador")
    private Operator operador;

    @ManyToOne
    @JoinColumn(name = "idpaquete")
    private Package paquete;

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

    public Operator getIdOperator() {
        return operador;
    }

    public void setIdOperator(Operator operador) {
        this.operador = operador;
    }

    public Package getIdPackage() {
        return paquete;
    }

    public void setIdPackage(Package paquete) {
        this.paquete = paquete;
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