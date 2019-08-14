import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    @Parameterized.Parameter(0)
    public int input;
    @Parameterized.Parameter(1)
    public int expected;
    private Solution soln = new Solution1();

    @Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][]{
                {10, 12}
        });
    }

    @Test
    public void test() {
        assertEquals(expected, soln.nthUglyNumber(input));
    }
}