public class TestMyTime {
    public static void main(String[] args) {

        MyTime firstMyTime = new MyTime();

        System.out.println(firstMyTime.getHour() + ":" + firstMyTime.getMinute() + ":" + firstMyTime.getSecond());

        MyTime secondMyTime = new MyTime(555550000);

        System.out.println(secondMyTime.getHour() + ":" + secondMyTime.getMinute() + ":" + secondMyTime.getSecond());

        MyTime thirdMyTime = new MyTime(5, 23, 55);

        System.out.println(thirdMyTime.getHour() + ":" + thirdMyTime.getMinute() + ":" + thirdMyTime.getSecond());

    }
}
