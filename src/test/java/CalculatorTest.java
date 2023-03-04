import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testMulti(){
        int result = calculator.multi(3, 4);
        assertThat(result, is(equalTo(12)));
    }
    @Test
    public void testDiv(){
        int result = calculator.div(20,5);
        assertThat(result, is(equalTo(4)));
    }


}
