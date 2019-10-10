package Contact;

public class Utils extends DriverManager
{
    public static void waitForSomeTime() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
