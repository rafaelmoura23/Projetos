import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe as horas trabalhadas: ");
		double horas = sc.nextDouble();
		System.out.println("Informe o salário por hora: ");
		double salario = sc.nextDouble();
		if(horas<=200) {
		double salario1 = horas*salario;
		System.out.println("O SALÁRIO TOTAL É DE: " +salario1);
		} else {
		double salario2 = ((horas-200)*0.5)+(salario*horas);
		System.out.println("O SALÁRIO TOTAL É DE: " +salario2);
		
		}
		

	}

}
