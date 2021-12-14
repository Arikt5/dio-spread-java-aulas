package br.com.dio.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Digite novamente: ");
            nota = scan.nextInt();
        }

        //não tem no exercício, só teste de código
        if (nota >= 7) {
            System.out.println("Oba! Você passou!");
        } else if (nota <= 6) {
            System.out.println("Não passou. :( Mais sorte da próxima vez!");
        }

    }
}
