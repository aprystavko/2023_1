package selenium2.base;

public class TestUtilities extends BaseTest {

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
