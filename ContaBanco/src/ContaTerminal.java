import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		double saldo = 237.48;
		
		System.out.println("Por favor, digite o número da Conta!");
		int numero = sc.nextInt();
		System.out.println("Por favor, digite o número da Agência!");
		String agencia = sc.next();
		sc.nextLine();
		System.out.println("Por favor, digite seu nome!");
		String name = sc.nextLine();
		
		System.out.println("Olá " + name + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", Conta " + numero + " e seu saldo é R$ " + saldo + " já está disponivel para saque!");
		
		sc.close();		
		
	}

}
