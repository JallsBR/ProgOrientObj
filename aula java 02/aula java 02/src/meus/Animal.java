package meus;

public class Animal {
    String nome;  
    int qtdPatas;
    boolean pelos;
    String genero;

    public Animal (){}

    public Animal (String nome, int qtdPatas, boolean pelos, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.pelos = pelos;
        this.genero = genero;
    
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public boolean getPelos() {
        return pelos;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPelos(boolean pelos) {
        this.pelos = pelos;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mover(){
        System.out.println("mover");
        
    }

    public void comer(){
        System.out.println("comer");
        
    }

    public void comer( String comida){
        System.out.println("comer "+ comida);
        
    }

}