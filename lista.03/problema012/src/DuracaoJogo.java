import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        int horaFinal = sc.nextInt();

        DuracaoJogo jogo = new DuracaoJogo(horaInicial, horaFinal);
        int duracao = jogo.calcularDuracao();

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}

class DuracaoJogo {
    private int horaInicial;
    private int horaFinal;

    public DuracaoJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        if (horaInicial == horaFinal) {
            return 24;
        } else if (horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else {
            return 24 - horaInicial + horaFinal;
        }
    }
}
