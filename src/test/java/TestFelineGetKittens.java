import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFelineGetKittens {
    @Test
    public void testGetFamily() throws Exception {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);

    }
}
