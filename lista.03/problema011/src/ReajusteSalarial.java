import java.util.Scanner;

public class ReajusteSalarialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual: ");
        double salarioAtual = scanner.nextDouble();

        ReajusteSalarial reajuste = new ReajusteSalarial(salarioAtual);

        System.out.printf("Novo salário: R$ %.2f%n", reajuste.getNovoSalario());
        System.out.printf("Aumento: R$ %.2f%n", reajuste.getValorAumento());
        System.out.printf("Porcentagem: %.0f%%%n", reajuste.getPercentual());

        scanner.close();
    }
}
