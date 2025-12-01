import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBoxes {

    @Test
    public void testBoxCreate() {
        Box b = new Box();
        assertEquals(0, b.getSize());
    }
}
