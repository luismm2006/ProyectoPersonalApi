package com.luispractica.id.aplicacion.springboot_id.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;
import com.luispractica.id.aplicacion.springboot_id.services.ProductoServicios;



@RestController
@RequestMapping("/api")
public class Product_Controller {

    @Autowired
    private  ProductoServicios servicio;

    @GetMapping()
    public List<Productos> ListaProductos(){
        return servicio.findAll();
    }

    @GetMapping("/{idProducto}")
    public Productos mostrar(@PathVariable long idProducto){
        return servicio.buscaId(idProducto);
    }

}
