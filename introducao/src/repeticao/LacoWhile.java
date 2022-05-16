package repeticao;

public class LacoWhile {
    public static void main(String[] args) {
        int contador = 0;
        // While é o laço de repetição que executa enquanto a condição for true
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
            // ++contador;
            // contador = contador + 1
            // contador += 1;
        }
        System.out.println(contador);
    }
}
