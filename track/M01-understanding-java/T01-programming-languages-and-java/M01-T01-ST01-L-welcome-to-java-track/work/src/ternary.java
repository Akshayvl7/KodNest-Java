public class ternary {
    public static void main(String[] args) {
        int m1 = 80;
        int m2 = 70;
        int m3 = 60;
        int m4 = 50;
        int m5 = 40;
        int total = m1+m2+m3+m4+m5;

        double percentage =(total/500.0)*100;
        boolean valid = (m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (m3>=0 && m3<=100) && (m4>=0 && m4<=100) && (m5>=0 && m5<=100);
        String status = percentage < 40 ? "Fail" : percentage < 60 ? "Pass" : percentage < 75 ? "First class " : "Distinction" ;

        System.out.println("Percentage :" +percentage);
        System.out.println("Status :"+status);
        System.out.println("Valid :"+valid);    

        
    }  
}
