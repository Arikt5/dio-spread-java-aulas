package br.com.dio;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.5f;

        double d1 = 59.6d;

        char c1 = 'a';
        char c2 = 'b';

        String s1 = "Fulano";
        String s2 = "Beltrano";

        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 3597L;

        byte y1 = 1;
        short h1 = 75;

        //inteiro
        System.out.println("i1 == i2 = " + (i1 == i2));
        System.out.println("i1 != i2 = " + (i1 != i2));
        System.out.println("i1 >= i2 = " + (i1 == i2));
        System.out.println("i1 <= i2 = " + (i1 <= i2));

        //float
        System.out.println("f1 == f2 = " + (f1 == f2));
        System.out.println("f1 != f2 = " + (f1 != f2));
        System.out.println("f1 >= f2 = " + (f1 >= f2));
        System.out.println("f1 <= f2 = " + (f1 <= f2));

        //char
        System.out.println("c1 == c2 = " + (c1 == c2));
        System.out.println("c1 != c2 = " + (c1 != c2));
        System.out.println("c1 >= c2 = " + (c1 >= c2));
        System.out.println("c1 <= c2 = " + (c1 <= c2));

        //string - não consigo perguntar se ela é maior ou menor que outra string
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1 != s2 = " + (s1 != s2));
        //System.out.println("s1 >= s2 = " + (s1 >= s2));
        //System.out.println("s1 <= s2 = " + (s1 <= s2));

        //boolean - não consigo perguntar se um booleano é maior que outro
        System.out.println("b1 == b2 = " + (b1 == b2));
        System.out.println("b1 != b2 = " + (b1 != b2));
        //System.out.println("b1 >= b2 = " + (b1 >= b2));
        //System.out.println("b1 <= b2 = " + (b1 <= b2));

        //long
        System.out.println("l1 == l2 = " + (l1 == l2));
        System.out.println("l1 != l2 = " + (l1 != l2));
        System.out.println("l1 >= l2 = " + (l1 >= l2));
        System.out.println("l1 <= l2 = " + (l1 <= l2));

        //char e numeros
        System.out.println("c1 == i2 = " + (c1 == i2));
        System.out.println("c1 != l2 = " + (c1 != l2));
        System.out.println("c1 >= f2 = " + (c1 >= f2));
        System.out.println("c1 <= i2 = " + (c1 <= d1));

        //byte com short
        System.out.println("y1 == h2 = " + (y1 == h1));
        System.out.println("y1 != h1 = " + (y1 != h1));
        System.out.println("y1 >= h1 = " + (y1 >= h1));
        System.out.println("y1 <= h1 = " + (y1 <= h1));

        /*string com char - não se pode comparar os dois
        System.out.println("s1 == c2 = " + (s1 == c2));
        System.out.println("s1 != c2 = " + (s1 != c2));
        System.out.println("s1 >= c2 = " + (s1 >= c2));
        System.out.println("s1 <= c2 = " + (s1 <= c2));

        string com numeros - não se compara texto com números
        System.out.println("s1 == l2 = " + (s1 == l2));
        System.out.println("s1 != l2 = " + (s1 != l2));
        System.out.println("s1 >= l2 = " + (s1 >= l2));
        System.out.println("s1 <= l2 = " + (s1 <= l2));*/
    }
}
