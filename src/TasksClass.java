import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TasksClass {  // TasksClass

    public void printVariables(){

        boolean boolValueOne = true;    // Boolean -> boolean
        boolean boolValueTwo = false;
        String stringValueOne = "Mariia";
        String stringValueTwo = "Tyshko";
        int intNumberOne = 7;
        int intNumberTwo = 17;

        System.out.println("Task number 1");
        System.out.println(boolValueOne);
        System.out.println(boolValueTwo);
        System.out.println(stringValueOne);
        System.out.println(stringValueTwo);
        System.out.println(intNumberOne);
    }

    public void printLists(){

        boolean boolValueThree = false;
        boolean boolValueFour = true;
        String stringValueThree = "Hello";
        String stringValueFour = "World";
        int intNumberThree = 10;
        int intNumberFour = 100;

        List<Boolean> listOfBooleans = new ArrayList<>(); // List<Boolean>
        List<String> listOfStrings = new ArrayList<>();
        List<Integer> listOfIntegers = new ArrayList<>();

        listOfBooleans.add(boolValueThree);
        listOfBooleans.add(boolValueFour);
        listOfStrings.add(stringValueThree);
        listOfStrings.add(stringValueFour);
        listOfIntegers.add(intNumberThree);
        listOfIntegers.add(intNumberFour);

        System.out.println("Task number 2");
        System.out.println(listOfBooleans);
        System.out.println(listOfStrings);
        System.out.println(listOfIntegers);

    }

    public void printMaxValue(Integer firstValue, Integer secondValue){ // rename: printMaxValue()

        System.out.println("Task number 3");

        if (firstValue > secondValue) {           // {}
            System.out.println(firstValue);
        }
        else
            System.out.println(secondValue);

    }

    public void printRequestedListElement(){

        String[] list = new String[]{"Name", "Surname", "Middle", "PostalCode", "Address"};
        System.out.println("Task number 4");
        System.out.println(list[1]);
        System.out.println(list[4]);
    }

    public void printMinValueOfTheList(){

        List<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(5);
        listOfNumbers.add(1);
        listOfNumbers.add(110);
        listOfNumbers.add(10);
        listOfNumbers.add(35);
        int min = listOfNumbers.get(0);
        int arraysize = listOfNumbers.size();

        for (int i=0; i< arraysize; i++){ // Integer -> int
            if (listOfNumbers.get(i) < min){
                min = listOfNumbers.get(i);
            }
        }

        System.out.println("Task number 5");
        System.out.println("Minimum element is: " + min);

    }

    public static void main(String[] args) {

       /* TasksClass print = new TasksClass();
        print.printVariables();
        print.printLists();
        print.printMaxValue(-16, -17);
        print.printRequestedListElement();
        print.printMinValueOfTheList();

        Workers dex = new Workers();
        dex.setName("Dex");
        dex.setLastName("Newton");
        dex.setId(1);
        dex.CalculateTotalSalaryPayedPerHour(20.8);

        Workers ann = new Workers();
        ann.setName("Ann");
        ann.setLastName("Brown");
        ann.setId(2);
        ann.PrintAvarageSalary(7655.11);

        FixedRateWorker Dex = new FixedRateWorker();
        Dex.setName("Dex");
        Dex.setLastName("Hunter");
        Dex.setId(17);
        System.out.println(Dex.getName());
        System.out.println(Dex.getLastName());
        System.out.println(Dex.getId());
        Dex.getCalculatedSalary(3700.5);

        HourlyRateWorker Ann = new HourlyRateWorker();
        Ann.setName("Ann");
        Ann.setLastName("Baker");
        Ann.setId(34);
        System.out.println(Ann.getName());
        System.out.println(Ann.getLastName());
        System.out.println(Ann.getId());
        Ann.getCalculatedSalary(47.64);*/

        List<FixedSalaryWorker> fixedSalaryWorkerList = new ArrayList<FixedSalaryWorker>();

        FixedSalaryWorker ann = new FixedSalaryWorker(1, "Ann", "Fisher", 3700);
        FixedSalaryWorker ben = new FixedSalaryWorker(2, "Ben", "Claud", 2650.25);
        FixedSalaryWorker lucie = new FixedSalaryWorker(3, "Lucie", "Tom", 4929.43);
        FixedSalaryWorker zet = new FixedSalaryWorker(4, "Zet", "Johnson", 7200.5);
        FixedSalaryWorker natan = new FixedSalaryWorker(5, "Natan", "Bread", 6140.15);
        FixedSalaryWorker owen = new FixedSalaryWorker(6, "Owen", "Settleberry",7200.49);
        FixedSalaryWorker piter = new FixedSalaryWorker(7, "Piter", "Pen", 8729.11);
        FixedSalaryWorker conan = new FixedSalaryWorker(8, "Conan", "Zigmund", 12730.3);
        FixedSalaryWorker den = new FixedSalaryWorker(9, "Den", "Martin", 15600.34);
        FixedSalaryWorker frank = new FixedSalaryWorker(10, "Frank", "Polo", 2650.25);

        fixedSalaryWorkerList.add(ann);
        fixedSalaryWorkerList.add(ben);
        fixedSalaryWorkerList.add(lucie);
        fixedSalaryWorkerList.add(zet);
        fixedSalaryWorkerList.add(natan);
        fixedSalaryWorkerList.add(owen);
        fixedSalaryWorkerList.add(piter);
        fixedSalaryWorkerList.add(conan);
        fixedSalaryWorkerList.add(den);
        fixedSalaryWorkerList.add(frank);

        SortWorkerListBySalaryAccending sortWorkersAccending = new SortWorkerListBySalaryAccending();
        sortWorkersAccending.compare(ann, ben);
        Collections.sort(fixedSalaryWorkerList, new SortWorkerListBySalaryAccending());


        /*HourlySalaryWorker calculateHourlySalary = new HourlySalaryWorker();
        List<HourlySalaryWorker> hourlySalaryWorkerList = new ArrayList<HourlySalaryWorker>();

        HourlySalaryWorker rob = new HourlySalaryWorker(20, "Rob", "Roy", calculateHourlySalary.getCalculatedSalary(6, 122.15));
        HourlySalaryWorker kalin = new HourlySalaryWorker(18, "Kalin", "Johnson",calculateHourlySalary.getCalculatedSalary(3, 140));
        HourlySalaryWorker melvin = new HourlySalaryWorker(19, "Melvin", "Prestly", calculateHourlySalary.getCalculatedSalary(6, 122.15));
        HourlySalaryWorker joshua = new HourlySalaryWorker(14, "Joshua", "Robinson", calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker emma = new HourlySalaryWorker(17, "Emma", "White", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker lenny = new HourlySalaryWorker(11, "Lenny", "Krawitch",calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker orwell = new HourlySalaryWorker(13, "Orwell", "McKinley", calculateHourlySalary.getCalculatedSalary(8, 240.56));
        HourlySalaryWorker sunny = new HourlySalaryWorker(12, "Sunny", "Lane", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker ronald = new HourlySalaryWorker(15, "Ronald", "Quack", calculateHourlySalary.getCalculatedSalary(10, 122.15));
        HourlySalaryWorker donald = new HourlySalaryWorker(16, "Donald", "Duck", calculateHourlySalary.getCalculatedSalary(6, 122.15));

        hourlySalaryWorkerList.add(rob);
        hourlySalaryWorkerList.add(kalin);
        hourlySalaryWorkerList.add(melvin);
        hourlySalaryWorkerList.add(joshua);
        hourlySalaryWorkerList.add(emma);
        hourlySalaryWorkerList.add(lenny);
        hourlySalaryWorkerList.add(orwell);
        hourlySalaryWorkerList.add(sunny);
        hourlySalaryWorkerList.add(ronald);
        hourlySalaryWorkerList.add(donald);*/



    }
}
