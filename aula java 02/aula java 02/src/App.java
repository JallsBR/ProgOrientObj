<<<<<<< HEAD
import meus.Animal;
import meus.Cachorro;

public class App {

    public static void main(String[] args){

 
    Animal bird = new Animal( "Pardal", 2, false, "Ave");

    System.out.println("Atributos" +  bird.getNome() +", "+ bird.getQtdPatas() +"  "+ bird.getPelos() +"  "+ bird.getGenero());
    
    bird.comer();

    Cachorro capataz = new Cachorro("Capataz", 4, true, "Canis Familiares", "Golden");
    System.out.println("Atributos" + capataz.getNome() +"  "+ capataz.getQtdPatas() +"  "+ capataz.getGenero()+"  "+ capataz.getRaca());

    capataz.comer();


    
}
}
=======
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
>>>>>>> 5ea311d13636a77b69d0f74298bc694f4429e0c8
