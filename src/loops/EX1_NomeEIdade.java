package loops;

import java.util.Scanner;

public class EX1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite 0 no nome para parar!");

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();


        }
        System.out.println("Você saiu do laço!");
    }
}
