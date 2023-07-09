public class RentRideUse {
    private String rideDistance;
    private String carRequested;
    double minDistance=9999;
    private static final int CHARGE_PER_KM=8;
    private String finalDriver;
    public String getRideDistance() {
    	return rideDistance;
    }
    public void setRideDistance(String rideDistance) {
    	this.rideDistance=rideDistance;	
    }
    public String getCarRequested() {
    	return carRequested;
    }
    public void setCarRequested(String carRequested) {
    	this.carRequested=carRequested;
    }
    private String[] drivers= {"A","B","C","D","E"};
    private String[] carModel= {"Sedan","HatchBack","5 Seater","Sedan","HatchBack"};
    private double[] rating= {4,4.3,4.8,4.1,4.7};
    private String[] distanceFromCustomer= {"500m","1km","200m","700m","430m"};
    private float[] distances=new float[distanceFromCustomer.length];
    public void Distance() {
		for(int i=0;i<distanceFromCustomer.length;i++)
		{  
			String distance=distanceFromCustomer[i];
			if(distance.endsWith("km")) {
				float ConvertedDistance=Float.valueOf(distance.replace("km",""));
				distances[i]=ConvertedDistance;
				
			}
			else 
			{   
				float  ConvertedDistance=Float.valueOf(distance.replace("m",""))/1000;
				distances[i]=ConvertedDistance;
			}
		}
    }
    public void findFinalDriver() {
    	for(int i=0;i<distanceFromCustomer.length;i++) {
    		if(getCarRequested().equals(carModel[i])&&rating[i]>=4.0) {
    			if(distances[i]<minDistance) {
    				finalDriver=drivers[i];
    				minDistance=distances[i];
    			}
    			
    		}
    	}
    	long finalRideDistance;
    	if(rideDistance.endsWith("km")) {
    		finalRideDistance=Long.valueOf(getRideDistance().replace("km",""));
    	}
    	else {
    		finalRideDistance=Long.valueOf(getRideDistance());
    	}
    	System.out.println("Driver "+finalDriver+" will get you to the destination.");
        System.out.println("Your charge will be Rs "+finalRideDistance*CHARGE_PER_KM+" ("+getRideDistance()+"*"+CHARGE_PER_KM+")");

		
    }
}
