public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    // Initial state
    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    // Getters and Setters
    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public boolean areSolarPanelsActive() {
        return solarPanelsActive;
    }

    public void setSolarPanelsActive(boolean solarPanelsActive) {
        this.solarPanelsActive = solarPanelsActive;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void incrementDataCollected(int amount) {
        if (solarPanelsActive) {
            this.dataCollected += amount;
        } else {
            System.out.println("Cannot collect data. Solar panels are inactive.");
        }
    }
}
