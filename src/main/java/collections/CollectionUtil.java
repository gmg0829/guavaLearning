package collections;


import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/7/11  10:08
 */
public class CollectionUtil {


    // 普通Collection的创建

    Set<String> set = Sets.newHashSet();
    // 不变Collection的创建
    ImmutableList<String> iList = ImmutableList.of("a", "b", "c");
    ImmutableSet<String> iSet = ImmutableSet.of("e1", "e2");
    ImmutableMap<String, String> iMap = ImmutableMap.of("k1", "v1", "k2", "v2");



    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        list.add("aaa");
        list.add("bbb") ;
        list.add("ccc");
        String result1 = Joiner.on("-").join(list);
       // System.out.println(result1);

        Map<String, Object> map = Maps.newHashMap();
        map.put("xiaoming", "12");
        map.put("xiaohong","13");
        String result2 = Joiner.on(",").withKeyValueSeparator("=").join(map);
       // System.out.println(result2);

        String str = "1-2-3-4-5-6";
        List<String> result3 = Splitter.on("-").splitToList(str);
        //System.out.println(result3);

        String str1 = "xiaoming=11,xiaohong=23";
        Map<String,String> result4 = Splitter.on(",").withKeyValueSeparator("=").split(str1);
       // System.out.println(result4);

        Iterable<String> fitered = Iterables.filter(list, Predicates.or(Predicates.equalTo("aaa"), Predicates.equalTo("bbb")));
       // System.out.println(fitered);

        Map<String, Integer> map01 = Maps.newHashMap();
        map01.put("xiaoming", 12);
        map01.put("xiaohong",13);
        map01.put("gmg",15);
        // Function<F, T> F表示apply()方法input的类型，T表示apply()方法返回类型
        Map<String, Integer> m2 = Maps.transformValues(map01, new Function<Integer, Integer>() {
            public Integer apply(Integer input) {
                if(input>12){
                    return input;
                }else{
                    return input+1;
                }
            }
        });
        System.out.println(m2);


        Set<Integer> set1= Sets.newHashSet(1,2,3,4,5);
        Set<Integer> set2=Sets.newHashSet(3,4,5,6);
        Sets.SetView<Integer> inter=Sets.intersection(set1,set2); //交集
        System.out.println(inter);
        Sets.SetView<Integer> diff=Sets.difference(set1,set2); //差集,在A中不在B中
        System.out.println(diff);
        Sets.SetView<Integer> union=Sets.union(set1,set2); //并集
        System.out.println(union);


    }






}
