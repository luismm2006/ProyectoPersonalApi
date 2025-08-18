package com.luispractica.id.aplicacion.springboot_id.repository;

import java.util.List;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;

public interface  ProductoRepositorio {
    List<Productos> findAll();
    Productos buscaId(long idProducto);

}
