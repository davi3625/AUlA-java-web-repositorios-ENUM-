package application;

import entities.ContaEmpresa;

public class ProgramHeranca {
    public static void main(String[] args) {
        ContaEmpresa contaEmpresa = new ContaEmpresa();

        contaEmpresa.setNumero(101);
        contaEmpresa.setTitular("João bilulas");
        contaEmpresa.setSaldo(1000.00);


        contaEmpresa.deposito(100.0);

        System.out.println(contaEmpresa);


        // ===========================================

        ContaEmpresa contaEmpresa1 = new ContaEmpresa(102, "Joana de bilulas", 1000.00, 2000.00);

        contaEmpresa1.emprestimo(500.0);

        System.out.println(contaEmpresa1);

    }
}
