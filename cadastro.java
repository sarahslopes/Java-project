package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastro {
  public static void main(String[] args) {
    menu1();
  }

  public static void menu1() {

    Scanner sc1 = new Scanner(System.in);

    System.out.println("========GESTAO DO PREDIO========");
    System.out.println("Digite a opçao desejada:");
    System.out.println("[1] Cadastrar apartamento");
    System.out.println("[2] Cadastrar morador");
    System.out.println("[3] Listar moradores");
    System.out.println("[4] Sair");
    int op = sc1.nextInt();

    switch (op) {
      case 1:
        cadastrarAp();
        break;

      case 2:
        cadastrarMorador();
        break;

      case 3:
        listar();
        break;

      case 4:
        sair();
        break;

      default:
        System.out.println("Opcao invalida");
        menu1();
        break;

    }

    close(sc1);

  }

  private static void close(Scanner sc1) {
  }

  public static void cadastrarAp() {

    Scanner sc1 = new Scanner(System.in);
    ap p1 = new ap();

    System.out.println("Digite os dados do apartamento:");
    System.out.println("Numero apartamento:");
    p1.num = sc1.nextInt();
    System.out.println("Andar:");
    p1.andar = sc1.nextInt();
    System.out.println("Metragem:");
    p1.metragem = sc1.nextDouble();
    System.out.println("Status:");
    p1.status = sc1.next();
    System.out.println("\n");
    System.out.println(p1.toString());
    System.out.println("Insira a opcao desejada");
    System.out.println("[1] Cadastrar outro apartamento");
    System.out.println("[2] Menu");
    int op = sc1.nextInt();

    close(sc1);

    if (op == 1)
      cadastrarAp();
    if (op == 2)
      menu1();
  }

  public static void cadastrarMorador() {

    Scanner sc1 = new Scanner(System.in);
    morador m1 = new morador();
    ArrayList<morador> lista = new ArrayList<morador>();

    System.out.println("Dados do morador:");
    System.out.println("Nome:");
    m1.nome = sc1.next();
    System.out.println("Cpf:");
    m1.cpf = sc1.next();
    System.out.println("Celular:");
    m1.celular = sc1.next();
    System.out.println("Sexo:");
    m1.sexo = sc1.next();
    System.out.println("Bloco:");
    m1.bloco = sc1.nextInt();
    System.out.println("Apartamento:");
    m1.apt = sc1.nextInt();
    lista.add(m1);

    System.out.println("Insira a opcao desejada:");
    System.out.println("[1] Cadastrar outro morador");
    System.out.println("[2] Listar cadastros");
    int op = sc1.nextInt();

    close(sc1);

    if (op == 1){
      cadastrarMorador();
    }if(op==2){
      for(int i = 0;)
    }

  public static void sair() {
    System.exit(0);
  }

}
