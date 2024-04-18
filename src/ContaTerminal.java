import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {

        // Solicitar e ler os dados da conta bancaria
        Scanner informacoesDaConta = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = informacoesDaConta.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = informacoesDaConta.nextLine();

        System.out.println("Por favor, digite o número da conta.");
        int numero = informacoesDaConta.nextInt();

        System.out.println("Por favor, digite o saldo!");
        double saldo = informacoesDaConta.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", sua conta é " + numero + " e seu saldo corresponde a " + saldo
                + " e já está disponível para saque.");

        informacoesDaConta.close();
    }
}