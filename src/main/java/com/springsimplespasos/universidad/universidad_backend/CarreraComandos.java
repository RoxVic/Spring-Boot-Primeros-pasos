package com.springsimplespasos.universidad.universidad_backend;

import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidad_backend.repositorios.CarreraRepository;
import com.springsimplespasos.universidad.universidad_backend.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarreraComandos  implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
//        Carrera ingSistemas = new Carrera(null, "Ingenieria en sistemas", 50, 5);
//        Carrera save = servicio.save(ingSistemas);
//        System.out.println("Carrera en sistemas: " + save.toString());
        /*Carrera ingSistemas = new Carrera(null, "ingenieria en sistemas", 60, 5);
        Carrera ingIndustrial = new Carrera(null, "ingenieria industrial", 55, 5);
        Carrera ingAlimentos = new Carrera(null, "ingenieria en alimentos", 53, 5);
        Carrera ingElectronica = new Carrera(null, "ingenieria Electronica", 45, 4);
        Carrera licSistemas = new Carrera(null, "licenciatura en sistemas", 30, 3);
        Carrera licTurismo = new Carrera(null, "licenciatura en turismo", 20, 5);
        Carrera liccontabilidad = new Carrera(null, "licenciatura en contabilidad", 30, 7);

        servicio.save(ingSistemas);
        servicio.save(ingIndustrial);
        servicio.save(ingAlimentos);
        servicio.save(ingElectronica);
        servicio.save(licTurismo);
        servicio.save(liccontabilidad);
        servicio.save(licSistemas);*/

        List<Carrera> carreras = (List<Carrera>)servicio.findAll();
        System.out.println("Carreras encontradas");
        carreras.forEach(System.out::println);
    }
}
