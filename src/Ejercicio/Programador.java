/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public class Programador extends Empleado {
    private double bonusExperiencia;

    public Programador(String nombre, int experiencia) {
        super(nombre, experiencia);
        this.sueldoBase = Empresa.sueldoBaseProgrmador;
        this.bonusExperiencia = 2000;
    }
    
    @Override
    public double calcularSalario(){
        return this.sueldoBase + (this.experiencia * this.bonusExperiencia);
    }
    
    @Override
    public String toString(){
        return String.format("%s  %.2f€",super.toString(),this.calcularSalario());
    }
    
    @Override
    public void trabajar(){
         System.out.printf("%s -->estoy picando código",this.nombre);
    }
    
    
}
