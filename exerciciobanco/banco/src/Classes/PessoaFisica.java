package Classes;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String cnh;
    private String rg;

    public PessoaFisica(String nome, String endereco, String email, String  telefone, String cpf, String cnh, String rg){
        super(nome, endereco, email, telefone);
        this.cpf=cpf;
        this.cnh=cnh;
        this.rg=rg;
    }    
    
    public String getCnh() {
        return cnh;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

   
}
