public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }

    public void activatePanels() {
        this.solarPanelsActive = true;
    }

    public void deactivatePanels() {
        this.solarPanelsActive = false;
    }

    public boolean arePanelsActive() {
        return solarPanelsActive;
    }

    public void collectData() {
        if (solarPanelsActive) {
            this.dataCollected += 10;
        }
    }

    public int getDataCollected() {
        return dataCollected;
    }

    public void displayStatus() {
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + (solarPanelsActive ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + dataCollected);
    }
}
