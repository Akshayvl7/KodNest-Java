public class calc {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double simpleinterest = principal * rate * time/100.0;
        double totalamount = principal + simpleinterest;
       
        double weight = 72.0;
        double height = 1.8;
        double bmi = weight /(height*height);

        int m1 = 78;
        int m2 = 84;
        int m3 = 69;
        int m4 = 91;
        int m5 = 88;
        int totalmarks = m1 + m2 + m3 + m4 + m5;
        double percentage = totalmarks * 100.0 / 500.0;

        System.out.println("Principal Amount : " + principal);
        System.out.println("Rate of Interest : " + rate);
        System.out.println("Time in Years : " + time);
        System.out.println("Simple Interest : " + simpleinterest);
        System.out.println("Total Amount : " + totalamount);
    }
    
}
