package conta_banc_caixa_elet;

import java.util.Scanner;

public class conta {

    private String nome;
    private int conta;
    private float saldo;
    private int saques = 3;
    Scanner entrada = new Scanner(System.in);

    public conta() {
        System.out.println("Digite seu nome:");
        this.nome = entrada.nextLine();
        System.out.println("Digite o valor para depositar:");
        this.saldo = entrada.nextFloat();
        this.conta = (int) (Math.random() * 1000 + 1000);
        iniciar();

    }

    public void extrato() {
        System.out.printf(
                "\n\t|DADOS DA CONTA|\n\t|Cliente: %s|\n\t|Numero da Conta: %d|\n\t|Saldo:%.2f|\n\t|Saques disponiveis: %d|\n\n",
                nome, conta, saldo, saques);
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saques--;
            saldo -= valor;
            System.out.printf("Saldo atual: %.2f", saldo);

        } else {
            System.out.printf("Saldo insuficiente para saque!");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.printf("Saldo atual: %.2f\n\n", saldo);
    }

    public void iniciar() {
        int opcao;

        do {
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        } while (opcao != 4);
    }

    public void exibeMenu() {
        System.out.println(
                "\n\t|MENU DE OPCOES|\n\t1 - EXTRATO\n\t2 - SACAR\n\t3 - DEPOSITAR\n\t4 - SAIR\n\tEscolha uma das opcoes acima\n");
    }

    public void escolheOpcao(int opcao) {
        switch (opcao) {
            case 1:
                extrato();
                break;
            case 2:
                if (saques > 0) {
                    System.out.println("\n\tDigite quanto deseja sacar:");
                    float valor = entrada.nextFloat();
                    sacar(valor);
                } else {
                    System.out.println("\n\tVoce ja atingiu a cota de saques do dia:");
                }
                break;
            case 3:
                System.out.println("\n\tDigite quanto deseja depositar:");
                float valor = entrada.nextFloat();
                depositar(valor);
                break;

            case 4:
                break;

            default:
                System.out.println("\n\tOpcao invalida, tente novamente!");
                break;
        }
    }

}
