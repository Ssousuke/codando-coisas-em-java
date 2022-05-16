package basico;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        double salario = 1250.50;
        // O compilador não permite que uma variavel do tipo int receba o valor do tipo double
        // esse processo faz com que o número atribuido perca precisão.
        // int valor = salario;

        // Mas o desenvolvedor pode informar explicitamente ao compilador que deseja fazer essa atribuição

        // casting
        int valor = (int) salario;
        System.out.println(valor);

        float pontoFlutuante = 3.14f;
        // float pontoFlutuante = (float) 3.14; casting
        long numeroGrande = 9000000000000000000L;
        short valorPequeno = 10000;
        byte valorByte = 127;
    }
}
