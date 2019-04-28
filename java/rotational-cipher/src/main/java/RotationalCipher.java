class RotationalCipher {
    int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] string = data.toCharArray();
        String shifted = "";

        for (int i = 0; i < string.length; i++) {
            int value = (int) string[i];
            if(value >= 65 && value <= 89){
                value = value - 65 + shiftKey;
                value = value % 26 + 65;
            } else if(value >= 97 && value <= 122){
                value =value - 97 + shiftKey;
                value = value % 26 + 97;
                System.out.println(value);
            }
            string[i] = (char) value;
        }

        for (int i = 0; i < string.length; i++) {
            shifted += string[i];
        }
        return shifted;
    }

}
