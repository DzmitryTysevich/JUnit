import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DiscriminantTest {

    private final Double expected;
    private final QuadraticEquation quadraticEquation;

    public DiscriminantTest(Double valueA, Double valueB, Double valueC, Double expected) {
        this.expected = expected;
        quadraticEquation = new QuadraticEquation(valueA, valueB, valueC);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2.0, 3.0, 1.0, 1.0},
                {-2.0, 0.0, 1.0, 8.0},
                {2.0, 3.0, 0.0, 9.0}
        });
    }

    @Test
    public void getDiscriminant() {
        Assert.assertEquals(expected, quadraticEquation.getDiscriminant(), 0.0);
    }
}