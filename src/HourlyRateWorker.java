public class HourlyRateWorker extends Worker {
    public void getCalculatedSalary(double ratePerHour) {
        double perHourSalary = ratePerHour * 8 * 21;
        System.out.println(perHourSalary);
    }
}
