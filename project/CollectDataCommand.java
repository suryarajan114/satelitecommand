public class CollectDataCommand {
    private Satellite satellite;
    private static final int DATA_INCREMENT = 10;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() {
        satellite.incrementDataCollected(DATA_INCREMENT);
        System.out.println("Data collected: " + satellite.getDataCollected());
    }
}
