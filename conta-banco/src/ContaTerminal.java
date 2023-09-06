import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

            int numero = 1021;
            String agencia	= "067-8";
            String nomeCliente = "RUAN LUCAS";
            double saldo = 237.48;

            System.out.println("Por favor, digite o numero da Agencia");
            scanner.nextInt();
            System.out.println("Ola " + nomeCliente + "! obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " ja esta disponivel para saque!");
        
    }   
}