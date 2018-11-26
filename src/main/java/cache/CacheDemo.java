package cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/11/26  11:00
 */
public class CacheDemo
{
    public static void main(String[] args) throws ExecutionException {
        LoadingCache<String,String> cahceBuilder= CacheBuilder
                .newBuilder()
                .build(new CacheLoader<String, String>(){
                    @Override
                    public String load(String key) throws Exception {
                        String strProValue="hello "+key+"!";
                        return strProValue;
                    }

                });
        System.out.println("jerry value:"+cahceBuilder.apply("jerry"));
        System.out.println("jerry value:"+cahceBuilder.get("jerry"));
        cahceBuilder.put("harry", "ssdded");
        System.out.println("harry value:"+cahceBuilder.get("harry"));
    }
}
