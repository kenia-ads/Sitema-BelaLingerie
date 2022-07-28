package BelaLingerie;

import java.util.Scanner;

public class Funcionario extends Pessoa{
   
    private int codigo;
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
public void status(){
    Scanner entrada = new Scanner (System.in); 
   
    do{
        System.out.print("Entre com o código de funcionário: " );
        setCodigo (entrada.nextInt());
    
        switch (getCodigo()){
            case 100:
                setNome ("Carla Fonseca");
                System.out.println("FUNCIONÁRIO: " + getNome());
                break;
            case 101:
                setNome ("Patricia Amaral");
                System.out.println("FUNCIONÁRIO: " + getNome());
                break;
            case 102:
                setNome ("Sandra Sousa");
                System.out.println("FUNCIONÁRIO: " + getNome());
                break;
            default: 
                System.out.println("-FUNCIONÁRIO INVÁLIDO-");   
    }
    }while(getCodigo()<100||getCodigo()>102);
   
}   
}

    
   
