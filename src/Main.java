public class Main {
  public static void main(String[] args) {
    int homeMaintenanceCostSpring = 1320;
    int homeMaintenanceCostSummer = 1235;
    int homeMaintenanceCostFall = 1175;
    int homeMaintenanceCostWinter = 1425;

    System.out.println("The home maintenance cost in Spring was: " + homeMaintenanceCostSpring);
    System.out.println("The home maintenance cost in Summer was: " + homeMaintenanceCostSummer);
    System.out.println("The home maintenance cost in Fall was: " + homeMaintenanceCostFall);
    System.out.println("The home maintenance cost in Winter was: " + homeMaintenanceCostWinter);

    int totalHomeMaintenanceCost = homeMaintenanceCostSpring + homeMaintenanceCostSummer + homeMaintenanceCostFall + homeMaintenanceCostWinter;

    System.out.println("The total home maintenance cost for the year was: " + totalHomeMaintenanceCost);

  }
}