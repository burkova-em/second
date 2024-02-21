package org.example.task4;

import java.time.LocalDateTime;

public class TimeUnit {

    private TimeTypes timeTypes;
    long hours;
    long minutes;
    long seconds;
    public LocalDateTime localDateTime;

    public TimeUnit(long hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeUnit(long hours, long minutes) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = 0;
    }
    public TimeUnit(long hours) {
        this.hours = hours;
        this.minutes = 0;
        this.seconds = 0;
    }

//    public java.util.concurrent.TimeUnit display() {
//
//        System.out.println(localDateTime.getHour());
//    }



}
