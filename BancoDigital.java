 package bancodigital;
import java.util.Scanner;
public class BancoDigital {

    public static void main(String[] args) {
        Scanner top = new Scanner(System.in);
        
        System.out.println("Bem vindo a sua conta: ");
        System.out.println("Digite seus dados com atenção: ");
        System.out.println("Nome do usuario: ");
        String nome = top.next();
        System.out.println("Digite o numero da conta: ");
        int num = top.nextInt();
        System.out.println("Digite o valor a despositar: ");
        float dep = top.nextFloat();
        
        Conta c1 = new Conta();
        c1.setNome_do_usuario(nome);
        c1.setNumero_da_conta(num);
        c1.depositar(dep);
        
        c1.status();
    }
    
}
