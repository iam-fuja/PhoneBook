import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts mak = new Contacts();
        mak.save();

        System.out.println("Search ....");
        System.out.print("Enter : ");
        String name = scanner.next();
        mak.search(name);
    }
}

 class Contacts{
    public static String name;
    public static String number;
    public static HashMap<String, String> entry;

    public static void save(){
        Scanner n = new Scanner(System.in);
        System.out.print("Input name: ");
        name = n.nextLine();
        System.out.print("Input number: ");
        number = n.nextLine();
        entry = new HashMap<>();
        entry.put(number, name);
//        System.out.print(entry);
    }

    public static void search(String name){
        if(entry.containsKey(name) || entry.containsValue(name)){
        for(var detail : entry.entrySet()){
           if (detail.getKey().equals(name)){
                System.out.println("Name : "+ detail.getValue() + "\nNumber : " + detail.getKey());
                break;
            }
           else if (detail.getValue().equals((name))){
               System.out.println("Name : "+ detail.getValue() + "\nNumber : " + detail.getKey());
               break;
           }
        }}
        else {
            System.out.println("Details not found!");
        }
//        String result = entry.get(number);
//        System.out.println(result);
//
//         result = entry.get(name);
//        System.out.print(result);

    }
}