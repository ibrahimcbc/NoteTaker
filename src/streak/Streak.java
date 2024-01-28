package streak;

public class Streak { // this class will keep the properties of streak object.
    private int dayCount;
    private String streakName;
    private int maxDayCount;

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public String getStreakName() {
        return streakName;
    }

    public void setStreakName(String streakName) {
        this.streakName = streakName;
    }

    public int getMaxDayCount() {
        return maxDayCount;
    }

    public void setMaxDayCount(int maxDayCount) {
        this.maxDayCount = maxDayCount;
    }
}
