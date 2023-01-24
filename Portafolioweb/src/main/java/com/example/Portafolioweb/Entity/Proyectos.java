/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Entity;

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
public class Proyectos {
   @Id
   private Integer id;
   private String nombre;
   private String descripcion;
   private String url_imagen;
   private String url_repository;
   private String url_demo;
   private Persona persona_id;
}
