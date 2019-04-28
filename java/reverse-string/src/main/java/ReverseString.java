class ReverseString {

    String reverse(String inputString) {
        char[] c = inputString.toCharArray();
        String reverseString = "";
        for (int i = c.length - 1; i >= 0; i--) {
            reverseString += c[i];
        }
        return reverseString;
    }
  
}