import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {
    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameters(name = "{index}: пол" )
    public static Object[] sexLion() {
        return new Object[] {"Самка", "Самец", "транс"};
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    Feline feline = Mockito.mock(Feline.class);
    @Test
    public void testDoesHaveMane() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            Boolean expectedHasMain = null;

            if (sex.equals("Самец")) {
                expectedHasMain = true;
            } else if (sex.equals("Самка")) {
                expectedHasMain = false;
            }
            Boolean actualHasMane = lion.doesHaveMane();
            assertEquals(expectedHasMain, actualHasMane);
        }
        catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
