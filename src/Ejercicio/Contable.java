/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public class Contable extends Empleado {

    public Contable(String nombre, int experiencia) {
        super(nombre, experiencia);
        this.sueldoBase = Empresa.sueldoBaseContable;
    }
    
    @Override
    public double calcularSalario(){
        return this.sueldoBase;
    }
    
    @Override
    public String toString(){
        return String.format("%s  %.2f€",super.toString(),this.calcularSalario());
    }
    
    @Override
    public void trabajar(){
        System.out.printf("%s -->contabilizando facturas!",this.nombre);
    }
    
    
    
    
    
}
