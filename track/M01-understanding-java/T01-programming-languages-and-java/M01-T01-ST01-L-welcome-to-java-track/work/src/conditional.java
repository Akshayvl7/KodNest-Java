public class conditional {
    public static void main(String[] args) {
        int number = -7;
        int firstscore = 18;
        int secondscore = 25;

        if (number > 0){
            System.out.println("Number type: positive");
        }   else if (number < 0) {
            System.out.println("Number type : Negative");
        }   else {
            System.out.println("Number type : Zero");
        }
        if (firstscore % 2 == 0) {
            System.out.println("firstscore is even : " + firstscore);
        } else {
            System.out.println("firstscore is odd : " + secondscore);
        }
    }   
}
