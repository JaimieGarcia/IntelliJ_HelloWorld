import java.util.*;

public class MapEntryExercise {
    public static void main(String[] args) {

        HashMap<String, String> carInventory = new HashMap<>();
            carInventory.put("BMW", "328i");
            carInventory.put("Honda", "CR-V");
            carInventory.put("Toytoa", "Prius");
            carInventory.put("Kia", "Soul");

            Scanner carType = new Scanner(System.in);

            System.out.println("Which car model would you like to view?");
            String myCar = carType.nextLine();

            if (carInventory.containsKey(myCar)) {
                System.out.println("You're looking for a " + myCar +". We have it in stock!");
            } else System.out.println("We're sorry! We do not currently have that vehicle in stock.");
    }
}
