package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.manytoone.Persona;
import com.springsimplespasos.hibernate.entidades.manytoone.Telefono;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class MainJPQL {
    public static void main(String[] args) {
        //SQL nativo SELECT * FROM personas WHERE codigo = ?

        Session session = HibernateUtil.getSeccionSessionFactory().openSession();

        Query query = session.createQuery("select p from Persona p where p.codigo = ?3");
        query.setParameter(3, Integer.parseInt("3"));

        Persona persona = (Persona) query.getSingleResult();
        System.out.println(persona.getNombre());

        //SELECT * FROM personas p JOIN telefonos t on p.codigo = t.codigo where p.codigo = ?
        Query queryDos = session.createQuery("select p.telefonos from Persona p where p.codigo = :codigo");
        queryDos.setParameter("codigo", Integer.parseInt("3"));

        List<Telefono> telefonos = (List<Telefono>) queryDos.getResultList();
        telefonos.forEach(telefono -> System.out.println(telefono.getNumero()));



        session.close();
    }
}
