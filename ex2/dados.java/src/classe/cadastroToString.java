package classe;

import java.util.Scanner;

public class cadastroToString {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        dados morador = new dados(); // criação do obj

        System.out.println("\n======CADASTRO DE MORADORES======");
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

        System.out.println(morador.toString());

        close(sc1);

    }

    private static void close(Scanner sc1) {// método que fecha scanner
    }

}
