package ProjectPOO;

import java.util.Random;

public class CriacaoConta {
    Random rd = new Random();
    PessoasFisicas contas[]=new PessoasFisicas[10];

    for (int i = 0; i < PessoasFisicas.length; i++) {
        //criar o objeto - construtor
        contas[i] = new PessoasFisicas(); //construtor vazio
        //preencher os atributos (sets)
        contas[i].setNome("Digite o Nome: ");
        contas[i].setCpf(i+18);
        contas[i].setConta(rd.nextDouble(1.5,2));
    }


    
}