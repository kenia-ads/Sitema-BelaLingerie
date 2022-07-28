package BelaLingerie;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cliente extends Pessoa {
    Scanner entrada = new Scanner (System.in);
    
    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
    
    public void status(){
        
                  
    do{
        setOpcao((int)Float.parseFloat(JOptionPane.showInputDialog(null, "<html>PARA ENTRAR COM O CLIENTE, ESCOLHA UMA DAS OPÇÕES ABAIXO:<br>[1] TELEFONE<br>[2] CPF")));
        switch (getOpcao()){
            case 1:
                System.out.print("TELEFONE: ");
                setTelefone (entrada.next());
                switch (getTelefone()){
                    case "27997017951":
                        setNome ("Kênia Silva Pereira");
                        break;
                    case "27996379998":
                        setNome ("Margarete Borges do Santos");
                        break;            
                    case "27997264754":
                     setNome ("Sérgio Ribeiro Nascimento Júnior");
                    break;
                    default:
                        setNome ("-CLIENTE NÃO CADASTRADO-");                      
                } 
            break;  
            case 2:
                System.out.print("CPF: ");
                setCpf (entrada.next());
                switch (getCpf()){
                    case "012.345.678-9":
                        setNome ("Kênia Silva Pereira");
                     break;
                    case "123.456.789-0":
                        setNome ("Margarete Borges do Santos");
                        break;
                    case "098.765.432-1":
                        setNome ("Sérgio Ribeiro Nascimento Júnior");
                        break;
                    default: 
                        setNome ("-CLIENTE NÃO CADASTRADO-");    
            }
            break;     
    } 
    }while(getOpcao()<1 || getOpcao()>2);
    
    System.out.println("CLIENTE: " + getNome());        
    }        
            
}
