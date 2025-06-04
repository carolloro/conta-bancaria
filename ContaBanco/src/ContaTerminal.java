import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //importando Scanner
        Scanner scanner = new Scanner(System.in);

        //Declarando variáveis
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;


        //Lendo dados do usuário
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        //Exibindo os dados informados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");    

        //Fechando o scanner
        scanner.close();
    }
}
