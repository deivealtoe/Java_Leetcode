package majority_element;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int getMajorityElement(int[] nums) {
        Map<Integer, Integer> mapOfValues = new HashMap<>();

        for (int num : nums) {
            if (!mapOfValues.containsKey(num)) {
                mapOfValues.put(num, 1);
            } else {
                int count = mapOfValues.get(num) + 1;
                mapOfValues.put(num, count);
            }
        }

        int maxValueInMap = Collections.max(mapOfValues.values());

        for (Map.Entry<Integer, Integer> entry : mapOfValues.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                return entry.getKey();
            }
        }

        return -1;
    }

}
