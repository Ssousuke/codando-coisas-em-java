package basico;

public class Valores {
    public static void main(String[] args) {
        // Tipos valores
        int primeiro = 10;
        int segundo = 20;

        // A variavel primeiro vai receber o valor 20
        primeiro = segundo;

        // Mesmo a variavel segundo recebendo um novo valor,
        // a variavel primeiro vai continuar recebendo 20
        segundo = 30;
        System.out.println(primeiro);
    }
}
