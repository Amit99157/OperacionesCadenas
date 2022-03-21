package com.amit;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, frase1, frase2;
        frase1 = " ";
        frase2 = "";
        int numero, count;
        char caracter1, caracter2;
        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();
        frase = ' ' + frase;
        do {
            System.out.println("MENU: ");
            System.out.println("========================");
            System.out.println("1.- Contar palabras. ");
            System.out.println("2.- Iniciales. ");
            System.out.println("3.- Sustituir carácter. ");
            System.out.println("4.- Al revés. ");
            System.out.println("0.- Salir. ");
            System.out.print("Elige una opción: ");
            numero = entrada.nextInt();

            if (numero == 1) {
                count = 1;
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == ' ')
                        count++;
                }
                System.out.println("Número de palabras en la frase: "+ count);
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 2) {
                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == ' ') {
                        frase2 = String.valueOf(frase.charAt(i + 1)) + " ";
                        System.out.print(frase2.toUpperCase());
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 3) {
                System.out.println("Dame dos caracteres:");
                System.out.print("Dame caracter 1 : ");
                caracter1 = entrada.next().charAt(0);
                System.out.print("Dame caracter 2 : ");
                caracter2 = entrada.next().charAt(0);

            } else if (numero == 4) {
                for (int i = frase.length() - 1; i >= 0; i--) {
                    frase1 = frase1 + frase.charAt(i);
                }
                System.out.print("Al revés de su frase dada es: "+frase1);
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 0) {
            } else ;
        } while (numero != 0);
        entrada.close();
    }
}
