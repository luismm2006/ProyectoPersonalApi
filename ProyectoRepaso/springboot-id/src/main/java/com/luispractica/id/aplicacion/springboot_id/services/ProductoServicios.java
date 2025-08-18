package com.luispractica.id.aplicacion.springboot_id.services;

import java.util.List;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;

public interface ProductoServicios {

    List<Productos> findAll();
    Productos buscaId(long idProducto);
}
