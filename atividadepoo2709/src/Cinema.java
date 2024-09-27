public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;

    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5];
    }

    public Cinema(String nomeCinema, boolean[][] assentos) {
        this.nomeCinema = nomeCinema;
        this.assentos = assentos;
    }

    public void imprimirAssentos() {
        System.out.println("Nome do Cinema: " + nomeCinema);
        for (int i = 0; i < assentos.length; i++) {
            System.out.print("Fileira " + (i + 1) + ": ");
            for (int j = 0; j < assentos[i].length; j++) {
                System.out.print(assentos[i][j] ? "Ocupado " : "Livre ");
            }
            System.out.println();
        }
    }

    public boolean verificarLotacaoFileira(int numeroFileira, int limiteOcupacao) {
        int assentosOcupados = 0;
        for (boolean assento : assentos[numeroFileira]) {
            if (assento) {
                assentosOcupados++;
            }
        }
        return assentosOcupados > limiteOcupacao;
    }

    public static void main(String[] args) {
        Cinema cinema1 = new Cinema();
        cinema1.imprimirAssentos();

        boolean[][] assentosPersonalizados = {
                {true, false, true, false, true},
                {false, false, true, true, true},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {true, true, true, true, true}
        };

        Cinema cinema2 = new Cinema("Cinema A", assentosPersonalizados);
        cinema2.imprimirAssentos();

        boolean lotacaoExcedida = cinema2.verificarLotacaoFileira(1, 3);
        System.out.println("A fileira 2 excedeu o limite de ocupação de 3? " + lotacaoExcedida);
    }
}
