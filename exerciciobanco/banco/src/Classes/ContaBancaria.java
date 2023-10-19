package Classes;

public class ContaBancaria {
    private PessoaFisica titular;
    private PessoaJuridica banco;
    private String agencia;
    private String numero;
    private double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(String numero){
        this.numero=numero;    
    }

    public ContaBancaria(PessoaFisica titular, PessoaJuridica banco, String agencia, String numero) {
        this.titular=titular;
        this.banco=banco;
        this.agencia=agencia;
        this.numero=numero;    
    }

    public PessoaFisica getTitular() {
        return titular;
    }
    public PessoaJuridica getBanco() {
        return banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public void setBanco(PessoaJuridica banco) {
        this.banco = banco;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    public double deposito(double deposito){
        saldo = saldo + deposito;
        return saldo;
    }

    public double saque(double saque){
        saldo = saldo - saque;
        return saldo;
        }
    
}
