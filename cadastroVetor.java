package classe;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroVetor {
    public static void main(String[] args) {
        menu1();
    }

    public static void menu1() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n======CADASTRO DE MORADORES======");
        System.out.println("[1] Cadastrar moradores");
        System.out.println("[2] Sair");
        int op = sc1.nextInt();

        switch (op) {
            case 1:
                cadastrar();
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("Opcao invalida!");
                menu1();
                break;
        }
        close(sc1);
    }

    public static void cadastrar() {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<dados> lista = new ArrayList<dados>();

        System.out.println("Deseja cadastrar quantos moradores?");
        int moradores = sc1.nextInt();

        for (int i = 0; i < moradores; i++) {

            dados morador = new dados(); // criação do obj

            System.out.println("Insira os dados do morador:");
            System.out.println("Nome:");
            morador.nome = sc1.next();
            System.out.println("Cpf:");
            morador.cpf = sc1.nextInt();
            System.out.println("Celular:");
            morador.cel = sc1.nextInt();
            System.out.println("Data de nascimento:");
            morador.data = sc1.nextInt();
            System.out.println("Sexo:");
            morador.sexo = sc1.next();
            System.out.println("Bloco do apartamento:");
            morador.bloco = sc1.nextInt();
            System.out.println("Numero do apartamento:");
            morador.ap = sc1.nextInt();

            lista.add(morador);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista);
        }

    }

    private static void close(Scanner sc1) {// método que fecha scanner
    }

}