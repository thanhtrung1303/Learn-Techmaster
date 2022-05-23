import java.util.Random;

public class Util {
    public static int RandomID() {
        Random random=new Random();
        return random.nextInt(899999)+100000;
    }
}
