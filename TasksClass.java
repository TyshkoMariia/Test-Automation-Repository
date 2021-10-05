import java.util.ArrayList;
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

        TasksClass print = new TasksClass();
        print.printVariables();
        print.printLists();
        print.printMaxValue(-16, -17);
        print.printRequestedListElement();
        print.printMinValueOfTheList();

    }
}
