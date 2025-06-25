import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite a temperatura em " + (escala == 'C' ? "Celsius" : "Fahrenheit") + ": ");
        double temperatura = sc.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura(temperatura, escala);
        double resultado = conversor.converter();

        if (escala == 'C') {
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", resultado);
        } else {
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", resultado);
        }

        sc.close();
    }
}

class ConversorTemperatura {
    private double temperatura;
    private char escala;

    public ConversorTemperatura(double temperatura, char escala) {
        this.temperatura = temperatura;
        this.escala = escala;
    }

    public double converter() {
        if (escala == 'C') {
            return (temperatura * 9.0 / 5.0) + 32.0;
        } else {
            return (5.0 / 9.0) * (temperatura - 32.0);
        }
    }
}
