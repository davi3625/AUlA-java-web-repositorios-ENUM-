package application;

import entities.Pedido;
import enums.PedidoStatus;

import java.time.LocalDate;

public class ProgramEnum {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();

        Pedido pedido = new Pedido(100, d01, PedidoStatus.PAGAMENTO_PENDENTE);
        PedidoStatus ps2 = PedidoStatus.valueOf("ENTREGUE");



        PedidoStatus ps1 = PedidoStatus.PROCESSANDO;
        System.out.println(pedido);
        System.out.println(ps1);
        System.out.println(ps2);
    }


}
