package file;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.util.List;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/7/11  10:36
 */
public class FileUtil {

    public static void main(String[] args) throws Exception{
        File original = new File("D:\\test.txt");
        File copy = new File("D:\\testCopy.txt");
      //  Files.copy(original, copy);


        File originalFile = new File("D:\\test.txt");
        File newFile = new File("D:\\testCopy.txt");
        //Files.move(originalFile, newFile);

        List<String> readLines = Files.readLines(copy, Charsets.UTF_8);
        //System.out.println(readLines);

       byte[] byteArray=Files.toByteArray(copy);//从文件中获得字节数组
        System.out.println(byteArray);



    }

}
