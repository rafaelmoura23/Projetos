import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número da sua conta: ");
		double conta = sc.nextDouble();
		System.out.println("Informe o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		System.out.println("Informe o débito da sua conta: ");
		double debito = sc.nextDouble();
		System.out.println("Informe o crédito da sua conta: ");
		double credito = sc.nextDouble();
		double saldoAtual = (saldo-debito+credito);
		if(saldoAtual>=0) {
		System.out.println("SALDO POSITIVO " +saldoAtual);
		} else{
		System.out.println("SALDO NEGATIVO " +saldoAtual);
		}
	}
}
