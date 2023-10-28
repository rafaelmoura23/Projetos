import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor 1: ");
		double valor1 = sc.nextDouble();
		System.out.println("Informe o valor 2: ");
		double valor2 = sc.nextDouble();
		System.out.println("Informe o valor 3: ");
		double valor3 = sc.nextDouble();
		
		if (valor1>valor2 && valor1>valor3){
		System.out.println("O MAIOR VALOR É" +valor1);
		} else if (valor2>valor1 && valor2>valor3){
		System.out.println("O MAIOR VALOR É" +valor2);
		} else {
		System.out.println("O MAIOR VALOR É" +valor3);
		}
}
}

