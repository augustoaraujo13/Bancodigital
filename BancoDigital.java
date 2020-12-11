package bancodigital;
import java.util.Scanner;
public class BancoDigital {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("BEM VINDO AO SEU BANCO");
        System.out.println("----------------------");
        System.out.println("DIGITE SEUS DADOS COM ATENÇÃO");
        System.out.println("----------------------");
        System.out.println("Nome do usuario: ");
        String nome = teclado.next();
        System.out.println("Digite o numero da conta: ");
        int numero = teclado.nextInt();
        System.out.println("Digite o valor a despositar: ");
        float deposito = teclado.nextFloat();
        
        Conta c1 = new Conta();
        c1.setNome_do_usuario(nome);
        c1.setNumero_da_conta(numero);
        c1.setAdicionar_dinheiro(deposito);

        c1.status();
    }
    
}
