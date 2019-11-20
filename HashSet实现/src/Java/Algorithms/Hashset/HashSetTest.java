package Java.Algorithms.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {
    public static void main(String[] args)
    {
        HashSet<String> words = new HashSet<>();
        long totalTime = 0;

        Scanner in = new Scanner(System.in);
        long callTime = System.currentTimeMillis();
        try
        {
            while(!in.hasNext("#"))
            {
                String word = in.next();
                words.add(word);
            }
            in.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("illegal input!");
        }
        callTime = System.currentTimeMillis() - callTime;
        totalTime += callTime;
        System.out.println("total time is "+totalTime);
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println(" ");
        System.out.println(words.size()+" distinct words,"+totalTime +" milliseconds.");

        words.remove("apple");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println(words.contains("cat"));
        HashSet cloneSet = (HashSet) words.clone();
        System.out.println("克隆数据："+cloneSet);
    }
}
