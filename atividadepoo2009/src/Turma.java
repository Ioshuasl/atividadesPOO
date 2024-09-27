import java.util.Arrays;

public class Turma {
    private String nomeTurma;
    private String[] alunos;

    public Turma(){
        this.nomeTurma = "";
        this.alunos = new String[5];
    }

    public Turma(String nomeTurma, String[] alunos) {
        this.nomeTurma = nomeTurma;
        if (alunos.length == 5) {
            this.alunos = alunos;
        } else {
            this.alunos = new String[5];
        }
    }

    public void imprimirTurma(){
        System.out.println("Nome da turma: " + this.nomeTurma);
        System.out.print("Alunos: ");
        System.out.println("");
        for (String aluno : this.alunos) {
            if (aluno != null) {
                System.out.println(aluno);
            } else {
                System.out.println("Vaga vazia");
            }
        }
    }

    public String quantidadeAlunos() {
        int quantidade = 0;
        for (String aluno : this.alunos) {
            if (aluno != null) {
                quantidade++;
            }
        }
        return "Quantidade de alunos: " + quantidade;
    }

    public boolean buscarAluno(String nome) {
        for (String aluno : this.alunos) {
            if (aluno != null && aluno.equals(nome)) {
                System.out.println(nome + " está na turma");
                return  true;
            }

        }
        System.out.println(nome + " não está na turma");
        return false;
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.imprimirTurma();
        System.out.println(turma1.quantidadeAlunos());
        System.out.println(turma1.buscarAluno("João"));

        String[] alunos = {"Ioshua", "Felipe", "Paulo", "Joao Pedro", null}; // Um aluno vazio
        Turma turma2 = new Turma("Matemática", alunos);
        turma2.imprimirTurma();
        System.out.println(turma2.quantidadeAlunos());
        System.out.println(turma2.buscarAluno("Ioshua"));
        System.out.println(turma2.buscarAluno("Carlos"));
    }
}
