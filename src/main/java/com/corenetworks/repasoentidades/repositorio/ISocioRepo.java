package com.corenetworks.repasoentidades.repositorio;

import com.corenetworks.repasoentidades.modelo.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISocioRepo extends JpaRepository<Socio,String> {
//    @Query("SELECT s FROM Socio s WHERE s.direccion = 'Alpedrete'")
//    List<Socio> obtenerSociosAlpedrete();
//    @Query("SELECT s FROM Socio s ORDER BY s.nombre ASC")
//    List<Socio> obtenerSociosOrdenadosNombre();
//
//    @Query("SELECT s.direccion, COUNT(*) FROM Socio s GROUP BY s.direccion")
//    List<Object[]> obtenerSociosAgrupadosPorDireccion();


}
