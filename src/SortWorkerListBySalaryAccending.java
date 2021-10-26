import java.util.Comparator;

public class SortWorkerListBySalaryAccending implements Comparator<FixedSalaryWorker> {
    public int compare(FixedSalaryWorker a, FixedSalaryWorker b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
