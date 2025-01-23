package alina.week_4;

public class ReverseNegativeNumber {
    public static int reverseNegative(int num){
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("reverseNegative(-5671) = " + reverseNegative(-5671));
    }
}

/*
`2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */