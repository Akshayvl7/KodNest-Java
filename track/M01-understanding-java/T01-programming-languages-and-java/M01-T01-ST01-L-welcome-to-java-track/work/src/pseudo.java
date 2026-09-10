public class pseudo {
    public static void main(String[] args) {
       int javahrsperday = 2;
       int aptihrsperday = 1;
       int numofdays = 5;

       int weeklyjava = javahrsperday * numofdays;
       int weeklyapti = aptihrsperday * numofdays;
       int totalpreptime = weeklyapti + weeklyjava;
       
       System.out.println("weeklyjava : " + weeklyjava);
       System.out.println("weeklyapti : " + weeklyapti);
       System.out.println("totalpreptime : " + totalpreptime);
    }
}
