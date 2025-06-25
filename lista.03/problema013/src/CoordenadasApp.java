import java.util.Scanner;

public class CoordenadasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        Ponto ponto = new Ponto(x, y);

        System.out.println(ponto.localizacao());

        scanner.close();
    }
}