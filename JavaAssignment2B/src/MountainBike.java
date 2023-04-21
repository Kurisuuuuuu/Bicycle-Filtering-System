public class MountainBike extends Bike {
    
    private int suspensionDepth;
    
    public MountainBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int suspensionDepth) {
        
        super(owner, model, wheelDiameter, gears, kmsRidden);
        this.suspensionDepth = suspensionDepth;
    }

    public int getSuspensionDepth() {
        
        return suspensionDepth;
    }

    public void setSuspensionDepth(int suspensionDepth) {
        
        this.suspensionDepth = suspensionDepth;
    }
    
    public String toString() {
        
        return "MTB|" + getOwner() + "|" + getModel() + "|" + getWheelDiameter() 
            + "|" + getGears() + "|" + getKmsRidden() + "|" + getSuspensionDepth();
    }
    
    public int serviceInterval() {
        
        int interval = getWheelDiameter() * getGears() - getSuspensionDepth();
        return interval;
    }
}
