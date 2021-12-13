package br.com.dio;

public class ArraysMatrizes {
    public static void main(String[] args) {
        /*
        Array unidimensional:
        <tipo>[] nome <?=valorInicial?>; -> mais comum ou
        <tipo> nome[] <?=valorInicial?>;

        int[] idades = new int[10]; -> aloquei 10 espaços na memória para este array, e ocupei 2 abaixo.
        idades [0] = 27;
        idades[1] = 31;

        int[] i = {10,25}; -> não definiu previamente os valores, já disse quais eram esses valores de cara.

        int[] k = new int[] {1,2,3}; -> forma mais comum. Omitiu os valores inicialmente, já os definiu na entrada.

        int[] j = new int[2]; -> pode só criar e depois colocar os valores quando precisar.


        int[] idades = new int[] {12,35,45,22,9,37,51,61};

        for (int idade : idades) { //-> para cada repetição eu guardo o valor na variável idade.
            //códigos
        }

        System.out.println("\n");
        for (int i = 0; i < idades.length; i++) {
            int idade = idades[i]; -> idade gurada a repetição do i;
            //códigos
        }

        for (int idade : idades) {
            if(idade >= 18){
                Maior de idade
            }
        }

        for (int i = 0; i < idades.length; i++) {
            int idade = idades[i];
            if(idade >= 18) {
                maior de idade
            }
        }

        Array de Array: Matriz

        int[][] idades = new int[][] {{12,35},{45,22}};

        for (int[] id1 : idades) {
            for (int id2 : id1) {
                System.out.println(id2);
            }
        }

        for (int i = 0; i < idades.length; i++) {
            int[] id = idades[i];
            for (int j = 0; j < id.length; j++) {
                System.out.println(idades[i][j]);
            }
        }
        */

        String[] nomes = new String[10];
        nomes [0] = "Maria";
        nomes [1] = "João";
        nomes [2] = "Marcos";
        nomes [3] = "Raquel";
        nomes [4] = "Cecília";

        System.out.println("nome: " + nomes[1]);

        int[] numero = new int[] {4,2,5,7,8,42};

        System.out.println("numero: " + numero[0]);

        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

        for(int i = 0; i < numero.length; i++) {
            int numeros = numero[i];
            System.out.println(numeros + " ");
        }

        char[][] jogo = new char[3][3];
        jogo[0][0] = 'X';
        jogo[2][1] = 'O';

        System.out.println("Posição O: " + jogo[0][0]);
        System.out.println("Posição X: " + jogo [2][1]);

    }
}
