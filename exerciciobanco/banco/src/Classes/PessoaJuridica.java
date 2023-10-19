package Classes;

public class PessoaJuridica extends Pessoa{
    String tipo;
    String cnpj;
    String fantasia;

    public PessoaJuridica (String nome){
        super(nome);
    }
    
    public PessoaJuridica (String nome, String endereco, String email, String  telefone, String tipo, String cnpj, String fantasia){
        super(nome, endereco, email, telefone);
        this.tipo=tipo;
        this.cnpj=cnpj;
        this.fantasia=fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getFantasia() {
        return fantasia;
    }
    public String getTipo() {
        return tipo;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }      
    


}
