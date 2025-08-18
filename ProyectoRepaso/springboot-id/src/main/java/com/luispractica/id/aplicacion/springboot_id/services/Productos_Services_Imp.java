package com.luispractica.id.aplicacion.springboot_id.services;

import java.util.List;
import java.util.stream.Collectors;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;
import com.luispractica.id.aplicacion.springboot_id.repository.Repo_Productos_Imp;

public class Productos_Services_Imp implements ProductoServicios{

    private Repo_Productos_Imp repositorio = new Repo_Productos_Imp();

    @Override
    public List<Productos> findAll(){

        return repositorio.findAll().stream().map(p-> {
            Double precioTotal = p.getPrecio() * 1.50d;
            Productos newProductos = (Productos)p.clone();
            newProductos.setPrecio(precioTotal.intValue());
            return newProductos;
        }).collect(Collectors.toList());
    }
    
    @Override
    public Productos buscaId(long idProducto) {
        return repositorio.buscaId(idProducto);
    }

        
}
