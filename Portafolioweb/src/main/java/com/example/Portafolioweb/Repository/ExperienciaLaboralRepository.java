/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Portafolioweb.Repository;

import com.example.Portafolioweb.Entity.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arai
 */
@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Integer> {

   
}
