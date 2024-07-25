package src;

public class main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Banco Digital!");

        Cliente cliente = new Cliente("João", "123.456.789-00");
        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(100);
        contaPoupanca.depositar(200);

        contaCorrente.sacar(50);
        contaCorrente.transferir(30, contaPoupanca);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
