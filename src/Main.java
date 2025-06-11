import java.util.Scanner;

class Aluno {
    private double nota1;
    private double nota2;


    public void lerNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do 1º semestre: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a nota do 2º semestre: ");
        nota2 = scanner.nextDouble();
    }


    public double calcularNotaFinal() {
        return (nota1 + nota2) / 2.0;
    }


    public void mostrarResultado() {
        double notaFinal = calcularNotaFinal();
        System.out.printf("Nota final: %.1f\n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.lerNotas();
        aluno.mostrarResultado();
    }
}