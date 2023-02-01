/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Entity;
import lombok.Getter;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Arai
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)

public class Persona {
    @Id
    private Integer id;
    private String nombre;
    private String titulo;
    private String descripcion;
    private String url_foto;
    private Date fechaCreacion;
    private String telefono;
    private String sobre_mip1;
    private String sobre_mip2;
    private String email;
    private String password;
    @OneToMany (mappedBy = "persona")
    private List<Educacion> educacion;
    @OneToMany (mappedBy = "persona")
    private List<ExperienciaLaboral> expeienciaLaboral;
    @OneToMany (mappedBy = "persona")
    private List<Proyectos> proyectos;
    @OneToMany (mappedBy = "persona")
    private List<Skills> skills;
    
}
