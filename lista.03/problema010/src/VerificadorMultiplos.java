import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int primeiro = sc.nextInt();
        int segundo = sc.nextInt();

        VerificadorMultiplos verificador = new VerificadorMultiplos(primeiro, segundo);
        if (verificador.saoMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}

class VerificadorMultiplos {
    private int a;
    private int b;

    public VerificadorMultiplos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean saoMultiplos() {
        return a % b == 0 || b % a == 0;
    }
}
