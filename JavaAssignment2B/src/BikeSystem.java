import java.util.ArrayList;

public class BikeSystem {
    
    private int maxLoad;  
    ArrayList<String> bikeStringArray = new ArrayList<String>();
    ArrayList<Bike> bikes = new ArrayList<Bike>();
    
    public BikeSystem(int maxLoad) {
        
        this.maxLoad = maxLoad;
    }
    
    public boolean insertBike(String bikeString) {
        
        boolean returnValue = false;
        
        String[] tempArray = bikeString.split("\\|");
        
        if (bikes.size() < maxLoad) {
            
            returnValue = true;
            
            for (int i = 0; i < bikes.size(); i++) {
                
                if (bikeStringArray.get(i).equals(bikeString)) {

                    returnValue = false;
                    break;
                }
            }
            
            if (tempArray[0].equals("Bike") && returnValue) {
                
                bikes.add(new Bike(tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), 
                    Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5])));
                bikeStringArray.add(bikeString);
            }
            else if (tempArray[0].equals("MTB") && returnValue) {
                
                bikes.add(new MountainBike(tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), 
                    Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]), Integer.parseInt(tempArray[6])));
                bikeStringArray.add(bikeString);
            }
            else if (tempArray[0].equals("RB") && returnValue) {
                
                bikes.add(new RoadBike(tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), 
                    Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]), Integer.parseInt(tempArray[6])));
                bikeStringArray.add(bikeString);
            }            
        }
        else {

            returnValue = false;
        }
        
        return returnValue;
    }
    
    public boolean bikeExists(String owner, String model) {
        
        boolean bikeExists = false;
        
        for (int i = 0; i < bikes.size(); i++) {
            
            String tempOwner = bikes.get(i).getOwner();
            String tempModel = bikes.get(i).getModel();
            
            if (tempOwner.equals(owner) && tempModel.equals(model)) {
            
                bikeExists = true;
                break;
            }
        }
        return bikeExists;
    }
    
    public void printSystem() {
        
        for (int i = 0; i < bikes.size(); i++) {
            
            System.out.println(bikes.get(i).toString());
        }
    }
    
    public void closeShop() {
        
        bikes.clear();
        bikeStringArray.clear();
    }
    
    public void printServiceIntervals() {
        
        Bike currentBike;
        
        for (int i = 0; i < bikes.size(); i++) {
            
            currentBike = bikes.get(i);
            
            System.out.println(currentBike.getOwner() + ", " + currentBike.getModel()
            + ", " + currentBike.serviceInterval());
        }
    }
}
