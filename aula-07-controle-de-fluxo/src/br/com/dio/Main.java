package br.com.dio;

public class Main {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifFlecha() {
        //if flecha deve ser evitado
        int mes = 0;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                }
            }
        }
    }

    private static void ifSemFlecha() {
        int mes = 40;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido");
        }
    }

    private static void ifFerias() {
        //nesse caso melhor usar o switch, porque se usar apenas uma variável
        String mes = "Agosto";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Férias!");
        } else {
            System.out.println("Não é férias :(");
        }
    }

    private static void ifMenor() {
        double salarioMensal = 11999.55d;
        double mediaSalario = 20450d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosFilhos = quantidadeDependentes > mediaDependentes;

        if(salarioBaixo && muitosFilhos) {
            System.out.println("Funcionário deve receber auxílio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    private static void switchSemana() {

        String dia = "quarenta";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero() {
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    private static void switchFerias() {

        String mes = "";
        switch (mes) {
            case "Julho":
            case "Dezembro":
            case "Janeiro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Não é férias :(");
                break;
        }
    }
}