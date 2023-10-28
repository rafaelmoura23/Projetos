package ProjectPOO;

import java.util.Scanner;

//public class Retangulo implements FigurasGeometricas

   public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar o banco - construtor
        PessoasFisicas banco1 = new PessoasFisicas();

        //enquando for true o aplicativo estará rodando
        boolean logado = true;

        while(logado){
            System.out.println("O Que Deseja? " +"\n1-Criar Conta"+"\n2-Buscar Conta"+"\n3-Sair do App"); //primeira parte, perguntar se deseja criar ou buscar conta
            int primeiraAcao = sc.nextInt();

            if(primeiraAcao==1){
                System.out.print("Informe o tipo de Pessoa: ");
                System.out.println("\n1-Pessoa Física"+"\n2-Pessoa Jurídica");
                int segundaAcao = sc.nextInt();
                if(segundaAcao==1){
                    System.out.println("Nome: "); // pedir os dados
                    String nome = sc.nextLine();
                    System.out.println("CPF: ");
                    int cpf = sc.nextInt();
                    System.out.println("n° Conta: "); //gerar o numero da conta
                    System.out.println("Saldo: ");
                } else if(segundaAcao==2){
                    System.out.println("Nome: "); // pedir os dados
                    System.out.println("CNPJ: ");
                    System.out.println("n° Conta: "); //gerar o numero da conta
                    System.out.println("Saldo: ");
                } else{
                    System.out.println("Escolha uma opção Válida!");
                }

            } else if(primeiraAcao==2){

            } else if(primeiraAcao==3){
                logado=false;
            } else{
                System.out.println("Digite uma opção Válida!");
            }
        }
    }
}
