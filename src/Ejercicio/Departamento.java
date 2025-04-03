/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList();
    }
    
    
    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
        empleado.setDepartamento(this);
    }
    
    
    private double calcularSalarioTotal(){
        double total = 0;
        for (Empleado empleado : listaEmpleados) {
            total = total + empleado.calcularSalario();
        }
        return total;
    }
    
    @Override
    public String toString(){
        return String.format("[%11s] %s %d empleados - %.2f€ 1salario total",this.nombre," ",this.listaEmpleados.size(),this.calcularSalarioTotal());
    }
    

    public String getNombre() {
        return nombre;
    }

  
    
    
    
    
}
