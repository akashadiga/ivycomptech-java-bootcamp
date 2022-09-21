package Day7.Holidays;

public class Holidays {
    private String name;
    private int day;
    private String month;

    public Holidays(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holidays holiday){
        return this.month.equals(holiday.month);
    }
    public static double averageDate(Holidays[] holidays){
        int sum=0;
        for(int i=0;i< holidays.length;i++){
            sum=sum+holidays[i].day;
        }
        return ((double)sum/ holidays.length);
    }

}
