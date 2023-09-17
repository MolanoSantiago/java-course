public class Family {

    private final String name;
    private final int age;
    private final String relationship;
    private final double timeShared;

    public Family(String name, int age, String relationship, double timeShared) {
        this.name = name;
        this.age = age;
        this.relationship = relationship;
        this.timeShared = timeShared;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRelationship() {
        return relationship;
    }

    public double getTimeShared() {
        return timeShared;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Relationship: " + relationship);
        System.out.println("Time shared with " + name +": " + timeShared +  " seconds");
    }

    public static void main(String[] args) {
        // Create instances of Family
        Family dad = new Family("Victor", 39, "Father", 30600.50);
        Family mom = new Family("Claudia", 51, "Mother", 873250.234);


        // Print family members details
        System.out.println("Family Member 1:");
        dad.printDetails();

        System.out.println("\nFamily Member 2:");
        mom.printDetails();
    }
}
