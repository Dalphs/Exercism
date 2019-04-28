public class PangramChecker {

    public boolean isPangram(String input) {
        int search = 65;
        String lowercase = input.toLowerCase();
        boolean[] checker = new boolean[26];
        for (boolean b: checker) {
            b = false;
        }
        for (int i = 0; i < lowercase.length(); i++) {
            if(lowercase.charAt(i) >= 97 && lowercase.charAt(i) <= 122)
                checker[(int) lowercase.charAt(i) - 97] = true;
        }

        for (boolean b: checker) {
            if (!b)
                return false;
        }
        return true;

    }

}
