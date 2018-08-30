package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin02
 * @date 2018/8/29
 * @project design-patterns
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MAlE")) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
