package fundamentos;

import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		
		int codigo, num, i = 0;
		float valor, preco;
		
			while(i<2) {
				i++;
				Scanner sc1 = new Scanner(System.in);
					
				System.out.println("Insira o c�digo da pe�a:");
					codigo = sc1.nextInt();
				System.out.println("Insira o n�mero de pe�as:");
					num = sc1.nextInt();
				System.out.println("Insira o valor da pe�a:");
					valor = sc1.nextFloat();
					
				preco = valor * num;
				System.out.println("Valor da compra: R$" + preco);
					
				}
			}
}
		