package Classes;

public class ContaPoupanca extends ContaBancaria {
    private float juros;
    private float saldoPoupanca;

    public ContaPoupanca(PessoaFisica titular, PessoaJuridica banco, String agencia, String numero, float juros,float saldoPoupanca){
        super(titular, banco, agencia, numero );
        this.juros=juros;
        this.saldoPoupanca=saldoPoupanca;

        }

    public float getJuros() {
        return juros;
    }
    public float getSaldoPoupanca() {
        return saldoPoupanca;
    }
    public void setJuros(float juros) {
        this.juros = juros;
    }
    public void setSaldoPoupanca(float saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public float depositoPoupança(float deposito){
        saldoPoupanca = saldoPoupanca + deposito;
        return saldoPoupanca;
    }

    public float saquePoupança(float saque){
        saldoPoupanca = saldoPoupanca - saque;
        return saldoPoupanca;
        }
    
    public float aplicarJuros(){
        saldoPoupanca = saldoPoupanca + (saldoPoupanca * juros);    
        return saldoPoupanca;        
    }

    




    
}
