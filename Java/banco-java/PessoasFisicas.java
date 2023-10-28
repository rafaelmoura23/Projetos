package ProjectPOO;

import java.util.Scanner;

public class PessoasFisicas {
    Scanner sc = new Scanner(System.in);
    String nome;
    int cpf;
    double conta;
    double saldo;

    //metodos

    //construtor
    public PessoasFisicas() {
    }

    //getts and setts
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //metodos proprios
    
    public void saque() {
        if(saldo>0){
            System.out.println("Quanto deseja Sacar?(R$)");
            double sacado = sc.nextDouble();
            saldo-=sacado;
        } else{
        System.out.println("Saldo Insuficiente");
    }

}
}
