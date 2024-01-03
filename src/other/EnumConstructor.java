package other;
enum Day {
    // Enum constants with constructors
    MONDAY("Start of the work week", true),
    TUESDAY("Second day of the week", true),
    WEDNESDAY("Middle of the week", true),
    THURSDAY("Almost there", true),
    FRIDAY("End of the work week", true),
    SATURDAY("Weekend!", false),
    SUNDAY("Weekend!", false);

    // Enum fields
    private final String description;
    private final boolean workingDay;

    // Enum constructor
    Day(String description, boolean workingDay) {
        this.description = description;
        this.workingDay = workingDay;
    }

    // Enum methods
    public String getDescription() {
        return description;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }
}



public class EnumConstructor {
    public static void main(String[] args) {
        // Accessing enum constants and their properties
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() + " (Working day: " + day.isWorkingDay() + ")");
        }
    }

}
