package repeticao;

public class Lacos02 {
    public static void main(String[] args) {
        for (int linha = 0; linha <= 10; linha++) {
            for (int coluna = 0; coluna <= 10; coluna++) {
                if (coluna > linha) {
                    // Se a coluna for maior que a linha o laço será quebrado e a execução passará
                    // a ser da proxima linha após esse bloco
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
