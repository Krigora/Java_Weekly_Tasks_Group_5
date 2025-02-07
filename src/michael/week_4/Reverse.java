package michael.week_4;

public class Reverse {
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }



    public static int reverseNum_2(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;

    }



    public static void main(String[] args) {
        System.out.println(reverseNum(-125));

        System.out.println("reverseNum_2(-125) = " + reverseNum_2(-125));
    }
}
