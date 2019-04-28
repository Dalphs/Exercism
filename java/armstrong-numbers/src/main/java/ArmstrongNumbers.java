import java.util.ArrayList;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int a = numberToCheck;
        ArrayList<Integer> number = new ArrayList<>();

		while (a > 0){
		    number.add(a % 10);
		    a = a / 10;
        }

        int result = 0;
        int power = number.size();

        for (Integer i: number) {
            result += Math.pow(i, power);
        }

        if(numberToCheck == result)
            return true;

		return false;
	}

}
