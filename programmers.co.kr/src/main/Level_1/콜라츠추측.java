package Level_1;

public class 콜라츠추측 {
    public int solution(int num) {
        int count = 0;
        long given = num;


        while(given != 1 && count < 500) {
            if(given % 2 == 0) {
                given /= 2;
            } else {
                given = given * 3 + 1;
            }

            count++;
        }

        if(count == 500) {
            return -1;
        }

        return count;
    }


    public int 참고할만한_풀이(int num) {
        long n = (long)num;
        for(int i =0; i<500; i++){
            if(n==1) return i;
            n = (n%2==0) ? n/2 : n*3+1;
        }
        return -1;
    }
}
