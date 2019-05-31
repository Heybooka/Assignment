// Date check Class
// Author: CHIMA CHUKWUEBUKA
// Date: 31st May 2019

public class HeartRate{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    int month;
    int day;
    int year;
    int age;
    int maximumHeartRate;


    public HeartRate(String firstName,String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLasttName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public  void setDateOfBirth(int month,int day,int year){
        this.month = month;
        this.day = day;
        this.year =year;
    }

    public String getDateOfBirth(int day,int month,int year){
        String date = month + "/" + day + "/" + year;
        return date;
       
    }

    public int calculatePersonAge(int currentYear){
        age = currentYear - year;
        return age;
    }

    public int calculateMaximumHeartRate(){
         maximumHeartRate = 220 - age;
         return maximumHeartRate;
    }

    public double calculateTargetRange1(){
        
        double targetRate = (1 + 0.5) * maximumHeartRate;
        return targetRate;
    }
    public double calculateTargetRange2(){
      
        double targetRate = (1 + 0.85) * maximumHeartRate;
        return targetRate;
    }
}