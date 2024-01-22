package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="barcos")
public class Barco {
    @Id
    @Column(length = 11)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double couta;

    @ManyToOne
    @JoinColumn(name="dni", nullable = false, foreignKey = @ForeignKey(name = "FK_barcos_socio"))
    private Socio socio;


}
