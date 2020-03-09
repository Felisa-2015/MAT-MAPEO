/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.uacm.curso.entidades.Departamento;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Felisa Dìaz 10-003-1195
 */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DepartamentoDAOTest {
    
    private static EntityManager em;
    
    private static DepartamentoDAO departamentoDAO;
    
    @BeforeAll
    public static void inicializar() {
        System.out.println("inicializar");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas-memoria");
        em = emf.createEntityManager();
        em.getTransaction().begin(); //iniciamos transaccion
        departamentoDAO = new DepartamentoDAOImpl(em);
    }
    
    @AfterAll
    //ejecuta despues de todos los tests
    public static void terminar(){
        System.out.println("terminar");
        //rollback regresa todo como estaba antes del test
        em.getTransaction().rollback();
    }
    
    @Test
    public void buscarDepartamentoTest(){
        
        Departamento d = departamentoDAO.buscarPorId(2);
        //checamos que la variable a no sea NULL
        Assertions.assertNotNull(d);
        Assertions.assertEquals(2,d.getId());
        System.out.println("id "+ d.getId());
        System.out.println("nombre : " + d.getNombre());
    }
    
    /*@Test
    public void guardarDepartamentoTest(){
        
        Departamento d = new Departamento();
        d.setNombre("mauricio");
        
        
        Departamento d2 = departamentoDAO.guardar(d);
        //verificamos que el articulo se guardo
        //revisamos que no sea null
        Assertions.assertNotNull(d2);
        //revisamos que tenga un id
        Assertions.assertNotNull(d2.getId());
        //revisamos que el contenido se guardo bien
        Assertions.assertEquals(d.getNombre(),d2.getNombre());
        
    }
    */
    
    
    
    
    
}
