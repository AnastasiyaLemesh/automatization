package task2.subtask2;

import java.util.*;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Sets {
    public static void main(String[] args) {
        long start, end;
        Set<Integer> hashSet = new HashSet <Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();
//add
//****************************************************************************************
        start = System.nanoTime();

        Integer valHS = null;
        for(int i = 0; i < 10000; i++){
            valHS = new Random().nextInt();
            hashSet.add(valHS);
        }
        end = System.nanoTime();
        System.out.println("Add elements to HashSet: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        Integer valTS = null;
        for(int i = 0; i < 10000; i++){
            valTS = new Random().nextInt();
            treeSet.add(valTS);
        }
        end = System.nanoTime();
        System.out.println("Add elements to TreeSet: " + (end-start) + " ns");
//****************************************************************************************
//remove
        start = System.nanoTime();
        hashSet.remove(valHS);
        end = System.nanoTime();
        System.out.println("Remove element from HashSet: " + (end - start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        treeSet.remove(valTS);
        end = System.nanoTime();
        System.out.println("Remove element from TreeSet: " + (end-start) + " ns");
//****************************************************************************************
//get
        Iterator iterator = hashSet.iterator();
        start = System.nanoTime();
        for(int i = 0; i < 500; i++){
            iterator.hasNext();
        }
        iterator.next();
        end = System.nanoTime();
        System.out.println("Get element from HashSet: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        iterator = treeSet.iterator();
        for(int i = 0; i < 500; i++){
            iterator.hasNext();
        }
        iterator.next();
        end = System.nanoTime();
        System.out.println("Get element from TreeSet: " + (end-start) + " ns");
    }
}
