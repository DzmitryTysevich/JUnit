import org.apache.log4j.Logger;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    private static final Logger LOGGER = Logger.getLogger(TestRunner.class);

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(DiscriminantTest.class, RootOneTest.class, RootsTest.class, RootTwoTest.class);
        for (Failure failure : result.getFailures()) {
            LOGGER.info(failure.toString());
        }
        LOGGER.info(result.wasSuccessful());
    }
}