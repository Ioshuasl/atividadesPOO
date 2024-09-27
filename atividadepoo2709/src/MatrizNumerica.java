public class MatrizNumerica {
    private String nomeMatriz;
    private int[][] matrizNumeros;

    public MatrizNumerica() {
        this.nomeMatriz = "Matriz Desconhecida";
        this.matrizNumeros = new int[3][3];
    }

    public MatrizNumerica(String nomeMatriz, int[][] matrizNumeros) {
        this.nomeMatriz = nomeMatriz;
        this.matrizNumeros = matrizNumeros;
    }

    public void imprimirMatriz() {
        System.out.println("Nome da Matriz: " + nomeMatriz);
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.print(matrizNumeros[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarDiagonal(int valorMinimo) {
        for (int i = 0; i < matrizNumeros.length; i++) {
            if (matrizNumeros[i][i] <= valorMinimo) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MatrizNumerica matriz1 = new MatrizNumerica();
        matriz1.imprimirMatriz();

        int[][] numeros = {
                {5, 2, 3},
                {4, 8, 6},
                {7, 1, 9}
        };

        MatrizNumerica matriz2 = new MatrizNumerica("Matriz A", numeros);
        matriz2.imprimirMatriz();

        boolean diagonalMaiorQue = matriz2.verificarDiagonal(4);
        System.out.println("Todos os valores da diagonal são maiores que 4? " + diagonalMaiorQue);
    }
}
