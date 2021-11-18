package loops;

import java.util.Scanner;

public class EX4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros, par = 0, impar = 0, numero;
        int count = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do{
            System.out.println("Digite os números: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                par++;
            }

            else if (numero % 2 != 0){
                impar++;
            }

            count++;
        } while(count < quantidadeNumeros);

        System.out.println("A quantidade de número pares é: "+par);
        System.out.println("A quantidade de números ímpares é: "+impar);

    }
}
