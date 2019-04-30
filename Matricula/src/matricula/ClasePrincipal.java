/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

import java.util.Scanner;
import porcentaje.*;
/**
 *
 * @author royerjmasache
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables e importanción
        float costo = 1330;
        int ciudad = 0;
        int edad = 0;
        int civil = 0;
        int carga = 0;
        float tramite = 0;
        float costof = 0;
        float descuento1 = Porcentaje.descuentoc;
        float descuento2 = Porcentaje.descuentoe;
        float descuento3 = Porcentaje.descuentoec;
        float descuento4 = Porcentaje.descuentof;
        // Entrada de datos
        System.out.println("Ingrese la ciudad de origen:\n"
                + "1. Loja o Zamora\n2. Otra ciudad");
        ciudad = entrada.nextInt();
        System.out.println("Ingrese la edad del estudiante:");
        edad = entrada.nextInt();
        System.out.println("Ingrese el estado civil del estudiante:\n"
                + "1. Soltero\n2. Casado");
        civil = entrada.nextInt();
        System.out.println("Ingrese el número de hijos del estudiante:");
        carga = entrada.nextInt();
        // Estructura lógica condicional
        if(ciudad == 1){
            // Cálculo del descuento por ciudad
            costof = costo - descuento1;
        } else {
            if(ciudad == 2){
                costof = costo;
            }
        }
        if(edad >= 17 || edad <20){
            // Cálculo del descuento por edad
            costof = costof - descuento2;
        } else {
            if(edad < 17 || edad >20){
                costof = costof;
            }
        }
        if(civil == 1){
            costof = costof;
        } else {
            if(civil == 2){
                // Cálculo del descuento por estado civil
                costof = costof - descuento3;
            }
        }
        if(carga >= 1){
            // Cálculo del descuento por carga familiar
            costof = costof - descuento4;
        } else {
            if(carga == 0){
                costof = costof;
            } 
        }
        // Cálculo del impuesto de los trámites
        costof = (float) (costof + (costof * 0.02));
        // Presentación del costo final de la matrícula
        System.out.printf("El costo de la matrícula es de: %.2f", costof);
    }   
}
