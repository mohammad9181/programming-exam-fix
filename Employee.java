/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        int timeLeft = 16 - age;
        if(age > 16) {
            return true;
        }
        else {
            system.print("You are too young, wait another " + timeLeft + " to drive");
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        return (unpaidHours*hourlyWage*o,7);
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        int pay = calculatePay();
        system.print(fullname + " has recieved a wire transfer of " + pay);
        unpaidHours = 0.0;
    }
    
    //setter method
    public boolean canWork()
    {
        int age = calculateAge(2025);
        if(age > 14) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //getter method
    public void workCheck() 
    {
        boolean ableToWork = canWork();
        if(ableToWork)
        {
            system.print("you can work");
        }
        else
        {
            system.print("you can't work");
        }
    }
}