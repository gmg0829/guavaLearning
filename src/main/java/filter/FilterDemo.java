package filter;


import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: Guava 布隆过滤器
 * @date 2018/11/26  8:32
 */
public class FilterDemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        BloomFilter<Integer> filter = BloomFilter.create(
                Funnels.integerFunnel(),
                10000000,
                0.01);
        for (int i = 0; i < 10000000; i++) {
            filter.put(i ) ;

        }
        System.out.println(filter.mightContain(1));
        System.out.println(filter.mightContain(1900100));
        long end = System.currentTimeMillis();

        System.out.println("执行时间：" + (end - start));
    }


}
