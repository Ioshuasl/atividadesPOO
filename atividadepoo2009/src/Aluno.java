public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno() {
        this.nome = "Desconhecido";
        this.notas = new double[4];
    }

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        if (notas.length == 4) {
            this.notas = notas;
        } else {
            this.notas = new double[4];
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.print("Notas: ");
        for (double nota : this.notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public String calcularMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return "Média " + (soma /4);
    }

    public boolean verificarNotaAprovacao(double valor) {
        for (double nota : this.notas) {
            if (nota < valor) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {Aluno aluno1 = new Aluno();
        aluno1.imprimirInformacoes();
        System.out.println(aluno1.calcularMedia());
        System.out.println("Aprovado? " + aluno1.verificarNotaAprovacao(6.0));

        double[] notas = {7.3, 9.0, 8.1, 6.5};
        Aluno aluno2 = new Aluno("Ioshua", notas);
        aluno2.imprimirInformacoes();
        System.out.println(aluno2.calcularMedia());
        System.out.println("Aprovado? " + aluno2.verificarNotaAprovacao(6.0));
    }
}
