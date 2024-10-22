import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer i1 = 10;  // Integer i1= new Integer(10)
        Integer i2 = 10;  // Integer i1= new Integer(10)
        Double d = 5.3;  // Double d = new Double(5.3)
        double q;


        int k = i1; //i1.intValue();    auto unboxing
        i1=i1+i2;

        List<Integer> ints = getIntsFromScanner();
        System.out.println(ints);

    }

    public static List<Integer> getIntsFromScanner(){

        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();

        while (true){
            System.out.println("Введите цклое число или 0 для завершения  ");
            int number = scanner.nextInt();
            if (number==0){
                return result;
            }
            result.add(number);
        }

    }
    /*
        public static boolean isExists(List<Integer> list, int number){
            for( Integer element : list    ){
                if (element.equals(number)) {
                    return true;
                }
            }
            return false;
        }
    */
    public  static  boolean isPersonByAgeExists(List<Person> list, int age){
        for (Person person : list){
            if (person.getAge() == age ){
                return true;
            }
        }
        return false;
    }


    public static boolean isExists(List<Integer> list, int number){
        return list.contains(number);
    }

    public static int indexOf(List<Integer> list, int number){
        return  list.indexOf(number);
    }


    public static boolean isPersonExist(List<Person> list, Person person){   // create equals() in Person !!!!
        return list.contains(person);
    }






}