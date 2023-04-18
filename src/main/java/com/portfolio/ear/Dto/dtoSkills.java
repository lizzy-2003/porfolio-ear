/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ear.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank
    private int porcentajeS;
    
    //Constructores

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, int porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }
    
    //Getters y Setters

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public int getPorcentajeS() {
        return porcentajeS;
    }

    public void setDescripcionS(int descripcionS) {
        this.porcentajeS = descripcionS;
    }
    
}
