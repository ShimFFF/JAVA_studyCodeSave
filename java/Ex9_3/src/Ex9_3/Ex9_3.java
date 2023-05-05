package Ex9_3;

class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
    
    public Truck(String manufacturer, int numCylinders, Person owner,
                 double loadCapacity, double towingCapacity) {
        super(manufacturer, numCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }
    
    public double getLoadCapacity() {
        return loadCapacity;
    }
    
    public double getTowingCapacity() {
        return towingCapacity;
    }
    
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    
    public boolean equals(Object other) {
        if (other == null || !(other instanceof Truck)) {
            return false;
        }
        Truck otherTruck = (Truck) other;
        return super.equals(other) &&
               loadCapacity == otherTruck.loadCapacity &&
               towingCapacity == otherTruck.towingCapacity;
    }
}

public class Ex9_3 {
	public static void main(String[] args) {
		Person owner1 = new Person("shim");
        Person owner2 = new Person("kim");
        
        Vehicle vehicle1 = new Vehicle("Toyota", 4, owner1);
        Vehicle vehicle2 = new Vehicle("Honda", 6, owner2);
        
        System.out.println("Vehicle 1:");
        System.out.println("Manufacturer: " + vehicle1.getManufacturer());
        System.out.println("Number of cylinders: " + vehicle1.getNumCylinders());
        System.out.println("Owner: " + vehicle1.getOwner().getName());
        
        System.out.println("\n\nVehicle 2:");
        System.out.println("Manufacturer: " + vehicle2.getManufacturer());
        System.out.println("Number of cylinders: " + vehicle2.getNumCylinders());
        System.out.println("Owner: " + vehicle2.getOwner().getName());
        
        System.out.println("\nAre vehicles 1 and 2 equal? " + vehicle1.equals(vehicle2));
        
        
        Truck truck1 = new Truck("Toyota", 7, owner1, 3.5, 2.0);
        Truck truck2 = new Truck("Toyota", 7, owner1, 3.5, 2.0);
        
        System.out.println("\n\nTruck 1:");
        System.out.println("Manufacturer: " + truck1.getManufacturer());
        System.out.println("Number of cylinders: " + truck1.getNumCylinders());
        System.out.println("Owner: " + truck1.getOwner().getName());
        System.out.println("Load capacity: " + truck1.getLoadCapacity());
        System.out.println("Towing capacity: " + truck1.getTowingCapacity());
        
        System.out.println("\n\nTruck 2:");
        System.out.println("Manufacturer: " + truck2.getManufacturer());
        System.out.println("Number of cylinders: " + truck2.getNumCylinders());
        System.out.println("Owner: " + truck2.getOwner().getName());
        System.out.println("Load capacity: " + truck2.getLoadCapacity());
        System.out.println("Towing capacity: " + truck2.getTowingCapacity());
        
        System.out.println("\nAre trucks 1 and 2 equal? " + truck1.equals(truck2));
    
	}

}
