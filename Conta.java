package bancodigital;
public class Conta {
    
    private String nome_do_usuario;
    private int numero_da_conta;
    private float adicionar_dinheiro;
    
    public void status(){
        System.out.println("---------------------");
        System.out.println("Nome do usuario da conta: "+this.getNome_do_usuario().trim());
        System.out.println("Numero do conta: "+this.getNumero_da_conta());
        System.out.printf("Valor total na conta em dinheiro R$ %.2f",this.getAdicionar_dinheiro());
        System.out.println();
        System.out.println("---------------------");
    }
  
    public float getAdicionar_dinheiro() {
        return adicionar_dinheiro;
    }

    public void setAdicionar_dinheiro(float adicionar_dinheiro) {
        this.adicionar_dinheiro = adicionar_dinheiro;
    }
    
    public String getNome_do_usuario() {
        return nome_do_usuario;
    }

    public void setNome_do_usuario(String nome_do_usuario) {
        
        this.nome_do_usuario = nome_do_usuario;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(int numero_da_conta) {
        this.numero_da_conta = numero_da_conta;
    }       
}