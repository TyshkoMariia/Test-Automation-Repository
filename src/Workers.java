public class Workers {
    private int id;
    private String name;
    private String surname;

    public void setName(String firstName){
        this.name = firstName;
    }
    public void setLastName(String lastName){
        this.surname = lastName;
    }
    public void setId(int id){
        this.id = id;
    }

    public void PrintAvarageSalary(double fixedSalary){
        System.out.println(id);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fixedSalary);
    }

    public void CalculateTotalSalaryPayedPerHour(double ratePerHour) {
        double perHourSalary = ratePerHour * 8 * 21;

        System.out.println(id);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(perHourSalary);
    }
}