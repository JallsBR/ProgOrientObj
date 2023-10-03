package meus;

public class PessoaFisica extends Pessoa{
    String cpf;

    public PessoaFisica(){}

    public PessoaFisica( String nome, int idade, double altura, double peso, String cpf ){
        super(nome, idade, altura, peso);
        this.cpf = cpf;
    
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}