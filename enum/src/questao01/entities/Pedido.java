package questao01.entities;

import questao01.entities.enums.StatusDoPedido;

import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private StatusDoPedido statusDoPedido;

    public Pedido(int id, Date data, StatusDoPedido statusDoPedido) {
        this.id = id;
        this.data = data;
        this.statusDoPedido = statusDoPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", statusDoPedido=" + statusDoPedido +
                '}';
    }
}
