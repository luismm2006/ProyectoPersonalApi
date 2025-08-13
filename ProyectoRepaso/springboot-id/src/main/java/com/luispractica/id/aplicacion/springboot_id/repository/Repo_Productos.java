package com.luispractica.id.aplicacion.springboot_id.repository;

import java.util.Arrays;
import java.util.List;

import com.luispractica.id.aplicacion.springboot_id.models.Productos;

public class Repo_Productos {
    List<Productos> datos;

    public Repo_Productos(){
        this.datos = Arrays.asList(new Productos(001L, "Disco duro 1TB", 500),
                                    new Productos(002L, "Memoria USB 20TB", 150),
                                    new Productos(003L, "Raton Logitec", 50),
                                    new Productos(004L, "Monitor Asus", 1200));
    }
    public List<Productos> findAll(){
        return datos;
    }

    public Productos buscaId(Long idProducto){
        return datos.stream()
                    .filter(p->p.getIdProducto()
                    .equals(idProducto))
                    .findFirst()
                    .orElseThrow();
    }
}
