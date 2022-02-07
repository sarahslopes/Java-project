import java.util.Scanner;

public class exIf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();

        close(teclado);

        if (n1 >= 0) {
            System.out.println("POSITIVO!");
        } else {
            System.out.println("NEGATIVO!");
        }

    }

    private static void close(Scanner teclado) {
    }
}
