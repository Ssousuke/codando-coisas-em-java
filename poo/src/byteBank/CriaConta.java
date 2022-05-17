package byteBank;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 0.0;
        primeiraConta.deposita(500.0);
        System.out.println(primeiraConta.saldo);
        boolean retornoDoMetodo = primeiraConta.saca(100.0);
        System.out.println(primeiraConta.saldo);
        System.out.println(retornoDoMetodo);

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000.0);
        segundaConta.transfere(500.0, primeiraConta);
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

    }
}
