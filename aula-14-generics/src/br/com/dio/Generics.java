package br.com.dio;

public class Generics {
    public static void main(String[] args) {
        /*
        Generics:
        - Classe genérica: usada para evitar casting excessivo, código redundantes, econtrar erros de compilação.
        Introduzido no Java SE 5.0.

        Lista<String -> isso aqui> minhaLista = new Lista<>();

        public class Lista<T -> isso aqui>{
            pirvate T t;

        }

        WildCards: Coringas
        Unknown Wildcards (Unbounded) -> ilimitado, o mais genérico possível

        public void imprimeLista(List<?>lista){
            for(Object obj ; lista){
                System.out.println(obj);
            }
        }
        List<Aluno> minhaLista = new List<Aluno>();
        imprimeLista(minhaLista);


        Bounded Wildcard
         Upper Bounded -> só consigo passar listas herdeiras, descendentes

         public void imprimeLista(List<? extends Pessoa> listaPessoas){
            for(Pessoa p : listaPessoas){
                System.out.println(p);
            }
         }
         List<Aluno> MinhaLista = new List<Aluno>();
         imprimeLista(minhaLista);

         Lower Bounded -> não aceita herdeiro

         public void imprimeLista(List<? super Pessoa> listaPessoas){
            for(Pessoa p : listaPessoas){
                System.out.println(p);
            }
         }
         List<Aluno> minhaLista = new List<Aluno();
         imprimeLista(minhaLista);

         Convenção de caracteres:

         K para Key;
         V para Value
         E para Element
         T para Type
         ? para Genérico

         */

        No<String> no1 = new No<>("Conteúdo no1");

        No<String> no2 = new No<>("Conteúdo no2");

        no1.setProximoNo(no2); // -> referência do nó 1 está apontando para o nó 2.

        No<String> no3 = new No<>("Conteúdo no3");

        no2.setProximoNo(no3); // -> referência nó 2 apontando para nó 3.

        No<String> no4 = new No<>("Conteúdo no4");

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

