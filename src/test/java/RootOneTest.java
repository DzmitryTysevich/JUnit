import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RootOneTest {

    private final Double expected;
    private final QuadraticEquation quadraticEquation;

    public RootOneTest(Double valueA, Double valueB, Double valueC, Double expected) {
        this.expected = expected;
        quadraticEquation = new QuadraticEquation(valueA, valueB, valueC);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.0, 3.0, 1.0, -0.5},
                {-2.0, 0.0, 1.0, -0.7071067811865476},
                {2.5, 3.0, 0.0, 0.0}
        });
    }

    @Test
    public void getRootOne() {
        Assert.assertEquals(expected, quadraticEquation.getRootOne(), 0.0);
    }
}