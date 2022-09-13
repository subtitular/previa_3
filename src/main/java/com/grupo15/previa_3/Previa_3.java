/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupo15.previa_3;

import com.grupo15.Exceptions.HandledException;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author tecnologia7
 */
public class Previa_3 {
    private static final String OUT_OF_RANGE_EXCEPTION = "EXCEPCIÓN FUERA DE RANGO";
    private static final double kGramo2Onza = 0.03527395339;
    private static final double kGramo2Libra = 0.00220462262;
    public static void main(String[] args) throws HandledException {
        int gramos;
        double kilos;
        double libras;
        double onzas;
 
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el valor en gramos que desea convertir");
        try {
            gramos=leer.nextInt();
            kilos = (double) gramos / 1000;
            libras = gramo2Libra(gramos);
            onzas =gramo2Onza(gramos);
            System.out.println(MessageFormat.format("{0} gramos equivale a {1} kilos",gramos,kilos));
            System.out.println(MessageFormat.format("{0} gramos equivale a {1} libras",gramos,libras));
            System.out.println(MessageFormat.format("{0} gramos equivale a {1} onzas",gramos,onzas)); 
        } catch (HandledException e) {
            System.out.println("Code: "+e.getCode()+" Exception Message : "+e.getMessage());
        }
    }
    
    private static double gramo2Onza(int gramos) throws HandledException {
        if(gramos < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("La cantidad {0} en gramos no puede ser negativo",gramos));
        }
        return gramos*kGramo2Onza;
    }
    
    private static double gramo2Libra(int gramos) throws HandledException {
        if(gramos < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("La cantidad {0} en gramos no puede ser negativo",gramos));
        }
        return gramos*kGramo2Libra;
    }
    
}
