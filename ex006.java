package fundamentos;

import java.util.Scanner;

public class ex006 {
	
	public static void main(String[] args) {
		
		double A, B, C, tri, trap, quad, ret, pi = 3.14159, circ;
		
		Scanner sc1 = new Scanner(System.in);
			System.out.println("Informe três números:");
			A = sc1.nextDouble();
			B = sc1.nextDouble();
			C = sc1.nextDouble();
			
			tri = A * C /2; //area triangulo retangulo
			circ = (C*C) * pi; //area do circulo
			trap = ((A+B)/2) * C; //area do trapezio
			quad = B*B; //area do quadrado
			ret = A*B; //area do retangulo
			
			System.out.println("TRIANGULO: " + tri + "\nCIRCULO: " + circ +
							  "\nTRAPEZIO: " + trap + "\nQUADRADO: " + quad +
							  "\nRETANGULO " + ret);
	}
		
}
