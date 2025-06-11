// exercicio 01


import java.util.Scanner

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

//exercicio02

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
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }

        sc.close();
    }
}

// exercicio 03

import java.util.Scanner;

public class MenorNumeroApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        MenorNumero menorNumero = new MenorNumero(num1, num2, num3);

        System.out.println("O menor número é: " + menorNumero.encontrarMenor());
    }
}


// exercicio 04


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        PlanoTelefonia plano = new PlanoTelefonia(minutos);
        double valor = plano.calcularValor();

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        sc.close();
    }
}

class PlanoTelefonia {
    private final double valorBasico = 50.00;
    private final int franquiaMinutos = 100;
    private final double valorExcedentePorMinuto = 2.00;
    private int minutosConsumidos;

    public PlanoTelefonia(int minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double calcularValor() {
        if (minutosConsumidos <= franquiaMinutos) {
            return valorBasico;
        } else {
            int minutosExcedentes = minutosConsumidos - franquiaMinutos;
            return valorBasico + (minutosExcedentes * valorExcedentePorMinuto);
        }
    }
}


// exercicio 05


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

// exercicio 06

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double valorGlicose = sc.nextDouble();

        GlicosePaciente glicose = new GlicosePaciente(valorGlicose);
        System.out.println("Classificacao: " + glicose.getClassificacao());

        sc.close();
    }
}

class GlicosePaciente {
    private double valor;

    public GlicosePaciente(double valor) {
        this.valor = valor;
    }

    public String getClassificacao() {
        if (valor <= 100.0) {
            return "normal";
        } else if (valor <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}


// exercicio 07

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

// exercicio 08

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


// exercicio 09


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


// exercicio 10

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

// exercicio 11


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

// exercicio 12

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

// exercicio 13

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


