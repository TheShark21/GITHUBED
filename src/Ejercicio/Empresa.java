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
public class Empresa {
    private String nombre;
    private ArrayList<Departamento> listaDeparta;
    private ArrayList<Empleado> listaEmpleados;
    public static int sueldoBaseDirector=100000;
    public static int sueldoBaseContable=30000;
    public static int sueldoBaseProgrmador=50000;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaDeparta = new ArrayList();
        this.listaEmpleados = new ArrayList();
    }
    
    public void listarDepartamentos(){
        for (Departamento d : listaDeparta) {
            System.out.println(d);
        }
    }
    
    public void listarEmpleados(){
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }
    }
    
    public void agregarDepartamento(Departamento d){
        listaDeparta.add(d);
    }
    
     public Departamento buscarDep(String nombre){
         for (Departamento d : listaDeparta) {
             if (d.getNombre().equalsIgnoreCase(nombre)) {
                 return d;
             }
         }
         return null;
    }
    
    public void agregarEmpleado(Empleado e){
        
        if (e instanceof Director) {
           Departamento dep = this.buscarDep("Direccion");
           dep.agregarEmpleado(e);
           listaEmpleados.add(e);
        }
        if (e instanceof Contable) {
            Departamento dep = this.buscarDep("Contabilidad");
            dep.agregarEmpleado(e);
            listaEmpleados.add(e);
        }
        if (e instanceof Programador) {
            Departamento dep = this.buscarDep("Programacion");
            dep.agregarEmpleado(e);
            listaEmpleados.add(e);
        }
        
    }
    
    public void iniciarJornada(){
        System.out.println("");
        System.out.println("..........................................");
        for (Empleado e : listaEmpleados) {
            e.trabajar();
            System.out.println("");
        }
        System.out.println("..........................................");
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
    
    
}
