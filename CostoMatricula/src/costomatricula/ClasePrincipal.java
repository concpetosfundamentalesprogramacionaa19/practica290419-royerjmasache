/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costomatricula;

import porcentajes.Porcentajes;
import java.util.Scanner;
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
        float costof = 0;
        float ciudad = 0;
        float edad = 0;
        float estado = 0;
        float cargas = 0;
        float descuento1 = Porcentajes.descuentoc;
        float descuento2 = Porcentajes.descuentoe;
        // Ingreso de datos
        System.out.println("Ingrese la ciudad del estudiante:\n"
                + "1. Loja o Zamora\n2. Otra ciudad");
        ciudad = entrada.nextInt();
        System.out.println("Ingrese la edad del estudiante");
        edad = entrada.nextInt();
        if(ciudad == 1){
            costof = (float) costo - descuento1;
        } else {
            if(ciudad == 2){
                costof = costo;
            } else {
                if(edad >= 17 || edad < 20){
                    costof = (float) costof - descuento2;
                } else {
                    if(edad <17 || edad > 20){
                        costof = costof;
                    }
                    System.out.printf("El valor de la matrícula es de: %.2f",
                        costof);
                    }
                }
            }
        }
    }
