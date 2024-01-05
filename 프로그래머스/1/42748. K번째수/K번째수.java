import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] result = new int[commands.length];
        int start, end, target;
        
        for (int play = 0; play < commands.length; play++){
            start = commands[play][0]-1;
            end = commands[play][1];
            target = commands[play][2]-1;
            
            answer = Arrays.copyOfRange(array, start, end);
            Arrays.sort(answer);
            result[play] = answer[target];
            
        }

        return result;
    }
}