package br.com.dio;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
	    //trabalhando os operadores aritméticos
        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmetico");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k; //somar para depois atribuir no i (11)
        int j = k--; //atribuir primeiro para depois subtrair (j recebe 11 e o k vira 10 logo após)
        int x = k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);
    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d " + d);

        i += 5; // i = i + 5;
        j -= 3; // j = j - 3;
        l *= 3; // l = l * 3;
        k %= 2; // k = k % 2;
        d /= 2.7d; // d = d / 2.7d;

        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("l " + l);
        System.out.println("k " + k);
        System.out.println("d " + d);

        i = k = j;
    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; /* 10 + (19 * 30) = 570 + 10 = 580: primeiro ele lê o pós fixado para depois ler os outros
        valores. O que vem dentro de parênteses é resolvido primeiro na operação.*/

        System.out.println("i++ + --j * k = " + a);

        System.out.println("i = " + i); // valor 11

        int b = k / --i % 3 + 1; // (30 / 10) resto de 3 + 1 = 1;

        System.out.println("k / --i % 3 + 1 = " + b);

        System.out.println("i = " + i); //valor volta para 10

        int c = 2;

        c *= i += 5; //c = 2 * i; i = i + 5; -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30;

        System.out.println("c *= i += 5 = " + c);
    }
}
