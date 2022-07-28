package BelaLingerie;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BelaLingerie {
  
    public static void main(String[] args) { 
        Scanner entrada = new Scanner (System.in); 
        String nomef[] = new String[3]; 
        float vendaf[] = new float[3];
        
        Cabecalho cb = new Cabecalho();
        Funcionario f = new Funcionario();
        Cliente c = new Cliente();
        CaixaLoja cl = new CaixaLoja();
        
        JOptionPane.showMessageDialog(null,"SEJA BEM VINDO!");
                  
        for(int i=0; i<3; i++){ 
        cb.status();
        f.status();
        c.status();        
        cl.status();
        nomef[i] = f.getNome();
        vendaf[i] = cl.getVtc();
        cl.setVtc (0);
        }
                
        System.out.println("------------------------------------------------------------");
        System.out.println("            RELATÓRIO DE VENDAS POR FUNCIONÁRIO             ");
        System.out.println("------------------------------------------------------------");
        
        for (int i=0; i<3; i++){
        System.out.println("FUNCIONÁRIO: " + nomef[i]); 
        System.out.println("Valor total vendido: R$" + String.format("%.2f", vendaf[i]));
        System.out.println("------------------------------------------------------------");
        }       
    }
}       
        

    
                     
    
  
    
        

        
  
        
        
        
        
       

