package Classes;

public class Funcionario extends PessoaFisica{
    private String cargo;
    private PessoaJuridica empresa;
    private String idFuncionario;
    private Funcionario chefe;
    private Funcionario subordinado;

    public Funcionario (String nome, String endereco, String email, String  telefone, String cpf, String cnh, String rg, String cargo, String idFuncionario){
        super(nome, endereco, email, telefone, cpf, cnh , rg);
        this.cargo=cargo;
        this.idFuncionario=idFuncionario;
    }
    public String getCargo() {
        return cargo;
    }
    public Funcionario getChefe() {
        return chefe;
    }
    public PessoaJuridica getEmpresa() {
        return empresa;
    }
    public String getIdFuncionario() {
        return idFuncionario;
    }
    public Funcionario getSubordinado() {
        return subordinado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
    public void setEmpresa(PessoaJuridica empresa) {
        this.empresa = empresa;
    }
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public void setSubordinado(Funcionario subordinado) {
        this.subordinado = subordinado;
    }
    
}
