/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoclases;
import java.util.Scanner; //import de la clase Scanner

/**
 *
 * @author yahir
 */
public class Areas {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);//se crea un objeto Scanner
    int d1;
    int d2;
    float b;
    float h;
    float A;
    
    
    
    System.out.print("Introduzca el primer dato: ");
    d1=sc.nextInt();
    
    System.out.print("Introduzca el segundo dato: ");
    d2=sc.nextInt();
    
    if (d1>d2){
    System.out.print("Introduce la base");
    b=sc.nextFloat();
    System.out.print("Introduce la altura");
    h=sc.nextFloat();
    A=b*h;
    System.out.println("El area del rectangulo es:"+ A);
    if (A>20){
        System.out.println("Hoy esta soleado ");
        if (A>21 && A<40){
            System.out.println("Hoy esta nublado ");
        }
        if (A>41){
            System.out.println("Error ");
        }
    }
    }
        else
    {
     System.out.print("Introduce la base ");
     b=sc.nextFloat();
     System.out.print("Introduce la altura ");
     h=sc.nextFloat();
     A=(b*h)/2;
     System.out.println("El area del triangulo es: "+ A);
       if (A>20){
        System.out.println("Hoy esta soleado ");
        if (A>21 && A<40){
            System.out.println("Hoy esta nublado ");
        }
        if (A>41){
            System.out.println("Error ");
            }
        }
     
}
  }  
}    
