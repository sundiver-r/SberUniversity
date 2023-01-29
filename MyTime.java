class MyTime {
    public static final int MILLISECONDS_IN_SECOND = 1000;
    public static final int SECONDS_PER_MINUTE = 60;
    public static final int MINUTES_PER_HOUR = 60;
    public static final int HOURS_PER_DAY = 24;

    private int second;
    private int minute;
    private int hour;

    public MyTime () {
        this(System.currentTimeMillis());
    }

    public MyTime (long elapsedTime) {
        setTime(elapsedTime);
    }

    public MyTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    private void setTime(long elapsedTime) {
        // get total time in seconds from 1970
        long totalSeconds = elapsedTime / MILLISECONDS_IN_SECOND;
        // get current seconds
        second = (int) (totalSeconds % SECONDS_PER_MINUTE);
        // get current minutes
        minute = (int) (totalSeconds / SECONDS_PER_MINUTE % MINUTES_PER_HOUR);
        // get current hours
        hour = (int) (totalSeconds / SECONDS_PER_MINUTE / MINUTES_PER_HOUR % HOURS_PER_DAY);
    }

}
