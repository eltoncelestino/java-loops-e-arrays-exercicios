package arrays;

public class EX1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-8,2,7,10,5,26};

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Sequência: "+vetor[i]);
        }

        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.println("Vetor Inverso: "+vetor[i]);
        }
    }
}
