import java.util.ArrayList;

class RaindropConverter {

    String convert(int number) {
        String num = "";
        if (number % 3 == 0)
            num += "Pling";
        if (number % 5 == 0)
            num += "Plang";
        if (number % 7 == 0)
            num += "Plong";
        if(num.equals("")) {
            num = Integer.toString(number);
        }
        return num;
    }

}
