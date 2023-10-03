package meus;
public class Cachorro extends Animal {
    String raca;

    public  Cachorro( String nome, int qtdPatas, boolean pelos, String genero, String raca) {
        super(nome, qtdPatas, pelos, genero);
        this.raca = raca;    
    }

    public void comer() {
        System.out.println("o cão esta comendo");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
