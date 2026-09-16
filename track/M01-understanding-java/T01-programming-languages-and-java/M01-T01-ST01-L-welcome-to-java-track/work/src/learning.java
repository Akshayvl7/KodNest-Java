public class learning {
    public static void main(String[] args) {
        int completedtopics = 17;
        int totaltopics = 20;
        int dailylearninghours = 3;
        int learningdays = 5;

        int calremainingtopics = totaltopics - completedtopics;
        int weeklylearninghours = dailylearninghours * learningdays;
        double calculateprogressPercentage = (double) completedtopics * 100 / totaltopics   ;

        System.out.println("completedtopics : " + completedtopics);
        System.out.println("weeklylearninghours : " + weeklylearninghours);
        System.out.println("calculateprogressPercentage : " + calculateprogressPercentage);
        System.out.println("calremainingtopics : " + calremainingtopics);
        
    }   
}
