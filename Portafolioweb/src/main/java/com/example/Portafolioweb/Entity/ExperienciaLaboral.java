/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Arai
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExperienciaLaboral {
    @Id
    private Integer id;
    private String nombredeEmpresa;
    private String puesto;
    private String descripcion;
    private Date fechaFinal;
    private String tipoEmpleo;
    @ManyToOne (fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "persona_id", insertable = false, updatable = false)
    private Persona persona;
    @Column(name = "persona_id")
    private String persona_id;
   
}
