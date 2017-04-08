package task2.subtask2;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.TreeMap;
import java.util.Random;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Maps {
    public static void main(String[] args) {
        long start, end;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
//add
//****************************************************************************************
        start = System.nanoTime();
        Integer keyHM1 = null;
        for(int i = 0; i < 10000; i++){
            keyHM1 = new Random().nextInt();
            Integer valHM2 = new Random().nextInt();
            hashMap.put(keyHM1,valHM2);
        }
        end = System.nanoTime();
        System.out.println("Add elements to HashMap: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        Integer keyTM1 = null;
        for(int i = 0; i < 10000; i++){
            keyTM1 = new Random().nextInt();
            Integer valTM2 = new Random().nextInt();
            treeMap.put(keyTM1, valTM2);
        }
        end = System.nanoTime();
        System.out.println("Add elements to TreeMap: " + (end-start) + " ns");
//****************************************************************************************
//remove
        start = System.nanoTime();
        hashMap.remove(keyHM1);
        end = System.nanoTime();
        System.out.println("Remove element from HashMap: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        treeMap.remove(keyTM1);
        end = System.nanoTime();
        System.out.println("Remove element from TreeMap: " + (end-start) + " ns");
//****************************************************************************************
//get
        start = System.nanoTime();
        hashMap.get(keyHM1);
        end = System.nanoTime();
        System.out.println("Get element from HashMap: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        treeMap.get(keyTM1);
        end = System.nanoTime();
        System.out.println("Get element from TreeMap: " + (end-start) + " ns");
    }
}

