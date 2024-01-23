package com.corenetworks.repasoentidades.servicio;

import com.corenetworks.repasoentidades.modelo.Patron;
import com.corenetworks.repasoentidades.repositorio.IPatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatronServicioImpl implements IPatronServicio{
    @Autowired
    private IPatronRepo repo;
    @Override
    public List<Patron> mostrarTodos() {
        return repo.findAll();
    }

    @Override
    public Patron mostrarUno(String dni) {
        return repo.findById(dni).orElse(new Patron());
    }

    @Override
    public Patron insertar(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public Patron modificar(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public void eliminar(String dni) {
        repo.deleteById(dni);
    }
}
