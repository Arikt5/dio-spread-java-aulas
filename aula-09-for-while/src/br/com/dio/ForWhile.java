package br.com.dio;

public class ForWhile {
    public static void main(String[] args) {

        /*formas de while:

        while (expressão) {
            códigos
        }

        while (tentativas <= limiteTentativas) {
            fz a pergunta do quiz
            atualiza a quantidade de tentativas
        } -> pode não ser executada nenhuma vez, pois de primeira a expressão pode ser lida como false.

        while (true) {
            //códigos
            //ao final pode verificar se ainda deve ser executado.
        } -> usado para fazer loop infinito, onde algo vai ser executado muitas vezes. expressão trcada por true.

        do {
            //faz a pergunta do quiz
            //atualiza a quantidade de tentativas
        } while (tentativas <= limiteTentativas); -> o laço será executado pelo menos uma vez. Raramente usado.


        Formas do For (4 tipos):

        for (ponto de início; quando parar; faz o for caminhar) {
            códigos
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i é " + i); -> o for vai caminhar de 0 até 10;
        }

        for (int i = 0; i > 10; i--) {
            System.out.println("O valor de i é " - i); -> o for vai caminhar de 10 até 0;
        }

        for (<tipoDeDado> variável : itens) {
            códigos
        } -> ?

        for (Iterator<tipoDeDado> <nomeVariavel> = itens.iterator(); itens.hasNext();) {
            códigos
        } -> ? pouquíssimo utilizado.

        for (;;) {
            códigos
        } -> executa de forma infinita, pois não foi definido início, nem fim, nem incremento.
        Melhor usar o while com true para isso.

         */


        int count = 0;

        while(count < 5) {
            System.out.println("Vou imprimir isso 5 vezes");
            count ++;
        }

        System.out.println("\n");

        for (int i = 3; i <= 11; i = i + 2) {
            if (i == 7) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
