package com.springsimplespasos.universidad.universidad_backend;

import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Alumno;
import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Direccion;
import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Persona;
import com.springsimplespasos.universidad.universidad_backend.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversidadBackendApplication {

    @Autowired
    private AlumnoDAO servicio;

    public static void main(String[] args) {
        SpringApplication.run(UniversidadBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return args -> {
            Direccion direccion = new Direccion("calle nombre", "123", "1623", "", "", "Morelia");
            Persona alumno = new Alumno(null,"Raul", "Perez", "12345678", direccion);

            Persona save = servicio.save(alumno);
            System.out.println(save.toString());
        };
    }
}
