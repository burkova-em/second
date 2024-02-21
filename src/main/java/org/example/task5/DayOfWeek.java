package org.example.task5;

public class DayOfWeek {

    byte day;
    String name;

    public DayOfWeek(byte day, String name) {
        this.day = day;
        this.name = name;
    }

    public static void main(String[] args) {

        DayOfWeek[] dayOfWeeks = new DayOfWeek[7];
        dayOfWeeks[0] = new DayOfWeek((byte) 1, "Monday");
        dayOfWeeks[1] = new DayOfWeek((byte) 2, "Tuesday");
        dayOfWeeks[2] = new DayOfWeek((byte) 3, "Wednesday");
        dayOfWeeks[3] = new DayOfWeek((byte) 4, "Thursday");
        dayOfWeeks[4] = new DayOfWeek((byte) 5, "Friday");
        dayOfWeeks[5] = new DayOfWeek((byte) 6, "Saturday");
        dayOfWeeks[6] = new DayOfWeek((byte) 7, "Sunday");

       for (int i = 0; i < dayOfWeeks.length; i++) {
            System.out.println(dayOfWeeks[i].day + " " + dayOfWeeks[i].name);
        }

    }
}
