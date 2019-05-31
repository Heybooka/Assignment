// Date check Class
// Author: CHIMA CHUKWUEBUKA
// Date: 31st May 2019

public class Date{

    private int month;
    private int year;
    private int day;

    public Date(int month, int year, int day){
        this.month = month;
        this.year = year;
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }

    public String displayDate(){
        return day + "/" + month + "/" + year;
    }
}