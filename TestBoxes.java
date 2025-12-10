import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes {

    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }

    @Test
    public void testBoxCreateClosed() {
        Box b = new Box();
        // une boite doit etre fermée par défaut
        assertFalse(b.isOpen());
    }

    @Test
    public void testThingVolume() {
        Thing truc = new Thing("truc",5);
        assertEquals(5,truc.getVolume());

    }

    @Test
    public void testBoxAdd(){

        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.add(truc1);
        b.add(truc2);
    }
    @Test
    public void testBoxContains(){

        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        Thing truc3 = new Thing("truc3");
        b.open();
        b.add(truc1);
        b.add(truc2);
        assertTrue(b.contains(truc1));
        // doit contenir un truc 1
        assertTrue(b.contains(truc2));
        assertFalse(b.contains(truc3));
        // ne odoit ps contenir truc3
    }
    @Test
    public void testBoxRemove(){

        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        Thing truc3 = new Thing("truc3");
        b.open();
        b.add(truc1);
        b.add(truc2);
        
        assertTrue(b.contains(truc1));
        // doit contenir un truc 1
        assertTrue(b.contains(truc2));
        assertFalse(b.contains(truc3));
        b.remove(truc2);
        assertFalse(b.contains(truc2));
        // ne odoit ps contenir truc3
    }

    @Test(expected = RuntimeException.class)
    public void testBoxRemoveFails(){

        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.open();
        b.add(truc1);

        assertTrue(b.contains(truc1));
        // doit contenir un truc 1
        assertFalse(b.contains(truc2));
        b.remove(truc2);
    
        // ne odoit ps contenir truc3
    }




 
}

// 