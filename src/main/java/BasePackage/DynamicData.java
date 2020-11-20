package BasePackage;

import java.util.Random;

public class DynamicData {

    public static String randomString() {
        String charc = "TomAlter Miller ";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 3) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= randomString.toString();
        return  rString;
    }

    public static String randomStrings() {
        String charc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 3) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= randomString.toString();
        return  rString;
    }
    public static String randomnumber() {
        String charc = "0123456789";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 3) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= randomString.toString();
        return  rString;
    }
    public static String emailString() {
        String charc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 4) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= "testemail"+randomString.toString();
        return  rString + "@mailinator.com";
    }

    public static String hwUniqueID() {
        String charc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 3) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= randomString.toString();
        return  rString;
    }
    public static String companyName() {
        String charc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 3) { // length of the charc string.
            int index = (int) (rnd.nextFloat() * charc.length());
            randomString.append(charc.charAt(index));
        }
        String rString= "Auto Company"+randomString.toString();
        return  rString;
    }
}
