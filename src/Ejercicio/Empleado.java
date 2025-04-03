/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public abstract class Empleado {
    protected int codigo;
    protected String nombre;
    protected int experiencia;
    protected double sueldoBase;
    protected Departamento departamento;
    protected static int contId = 1001;

    public Empleado(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.codigo = Empleado.contId;
        Empleado.contId ++;
    }
    
    @Override
    public String toString(){
        return String.format("id:%d   %15s(%d)   [%11s] ",this.codigo,this.nombre,this.experiencia, this.departamento.getNombre());
    }
    
    public abstract double calcularSalario();
    public abstract void trabajar();

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
    
}
