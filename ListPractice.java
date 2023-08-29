import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
    public static void main(String[] args){
        String[] bestFriends = new String[3];

        ArrayList<String> myFriendsList = new ArrayList<>();
        //add 5 friends to the list
        myFriendsList.add("Mitchie");
        myFriendsList.add("Johnny");
        myFriendsList.add("Richie");
        myFriendsList.add("Tommy");
        myFriendsList.add("Bucky");

        System.out.println("My first friend is: " + myFriendsList.get(0));
        System.out.println("My fifth friend is: " + myFriendsList.get(4));
        System.out.println("The size (number of elements): " + myFriendsList.size());

        //Set-change the data of an element
        myFriendsList.set(0,"Sit");
        System.out.println("My new first friend is n (Except Sit) " + myFriendsList.get(0));

        //Remove
        myFriendsList.remove(2); // two opt to remove obj or int; use int

        //output the list without a for-loop
        System.out.println(myFriendsList);

        int myFriendNumber = 1; // this help number down your friend capacity

        //output the list with a for/each loop
        for(String s : myFriendsList){ // or do the trad(int i = 0; i < myFriendsList.size(); i++)
            System.out.println("friends " + myFriendNumber + " is " + s); // change s to i if doing trad way
            myFriendNumber++;
        }

        //add list elements with a for loop
        for(int i = 0; i < 10; i++){ // for (int?value?, check,incrament)
            // use .add()
            myFriendsList.add(i+4, "new friend"); // use int add()
            System.out.println(" [!] *new friend added to list*");
        }
        System.out.println(myFriendsList);

        //output list with a for-loop for new friends
        for(int i = 0; i < myFriendsList.size(); i++){
            System.out.println("friends " + myFriendNumber + " is " +myFriendsList.get(i));
            myFriendNumber++;
        }
    }
}

//array hold almost anything, arraylist hold only object
