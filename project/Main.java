public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();

        RotateCommand rotateCommand = new RotateCommand(satellite);
        ActivatePanelsCommand activatePanelsCommand = new ActivatePanelsCommand(satellite);
        CollectDataCommand collectDataCommand = new CollectDataCommand(satellite);

        // Example command execution
        rotateCommand.execute("South");
        activatePanelsCommand.execute();
        collectDataCommand.execute();
        
        System.out.println("Current State:");
        System.out.println("Orientation: " + satellite.getOrientation());
        System.out.println("Solar Panels: " + (satellite.areSolarPanelsActive() ? "Active" : "Inactive"));
        System.out.println("Data Collected: " + satellite.getDataCollected());
    }
}
