
package projetodiobanco2;


public class ProjetoDioBanco2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco bancoFrente = new Banco(); //instancia novo banco
    
            bancoFrente.setNome("Banco Paulista"); 
    
            Cliente t2 = new Cliente("Tarciso", bancoFrente);  
            t2.setNome("Tarciso dos Santos de Oliveira"); 
    
            Conta corrente = new ContaCorrente(t2);     
            corrente.depositar(150); 
    
            Cliente carlos = new Cliente("Carlos", bancoFrente);  
            Conta poupanca = new ContaPoupanca(carlos);      
            corrente.imprimirExtrato();  
            poupanca.imprimirExtrato();  
    
            corrente.transferir(73, poupanca);  
    
            corrente.imprimirExtrato(); 
            poupanca.imprimirExtrato(); 
            bancoFrente.mostrarClientes(); 
    
            Cliente maria = new Cliente("maria felix", bancoFrente);  
            Conta corrente2 = new ContaCorrente(maria); 
            corrente2.imprimirExtrato();  
            bancoFrente.mostrarClientes(); 
        }


    }
    

