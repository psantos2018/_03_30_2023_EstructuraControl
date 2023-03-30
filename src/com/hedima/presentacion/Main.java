package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        int numero=-10;
        if(numero>=0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }

        //Declarar una variable y decir si es un número par o impar

        int numero1=9;
        if(numero1%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        //Decir si un numero está entre 0 y 100
        int numero2=101;
        if(numero2>=0 && numero2<=100){
            System.out.println("El numero esta entre 0 y 100");
        }else{
            System.out.println("El numero no está entre 0 y 100");
        }
        //Los articulos raton y teclado tienen el 10% de descuento
        String nombreArticulo="Ratón";
        double descuento=0.1, precio=20;
        if(nombreArticulo.equalsIgnoreCase("ratón") || nombreArticulo.equalsIgnoreCase("teclado")){
            System.out.println("El descuento es: " + descuento * precio);
        }else{
            System.out.println("NO tiene descuento");
        }

    }
}