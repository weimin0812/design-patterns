package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin02
 * @date 2018/8/29
 * @project design-patterns
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
