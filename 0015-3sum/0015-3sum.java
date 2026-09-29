import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] s) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(s);

        int left = 0;

        while (left < s.length - 2) {

            if (left > 0 && s[left] == s[left - 1]) {
                left++;
                continue;
            }

            int r = left + 1;
            int right = s.length - 1;

            while (r < right) {

                int sum = s[left] + s[r] + s[right];

                if (sum == 0) {

                    result.add(Arrays.asList(
                        s[left],
                        s[r],
                        s[right]
                    ));

                    r++;
                    right--;

                    while (r < right && s[r] == s[r - 1]) {
                        r++;
                    }

                    while (r < right && s[right] == s[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    r++;
                } else {
                    right--;
                }
            }

            left++;
        }

        return result;
    }
}