package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarSwitch {
    public static void main(String[] args) {
        String estadoCivil = "V";
        switch (estadoCivil) {

            case "S":
                System.out.println("Soltero");
                break;
            case "V":
                System.out.println("Viudo");
                break;
            case "D":
                System.out.println("Divorciado");
                break;
            case "C":
                System.out.println("Casado");
                    break;
            default:
                System.out.println("No es un estado válido");
                break;

        }
//Pedir una nota de 0 a 10 y mostrar de la forma: insuficientes,suficientes,bien, notable , sobresaliente.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota de 0 a 10: ");
        int nota = sc.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 3:
            case 4:
                System.out.println("insuficientes");
                break;
            case 5:
                System.out.println("suficientes");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7:
            case 8:
                System.out.println("notable");
                break;
            case 9:
                System.out.println("suficientes");
                break;
            case 10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("nota invalida");
                break;
        }

    }
}
