import java.util.Scanner;


    public class TrocoApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Preço unitário do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade comprada: ");
            int quantidade = scanner.nextInt();

            System.out.print("Valor recebido: ");
            double valorRecebido = scanner.nextDouble();

            Troco troco = new Troco(preco, quantidade, valorRecebido);

            if (troco.pagamentoSuficiente()) {
                System.out.printf("Troco: R$ %.2f%n", troco.calcularTroco());
            } else {
                System.out.printf("Dinheiro insuficiente. Faltam R$ %.2f%n", troco.calcularValorFaltante());
            }

            scanner.close();
        }
    }


