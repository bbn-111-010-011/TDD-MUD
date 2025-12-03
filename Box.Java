import java.util.ArrayList;


public class Box{

    ArrayList<String> contents = new ArrayList<>();

    Box(){

        System.out.println("Box crée");
    }

    public void add (String truc ){
        contents.add(truc);
    }

  
        
}