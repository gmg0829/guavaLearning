package collections;

import com.google.common.collect.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MultiDemo {
    public static void main(String[] args) {
        Multimap<String,Integer> map= ArrayListMultimap.create();
        map.put("aa",1);
        map.put("aa",2);
        //System.out.println(map.get("aa"));
        String strWorld="wer|dfd|dd|dfd|dda|de|dr";
        String[] words=strWorld.split("\\|");
        List<String> wordList= Arrays.asList(words);
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);
        for(String key:wordsMultiset.elementSet()){
            //System.out.println(key+" count："+wordsMultiset.count(key));
        }
        Map<String, Integer> map01 = Maps.newHashMap();
        map01.put("xiaoming", 12);
        map01.put("xiaohong",13);
        Map<String, Integer> map02 = Maps.newHashMap();
        map02.put("xiaoming", 12);
        map02.put("xiao",13);
        MapDifference differenceMap = Maps.difference(map01, map02);
        Map<String, Integer> entriesOnlyOnLeft = differenceMap.entriesOnlyOnLeft();//左差
        Map<String, Integer> entriesOnlyOnRight = differenceMap.entriesOnlyOnRight();//右差
        Map<String, Integer> entriesInCommon = differenceMap.entriesInCommon();//交集
        entriesOnlyOnLeft.forEach((k,v)->{
            System.out.println("k是"+k+"v是"+v);
        });
    }
}
