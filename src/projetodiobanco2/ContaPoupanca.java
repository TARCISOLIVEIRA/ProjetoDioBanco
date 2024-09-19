
package projetodiobanco2;


public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public ContaPoupanca() { 
        super();
    }

    public void imprimirExtrato() {
        System.out.println("...... Extrato de Conta Poupanca .........");
        super.imprimirInfosComuns();
    }
    
    
}
