public class MainChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver) {
            finalScore += 1000 + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }


//        Solution 1, not very efficient
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if(newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score is " + newFinalScore);
//        }

//        Solution 2
         score = 10000;
         levelCompleted = 8;
         bonus = 200;

         finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }



//        if(score < 5000 && score > 1000){
//            System.out.println("Your score is less than 5000 and more than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score is less than 1000");
//        }else{
//            System.out.println("Your score is " + score);
//        }
    }
}
