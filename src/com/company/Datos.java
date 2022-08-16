package com.company;

public class Datos {
    public static void main(String[] args) {
        // primera session de java

        /*
        * imprimir los tipos de datos vistos en la session
        * tenemos varios tipos de datos-  en este caso solo se imprimiran los datos primitvios
        * */

        // numericos
        // enteros
        byte number1=9;
        System.out.println("byte: "+number1);

        short number2=19;
        System.out.println("short: "+number2);

        int number3=23;
        System.out.println("int: "+number3);

        long number4=2345;
        System.out.println("long: "+number4);

        // decimal
        float number5=12.4f;
        System.out.println("float: "+number5);

        double number6=34.53; // es opcional poner d al final: ejemplo number5= 34.53d
        System.out.println("double: "+number6);

        // booleano

        boolean variabletrue=true;
        System.out.println("boolean true: "+variabletrue);

        boolean variableFalse=false;
        System.out.println("boolean false: "+variableFalse);

        // texto
        char char1='a';
        System.out.println("char: "+char1);

        String varibaleString="nombre completo"; // este no es una variable primitivo
        System.out.println("String: "+varibaleString);

    }
}
