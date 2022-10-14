
package com.mycompany.ejerciciotema4;


public class EjercicioTema4 {

    public static void main(String[] args) {
        int numeroIf = -10;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        String estacion = "Primavera";
        
        System.out.println("--------------- IF ----------------------");
        if(numeroIf > 0){
            System.out.println("numeroIf es positivo");
        } else if (numeroIf < 0){
            System.out.println("numeroIf es negativo");
        } else {
            System.out.println("numeroIf es igual a 0");
        }
        
        System.out.println("--------------- WHILE ----------------------");
        while (numeroWhile < 3){
            System.out.println("El numeroWhile es: " + numeroWhile);
            numeroWhile++;
        }
        
        System.out.println("--------------- DO WHILE ----------------------");
        do{
            System.out.println("El numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 1);
        
        System.out.println("--------------- FOR ----------------------");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El numeroFor es: " + numeroFor);
        }
        
        System.out.println("--------------- SWITCH ----------------------");
        switch (estacion){
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}
