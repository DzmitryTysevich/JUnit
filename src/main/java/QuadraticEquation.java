import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class QuadraticEquation {
    private final Double a;
    private final Double b;
    private final Double c;
    private final List<Double> roots;

    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        roots = new ArrayList<>();
    }

    public List<Double> getRoots() {
        assert a != 0;
        if (getDiscriminant() > 0) {
            roots.add(getRootOne());
            roots.add(getRootTwo());
        } else if (getDiscriminant() == 0) {
            roots.add(getRootOne());
        } else {
            roots.isEmpty();
        }
        return roots;
    }

    public Double getRootOne() {
        assert a != 0;
        return ((-b + sqrt((getDiscriminant()))) / (2 * a));
    }

    public Double getRootTwo() {
        assert a != 0;
        return ((-b - sqrt((getDiscriminant()))) / (2 * a));
    }

    public Double getDiscriminant() {
        assert a != 0;
        return b * b - 4 * a * c;
    }
}