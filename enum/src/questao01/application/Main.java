package questao01.application;

import questao01.entities.Pedido;
import questao01.entities.enums.StatusDoPedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(0001, new Date(), StatusDoPedido.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);
    }
}
