import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        System.out.println("=== Contas do " + nome + " ===");  
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + " | Titular: " + conta.getTitular());
        }
    }

    public String getNome() {
        return nome;
    }
}
