package filter;

import java.util.List;

/**
 * @author weimin02
 * @date 2018/8/29
 * @project design-patterns
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
