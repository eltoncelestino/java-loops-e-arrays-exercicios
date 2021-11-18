package loops;

import java.util.Scanner;

public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior = -8888, menor = 9999;
        int count = 0;
        double soma = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma += numero;

            if(numero > maior || numero > menor){
                maior = numero;
            }
            else if(numero < maior || numero < menor){
                menor = numero;
            }

            count++;
        }while (count < 5);

        System.out.println("Maior valor = " + maior+" E menor valor = " + menor);
        System.out.println("A média dos valores digitados é: " + soma / 5);
    }
}
