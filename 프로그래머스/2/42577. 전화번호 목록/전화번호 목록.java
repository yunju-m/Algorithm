import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
       
        boolean answer = true;
        int p_size = phone_book.length;
        
        for (int i = 1; i < p_size; i++){
            String target = phone_book[i-1];
            if (phone_book[i].startsWith(target)){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}