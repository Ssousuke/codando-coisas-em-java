package byteBank;

public class TesteReferencia {
    public static void main(String[] args) {
        // primeiraConta não é um objeto, é uma referência para o Objeto Conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.0;
    }
}
