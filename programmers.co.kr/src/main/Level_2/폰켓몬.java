package Level_2;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 폰켓몬 {
    public int solution(int[] nums) {
        HashSet<Integer> uniques = IntStream.of(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        if(uniques.size() <= nums.length / 2) {
            return uniques.size();
        }

        return nums.length / 2;
    }

    public int 성능개선을위해스트림연산제거(int[] nums) {
        HashSet<Integer> species = new HashSet<>();

        for (int num : nums) {
            species.add(num);
        }

        //TODO : if분기문보다 삼항연산자가 성능 좋은 것으로 나오는데 근거 있는건가?
        return species.size() <= nums.length / 2 ? species.size() : nums.length / 2;
    }

}

