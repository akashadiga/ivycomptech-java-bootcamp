package Day1;

public class LeapYear {
    public void isLeapYear(int year){
        if(year<=1 || year >=9999){
            System.out.println("not a leap year");
        }
        else{
            if(year%4==0 || year%100!=0) {
                System.out.println("leap year");
            }else if((year%4==0 && year%100==0)&&(year%400==0)){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
                }
            }
        }
    }

