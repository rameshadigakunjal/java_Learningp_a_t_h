package IntermediateStage.EnumEample;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class EnumSwitchExample {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;    

        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                
                break;
            case WEDNESDAY:
                System.out.println("Midweek day."); 
                break;
            case FRIDAY:
                System.out.println("Last workday of the week!");
                break;
            case SUNDAY:
                System.out.println("It's weekend, relax!");
                break;

        
            default:
                System.out.println("Just another day.");
                break;

        }}
        }
