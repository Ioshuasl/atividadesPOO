public class Empresa {
    private String nome;
    private String[] funcionarios;

    public Empresa() {
        this.nome = "Empresa Desconhecida";
        this.funcionarios = new String[8];
    }

    public Empresa(String nome, String[] funcionarios) {
        this.nome = nome;
        if (funcionarios.length == 8) {
            this.funcionarios = funcionarios;
        } else {
            this.funcionarios = new String[8];
        }
    }

    public void imprimirFuncionarios() {
        System.out.println("Nome da Empresa: " + this.nome);
        System.out.println("Funcionários:");
        for (String funcionario : this.funcionarios) {
            if (funcionario != null) {
                System.out.println(funcionario);
            } else {
                System.out.println("Vaga vazia");
            }
        }
    }

    public String contarFuncionarios() {
        int contador = 0;
        for (String funcionario : this.funcionarios) {
            if (funcionario != null) {
                contador++;
            }
        }
        return "Quantidade de funcionários: " + contador;
    }

    public boolean verificarFuncionario(String nomeFuncionario) {
        for (String funcionario : this.funcionarios) {
            if (funcionario != null && funcionario.equals(nomeFuncionario)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        empresa1.imprimirFuncionarios();
        System.out.println(empresa1.contarFuncionarios());
        System.out.println("Funcionário 'Carlos' está cadastrado? " + empresa1.verificarFuncionario("Carlos"));

        String[] funcionarios = {"Ioshua", "Felipe", "Paulo", "Joao Pedro", null, null, "Carlos", "Alanna"};
        Empresa empresa2 = new Empresa("Tech Solutions", funcionarios);
        empresa2.imprimirFuncionarios();
        System.out.println(empresa2.contarFuncionarios());
        System.out.println(empresa2.verificarFuncionario("Carlos"));
        System.out.println(empresa2.verificarFuncionario("Lucas"));
    }
}
