class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        for(; a < n; a++){
            if( n % a == 1){
                answer=a;
                break;
            }
        }
        
        
        return answer;
    }
}