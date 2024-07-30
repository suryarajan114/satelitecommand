public class DeactivatePanelsCommand {
    private Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() {
        satellite.setSolarPanelsActive(false);
        System.out.println("Solar panels deactivated.");
    }
}