import java.util.HashMap;

class Solution
{
	public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> poketmons = new HashMap<>();
        
        for (int n : nums) {
            if (!poketmons.containsKey(n)){
                poketmons.put(n, 1);
            } else {
                poketmons.replace(n, poketmons.get(n) + 1);
            }
        }
        
        int p_size = nums.length/2;
        int pk_size = poketmons.keySet().size();
        
        if (p_size <= pk_size) {
            answer = p_size;
        } else {
            answer = pk_size;
        }
        return answer;
    }
}