package br.com.dio;

public class Main {
    public static void main(String[] args) {
        /*
         Conceito de Nó e Encadeamento de Nó:

         Nó: espaço em memória que armazena o dado que queremos e a referência para o próximo nó.
         Referência de nó: serve para fazer o elo entre os nós. O último nó da cadeia aponta para null.
         */

        No no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2");

        no1.setProximoNo(no2); // -> referência do nó 1 está apontando para o nó 2.

        No no3 = new No("Conteúdo no3");

        no2.setProximoNo(no3); // -> referência nó 2 apontando para nó 3.

        No no4 = new No("Conteúdo no4");

        no3.setProximoNo(no4); // referência nó 3 apontando para nó 4.

        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("----------------------");

        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
