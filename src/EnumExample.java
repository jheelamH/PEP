enum Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumExample{
    public static void main(String[] args){
        Day today=Day.MONDAY;
        System.out.println("Today is: "+today);
        if(today==Day.MONDAY){
            System.out.println("Start of the week");
        }
    }
}