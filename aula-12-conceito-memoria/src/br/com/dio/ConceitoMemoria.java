package br.com.dio;

public class ConceitoMemoria {
    public static void main(String[] args) {
        /*
        Anotações: Conceituação

        Memória Secundária -> ela mantém os dados mesmo quando não há energia no computador.

        Memória Primária (memória RAM) -> ela não mantém os dados gravados. Precisa de energia para
        gravar as coisas. Possui diversos chips que são endereços de memórias (regiões) que o
        sistema operacional gerencia. Cada chip armazena milhões de bits. Se tiver energia guarda 1,
        se não tiver, guarda 0.

        1 byte tem 8 bits.
        4 bytes representa 1 inteiro. ex: 0000 = 0 (ZERADA = sem energia)
                                          0001 = 1 (ENERGIZADA -= com energia -> 1 em binário)
                                          0010 = 2 (ENERGIZADA -> 2 em binário)
                                          0011 = 3 (ENERGIZADA -> 3 em binário)
                                          0100 = 4 (ENERGIZADA -> 4 em binário)
                                          0101 = 5 (ENERGIZADA -> 5 em binário)
                                          0110 = 6 (ENERGIZADA -> 6 em binário)
                                          0111 = 7 (ENERGIZADA -> 7 em binário)
                                          1000 = 8 (ENERGIZADA -> 8 em binário)

         Atribuição e referência:
         Atribuição é por cópia de valor. Tipo primitivo copia-se o valor na memória, ou seja, os bits
         ou bytes (0 e 1).
         Objeto é por cópia de referência. Eles apontam por mesmo endereço de memória que aquele dado
         foi armazenado. tornam-se um. Se um for modificado, o outro também será.
          Ex:
         */

        int intA = 1;
        int intB = intA;
        System.out.println("intA = " + intA + " intB = " + intB);

        intA = 2; // nesse caso apenas o A troca de valor.
        System.out.println("intA = " + intA + " intB = " + intB);


        MeuObjeto objetoA = new MeuObjeto(1);
        MeuObjeto objetoB = objetoA;
        System.out.println("Objeto A = " + objetoA + " Objeto B = " + objetoB);

        objetoA.setNum(2); //aqui os dois trocam de valor.
        System.out.println("Objeto A = " + objetoA + " Objeto B = " + objetoB);
    }

}
