package intellij;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Array and arraylist
//        Declaring an array
//        Array can hold primitives or objects
        String[] friends = new String[4]; // Has a fixed size
        String[] coolFriends = {"John", "Chris", "Luke"};

//        Declaring an arrayList - don't have a fixed size. Grows and shrink automatically
//        ArrayList can only hold objects,but support wrapper types for primitives
        ArrayList<String>  neighbours = new ArrayList<>(); //<> Is a diamond operator
        ArrayList<String> closeFriends = new ArrayList<>(Arrays.asList("Austine", "Antony", "Joseph"));
        ArrayList<Integer>  marks = new ArrayList<>(); // use wrapper classes like: Integer, Double, Long, Boolean

        System.out.println("Hello world!");

        // getting values from an array
        System.out.println(coolFriends[2]);

        // getting values from arrayList
        System.out.println(closeFriends.get(1));

        // length of array
        System.out.println(coolFriends.length);

        // length of arrayList
        System.out.println(closeFriends.size());

        // You CANNOT add elements at the end of array due to their fixed size

        // Adding to the end of an arrayList
        closeFriends.add("Jude");
        System.out.println(closeFriends.get(3));

        // changing an element at particular index
        // arrays
        coolFriends[0] = "Mitch";
        System.out.println(coolFriends[0]);

        // setting an element in arrayList
        closeFriends.set(0, "James");
        System.out.println(closeFriends.getFirst());

        // removing an element
        // Arrays can't remove elements due to it's fixed size
        closeFriends.remove(2);

        // printing
        // printing arrays gives memory address
        // printing arrayList works perfectly

//        System.out.println(coolFriends); // gives memory address
        System.out.println(closeFriends); // works

        // Printing arrays - use for loop
        for(String coolFriend : coolFriends){
            System.out.println(coolFriend);
        }



    }

}