package Ex9_3;

public class Vehicle {
    private String manufacturer;
    private int numCylinders;
    private Person owner;
    
    public Vehicle(String manufacturer, int numCylinders, Person owner) {
        this.manufacturer = manufacturer;
        this.numCylinders = numCylinders;
        this.owner = owner;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public int getNumCylinders() {
        return numCylinders;
    }
    
    public Person getOwner() {
        return owner;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }
    
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Vehicle)) {
            return false;
        }
        Vehicle otherVehicle = (Vehicle) other;
        return manufacturer.equals(otherVehicle.manufacturer) &&
               numCylinders == otherVehicle.numCylinders &&
               owner.equals(otherVehicle.owner);
    }
}
