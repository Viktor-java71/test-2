import java.util.List;

public class ListHandler {
    private  List<Person> personList;

    public ListHandler(List<Person> personList) {
        this.personList = personList;
    }

    // Метод проверяет, есть ли человек с заданным возрастом в списке
    public    boolean isPersonByAgeExists( int age){
        for (Person person : personList){
            if (person.getAge() == age ){
                return true;
            }
        }
        return false;
    }


}