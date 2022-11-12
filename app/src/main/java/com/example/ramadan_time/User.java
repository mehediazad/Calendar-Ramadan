package com.example.ramadan_time;

public class User {
    private  int RamadanNo;
    private  String MonthName;
    private  String DayName;
    private  String SheheriTime;
    private  String IfterTime;

    public User(int ramadanNo, String monthName, String dayName, String sheheriTime, String ifterTime) {
        RamadanNo = ramadanNo;
        MonthName = monthName;
        DayName = dayName;
        SheheriTime = sheheriTime;
        IfterTime = ifterTime;
    }

    public int getRamadanNo() {
        return RamadanNo;
    }

    public void setRamadanNo(int ramadanNo) {
        RamadanNo = ramadanNo;
    }

    public String getMonthName() {
        return MonthName;
    }

    public void setMonthName(String monthName) {
        MonthName = monthName;
    }

    public String getDayName() {
        return DayName;
    }

    public void setDayName(String dayName) {
        DayName = dayName;
    }

    public String getSheheriTime() {
        return SheheriTime;
    }

    public void setSheheriTime(String sheheriTime) {
        SheheriTime = sheheriTime;
    }

    public String getIfterTime() {
        return IfterTime;
    }

    public void setIfterTime(String ifterTime) {
        IfterTime = ifterTime;
    }
}
