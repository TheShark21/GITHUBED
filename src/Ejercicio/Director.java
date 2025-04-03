/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public class Director extends Empleado {
    private double bonusExperiencia;
    private double bonus;

    public Director(String nombre, int experiencia) {
        super(nombre, experiencia);
        this.sueldoBase = Empresa.sueldoBaseDirector;
        this.bonus = 10000;
        this.bonusExperiencia = 5000;
    }
    
    @Override
    public double calcularSalario(){
        return this.sueldoBase+(this.experiencia*this.bonusExperiencia)+this.bonus;
    }
    
    @Override
    public String toString(){
        return String.format("%s  %.2f€",super.toString(),this.calcularSalario());
    }
    
    @Override
    public void trabajar(){
        System.out.printf("%s -->voy a dirigir",this.nombre);
    }
    
    
    
    
    
}
