import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    public void testSumRangeNormalOrder() {
        Assertions.assertEquals(6, BuggyProgram.sumRange(1, 3));
    }

    @Test
    public void testSumRangeReverseOrder() {
        Assertions.assertEquals(15, BuggyProgram.sumRange(5, 1));
    }

    @Test
    public void testSumRangeSingleValue() {
        Assertions.assertEquals(7, BuggyProgram.sumRange(7, 7));
    }
}
