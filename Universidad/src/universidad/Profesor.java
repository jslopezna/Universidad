/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author ESTUDIANTE
 */
public class Profesor extends Persona {
    private String profesion; 
    private double salario; 

    public Profesor(String profesion, double salario, String nombre, int edad) {
        super(nombre, edad);
        this.profesion = profesion;
        this.salario = salario;
    }
    
    
}
