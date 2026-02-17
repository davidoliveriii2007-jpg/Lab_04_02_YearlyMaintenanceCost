public class Main {
    public static void main(String[] args) {
        // Task 2: Yearly Maintenance Cost
        // Calculate total yearly maintenance costs from seasonal costs

        double springCost = 450.75;
        double summerCost = 325.50;
        double fallCost = 580.25;
        double winterCost = 625.00;
        double totalYearlyCost;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Home Maintenance Costs:");
        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall: $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);
    }
}