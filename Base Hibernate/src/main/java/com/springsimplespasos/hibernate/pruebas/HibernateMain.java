package com.springsimplespasos.hibernate.pruebas;

import com.springsimplespasos.hibernate.entidades.SimpleEntity;
import com.springsimplespasos.hibernate.util.HibernateUtil;
import javassist.Loader;
import org.hibernate.Session;

public class HibernateMain {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSeccionSessionFactory().openSession();
        session.beginTransaction();

        //Bloque insert
//        SimpleEntity simpleEntity = new SimpleEntity();
//        simpleEntity.setNombre("Nuevo");
//        session.save(simpleEntity);

        //Bloque update
//        SimpleEntity simpleEntity = new SimpleEntity();
//        simpleEntity.setCodigo(1);
//        simpleEntity.setNombre("Descripcion update");
//        session.update(simpleEntity);

        //Bloque Delete
//        SimpleEntity simpleEntity = new SimpleEntity();
//        simpleEntity.setCodigo(2);
//        session.delete(simpleEntity);

//        SimpleEntity entityRead = session.get(SimpleEntity.class, 1);
//        System.out.println(entityRead.getNombre());

        SimpleEntity entityNew = new SimpleEntity();
        entityNew.setNombre("Esta es una descripcion");

        SimpleEntity entityNew2 = new SimpleEntity();
        entityNew2.setCodigo(1);
        entityNew2.setNombre("Descripcion update 2");

        session.saveOrUpdate(entityNew);
        session.saveOrUpdate(entityNew2);



        session.getTransaction().commit();
        session.close();
    }

}
