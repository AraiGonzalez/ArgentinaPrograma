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
public class Educacion {
    @Id
    private Integer id;
    private String universidad;
    private String titulo;
    private String url_image;
    private Date fechaInicio;
    private Date fechaFinal;
    private Persona persona_id;
}
