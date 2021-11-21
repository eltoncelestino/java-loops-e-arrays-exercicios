package arrays;

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetorConsoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        while(count < vetorConsoantes.length){
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))){
                vetorConsoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        }

        System.out.println("Consoantes: ");
        for ( String consoante : vetorConsoantes) {
            if(consoante != null)
                System.out.println(consoante);
        }

        System.out.println("Quantidade de consoantes: "+quantidadeConsoantes);
    }
}
