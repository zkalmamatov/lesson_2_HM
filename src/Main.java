import org.w3c.dom.ls.LSOutput;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println (permission (21, generateRandomAge()));
        System.out.println (permission (15, generateRandomAge()));
        System.out.println (permission (13, generateRandomAge()));
        System.out.println (permission (18, generateRandomAge()));
        System.out.println (permission (10, generateRandomAge()));

    }

    public static String permission(int humanAge, int outTemp) {
        if (humanAge >= 20 && humanAge <= 45 && outTemp >= -20 && outTemp <= 30) {
            return "Можно идти гулять";
        } else if (humanAge < 20 && outTemp >= 0 && outTemp <= 28) {
            return "Можно идти гулять";
        } else if (humanAge > 45 && outTemp >= -10 && outTemp <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома!";
        }

    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(77);
    }


}







