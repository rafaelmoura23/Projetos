import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número de litros vendidos: ");
		double litros = sc.nextDouble();
		System.out.println("Informe o tipo de combustível (1 para Alcool e 2 para gasolina: )");
		double combust = sc.nextDouble();
		
		if (litros<=20 && combust ==1) {
		double alcool1 = (litros*3.90) - (litros*0.03);
		System.out.println("O VALOR A SER PAGO É DE: " +alcool1);
		
		}else if ( litros>20 && combust==1) {
		double alcool2 = (litros*3.90) - (litros*0.05); 
		System.out.println("O VALOR A SER PAGO É DE: " +alcool2);
		
	    }else if (litros<=20 && combust==2){ 
		double gasolina1 = (litros*5.30) - (litros*0.04);
		System.out.println("O VALOR A SER PAGO É DE: " +gasolina1);
		
        }else {
		double gasolina2 = (litros*5.30) - (litros*0.06);
		System.out.println("O VALOR A SER PAGO É DE: " +gasolina2 ); 

	}

	}
}

