// Versão corrigida
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        scanner.close();
        
        String mensagem = "Olá " + nomeCliente + 
                        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                        ", conta " + numero + 
                        " e seu saldo " + String.format("%.2f", saldo) + 
                        " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}