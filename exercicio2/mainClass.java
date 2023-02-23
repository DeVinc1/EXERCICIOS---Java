package exercicio2;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        /*
         * Instâncias de Classes
         */
        Scanner input = new Scanner(System.in);
        calculadora calculo = new calculadora();

        /*
         * Cabeçalho
         */
        System.out.println("---------------------------");
        System.out.println("|       CALCULADORA       |");
        System.out.println("---------------------------");

        /*
         * Variáveis do fluxo de cálculo
         */
        boolean continuar = true;
        char operacao = 'z';

        double num1 = 0;
        double num2 = 0;

        /*
         * Fluxo de cálculo
         */
        while (continuar == true) {

            System.out.println( "\nEscolha uma das seguintes operações matemáticas: \n\t a. SOMAR \n\t b. SUBTRAIR \n\t c. MULTIPLICAR \n\t d. DIVIDIR \n\t z. ENCERRAR O PROGRAMA");
            operacao = input.next().charAt(0);

            switch (operacao) {
                //Soma
                case 'a':
                    System.out.print("\nDigite o primeiro número: ");
                    num1 = input.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();

                    System.out.println("O resultado da soma é " + calculo.somar(num1, num2));
                    break;
                //Subtração
                case 'b':
                    System.out.print("\nDigite o primeiro número: ");
                    num1 = input.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();

                    System.out.println("O resultado da subtração é " + calculo.subtrair(num1, num2));
                    break;
                //Multiplicação
                case 'c':
                    System.out.print("\nDigite o primeiro número: ");
                    num1 = input.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();

                    System.out.println("O resultado da multiplicação é " + calculo.multiplicar(num1, num2));
                    break;
                //Divisão
                case 'd':
                    System.out.print("\nDigite o primeiro número: ");
                    num1 = input.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2 = input.nextDouble();

                    System.out.println("O resultado da divisão é " + calculo.dividir(num1, num2));
                    break;
                //Encerramento
                case 'z':
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                //Qualquer outro valor
                default:
                    System.out.println("Opção inválida. Tente denovo.");
                    break;
            }
        }

        input.close();
    }

}
