package extraCoaching;

import java.util.ArrayList;
import java.util.List;

public class Displayer {
    // Create a function should be public and static and should be void.
    //    //It should take 2 parameters (Arraylist<String> and int[])
    //    // Print all the list members and array members inside of this function
    //    //Name should be displayer
    public static void displayer(ArrayList<String> list, int[] array) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Shazli");
        stringArrayList.add("Mawuwa");
        stringArrayList.add("Hana");
        stringArrayList.add("Mirgisa");
        int[] numbersArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


/*
        Create function with name multiplyEachElementByItself
        it should be public, static and returns ArrayList<Integer>
        it should take a parameter of int[] array
        it should go through all the array members multiply them by itself and add to result list.

        Example [1,2,3,4,5,6,7] -> List(1,4,9,16,25,36,49)
    */
    }

    public static ArrayList<Integer> multiplyEachElementByItself(int[] array) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int number : array) {
            resultList.add(number * number);
        }
        return resultList;
    }

    /*
        Create function with name concatNameAndAges
        it should be public, static and returns ArrayList<String>
        it should take a parameter of int[] ages and String[] names
        it should go through all the array members and concat them and add to list. at the end return list.
        Example [1,2,3] ["Shazli", "Melissa", "Hana"] -> List("Shazli-1","Melissa-2", "Hana-3")

        Deadline 7.20pm

    */


    public static ArrayList<String> concatNamesAndAges(String[] names, int[] ages){
        String[] name = {"Maua", "Mudidi"};
        int[] age = {20,21};
        System.out.println(name + "-" + age);

    }
    /*
        Create function with name multiplyAgesByFIve
        it should be public, static and returns ArrayList<String>
        it should take a parameter of ArrayList<Integer> ages and String[] names
        it should go through all the array members and concat them and add to list. at the end return list.
        Example [1,2,3] ["Shazli", "Melissa", "Hana"] -> List("Shazli-5","Melissa-10", "Hana-15")
    /

    /
        Create function with name findRootAndSquare
        it should be public, static and returns String
        it should take a parameter of int number
        it should Calculate root and square and return as a string format
        Example (4) -> (2<->16)
    */

}