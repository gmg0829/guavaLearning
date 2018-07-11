package collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/7/11  11:02
 */
public class BiMapDemo {
    public static void main(String[] args) {
        BiMap<String,String> weekNameMap = HashBiMap.create();
        weekNameMap.put("星期一","Monday");
        weekNameMap.put("星期二","Tuesday");
        weekNameMap.put("星期三","Wednesday");
        weekNameMap.put("星期四","Thursday");
        weekNameMap.put("星期五","Friday");
        weekNameMap.put("星期六","Saturday");
        weekNameMap.put("星期日","Sunday");

        System.out.println("星期日的英文名是" + weekNameMap.get("星期日"));
        System.out.println("Sunday的中文是" + weekNameMap.inverse().get("Sunday"));
    }

}
