public class EstoqueLoja {
    private String nomeProduto;
    private int[][] quantidadesPorLote;

    public EstoqueLoja() {
        this.nomeProduto = "Produto Desconhecido";
        this.quantidadesPorLote = new int[4][2];
    }

    public EstoqueLoja(String nomeProduto, int[][] quantidadesPorLote) {
        this.nomeProduto = nomeProduto;
        this.quantidadesPorLote = quantidadesPorLote;
    }

    public void imprimirEstoque() {
        System.out.println("Nome do Produto: " + nomeProduto);
        for (int i = 0; i < quantidadesPorLote.length; i++) {
            System.out.println("Lote " + (i + 1) + ": Quantidade Disponível = "
                    + quantidadesPorLote[i][0] + ", Quantidade Vendida = "
                    + quantidadesPorLote[i][1]);
        }
    }

    public boolean verificarLoteCritico(int limiteVenda) {
        for (int[] lote : quantidadesPorLote) {
            if (lote[1] > limiteVenda) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EstoqueLoja estoque1 = new EstoqueLoja();
        estoque1.imprimirEstoque();

        int[][] quantidades = {
                {50, 20},
                {30, 15},
                {80, 60},
                {100, 90}
        };

        EstoqueLoja estoque2 = new EstoqueLoja("Produto A", quantidades);
        estoque2.imprimirEstoque();

        boolean loteCritico = estoque2.verificarLoteCritico(50);
        System.out.println("Algum lote vendeu mais que o limite de 50? " + loteCritico);
    }
}
