package br.com.dio;

public class TiposDados {
    public static <date> void main(String[] args) {

        //entendendo os tipos de dados
	    byte numeroInteiroPequeno = 10;

        short numeroInteiroMaior = 20000;
        //short nomeroMarior = 40000; muito maior do que ele suporta

        //int numeroInteiro32Bits = -10000000000; muito abaixo do que ele suporta
        int numeroInteiro32Bits = 28500;

        long numeroInteiro64Bits = 1000000000000000000L;//a letra L indica que é long

        //float numeroFracional32Bits = 4.5; precisa colocar o f pra indicar que é float
        float numeroFracional32Bits = 10.68F;

        double numeroFracional64Bits = 55.69;

        char caracteresUnicode16Bits = 'T';//com aspas simples e só um caracter ou o código da letra
        String palavraEspecial = "palavra"; //tb é um tipo de dado composto. Aspas duplas.

        //String data = "22/01/20"; existe um tipo para data

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(numeroInteiroPequeno);
        System.out.println(numeroInteiroMaior);
        System.out.println(numeroInteiro32Bits);
        System.out.println(numeroInteiro64Bits);
        System.out.println(numeroFracional32Bits);
        System.out.println(numeroFracional64Bits);
        System.out.println(caracteresUnicode16Bits);
        System.out.println(palavraEspecial);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
