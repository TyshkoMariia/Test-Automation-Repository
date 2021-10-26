public class HourlySalaryWorker extends Worker {
    /*private int id;
    private String name;
    private String lastName;*/
    private double perHourSalary;
    private int amountOfHours;

    public void getCalculatedSalary(int amountOfHours, double ratePerHour) {
        double perHourSalary = ratePerHour * amountOfHours * 21;
        System.out.println(perHourSalary);
    }

    HourlySalaryWorker(int id, String name, String lastName, double perHourSalary){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.perHourSalary = perHourSalary;
    }
}
