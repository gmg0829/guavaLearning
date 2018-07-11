package string;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/7/11  10:54
 */
public class StringUtil {

    public static void main(String[] args) {
        String input = "";
        boolean isNullOrEmpty = Strings.isNullOrEmpty(input);
        //System.out.println(isNullOrEmpty);

        String a = "com.jd.coo.Hello";
        String b = "com.jd.coo.Hi";
        String ourCommonPrefix = Strings.commonPrefix(a,b);
        //System.out.println("a,b common prefix is " + ourCommonPrefix);

        String c = "com.google.Hello";
        String d = "com.jd.Hello";
        String ourSuffix = Strings.commonSuffix(c,d);
        //System.out.println("c,d common suffix is " + ourSuffix);

        String k="hello,word,,世界，水平";
        Iterable<String> splitResults = Splitter.onPattern("[,，]{1,}")
                .trimResults()
                .omitEmptyStrings()
                .split(k);

        for (String item : splitResults) {
            System.out.println(item);
        }


    }
}
