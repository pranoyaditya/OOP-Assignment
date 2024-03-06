public class StudentInfo {

    public int roll;
    public String name;
    public boolean passed;

    public StudentInfo()
    {
        roll = 10;
        name = "Pranoy";
        passed = true;
    }

    public StudentInfo(int roll, String name, boolean passed)
    {
        this.name = name;
        this.roll = roll;
        this.passed = passed;
    }

    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;
    }
    public boolean isPassed()
    {
        return passed;
    }

    public static void main(String[] args)
    {

        StudentInfo studentInfo1 = new StudentInfo();

        System.out.println("Default constructor value: \n");
        System.out.println(studentInfo1.getName());
        System.out.println(studentInfo1.getRoll());
        System.out.println(studentInfo1.isPassed());

        StudentInfo studentInfo2 = new StudentInfo(100,"Mr. X", false);

        System.out.println("\nAfter passing values using parameters: \n");

        System.out.println(studentInfo2.getName());
        System.out.println(studentInfo2.getRoll());
        System.out.println(studentInfo2.isPassed());



    }
}
