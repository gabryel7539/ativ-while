/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativwhile;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ativwhile {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         Scanner scanner = new Scanner(System.in);


        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        int contador = 0;

        while (contador < 10) {
        System.out.print("Solicite um número " + (contador + 1) + ": ");
        int numero = scanner.nextInt();

        if (numero > maior) {
        segundoMaior = maior;
        maior = numero;
        } else if (numero > segundoMaior) {
        segundoMaior = numero;
        }

        contador++;
        }
   
        System.out.println("O Número Maior é: " + maior);
        System.out.println("O segundo maior número é: " + segundoMaior);
    }
}
