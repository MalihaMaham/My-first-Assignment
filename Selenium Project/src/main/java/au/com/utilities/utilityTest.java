package au.com.utilities;

public class utilityTest {
    //extends BasicTest {

    protected void sleep(long millis) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
