package br.com.dio;

public class OperadoresLogicos {

    public static void main(String[] args) {

        double salarioMensal = 3.000d;
        double mediaSalario = 10.300d;
        int quantidadeDependentes = 1;
        int mediaDependentes = 2;

        boolean salarioBaixo = (salarioMensal < mediaSalario);

        boolean muitosDependentes = (quantidadeDependentes >= mediaDependentes);

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("recebe auxílio: " + recebeAuxilio);


        /*boolean salarioAlto = (salarioMensal > mediaSalario);

        boolean poucosDependentes = (quantidadeDependentes <= mediaDependentes);

        boolean naoRecebeAuxilio2 = ();*/

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // && - só é true quando os dois forem true
        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b1 && b3 = " + (b1 && b3));

        // || - só é true quando os dois forem false
        System.out.println("b2 || b3 = " + (b2 || b3));
        System.out.println("b2 || b4 = " + (b2 || b4));

        // ^ - só é true quando os dois forem diferentes um do outro
        System.out.println("b1 ^ b3 = " + (b1 ^ b3));
        System.out.println("b4 ^ b1 = " + (b4 ^ b1));

        // ! - inverte o valor (se é true vira false)
        System.out.println((!b1));
        System.out.println((!b2));

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 + i2) < (f2 - f1)) && true = " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(il > i2) || (f2 < f1) = " + ((i1 > i2) || (f2 < f1)));

    }
}
