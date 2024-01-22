package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table(name="salidas")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalida;
    private LocalDate fSalida;
    private LocalTime hSalida;
   @ManyToOne
   @JoinColumn(name="matricula", nullable = false, foreignKey = @ForeignKey(name="FK_salidas_barco"))
    private Barco barco;

    @ManyToOne
    @JoinColumn(name="dni", nullable = false, foreignKey = @ForeignKey(name="FK_salidas_patron"))
    private Patron patron;
}
