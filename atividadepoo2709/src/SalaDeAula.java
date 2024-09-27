public class SalaDeAula {
    private String nomeTurma;
    private int[][] notasAlunos;

    public SalaDeAula() {
        this.nomeTurma = "Turma Desconhecida";
        this.notasAlunos = new int[5][3];
    }

    public SalaDeAula(String nomeTurma, int[][] notasAlunos) {
        this.nomeTurma = nomeTurma;
        this.notasAlunos = notasAlunos;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome da Turma: " + nomeTurma);
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Notas do Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarNotasAcima(int valorMinimo) {
        for (int[] notasAluno : notasAlunos) {
            for (int nota : notasAluno) {
                if (nota < valorMinimo) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SalaDeAula Turma1 = new SalaDeAula();
        Turma1.imprimirInformacoes();

        int[][] notas = {
                {8, 9, 7},
                {6, 5, 8},
                {10, 10, 9},
                {7, 6, 6},
                {9, 8, 10}
        };

        SalaDeAula Turma2 = new SalaDeAula("Turma A", notas);
        Turma2.imprimirInformacoes();

        boolean todasNotasAcima = Turma2.verificarNotasAcima(6);
        System.out.println("Todas as notas são maiores ou iguais a 6? " + todasNotasAcima);
    }
}
