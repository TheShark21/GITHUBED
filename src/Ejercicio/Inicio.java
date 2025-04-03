/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author Alumnos DAW
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        Empresa miEmpresa = new Empresa("FloriTECH");
        
        //==================================================================
        //          DATOS PARA INICIALIZAR EL PROGAMA  
        Departamento direccion = new Departamento("Direccion");
        Departamento contabilidad = new Departamento("Contabilidad");
        Departamento desarrollo = new Departamento("Programacion");
        
        miEmpresa.agregarDepartamento(direccion);
        miEmpresa.agregarDepartamento(contabilidad);
        miEmpresa.agregarDepartamento(desarrollo);
        
        
        Empleado empleado1 = new Director("Ana Boton", 10);
        Empleado empleado2 = new Contable("Pepita Billetes", 5);

        miEmpresa.agregarEmpleado(empleado1);
        miEmpresa.agregarEmpleado(empleado2);
        
        
        //==================================================================
        

        do {
            System.out.println("");
            System.out.printf("===================== %s ====================\n",miEmpresa.getNombre());
            
            miEmpresa.listarDepartamentos();
            System.out.println("----------------------------------------------------------");
            miEmpresa.listarEmpleados();
            System.out.println("----------------------------------------------------------");

            
            
            System.out.println("1. Nuevo Empleado");
            System.out.println("2. Iniciar trabajo");
            System.out.println("3. Salir");
            System.out.println("================================================");
            System.out.print("Dime tu opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.println("\nCreando Nuevo Empleado");
                    System.out.print("  >Nombre:");
                    String nombre = teclado.nextLine();
                    System.out.print("  >Experiencia:");
                    int experiencia = Integer.parseInt(teclado.nextLine());
                    System.out.print("  >Tipo de empleado [D|C|P]:");
                    char tipoEmp = teclado.nextLine().charAt(0);
                    
                    Empleado empleado;
                    
                    if (tipoEmp == 'D') {
                        empleado = new Director(nombre,experiencia);
                        miEmpresa.agregarEmpleado(empleado);
                        
                    }
                    else if (tipoEmp == 'C') {
                        empleado = new Contable(nombre,experiencia);
                        miEmpresa.agregarEmpleado(empleado);
                    }
                    else if (tipoEmp == 'P') {
                        empleado = new Programador(nombre,experiencia);
                        miEmpresa.agregarEmpleado(empleado);
                    }
                    else{
                        System.out.println("No hay ningun puesto que corresponda.");
                    }
                    
                    break;
                     
                case 2:
                    miEmpresa.iniciarJornada();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Numeros entre 1 y 3");
                    break;
            }
        } while (opcion != 3);
   }
   
}
