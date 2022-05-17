package byteBank;

public class CriaConta {
    public static void main(String[] args) {
        Cliente wesley = new Cliente();
        wesley.nome = "Wesley Farias";
        wesley.cpf = "075.230.463-12";
        wesley.profissao = "Desenvolvedor de Software";

        Conta wesleyConta = new Conta();
        wesleyConta.deposita(100);

        // Composição é basicamente usar uma classe dentro da outra.
        // Mais precisamente é fazer com que duas classes troquem informações.
        // neste casso a Classe Conta está recebendo informações da classe Cliente.
        wesleyConta.titular = wesley;

        System.out.println(wesleyConta.titular.nome);
    }
}
