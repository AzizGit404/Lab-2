public class task3 {
    public static void main(String[] args) {

        int amountOfBricks = 73;
        int containerCapacity = 8;

        System.out.println("Total bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Full containers: " + fullContainers);

        int leftoverBricks = amountOfBricks % containerCapacity;
        System.out.println("Leftover bricks: " + leftoverBricks);

        int totalContainers = fullContainers + 1;
        System.out.println("Total containers: " + totalContainers);
    }
}