/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Vector; 

/**
 *
 * @author bruno
 */
public class VariablesAsignaturas {
    
    private String asignatura;
    private int trimestre; 
    public double E1, E2, E3, E4, prom;

    public VariablesAsignaturas() {
    }

    public VariablesAsignaturas(String asignatura, int trimestre, double E1, double E2, double E3, double E4, double prom) {
        this.asignatura = asignatura;
        this.trimestre = trimestre;
        this.E1 = E1;
        this.E2 = E2;
        this.E3 = E3;
        this.E4 = E4;
        this.prom = prom;
    }

    public VariablesAsignaturas(String asignatura, int calificacion, int trimestre) {
        this.asignatura = asignatura;
        this.trimestre = trimestre;
    }

    public double getE1() {
        return E1;
    }

    public void setE1(double E1) {
        this.E1 = E1;
    }

    public double getE2() {
        return E2;
    }

    public void setE2(double E2) {
        this.E2 = E2;
    }

    public double getE3() {
        return E3;
    }

    public void setE3(double E3) {
        this.E3 = E3;
    }

    public double getE4() {
        return E4;
    }

    public void setE4(double E4) {
        this.E4 = E4;
    }
    
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }
    
    public void eva1(double calificacion){
        this.E1 = calificacion * 0.1; 
    }
    public void eva2(double calificacion){
        this.E2 = calificacion * 0.2 ; 
    }
    public void eva3(double calificacion){
        this.E3 = calificacion*0.3 ; 
    }
    public void exam(double calificacion){
        this.E4 = calificacion * 0.4 ; 
    }
    public void prom(){
        this.prom = (E4 + E3 + E2 + E1)/4; 
    }
    
    
    
}
