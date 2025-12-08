import java.util.ArrayList;


public class Box{

    ArrayList<Thing> contents = new ArrayList<>();

    Box(){

        System.out.println("Box crée");
    }

    public void add (Thing truc ){
        contents.add(truc);
    }

    public boolean contains(Thing t){

        return this.contents.contains(t);



    }
  
        
}