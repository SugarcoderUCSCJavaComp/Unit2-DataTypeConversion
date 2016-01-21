import java.util.Arrays;

/**
 * Created by Sugarcoder on 1/20/2016.
 */
public class ArrayTallying {
    public static void main(String[] args) {
        int quizScores[] = {
                0,1,4,3,2,1,
                3,4,2,3,1,2,
                1,4,3,2,1,2,
                4,1,3,2,4,1
        };

        // Find the distribution of the quiz scores.
        
        int [] scoreCount = new int[5];

        for(int score : quizScores) {
            scoreCount[score]++;
        }

        System.out.println(Arrays.toString(scoreCount));

    }


}
