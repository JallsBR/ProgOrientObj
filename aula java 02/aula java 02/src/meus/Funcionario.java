package meus;

public class Funcionario extends PessoaFisica{
    String matriculaFuncioario;

    public Funcionario() {}

    public Funcionario(String matriculaFuncionario, String nome, int idade, double altura, double peso, String cpf){
        super(nome, idade, altura, peso, cpf);
        this.matriculaFuncioario = matriculaFuncionario;
    }

    public String getMatriculaFuncioario() {
        return matriculaFuncioario;
    }

    public void setMatriculaFuncioario(String matriculaFuncioario) {
        this.matriculaFuncioario = matriculaFuncioario;
    }



    
}
