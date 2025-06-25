import java.util.Scanner;

public class LanchoneteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        Produto produto = new Produto(codigo, quantidade);
        double total = produto.calcularTotal();

        if (total >= 0) {
            System.out.printf("Total a pagar: R$ %.2f%n", total);
        } else {
            System.out.println("Código de produto inválido.");
        }

        scanner.close();
    }
}
