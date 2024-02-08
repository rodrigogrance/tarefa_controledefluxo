package br.com.rlacorte;

/**
 * @author rodrigo.grance
 */

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota nas materias a seguir:");

        System.out.println("Português:");
        int nota1 = s.nextInt();
        System.out.println("Matemática:");
        int nota2 = s.nextInt();
        System.out.println("Geografia:");
        int nota3 = s.nextInt();
        System.out.println("História:");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = getResultado(media);
        System.out.println(resultado);
    }

    private static String getResultado(int media) {
        if(media >= 7) {
            return "Aprovado";
        }else if(media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }

    }

}
