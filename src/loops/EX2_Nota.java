package loops;

import java.util.Scanner;

public class EX2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextDouble();

        while(nota < 0 || nota > 10){
            System.out.println("Nota Inválida, digite novamente");
            nota = scan.nextDouble();
        }

        System.out.println("Nota recebida válida = "+nota);
    }
}
