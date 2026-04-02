package com.logistica.trackinglogistico.orders.model;

import com.logistica.trackinglogistico.users.model.Person;
import jakarta.persistence.*;

@Entity
@Table(name = "paquete")
public class Package {

    @Id
    @Column(name = "idpaquete")
    private Integer idPaquete;

    @ManyToOne
    @JoinColumn(name = "idremitente", nullable = false)
    private Person remitente;

    @ManyToOne
    @JoinColumn(name = "iddestinatario", nullable = false)
    private Person destinatario;

    @Column(name = "peso", nullable = false)
    private Double peso;

    public Package() {
    }

    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Person getRemitente() {
        return remitente;
    }

    public void setRemitente(Person remitente) {
        this.remitente = remitente;
    }

    public Person getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Person destinatario) {
        this.destinatario = destinatario;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}