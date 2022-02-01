package fundamentos;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		
		int code, horas;
		double valor, saldo;
		
		Scanner sc1 = new Scanner(System.in);
			System.out.println("Insira o código do funcionário:");
			code = sc1.nextInt();
			System.out.println("Insira as horas trabalhadas:");
			horas =  sc1.nextInt();
			System.out.println("Insira o valor pago pela hora trabalhada:");
			valor = sc1.nextDouble();
			saldo = horas * valor;
			
			System.out.println("Valor do salário: R$" + saldo);
			
	}
	

}
