import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(19));
    }
    public static int solution(int N) {
        // write your code in Java SE 11
        int checkNum = 10;
        String sCheckNum;
        char[] numDigitsArray;
        Boolean bAnswerFound = false;

        int tempAnswer = 0;
        if(N < 10){
            return N;
        }
        else{
            while(!bAnswerFound){
                tempAnswer = 0;
                sCheckNum = Integer.toString(checkNum);
                numDigitsArray = sCheckNum.toCharArray();

                System.out.println(numDigitsArray[0] + " " + numDigitsArray[1]);

                for(char x : numDigitsArray){
                    tempAnswer += Character.getNumericValue(x);
                    System.out.println("tempAnswer: " + tempAnswer + " X: " + x);
                }
                if(tempAnswer == N){
                    bAnswerFound = true;
                }
                checkNum++;
            }
        }
        return tempAnswer;
    }
}
