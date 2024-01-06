import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        int total = 0;
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.toString(numbers[i]);
            total += numbers[i];
        }
        
        StringBuilder answer = new StringBuilder();
        
        if (total == 0) {
            answer.append("0");
        } else {
            Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));

            for (int i = 0; i < arr.length; i++){
                answer.append(arr[i]);
            }
        }
        
        return answer.toString();
    }
}