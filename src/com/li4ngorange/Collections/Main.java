package com.li4ngorange.Collections;

import java.util.*;

public class Main {


    public static void hashMapExample() {

        // HashMap allows null keys and null values, doesn't guarantee the order of the list
        Map<String, Integer> hashMap = new HashMap<>();

        // Add some values
        hashMap.put("Johnny", 1);
        hashMap.put("Stacey", 3);
        hashMap.put("Rex", 2);
        hashMap.put("Jonathan", 5);

        // Print out the total size of the map
        System.out.println("Total student: " + hashMap.size());

        // Iterate over students using keySet method
        for (String student: hashMap.keySet()) {
            System.out.println("Student: " + student + ", Level: " + hashMap.get(student));
        }

        // Print out extra new line
        System.out.println();

        // Searching student in the hashMap
        String searcher = "Johnny";

        if (hashMap.containsKey(searcher)) {
            System.out.println("The person you try to search is " + searcher + ", his/her level is " + hashMap.get(searcher));
        } else {
            System.out.println("The person you try to search is not in the list");
        }

        // Clean the hashMap
        hashMap.clear();

        System.out.println("The size of the HashMap after clear() method called: " + hashMap.size());
    }

    /**
     * treeMapExample method
     * This function demonstrate some basic operations with TreeMap
     */
    public static void treeMapExample() {

        // TreeMap sorts the list base on the "Key" not the value
        Map<String, Integer> treeMap = new TreeMap<>();

        // Add some values
        treeMap.put("Johnny", 1);
        treeMap.put("Stacey", 3);
        treeMap.put("Rex", 2);
        treeMap.put("Jonathan", 5);

        System.out.println(treeMap);

        // Print out the highest key
        // System.out.println("Highest Key: " + treeMap.lastKey());
    }


    /**
     * arrayListExample method
     *
     */
    public static void arrayListExample() {

        List<String> arrayList = new ArrayList<>();

        // Add some values in the list
        arrayList.add("ArrayList 1");
        arrayList.add("ArrayList 3");
        arrayList.add("ArrayList 2");
        arrayList.add("ArrayList 4");

        System.out.println(arrayList);

        // Add value into the list at index 0
        arrayList.add(0, "ArrayList 0");

        System.out.println(arrayList);

        String firstItem = arrayList.get(0);
        String secondItem = arrayList.get(1);
        String thirdItem = arrayList.get(2);

        System.out.println(firstItem + ", " + secondItem + ", " + thirdItem);


        // Access via iterator
        Iterator<String> arrayListIterator = arrayList.iterator();

        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

    }


    /**
     * hashSetExample
     * Definition: Set interface extends Collection interface. In a set, no duplicates are allowed.
     * Every element in a set must be unique.
     * You can simply add elements to a set, and duplicates will be removed automatically.
     *
     *
     */
    public static void hashSetExample() {

        // Hash set use hash table to store information
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Element 1");
        hashSet.add("Element 3");
        hashSet.add("Element 2");
        hashSet.add("Element 4");

        System.out.println(hashSet);                        // Print out the hashSet array
        Iterator<String> hashIterator = hashSet.iterator(); // Return an iterator over the element in the set

        while(hashIterator.hasNext()) {
            System.out.println(hashIterator.next());
        }

        // Check to see if certain element is in the set
        if (hashSet.contains("Element 2")) {
            System.out.println("The element is in the set");
        } else {
            System.out.println("The set doesn't contain the element");
        }
    }

    /**
     * treeSetExample
     * TreeSet is a special type of set which will automatically sort the list when user add items
     * in it.
     */
    public static void treeSetExample() {

        // TreeSet will automatically sort the list when you put in the set
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Element 1");
        treeSet.add("Element 3");
        treeSet.add("Element 2");
        treeSet.add("Element 4");

        // parse into iterator
        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Search an element in the set
        String searcher = "Element 5";
        if (treeSet.contains(searcher)) {
            System.out.println("The element: " + searcher + " is in the set");
        } else {
            System.out.println("The element: " + searcher + " is not in the set");
        }


        // Create second tree set
        Set<String> newTreeSet = new TreeSet<>();

        newTreeSet.add("Element 1");
        newTreeSet.add("Element 3");
        newTreeSet.add("Element 5");
        newTreeSet.add("Element 7");

        // Union set of treeSet and newTreeSet
        Set<String> union = new TreeSet<>(treeSet);
        union.addAll(newTreeSet);
        System.out.println(union);

        // Intersection of treeSet and newTreeSet
        Set<String> intersect = new TreeSet<>(treeSet);
        intersect.retainAll(newTreeSet);
        System.out.println(intersect);

        // Set only contains in treeSet not in newTreeSet
        Set<String> difference = new TreeSet<>(treeSet);
        difference.removeAll(newTreeSet);
        System.out.println(difference);

    }


    public static void main(String[] args) {

        // hashMapExample();
        // treeMapExample();


        // arrayListExample();

        // hashSetExample();
        treeSetExample();


    }
}
