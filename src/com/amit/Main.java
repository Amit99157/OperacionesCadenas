package com.amit;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, palabra2, palabra3, palabra4;

        int numero, count;
        char caracter1, caracter2;

        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();

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
                String fraseCopy = " " + frase;
                for (int i = 0; i < fraseCopy.length(); i++) {
                    if (fraseCopy.charAt(i) == ' ') {
                        palabra2 = fraseCopy.charAt(i + 1) + " ";
                        System.out.print(palabra2.toUpperCase());
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 3) {
                palabra3 = "";
                System.out.println("Dame dos caracteres:");
                System.out.print("Dame caracter 1 : ");
                caracter1 = entrada.next().charAt(0);
                System.out.print("Dame caracter 2 : ");
                caracter2 = entrada.next().charAt(0);

                for (int i = 0; i < frase.length(); i++) {
                    if (frase.charAt(i) == caracter1) {
                        palabra3 = palabra3 + caracter2;
                    } else {
                        palabra3 = palabra3 + frase.charAt(i);
                    }

                }
                System.out.println(palabra3);
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 4) {
                palabra4 = "";
                for (int i = frase.length() - 1; i >= 0; i--) {
                    palabra4 = palabra4 + frase.charAt(i);
                }
                System.out.print("Al revés de su frase dada es: "+palabra4);
                System.out.println();
                System.out.println();
                System.out.println();

            } else if (numero == 0) {
            } else {
                System.out.println("La opinión no es válida");
                System.out.println();
                System.out.println();
                System.out.println();
            }

        } while (numero != 0);

        entrada.close();
    }
}
