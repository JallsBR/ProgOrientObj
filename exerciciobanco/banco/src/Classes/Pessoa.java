package Classes;


public class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private ContaBancaria conta;

    // Criador
    public Pessoa(String nome){
        this.nome=nome;
    }

    public Pessoa (String nome, String endereco, String email, String  telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.email=email;
        this.telefone = telefone;
        
    }
    
    // Getters
    public ContaBancaria getConta() {
        return conta;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    // Setters 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    
}
