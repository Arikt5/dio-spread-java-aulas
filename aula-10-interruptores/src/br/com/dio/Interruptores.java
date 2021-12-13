package br.com.dio;

public class Interruptores {
    public static void main(String[] args) {
        /*

        Break:
        Interrompe o for, while e switch. duas formas de usar: marcada e não marcada.

        while (...) {
        ...
        break; -> forma não maracada. Tudo o que estiver embaixo não será executado.
        ...
        }

        for (...; ...; ...) {
            ...
            if (...) {
                break; -> forma não marcada. Interrompe o for, não o if.
            }
            ...
        }

        for (...; ...; ...) {
            for (..; ...; ...) {
                ...
                if (...) {
                    break; -> forma não marcada. Interrompe o segundo for.
                }
                ...
            }
        }

        do {
            ...
            if (...) {
                break; -> igual ao while. Tudo o que estiver abaixo não será executado.
            }
            ...
        } while (...);

        out: -> labels
        for (...; ...; ...) {
            for (...; ...; ...) {
                ...
                if (...) {
                break out; -> forma marcada. Interrompe os dois loops por ser um label.
                }
                ...
            }
        }
        continua aqui...

        Continue:
        interrompe parcialmente o for e o while (pula). Forma marcada e não marcada.

        while (...) {
            ...
            if (...) {
            continue; -> forma não marcada; Se o if for true, ele pula a repetição do while.
            }
            ...
        }

        for (...; ...; ...) {
            ...
            if (...) {
                continue; -> pula a repetição do for;
            }
            ...
        }

        for (...; ...; ...) {
            for (...; ...; ...){
                ...
                if (...) {
                    continue; -> pula a repetição do segundo for;
                }
                ...
            }
        }

        do {
            ...
            if (...) {
                continue; -> igual ao while;
            }
            ...
        } while (...);

        out:
        for (...; ...; ...) {
            for ( ...; ...; ...) {
                ...
                if (...) {
                    continue out; -> pula apenas a repetição do primeiro for. Reinicia a execução do segundo for.
                }
                ...
            }
        }

        Return:
        Atua no método, com valor ou sem valor.

        ...
        return; -> sem valor;
        }

        ...
        return <valor>; -> com valor;
        }

         */


        System.out.println("Múltiplo de 2: ");
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            if (i == 12) {
                break;
            }
        }


        System.out.println("Múltiplo de 2 While: ");
        int count = 1;

        while (count <= 14) {

            count ++;

            if (count % 2 == 0) {
                System.out.println(count + " ");
            }

            if (count == 12) {
                break;
            }
        }


    }
}
