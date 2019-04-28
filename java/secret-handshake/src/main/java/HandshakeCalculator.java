import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        signals.add(Signal.JUMP); signals.add(Signal.CLOSE_YOUR_EYES);
        signals.add(Signal.DOUBLE_BLINK); signals.add(Signal.WINK);
        String binary = getBinary(number);

        for (int i = binary.length() - 1; i >= 1; i--) {
            if (binary.charAt(i) == '0')
                signals.remove(i - 1);
        }
        if(binary.charAt(0) == '0')
            Collections.reverse(signals);



        return signals;
    }

    public String getBinary(int number){
        String reverseBinary = "";
        String binary= "";
        for (int i = 0; i < 5; i++) {
            reverseBinary += number % 2;
            number /= 2;
        }
        for (int i = reverseBinary.length() - 1; i >= 0; i--) {
            binary += reverseBinary.charAt(i);
        }

        System.out.println(binary);
        return binary;
    }

}
