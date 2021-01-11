package level01;

public class DayOfTheWeek {
    private final int[] daysOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

    public String solution(int inputMonth, int inputDate) {
        int diff = 0;
        for (int month = 1; month < inputMonth; month++)
            diff += daysOfMonth[month];
        diff += (inputDate - 1);
        diff %= 7;
        return days[diff];
    }


    public static void main(String[] args) {
        int month = 5;
        int date = 24;
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        System.out.println(dayOfTheWeek.solution(month, date));
    }
}
