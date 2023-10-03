package meus;
public class Pessoa{
    String nome;  
    int idade;
    double altura, peso;

    public Pessoa(){}

    public Pessoa(String nome, int idade, double altura, double peso){
        this.nome = nome;
        this.idade= idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

}