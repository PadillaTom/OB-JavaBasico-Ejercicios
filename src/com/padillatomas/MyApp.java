package com.padillatomas;


import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7,8,9:");

//        Ej: Reverse String
        System.out.println(" ");
        System.out.println("=== Reverse String ===");
        String ej1String = "Hola Mundo";
        String ej1Resultado = "";
        char charAt;
        for (int i=0 ; i < ej1String.length(); i++){
            charAt = ej1String.charAt(i);
            ej1Resultado = charAt + ej1Resultado;
        }
        System.out.println("String inicial -> " +ej1String);
        System.out.println("Resultado -> " + ej1Resultado );


//        Ej: 1
        System.out.println(" ");
        System.out.println("=== 1 ===");
        String[] ej1Array = {"Tomas", "Padilla"};
        for (String str : ej1Array){
            System.out.println(str);
        }

//        Ej: 2
        System.out.println(" ");
        System.out.println("=== 2 ===");
        int ej2BiDi[][] = new int[2][4];
        ej2BiDi[0][0] = 1;
        ej2BiDi[0][1] = 2;
        ej2BiDi[0][2] = 3;
        ej2BiDi[0][3] = 4;

        ej2BiDi[1][0] = 10;
        ej2BiDi[1][1] = 20;
        ej2BiDi[1][2] = 30;
        ej2BiDi[1][3] = 40;

        for(int i = 0; i< ej2BiDi.length; i++){
            System.out.println("Current Position: " + i);
            for(int j = 0 ; j < ej2BiDi[1].length; j++){
                System.out.println("Estoy en J = " + j + " -> " + ej2BiDi[i][j]);
            }
        }

//        Ej: 3
        System.out.println(" ");
        System.out.println("=== 3 ===");
        Vector<String> ej3Vectors = new Vector<>();
        ej3Vectors.add("Tomas");
        ej3Vectors.add("Padilla");
        ej3Vectors.add("Edad: 32");
        ej3Vectors.add("Nacionalidad: Italia");
        ej3Vectors.add("Residencia: Francia");
        System.out.println(ej3Vectors);
        System.out.println("Removemos 2o y 3er Elemento:");
        ej3Vectors.remove(1);
        ej3Vectors.remove(1);
        System.out.println(ej3Vectors);

//        Ej: 4
        System.out.println(" ");
        System.out.println("=== 4 ===");
        System.out.println("Por defecto un Vector tiene una capacida de 10 Elementos. " +
                "Al Superar dicha capacidad se crea un nuevo array y se van copiando dentro de un nuevo Vector de mayor capacidad ('Rezises'). " +
                "Esto perjudica al consumo de la memoria. Copiar un Array a otro Array es una operacion COSTOSISIMA a nivel computacional ");

//        Ej: 5
        System.out.println(" ");
        System.out.println("=== 5 ===");

        ArrayList<String> ej5Array = new ArrayList<>();
        ej5Array.add("Tomas");
        ej5Array.add("Katherine");
        ej5Array.add("Julieta");
        ej5Array.add("Alexandra");

        LinkedList<String> ej5LinkedList = new LinkedList<>(ej5Array);

        System.out.println("ArrayList -> ");
        for(String str : ej5Array){
            System.out.println(str);
        }
        System.out.println("");
        System.out.println("LinkedList -> ");
        for(String str : ej5LinkedList){
            System.out.println(str);
        }

//        Ej: 6
        System.out.println(" ");
        System.out.println("=== 6 ===");

        ArrayList<Integer> ej6Array = new ArrayList<>();
        for (int i = 1 ; i<11 ; i++){
            ej6Array.add(i);
        }
        System.out.println("Array del 1-10 -> " + ej6Array);
        ej6Array.removeIf(number -> (number%2) == 0);
        System.out.println("Array sin PARES: " + ej6Array);

//        Ej: 7
        System.out.println(" ");
        System.out.println("=== 7 ===");

// ===== DESCOMENTAR PARA SU FUNCIONAMIENTO ===
//        System.out.println(dividePorCero(0));

//        Ej: 8
        System.out.println(" ");
        System.out.println("=== 8 ===");

        // FILE IN  (mac) ->  "/Users/padillatom/Desktop/testio/myFile.txt"
        // FILE OUT -> "destino.txt"
        copyFiles("/Users/padillatom/Desktop/testio/myFile.txt", "destino.txt" );
//        Ej: 9
        System.out.println(" ");
        System.out.println("=== 9 ===");




    }
//    EJ 7 Exception:
    public static int dividePorCero(int myNumber) throws ArithmeticException{
        int resultado;
       try{
           resultado = myNumber / 0;
       } catch (ArithmeticException e){
           System.out.println("Entramos a la EXCEPTION");
           throw new ArithmeticException("Esto no puede hacerse");
       } finally {
           System.out.println("Demo de Codigo");
       }
       return resultado;
    }

//    EJ 8 File IN - File OUT:
//    "/Users/padillatom/Desktop/testio/myFile.txt"
//    "destino2.txt"
    public static void copyFiles(String fileIn, String fileOut){
        try  {
            InputStream in = new FileInputStream(fileIn);
            try{
                byte[] datos = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();

            } catch (IOException e){
                System.out.println("File Not Found Exception: " + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("File Not Found Exception: " + e.getMessage());
        }
        System.out.println("Operacion Realizada con EXITO!");
    }
}
