import java.util.Scanner;

public class ArremessoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Distância do primeiro arremesso: ");
        double tentativa1 = scanner.nextDouble();

        System.out.print("Distância do segundo arremesso: ");
        double tentativa2 = scanner.nextDouble();

        System.out.print("Distância do terceiro arremesso: ");
        double tentativa3 = scanner.nextDouble();

        Arremesso arremesso = new Arremesso(tentativa1, tentativa2, tentativa3);

        System.out.printf("Maior distância: %.2f metros%n", arremesso.maiorDistancia());

        scanner.close();
    }
}