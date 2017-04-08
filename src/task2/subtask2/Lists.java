package task2.subtask2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Anastasiya_Lemesh on 2/21/2017.
 */
public class Lists {
    public static void main(String[] args) {
        long start, end;
        ArrayList<Double> arrayList = new ArrayList<Double>();
        LinkedList<Double> linkedList = new LinkedList<Double>();
//add
//****************************************************************************************
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            Double valAL = new Random().nextGaussian();
            arrayList.add(valAL);
        }
        end = System.nanoTime();
        System.out.println("Add elements to ArrayList: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            Double valLL = new Random().nextGaussian();
            linkedList.add(valLL);
        }
        end = System.nanoTime();
        System.out.println("Add elements to LinkedList: " + (end-start) + " ns");
//****************************************************************************************
//remove
        start = System.nanoTime();
        arrayList.remove(500);
        end = System.nanoTime();
        System.out.println("Remove element from ArrayList: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        linkedList.remove(500);
        end = System.nanoTime();
        System.out.println("Remove element from LinkedList: " + (end-start) + " ns");
//****************************************************************************************
//get
        start = System.nanoTime();
        arrayList.get(500);
        end = System.nanoTime();
        System.out.println("Get element from ArrayList: " + (end-start) + " ns");
//****************************************************************************************
        start = System.nanoTime();
        linkedList.get(500);
        end = System.nanoTime();
        System.out.println("Get element from LinkedList: " + (end-start) + " ns");

    }
}
