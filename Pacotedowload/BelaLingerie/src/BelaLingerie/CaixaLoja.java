package BelaLingerie;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CaixaLoja{
    private String nomep;
    private float vu;
    private int qnt;
    private float vtc;
    private float vti;
    private int codigop;
    private int resp;
    private String frv;
    private float vdin;
    private float vcd;
    private float vcc;
    private float vrdin;
    private float vvf;
    
    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public float getVu() {
        return vu;
    }

    public void setVu(float vu) {
        this.vu = vu;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    public float getVtc() {
        return vtc;
    }

    public void setVtc(float vtc) {
        this.vtc = vtc;
    }
    
    public float getVti() {
        return vti;
    }
    
    public void setVti(float vti) {
        this.vti = vti;
    }
    
    public float getVrdin() {
        return vrdin;
    }

    public void setVrdin(float vrdin) {
        this.vrdin = vrdin;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public float getVdin() {
        return vdin;
    }

    public void setVdin(float vdin) {
        this.vdin = vdin;
    }

    public float getVcd() {
        return vcd;
    }

    public void setVcd(float vcd) {
        this.vcd = vcd;
    }

    public float getVcc() {
        return vcc;
    }

    public void setVcc(float vcc) {
        this.vcc = vcc;
    }
   
     public String getFrv() {
        return frv;
    }

    public void setFrv(String frv) {
        this.frv = frv;
    }

    
    public int getCodigop() {
        return codigop;
    }

    public void setCodigop(int codigop) {
        this.codigop = codigop;
    }
   
    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

        
    public float getVvf() {
        return vvf;
    }

    public void setVvf(float vvf) {
        this.vvf = vvf;
    }
    
    Scanner entrada = new Scanner (System.in);

    public void CabecalhoCaixa(){
        System.out.println(".........................");
        System.out.println("  CADASTRO DE PRODUTOS:  ");
        System.out.println(".........................");
        System.out.println("PARA ENCERRAR A ENTRADA DE PRODUTOS DIGITE (0)");
    } 
    
    public void Produto200(){
        setNomep ("calcinha coração");
        setVu (25f);
        System.out.println("ITEM: " + getNomep());
        System.out.println("Valor untário: " + String.format("%.2f", getVu()));
        System.out.print("Quantidade: ");
        setQnt (entrada.nextInt());
        setVti(getVu() * getQnt());
        System.out.println("Valor total do item: " + String.format("%.2f", getVti()));
        System.out.println(".........................");
        setVtc (getVtc() + getVti());
         
    }
    
    public void Produto201(){
        setNomep ("calcinha oncinha");
        setVu (22.50f);
        System.out.println("ITEM: " + getNomep());
        System.out.println("Valor unitário: " + String.format("%.2f", getVu()));
        System.out.print("Quantidade: ");
        setQnt (entrada.nextInt());
        setVti(getVu() * getQnt());
        System.out.println("Valor total do item: " + String.format("%.2f", getVti()));
        System.out.println(".........................");
        setVtc (getVtc() + getVti());
           
    }
    
   public void Produto202(){
            setNomep ("sutiã renda branco");
                setVu(35.90f);
                System.out.println("ITEM: " + getNomep());
                System.out.println("Valor untário: " + String.format("%.2f", getVu()));
                System.out.print("Quantidade: ");
                setQnt (entrada.nextInt());
                setVti(getVu() * getQnt());
                System.out.println("Valor total do item: " + String.format("%.2f", getVti()));
                System.out.println(".........................");
                setVtc (getVtc() + getVti());
                   
   }
    
    public void LancamentoProdutos(){
        
        do{
        System.out.print("Código do produto: ");  
        setCodigop (entrada.nextInt());
        switch (getCodigop()){
            case (200):
                Produto200();                
                break;
            case (201):
                Produto201();
                break;
            case (202):
                Produto202();
                break;
            case (0):
                System.out.println("Finalizando o cadastro de produtos...");
                System.out.println("------------------------------------------------------------");
                break;
               
            default:                
                System.out.println("-PRODUTO INVÁLIDO-");
                System.out.println(".........................");
                
        }
        }while(getCodigop()!=0);
    }
  
    public void caixa(){            
        System.out.println("");
        System.out.println("VALOR TOTAL DA COMPRA : R$ " + String.format("%.2f", getVtc()));
        System.out.println("");
        
        do{
        setResp((int)Float.parseFloat(JOptionPane.showInputDialog(null, "<html>ESCOLHA UMA FORMA DE PAGAMENTO"
            + "<br>[1] DINHEIRO <br>[2] CARTÃOD DE DÉBITO <br> [3] CARTÃO DE CRÉDITO")));
        
        setVdin((float)(getVtc() - getVtc() * 0.07));
        setVcd((float)(getVtc() - getVtc() * 0.03));
        setVcc((float)(getVtc()));
                
        switch(getResp()){
            case (1):
                System.out.println("VALOR TOTAL À PAGAR : R$ " + String.format("%.2f", getVdin()));
                System.out.print("VALOR RECEBIDO: R$");
                setVrdin(entrada.nextFloat());
                System.out.println("TROCO: R$" + String.format("%.2f", (float)(getVrdin() - getVdin()))); 
                System.out.println(" ");
                System.out.println("            OBRIGADO PELA PREFERÊNCIA               ");
                System.out.println(" ");
                break;
            case (2): 
                System.out.println("VALOR TOTAL À PAGAR : R$ " + String.format("%.2f", getVcd()));
                System.out.println(" ");
                System.out.println("            OBRIGADO PELA PREFERÊNCIA               ");
                System.out.println(" ");
                break;                
            case (3): 
                System.out.println("VALOR TOTAL À PAGAR : R$ " + String.format("%.2f", getVcc()));
                System.out.println(" ");
                System.out.println("            OBRIGADO PELA PREFERÊNCIA               ");
                System.out.println(" ");
                break;
        }
        }while(getResp()<1 || getResp()>3);  
     
    } 
    
public void status(){
    CabecalhoCaixa();
    LancamentoProdutos();
    caixa();
}
}  

    

    
 
   
