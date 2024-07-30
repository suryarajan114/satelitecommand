public class ActivatePanelsCommand {
    private Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() {
        satellite.setSolarPanelsActive(true);
        System.out.println("Solar panels activated.");
    }
}