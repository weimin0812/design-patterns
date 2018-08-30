package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin02
 * @date 2018/8/29
 * @project design-patterns
 */
public class CriteriaPattrenDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));


        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));


        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));


        System.out.println("\nSingle Or females: ");
        printPersons(singleOrFemale.meetCriteria(persons));


    }

    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
