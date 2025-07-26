
package com.mycompany.mavenproject1;
import java.util.Scanner; 


/**
 *
 * Realizar un programa que te verifique si es que apruebas o no la asignatura. Se deben ingresar 3 o 4 calificaciones con ponderaciones (0.1, 0.2, 0.3 y 0.4).
 * Si es que el usuario solamente ingresa tres, dar la calificacion final que necesita 
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Registro de calificaciones");
        
        // asignacion funcion Scanner
        Scanner leer = new Scanner(System.in);
        // Creacion Clase opcionesMenu
        OpcionesMenu op = new OpcionesMenu();
        // Creacion clase VariablesAsignaturas
        VariablesAsignaturas var = new VariablesAsignaturas();
        
        int opciones; 
        
        do{ 
            
            System.out.println("##############################################");
            System.out.println("Bienvenido Bruno al registro de calificaciones");
            System.out.println("##############################################");
            System.out.println("####Presiona cualquier tecla para ingresar####");
            System.out.println("##############################################");
            
            
            System.out.println("#####################################################");
            System.out.println("Elige cual de las siguientes opciones deseas acceder ");
            System.out.println("#####################################################");
            
            System.out.println("#####################################################");
            System.out.println("##########1. Registro de calificaciones##############");
            System.out.println("#######2. Revision de calificaciones historico#######");
            System.out.println("#####3. Revision de calificaciones por trimestre#####");
            System.out.println("####4. Revision de calificaciones por asignatura#####");
            System.out.println("######################5. Salir#######################");
            System.out.println("#####################################################"); 
            
            opciones = leer.nextInt();
            
            switch(opciones){
                case 1: 
                    
                    
                    op.insertTrimestre();
                    int trimestre = leer.nextInt();
                    var.setTrimestre(trimestre);
                    
                    op.insertAsignatura();
                    String nombre = leer.nextString();
                    var.setAsignatura(nombre);
                    
                    op.insertNumEva();
                    int numEva = leer.nextInt();
                    
                    System.out.println("Ingrese la calificacion: ");
                    double calificacion = leer.nextDouble();
                    if (numEva == 1){
                        var.eva1(calificacion);  
                    } if (numEva == 2){
                        var.eva2(calificacion); 
                    } if (numEva == 3){
                        var.eva3(calificacion);
                    } if (numEva == 3){
                        var.eva3(calificacion);
                    } 
                    break;
            }
        } while (opciones !=5);
                
        
    }
}

