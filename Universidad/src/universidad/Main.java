/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            Scanner archivo = new Scanner (new File("Universidad.txt"));
            archivo.useDelimiter(";");
            Universiada universidad= new Universiada();
            while(archivo.hasNext()){
                String tipo = archivo.next();
                if (tipo.equals("p")){
                    String nombre= archivo.next(); 
                    int edad = archivo.nextInt();
                    String profesion= archivo.next();
                    double salario= archivo.nextDouble();
                    Profesor profesor= new Profesor(profesion, salario, nombre, edad);
                    Universiada.addPersona(profesor);
                }else{
                    
                }
                
            }
        } catch (FileNotFoundException ex) {
            
        }
        
       
    }

    
    
}
