import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoOneTest {
    @Test
    public void testSquare() {
        assertEquals(5, SkillDemoOne.square(2)); //should be failing
    }
}