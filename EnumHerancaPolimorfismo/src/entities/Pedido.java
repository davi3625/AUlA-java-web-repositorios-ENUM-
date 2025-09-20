package entities;

import enums.PedidoStatus;

import java.time.LocalDate;

public class Pedido {
    private Integer id;
    private LocalDate data;
    private PedidoStatus pedido;

    public Pedido() {

    }

    public Pedido(Integer id, LocalDate data, PedidoStatus pedido) {
        this.id = id;
        this.data = data;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public PedidoStatus getPedido() {
        return pedido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPedido(PedidoStatus pedido) {
        this.pedido = pedido;

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", pedido=" + pedido +
                '}';
    }
}



