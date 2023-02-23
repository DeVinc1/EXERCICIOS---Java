package exercicio3;

import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        /*
         * Cabeçalho
         */
        System.out.println("---------------------------");
        System.out.println("|       PALÍNDROMO?       |");
        System.out.println("---------------------------");
        System.out.print("\nQual palavra você deseja verificar se é um palindromo?: ");
        
        String palavraTestada = input.nextLine();
        input.close();
        boolean palindromo = verificaPalindromo(palavraTestada.toCharArray());

        if(palindromo == true){
            System.out.println("\nA palavra fornecida é um palíndromo.");
        }else{
            System.out.println("\nA palavra fornecida não é um palíndromo.");
        }
        
    }

    public static boolean verificaPalindromo(char[] caracteresDaString){
        /*
         * Fluxo de verificação de palindromo.
         */
        for(int i = 0; i < caracteresDaString.length; i++){
            if(caracteresDaString[i] != caracteresDaString[caracteresDaString.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
