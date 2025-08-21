package com.luispractica.id.aplicacion.springboot_id.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;

@Component
public class Repo_Productos_Imp implements ProductoRepositorio{
    List<Productos> datos;
    
    public Repo_Productos_Imp(){
        this.datos = Arrays.asList(new Productos(001L, "Disco duro 1TB", 500),
                                    new Productos(002L, "Memoria USB 20TB", 150),
                                    new Productos(003L, "Raton Logitec", 50),
                                    new Productos(004L, "Monitor Asus", 1200));
    }
    @Override
    public List<Productos> findAll(){
        return datos;
    }

    @Override
    public Productos buscaId(long idProducto) {
            return datos.stream()
                    .filter(p->p.getIdProducto()
                    .equals(idProducto))
                    .findFirst()
                    .orElseThrow();
    }
}
