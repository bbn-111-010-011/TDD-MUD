public class Thing{

    private String name ;
    private int volume;


 /**
  * 
  *  @param name (string) :nom
  * 
  */
    public Thing(String name){
        this.name =name;
        
    }

    public Thing(String name,int volume){
        this.name =name;
        this.volume = volume;
        
    }

    public int getVolume(){

        return this.volume;
        
    }
}