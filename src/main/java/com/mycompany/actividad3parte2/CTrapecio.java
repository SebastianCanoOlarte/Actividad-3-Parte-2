/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3parte2;

/**
 *
 * @author Knoknozo
 */
public class CTrapecio {
    public static double CalcularArea(int altura, int B, int b){
        return (altura/2)*(B+b);
    }
    public static double CalcularPerimetro(int B, int b, int lado){
        return B+b+(2*lado);
    }
}
