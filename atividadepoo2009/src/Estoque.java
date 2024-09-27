public class Estoque {
    private String produto;
    private int[] quantidades;

    public Estoque() {
        this.produto = "Produto Desconhecido";
        this.quantidades = new int[5];
    }

    public Estoque(String produto, int[] quantidades) {
        this.produto = produto;
        if (quantidades.length == 5) {
            this.quantidades = quantidades;
        } else {
            this.quantidades = new int[5];
        }
    }

    public void imprimirEstoque() {
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidades por lote:");
        for (int quantidade : this.quantidades) {
            System.out.println(quantidade);
        }
    }

    public String calcularTotalEstoque() {
        int total = 0;
        for (int quantidade : this.quantidades) {
            total += quantidade;
        }
        return "Total em estoque: " + total;
    }

    public boolean verificarDisponibilidade(int quantidadeMinima) {
        for (int quantidade : this.quantidades) {
            if (quantidade > quantidadeMinima) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        estoque1.imprimirEstoque();
        System.out.println(estoque1.calcularTotalEstoque());
        System.out.println("Algum lote com mais de 10 unidades? " + estoque1.verificarDisponibilidade(10));

        int[] lotes = {15, 7, 0, 22, 5};
        Estoque estoque2 = new Estoque("Cadeiras", lotes);
        estoque2.imprimirEstoque();
        System.out.println(estoque2.calcularTotalEstoque());
        System.out.println("Algum lote com mais de 10 unidades? " + estoque2.verificarDisponibilidade(10));
    }
}
