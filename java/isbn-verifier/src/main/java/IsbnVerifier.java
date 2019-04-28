import java.util.Collections;

class IsbnVerifier {

    public IsbnVerifier() {
    }

    boolean isValid(String stringToVerify) {
        char[] chars = stringToVerify.toCharArray();
        int[] numbers = new int[stringToVerify.length()];
        int counter = 0;

        for (int i = 0; i < stringToVerify.length(); i++) {
            System.out.println("for loop running" + (int) chars[i]);
            if((((int) chars[i]) >= 48 && ((int) chars[i]) <= 57) || ((int) chars[i] == 88) && counter == 9) {
                numbers[counter] = ((int) chars[i] == 88 ? 10 : ((int) chars[i]) - 48);
                System.out.println("short iff" + ((int) chars[i] == 88 ? 10 : ((int) chars[i]) - 47));
                counter++;
            }
        }
        System.out.println("counter: " + counter);
        if (counter != 10)
            return false;

        int checksum = 0;
        for (int i = 0; i < numbers.length; i++) {
            checksum += numbers[i] * counter;
            counter--;
        }
        return checksum % 11 == 0;
    }

}
