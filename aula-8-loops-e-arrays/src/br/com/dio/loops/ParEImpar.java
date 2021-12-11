package br.com.dio.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int count = 0;
        int numero;
        int quantidadePares= 0, quantidadeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while(count < quantidadeNumeros);

        System.out.println("Quantidade de Pares: " + quantidadePares);
        System.out.println("Quantidade de Ímpares: " + quantidadeImpares);
    }
}
