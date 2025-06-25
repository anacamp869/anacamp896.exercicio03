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

