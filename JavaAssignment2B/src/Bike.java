public class Bike {
    
    private String owner;
    private String model;
    private int wheelDiameter;
    private int gears;
    private int kmsRidden;
    
    public Bike(String owner, String model, int wheelDiameter, int gears, int kmsRidden) {
        
        this.owner = owner;
        this.model = model;
        this.wheelDiameter = wheelDiameter;
        this.gears = gears;
        this.kmsRidden = kmsRidden;
    }

    public String getOwner() {
        
        return owner;
    }

    public void setOwner(String owner) {
        
        this.owner = owner;
    }

    public String getModel() {
        
        return model;
    }

    public void setModel(String model) {
        
        this.model = model;
    }

    public int getWheelDiameter() {
        
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        
        this.wheelDiameter = wheelDiameter;
    }

    public int getGears() {
        
        return gears;
    }

    public void setGears(int gears) {
        
        this.gears = gears;
    }

    public int getKmsRidden() {
        
        return kmsRidden;
    }

    public void setKmsRidden(int kmsRidden) {
        
        this.kmsRidden = kmsRidden;
    }
    
    public String toString() {
        
        return "Bike|" + getOwner() + "|" 
            + getModel() + "|" + getWheelDiameter() + "|" + getGears() 
            + "|" + getKmsRidden();
    }
    
    public int serviceInterval() {
        
        int interval = getOwner().length() * getGears();
        System.out.println(getOwner().length());
        return interval;
    }
}