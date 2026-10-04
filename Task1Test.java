import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    public void testGrades() {
        Assertions.assertEquals("Exceeds", BuggyProgram.getGrade(95));
        Assertions.assertEquals("Meets", BuggyProgram.getGrade(85));
        Assertions.assertEquals("Does Not Meet", BuggyProgram.getGrade(60));
    }

    @Test
    public void testEdges() {
        Assertions.assertEquals("Exceeds", BuggyProgram.getGrade(90));
        Assertions.assertEquals("Meets", BuggyProgram.getGrade(80));
        Assertions.assertEquals("Does Not Meet", BuggyProgram.getGrade(79));
    }
}
