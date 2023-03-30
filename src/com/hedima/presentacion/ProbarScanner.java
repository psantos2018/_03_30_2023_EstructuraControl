package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        // Decalrar una variable primitiva
        String nombre ="";

        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un Nombre->");
//        nombre = sc.next();
//        System.out.println("El nombre es: " + nombre);

        //Solicitar  un nombre, si el nombre es  "Juan" le damos la bienvenida, si no sólo damos la bienvenida.
//        System.out.println("Ingrese un nombre->");
//        nombre = sc.next();
//        if (nombre.equalsIgnoreCase("Juan")) {
//            System.out.println("Bienvenido " + nombre);
//        }
        //Pedir dos numeros y comparar si son iguales
//        System.out.println("Ingrese dos numeros->");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        if (num1 == num2) {
//            System.out.println("Los numeros son iguales");
//        } else {
//            System.out.println("Los numeros no son iguales");
//        }
        //Pedir un numero y comparar si es mayor o menor
//        System.out.println("Ingrese un numero->");
//        int num = sc.nextInt();
//        int num2 = sc.nextInt();
//        if (num == num2) {
//            System.out.println("El numero es mayor");
//        } else if (num < num2) {
//            System.out.println("El numero es menor");
//        } else {
//            System.out.println("El numero es igual");
//        }
        //Pedir dos numeros y ordenar de mayor a menor
        System.out.println("Ingrese dos numeros->");
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num3 > num4) {
            System.out.println(num3 + " ," + num4);

        } else if (num3 < num4) {
            System.out.println(num4 + " ," + num3);
        }
    }

}
