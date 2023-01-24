/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Entity;

import java.util.Date;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Arai
 */
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
    private Date fechaInicio;
    private Date fechaFinal;
    private Persona persona_id;
    private String tipoEmpleo;
}
