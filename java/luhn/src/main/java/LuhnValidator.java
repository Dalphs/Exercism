import java.util.ArrayList;

class LuhnValidator {

    boolean isValid(String candidate) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < candidate.length(); i++) {
            char checker = candidate.charAt(i);
            if (checker >= 48 && checker <= 57)
                numbers.add(((int) checker) - 48);
            else if (checker != ' ')
                return false;
        }
        System.out.println("numbers: " + numbers);
        if (numbers.size() <= 1)
            return false;
        for (int i = numbers.size() - 2; i >= 0 ; i -= 2) {
            int newDigit = numbers.get(i) * 2 < 10 ? numbers.get(i) * 2 : numbers.get(i) * 2 - 9;
            numbers.remove(i);
            numbers.add(i, newDigit);
        }
        System.out.println("New digits: " + numbers);

        for (Integer i: numbers) {
            sum += i;
        }
        System.out.println((sum % 10 == 0) + " " + sum);
        return sum % 10 == 0;
    }

}
