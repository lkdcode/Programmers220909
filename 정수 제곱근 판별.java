class Solution {
    public long solution(long n) {
        // n을 받는다.
        // x*x == n 이면 (x+1)*(x+1)을 반환한다.
        // x*x != n 이면 -1을 리턴한다
        //
        
        long answer = 0;
        long x =0;
        while(x*x <= n){
            if(x*x == n){
                answer = (x+1)*(x+1);
            }
            else{
                answer = -1;
            }
            x++;
        }
        
        
        
        return answer;
    }
}