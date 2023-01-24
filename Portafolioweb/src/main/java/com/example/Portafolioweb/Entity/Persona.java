/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Entity;
import lombok.Getter;

import java.util.Date;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
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

public class Persona {
    @Id
    private Integer id;
    private String nombre;
    private String titulo;
    private String descripcion;
    private String url_foto;
    private Date fechaDeNacimiento;
    private String telefono;
    private String email;
    private String sobre_mip1;
    private String sobre_mip2;
    
}
