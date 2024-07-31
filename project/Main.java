import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        RotateCommand rotateCommand = new RotateCommand();
        ActivatePanelsCommand activatePanelsCommand = new ActivatePanelsCommand();
        DeactivatePanelsCommand deactivatePanelsCommand = new DeactivatePanelsCommand();
        CollectDataCommand collectDataCommand = new CollectDataCommand();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satellite Command System");
        boolean running = true;

        while (running) {
            System.out.println("\nEnter a command (rotate, activatePanels, deactivatePanels, collectData, status, exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "rotate":
                    System.out.println("Enter direction (North, South, East, West):");
                    String direction = scanner.nextLine();
                    rotateCommand.rotate(satellite, direction);
                    break;
                case "activatePanels":
                    activatePanelsCommand.activate(satellite);
                    break;
                case "deactivatePanels":
                    deactivatePanelsCommand.deactivate(satellite);
                    break;
                case "collectData":
                    collectDataCommand.collectData(satellite);
                    break;
                case "status":
                    satellite.displayStatus();
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();
    }
}
