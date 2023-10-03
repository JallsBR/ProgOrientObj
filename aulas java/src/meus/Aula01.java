package meus;

//importar classe lampada e ver qual o maior preço

public class Aula01 {
    public static void main(String[] args) {
        
        Lampada luzincandecente = new Lampada(5.8);
        Lampada luzfria = new Lampada(2.4);

    if (luzfria.getPreco() > luzincandecente.getPreco()){
            System.out.println("Luz fria mais cara");
        }
    else{
        System.out.println("Luz incandecente mais cara");
    }





    }
}





