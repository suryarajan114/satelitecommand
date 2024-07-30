public class RotateCommand {
    private Satellite satellite;

    public RotateCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute(String direction) {
        satellite.setOrientation(direction);
        System.out.println("Satellite orientation set to " + direction);
    }
}