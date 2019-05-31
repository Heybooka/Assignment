// Date check Class
// Author: CHIMA CHUKWUEBUKA
// Date: 31st May 2019

public class HealthProfile{
    private String firstName;
    private String lastName;
    private String gender;
    private int height;
    private int weight;
    private String dateOfBirth;
    int month;
    int day;
    int year;
    int age;
    int maximumHeartRate;


    public HealthProfile(String firstName,String lastName, String gender,int height, int weight,String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
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
    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(int weight){
        this.weight= weight;
    }

    public int getWeight(){
        return weight;
    }

    

    public int calculatePersonAge(int year){
        age = 2019 - year;
        return age;
    }

    public int calculateMaximumHeartRate(){
         maximumHeartRate = 220 - age;
         return maximumHeartRate;
    }

    public double calculateBMI(int height,int weight){
        double BMI = (703 * weight) / (height * height);
        return BMI;
    }

    public double calculateTargetRange1(){
        
        double targetRate = 0.5 * maximumHeartRate;
        return targetRate;
    }
    public double calculateTargetRange2(){
      
        double targetRate =  0.85 * maximumHeartRate;
        return targetRate;
    }
}