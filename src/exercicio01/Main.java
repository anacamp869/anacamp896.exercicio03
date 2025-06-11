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


import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else {
            // Cálculo das raízes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // Exibição das raízes com 4 casas decimais
            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }

        sc.close();
    }
}




