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
}
