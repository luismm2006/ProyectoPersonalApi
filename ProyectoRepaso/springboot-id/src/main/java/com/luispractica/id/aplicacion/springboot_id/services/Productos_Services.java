package com.luispractica.id.aplicacion.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;
import com.luispractica.id.aplicacion.springboot_id.repository.Repo_Productos;

public class Productos_Services {

    private Repo_Productos repositorio = new Repo_Productos();

    public List<Productos> findAll(){

        return repositorio.findAll().stream().map(p-> {
            Double precioTotal = p.getPrecio() * 1.50d;
            Productos nuevoPrecio = new Productos(p.getIdProducto(), p.getNombre(), precioTotal.intValue());
            return nuevoPrecio;
        }).collect(Collectors.toList());
    }
 
    public Productos buscaId(Long idProducto){

        return repositorio.buscaId(idProducto);
    }    
}
