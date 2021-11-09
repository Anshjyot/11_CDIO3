package testing;
import game.Cup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CupTest {

    /**
     * Testing the Cup and dice, the method should roll two dices and its combined sum should be limited from
     * 2-12, as it is: two six sided dice
     */
    @Test
    public void test() {

        Cup cup = new Cup();
        int result = cup.sum();
        if (result > 12 || result < 2) {
            fail("The dice has not been limited ");
        }
        int expectingResult = 0; //Just to declare a variable which
        if (result >= 2 && result <= 12) {
            expectingResult = result;
        }
        int actualResult = cup.sum();
        assertEquals(expectingResult, actualResult);

    }
}

