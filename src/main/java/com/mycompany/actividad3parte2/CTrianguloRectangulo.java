/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte2;

/**
 *
 * @author Knoknozo
 */
public class CTrianguloRectangulo {
    public static double CalcularArea(int base,int altura){
        return (base*altura/2);
    }
    public static double CalcularHipotenusa(int base,int altura){
        return Math.pow(base*base+altura*altura,0.5);
    }
    
    public static double CalcularPerimetro(int base,int altura){
        return (base+altura+Math.pow(base*base+altura*altura,0.5));
    }
    public static String DeterminarTipoTriangulo(int base,int altura){
        String x;
        if((base==altura)&&(base==Math.pow(base*base+altura*altura,0.5))&&(altura==Math.pow(base*base+altura*altura,0.5))){
           x =  "Es un triangulo equilatero";
        }
        else if((base!=altura)&&(base!=Math.pow(base*base+altura*altura,0.5))&&(altura!=Math.pow(base*base+altura*altura,0.5))){
            x = "Es un triangulo escaleno";
        }
        else{
            x = "Es un triangulo isosceles";
        }
        return x;
    }
}
