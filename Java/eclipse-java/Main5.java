import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do Produto: ");
		String nome = sc.nextLine();
		System.out.println("Informe a quantidade Adquirida: ");
		double quantidade = sc.nextDouble();
		System.out.println("Informe o preço Unitário: ");
		double preco = sc.nextDouble();
		double total = quantidade*preco;
		
		if(quantidade<=5) {
		double desconto1 = total*0.02;
		double totalPagar = total-desconto1;
		System.out.println("O PRODUTO É: " +nome);
		System.out.println("O PREÇO TOTAL É DE: " +total);
		System.out.println("O DESCONTO É DE: " +desconto1);
		System.out.println("O TOTAL A PAGAR É DE: " +totalPagar);
		
		}else if(quantidade>5 && quantidade<=10) {
		double desconto2 = total*0.03;
		double totalPagar2 = total - desconto2;
		System.out.println("O PRODUTO É: " +nome);
		System.out.println("O PREÇO TOTAL É DE: " +total);
		System.out.println("O DESCONTO É DE: " +desconto2);
		System.out.println("O TOTAL A PAGAR É DE: " +totalPagar2);
		
		}else {
		double desconto3 = total*0.05;
		double totalPagar3 = total - desconto3;
		System.out.println("O PRODUTO É: " +nome);
		System.out.println("O PREÇO TOTAL É DE: " +total);
		System.out.println("O DESCONTO É DE: " +desconto3);
		System.out.println("O TOTAL A PAGAR É DE: " +totalPagar3);	
		}
		}

	}


