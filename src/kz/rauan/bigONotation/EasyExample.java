package kz.rauan.bigONotation;

import java.util.List;

public class EasyExample {

    //Example of O(1)
    boolean IsListEmpty(List<String> elements)
    {
        return elements.size() == 0;
    }

    //Example of O(N)
    boolean ContainsValue(List<Integer> numbers, Integer needle)
    {
        for (Integer number: numbers) {
            if (number.equals(needle)) {
                return true;
            }
        }
        return false;
    }

    //Example of O(N*N)
    boolean ContainsDuplicates(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i == j) {
                    continue;
                }

                if (numbers.get(i).equals(numbers.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
