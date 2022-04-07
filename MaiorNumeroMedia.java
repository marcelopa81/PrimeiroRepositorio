import java.util.Scanner;

public class MaiorNumeroMedia {

    /*Programa que lê 5 números digitados pelo usuário via teclado e retorna o maior valor digitado
    e a média entre eles*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;

        int numeroMaior = 0;

        double soma = 0;

        double media;

        do{
            System.out.println("Digite um número inteiro: ");
            numero = scan.nextInt();
            count += 1;

            if (numero > numeroMaior){
                numeroMaior = numero;
            }
            soma = soma + numero;

        }while(count < 5);

        media = (soma)/5;

        System.out.println("O maior número digitado foi: " + numeroMaior);

        System.out.println("A média dos números digitados é: " + media);
    }

}
