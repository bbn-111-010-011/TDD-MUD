import java.util.ArrayList;


public class Box{

    ArrayList<Thing> contents = new ArrayList<>();
    boolean open;

    Box(){

        System.out.println("Box crée");
        open=false;
    }

    public void add (Thing truc ){
        if (this.isOpen())
        {
            contents.add(truc);
        }
    }

    public boolean contains(Thing t){

        return this.contents.contains(t);



    }


    public void  remove(Thing t) throws RuntimeException{

        boolean ok = this.contents.remove(t);

        if(!ok)
            
        {
            throw new RuntimeException("remove echec ");

        }


    }

    public boolean isOpen() {
      return this.open;
    }

    public void open() {
        this.open = true;
      }

      public void close() {
        this.open = false;
      }


  
        
}