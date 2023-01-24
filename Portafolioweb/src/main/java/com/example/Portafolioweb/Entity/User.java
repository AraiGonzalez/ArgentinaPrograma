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
public class User {
   @Id
   private Integer id;
   private String email;
   private String password;
   private Date fechaDeCreacion;
   private Persona persona_id;
}
