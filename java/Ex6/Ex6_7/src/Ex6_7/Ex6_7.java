package Ex6_7;

class Temperature {
    private double degrees;
    private char scale;

    // Constructors
    public Temperature() {
        this.degrees = 0.0;
        this.scale = 'C';
    }

    public Temperature(double degrees) {
        this.degrees = degrees;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.degrees = 0.0;
        this.scale = scale;
    }

    public Temperature(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    // Accessor methods
    public double getDegreesCelsius() {
        if (scale == 'F') {
            return roundToNearestTenth((degrees - 32.0) * 5.0 / 9.0);
        } else {
            return roundToNearestTenth(degrees);
        }
    }

    public double getDegreesFahrenheit() {
        if (scale == 'C') {
            return roundToNearestTenth((degrees * 9.0 / 5.0) + 32.0);
        } else {
            return roundToNearestTenth(degrees);
        }
    }

    // Set methods
    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperature(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    // Comparison methods
    public boolean isEqualTo(Temperature other) {
        return this.getDegreesCelsius() == other.getDegreesCelsius();
    }

    public boolean isGreaterThan(Temperature other) {
        return this.getDegreesCelsius() > other.getDegreesCelsius();
    }

    public boolean isLessThan(Temperature other) {
        return this.getDegreesCelsius() < other.getDegreesCelsius();
    }

    // Helper method to round to the nearest tenth
    private double roundToNearestTenth(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}

public class Ex6_7 {
	public static void main(String[] args) {
        // Test constructors
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(25.0);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(32.0, 'F');

        // Test accessor methods
        System.out.println("t1 in Celsius: " + t1.getDegreesCelsius() + "°C");
        System.out.println("t2 in Celsius: " + t2.getDegreesCelsius() + "°C");
        System.out.println("t3 in Fahrenheit: " + t3.getDegreesFahrenheit() + "°F");
        System.out.println("t4 in Celsius: " + t4.getDegreesCelsius() + "°C");

        // Test set methods
        t1.setDegrees(10.0);
        t1.setScale('F');
        System.out.println("t1 in Fahrenheit: " + t1.getDegreesFahrenheit() + "°F");

        // Test comparison methods
        System.out.println("t2 is equal to t3: " + t2.isEqualTo(t3));
        System.out.println("t2 is greater than t4: " + t2.isGreaterThan(t4));
        System.out.println("t2 is less than t4: " + t2.isLessThan(t4));

        // Test equality of temperature pairs
        Temperature t5 = new Temperature(0.0);
        Temperature t6 = new Temperature(32.0, 'F');
        Temperature t7 = new Temperature(-40.0);
        Temperature t8 = new Temperature(-40.0, 'F');
        Temperature t9 = new Temperature(100.0);
        Temperature t10 = new Temperature(212.0, 'F');
        
        System.out.println("t5 is equal to t6: " + t5.isEqualTo(t6));
        System.out.println("t7 is equal to t8: " + t7.isEqualTo(t8));
        System.out.println("t9 is equal to t10: " + t9.isEqualTo(t10));

        // Test inequality of temperature pairs
        System.out.println("t5 is not equal to t7: " + !t5.isEqualTo(t7));
        System.out.println("t7 is not equal to t9: " + !t7.isEqualTo(t9));
        System.out.println("t6 is not equal to t8: " + !t6.isEqualTo(t8));

        // Test comparison of temperature pairs
        System.out.println("t5 is greater than t7: " + t5.isGreaterThan(t7));
        System.out.println("t9 is greater than t10: " + t9.isGreaterThan(t10));
        System.out.println("t7 is less than t8: " + t7.isLessThan(t8));
    }
}
