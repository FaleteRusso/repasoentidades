package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
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

    private double cuota;

    @ManyToOne
    @JoinColumn(name="dni", nullable = false, foreignKey = @ForeignKey(name = "FK_barcos_socio"))
    private Socio socio;

    public Barco(String matricula, int amarre, String nombre, double cuota) {
        this.matricula = matricula;
        this.amarre = amarre;
        this.nombre = nombre;
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", amarre=" + amarre +
                ", nombre='" + nombre + '\'' +
                ", cuota=" + cuota +
                '}';
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
