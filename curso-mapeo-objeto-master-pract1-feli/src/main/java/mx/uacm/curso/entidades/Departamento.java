/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Vividymau
 */
@Entity
@Table(name = "departamentos")
public class Departamento {
    
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "sec_dep", sequenceName = "departamento_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "sec_dep", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
}
