import java.util.Scanner;
class RentARide extends RentRideUse{
    public static void main(String[] args) {
        // Sample input
    	RentRideUse rdu=new RentRideUse();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Customer Ride Distance: ");
        rdu.setRideDistance(sc.nextLine());
        System.out.println("Car Requested: ");
        rdu.setCarRequested(sc.nextLine());
        rdu.Distance();
        rdu.findFinalDriver();
        
    }
    
    
}
