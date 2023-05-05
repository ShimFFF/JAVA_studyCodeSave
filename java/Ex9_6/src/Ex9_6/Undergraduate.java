package Ex9_6;

public class Undergraduate extends Student {
    private int level;

    public Undergraduate(String name, String major, int studentNumber, int level) {
        super(name, major, studentNumber);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + level);
    }
}

