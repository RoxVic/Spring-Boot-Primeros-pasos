package com.springsimplespasos.hibernate.pruebas;


import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Arrays;

public class MainManyToOne {
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        Persona juan = new Persona(null, "Juan");
        Persona pedro = new Persona(null, "Pedro");

        Telefono celularJuan = new Telefono(null, "1111111111");
        Telefono telefonoJuan = new Telefono(null, "222222222");

        celularJuan.setPersona(juan);
        telefonoJuan.setPersona(juan);

        juan.setTelefonos(Arrays.asList(telefonoJuan,  celularJuan));

        session.beginTransaction();

//        session.save(juan);
//        session.save(pedro);
        Persona persona = session.get(Persona.class, 3);
        persona.getTelefonos().forEach(t -> System.out.println(t.getNumero()));

        session.getTransaction().commit();

        session.close();
    }
}
