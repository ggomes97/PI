
import java.util.ArrayList;
import java.util.Scanner;
public class UsaDoenca {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        Doenca don;
        ArrayList<Doenca> lista = new ArrayList<>(); //armazenar objetos na Classe Doenca
        int ops = 0, tipo;
        String nome;
        String descricao;
        boolean achouDoenca;

        System.out.println("************ Bem vindo ao cadastramento e consulta de doenças ************");
        System.out.println("-------------- Escolha uma das opções para começar --------------");
        while(ops != 3){
            System.out.println("1- Adicionar doença");
            System.out.println("2- Catálogo de doenças");
            System.out.println("3- Fim");

            ops = teclado.nextInt();
         switch (ops){
             case 1:
                 System.out.println("Insira o nome da doença: ");
                 nome = teclado.next(); teclado.nextLine();
                 System.out.println("Insira a descrição da doença: ");
                 descricao = teclado.nextLine();
                 don = new Doenca(nome, descricao);
                lista.add(don);
                break;

             case 2:
                for(int i = 0; i< lista.size(); i++){
                  don = lista.get(i);
                    System.out.println("nome: " + don.getNome());
                    System.out.println("Descrição: " + don.getDescricao());
                }

                break;

             case 3:
                 System.out.println("Fim do programa!");
                 break;

             default:


                 System.out.println("Opção incorreta!");
         }

        }

    }
}
