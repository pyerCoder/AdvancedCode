package com.itheima.propertiesio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // void load (InputStream inStream) 从输入字节流读取属性列表（键和元素对）
        // void load (Reader reader) 从输入字符流读取属性列表（键和元素对）
                // 将本地文件中的键值对数据读取到集合中
        // void store (OutputStream out, String comments) 将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法的格式写入输出字节流
        // void store (Writer writer, String comments) 将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
                // 将集合中的数据以键值对形式保存在本地

        // 读取
        Properties prop = new Properties();
        FileReader fr = new FileReader("otheriomodule/prop.properties");

        // 如果以这种匿名的方式传递对象，那么就无法关闭流，所以不采用这种方式
        // prop.load(new FileReader("otheriomodule/prop.properties"));

        // 调用完了load方法之后，文件中的键值对数据已经在集合中了
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }
}
