
package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Karly
 */

@Data
@Entity
@Table(name="estado")

public class Cliente implements Serializable{
    
    private static final long serialVersionUId = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado; //Si lo ponemos asi idCliente lo que pasa que esa C en mauscula pasaa minuscula
                            //y sepone un guio entonces queda asi id_cliente
    String nombre;
    String capital;
    String poblacion;
    String idioma;

    public Cliente() {
    }

    public Cliente(Long idEstado, String nombre, String capital, String poblacion, String idioma) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
    }

    
    
    
}
