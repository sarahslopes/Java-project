import java.util.Scanner;

public class Par {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        close(teclado);

        if (n % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }
    }

    private static void close(Scanner teclado) {
    }
}