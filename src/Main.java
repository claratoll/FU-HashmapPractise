import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> phoneNumber = new HashMap<>();

        phoneNumber.put("Greta", "54334311533");
        phoneNumber.put("Karin", "63423412344");
        phoneNumber.put("Kevin", "32454301222");

        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(phoneNumber.get(name));

        System.out.println("Add a name to the list:");
        String newName = sc.nextLine();
        String newNumber = sc.nextLine();

        phoneNumber.put(newName, newNumber);
        for (String key: phoneNumber.keySet()){
            System.out.println(key + " " + phoneNumber.get(key));
        }

    }
}