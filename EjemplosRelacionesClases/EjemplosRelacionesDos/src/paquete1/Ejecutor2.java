/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir el nombre del barrio: ");
        String a = leer.nextLine();
        Barrio barrio = new Barrio(a);
        
        System.out.println("Escribir el nombre de la persona: ");
        String nom = leer.nextLine();
        System.out.println("Escribir la cedula de la persona: ");
        String ced = leer.nextLine();
        Persona p = new Persona(nom,ced,barrio);
        
        System.out.printf("%s\n",p);
    }
}
