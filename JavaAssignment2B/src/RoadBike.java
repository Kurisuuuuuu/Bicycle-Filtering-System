public class RoadBike extends Bike {
    
    private int reflectorsFitted;
    
    public RoadBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int reflectorsFitted) {
    
        super(owner, model, wheelDiameter, gears, kmsRidden);
        this.reflectorsFitted = reflectorsFitted;
    }

    public int getReflectorsFitted() {
        
        return reflectorsFitted;
    }

    public void setReflectorsFitted(int reflectorsFitted) {
        
        this.reflectorsFitted = reflectorsFitted;
    }
    
    public String toString() {
        
        return "RB|" + getOwner() + "|" + getModel() + "|" + getWheelDiameter() 
            + "|" + getGears() + "|" + getKmsRidden() + "|" + getReflectorsFitted();
    }
    
    public int serviceInterval() {
        
        int interval = getKmsRidden() * getReflectorsFitted();
        return interval;
    }
}
