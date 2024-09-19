
package projetodiobanco2;


public class ContaCorrente extends Conta {
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public ContaCorrente() {  
        super();
    }

    public void imprimirExtrato() {
        System.out.println("......... Conta Corrente .......");
        super.imprimirInfosComuns(); 
    } 
       
     

    
}
