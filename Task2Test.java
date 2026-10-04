import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    public void testSumEvenNumbers() {
        int[] values = new int[]{2, 3, 4, 6};
        Assertions.assertEquals(12, BuggyProgram.sumEvenNumbers(values));
    }

    @Test
    public void testOddNumbers() {
        int[] values2 = new int[]{1, 3, 5};
        Assertions.assertEquals(0, BuggyProgram.sumEvenNumbers(values2));
    }

    @Test
    public void testEmpty() {
        int[] values = new int[0];
        Assertions.assertEquals(0, BuggyProgram.sumEvenNumbers(values));
    }
}
