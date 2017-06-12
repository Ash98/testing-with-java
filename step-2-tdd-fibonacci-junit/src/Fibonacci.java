public class Fibonacci {
    public int calculate(int index) {

        if(index < 0){
            throw new IllegalArgumentException("DO NOT ENTER A NEGATIVE VALUE");
        }

        if(index == 0 || index == 1){
            return 1;
        }
        else {
            return calculate(index-1)+calculate(index-2);
        }

    }
}