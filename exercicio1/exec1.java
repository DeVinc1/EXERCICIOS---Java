import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exec1{
    public static void main(String[] args) {
        
        /*
         * Cabeçalho
         */
        System.out.println("---------------------------------------------------------");
        System.out.println("|      ENCONTRANDO O MAIOR E MENOR NÚMERO DA LISTA      |");
        System.out.println("---------------------------------------------------------");


        /*
         * Instância de Classes
         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaDeNum = new ArrayList<Integer>();

        /*
         * Fluxo para adição de valores do usuário a Lista de números.
         */
        char continuarAdicionando = 'y';
        int carregadoDeNum = 0;
        int posicaoNaLista = 1;

        while(continuarAdicionando != 'n' && continuarAdicionando != 'N'){

            System.out.print("O " + posicaoNaLista + "º número que será adicionado à lista é: ");
            carregadoDeNum = input.nextInt();
            listaDeNum.add(carregadoDeNum);
            posicaoNaLista++;

            System.out.print("Quer adicionar novos números? \n[Y/n]: ");
            continuarAdicionando = input.next().charAt(0);
        }

        input.close();

        /*
         * Imprimir menor e maior número
         */
        System.out.println("\nA lista fornecida é: " + listaDeNum.toString());
        System.out.println("O menor número desta lista é: " + Collections.min(listaDeNum) + "\nO maior número desta lista é: " + Collections.max(listaDeNum));
       

    }
}
