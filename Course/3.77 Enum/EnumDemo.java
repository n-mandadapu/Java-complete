
enum Day {
    SUNDAY("holiday"), MONDAY("weekday"), TUESDAY("weekday"), WEDNESDAY("weekday"), THURSDAY("weekday"), FRIDAY, SATURDAY; //named constants

    // enum can have constructor, methods, fields
    // enum can't be extended
    // enum can't be instantiated

    // enum can have abstract methods, but all the constants must implement it
    // enum can implement interfaces
    // enum can have main method
    // enum can have static block
    // enum can have instance block
    // enum can have static variables
    // enum can have instance variables
    // enum can have constructors
    // enum can have abstract methods

    private String type; // instance variable
    Day() {
        type = "weekday";
    }
    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
// we can also define enum outside the class
// enum class can't be private or protected
// enum class can't be abstract or final
// enum class can't be static
// enum class can't be final
// enum class can't be synchronized
// enum class can't be transient or volatile
// enum class can't be extended
// enum class can't be local
// enum class can't be generic


public class EnumDemo {
    public static void main(String[] args) {
        Day day = Day.MONDAY; // day is object of Day enum
        System.out.println(day.ordinal());  // 1
        Day[] days = Day.values(); // returns array of all enum constants

        Day.SATURDAY.setType("weekend");
        Day.FRIDAY.setType("weekend");

        for (Day d : days) {
            System.out.println(d.ordinal() + " : "+ d + " : " + d.getType());
        }
        
        System.out.println(day.getClass().getSuperclass()); // MONDAY

        switch (day) {
            case SUNDAY:
                System.out.println("Sunday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;

            
        }
    }    
}
