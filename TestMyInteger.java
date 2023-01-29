public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println(n1.getI() + " четное? " + n1.isEven());
        System.out.println(n1.getI() + " простое? " + n1.isPrime());
        System.out.println("15 простое? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("45 нечетное? " + MyInteger.isOdd(45));
        System.out.println(n1.getI() + " равно " + n2.getI() + "? " + n1.equals(n2));
        System.out.println(n1.getI() + " равно 5? " + n1.equals(5));

    }
}

class MyInteger {
    private int i;

    public MyInteger(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public boolean isEven() {
        return isEven(i);
    }

    public boolean isOdd() {
        return isOdd(i);
    }

    public boolean isPrime() {
        return isPrime(i);

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if(n == 1 || n == 2) {
            return true;
        } else {
            for (int k = 2; k < n; k++) {
                if (n % k == 0) {
                    return false;
                }
            }
            return true;
            }

    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.i % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.i % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.getI());
    }

    public boolean equals(int a) {
        return a == i;
    }

    public boolean equals(MyInteger myInteger) {
        return i == myInteger.getI();
    }

    public static int parseInt(char[] charArray) {
        int result = 0;
        for(int m = 0; m < charArray.length; m++) {
            result = result * 10 + Character.getNumericValue(charArray[m]);
        }

        return result;
    }

    public static int parseInt(String numbersString) {
        int result = 0;
        for(int m = 0; m < numbersString.length(); m++) {
            result = result * 10 + Character.getNumericValue(numbersString.charAt(m));
        }

        return result;
    }

}
