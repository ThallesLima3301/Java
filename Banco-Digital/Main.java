public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Digital");

      
        ContaCorrente cc1 = new ContaCorrente(1001, "Thalles Lima", 500.0);
        ContaPoupanca cp1 = new ContaPoupanca(1002, "Ana Souza", 0.02);

        
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);

       
        cc1.depositar(1000);
        cp1.depositar(1500);

       
        cc1.sacar(1300);  
        cp1.sacar(500);

        
        cc1.transferir(cp1, 200);

        // Aplicando rendimento na poupança
        cp1.aplicarRendimento();

        
        banco.listarContas();

        // Exibindo saldo atualizado das contas
        System.out.println("\n=== Saldos Atualizados ===");
System.out.printf("Saldo da Conta Corrente: R$ %.2f (Limite Cheque Especial: R$ %.2f)%n", cc1.getSaldo(), cc1.getLimiteChequeEspecial());
System.out.printf("Saldo da Conta Poupança: R$ %.2f%n", cp1.getSaldo());

    }
}

