import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa vai ler qualquer numero e imprimir na tela se o numero é par ou impar e positivo ou negativo.\nDigite o numero desejado: ");
        float number = sc.nextFloat();
        if (number % 2 == 0 && number >= 1) {
            System.out.println("O numero é par e positivo!!");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println("O numero é par e negativo");
        } else if (number % 2 == 0 && number == 0) {
            System.out.println("O numero é neutro");
        } else if (number % 2 != 0 && number >= 1) {
            System.out.println("O numero é impar e positivo");
        } else if (number % 2 != 0 && number < 0) {
            System.out.println("O numero é impar e negativo");
        }
    }

}






