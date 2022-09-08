class Solution {
    public int solution(int n) {
        int answer = 0;
        // n을 받는다.
        // int i = 1; 을 생성하고
        // n % i ==0 인 경우 answer에 더한다.
        // n==i이 될 때까지 answer에 더한다        
        for(int i = 1; i <= n; i++){
            if(n % i ==0 ){
                answer += i;
            }
        }
        return answer;
    }
}