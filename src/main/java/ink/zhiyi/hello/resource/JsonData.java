package ink.zhiyi.hello.resource;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ink.zhiyi.hello.domain.Comic;
import ink.zhiyi.hello.domain.Person;
import ink.zhiyi.hello.mapper.ComicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Component
public class JsonData {

    //读取json文件
    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public  static Comic[] getData(){
        // 读取漫画数据
        String filename = "/Users/zhangkai/CODE/python/comic_manhuazhijia_zhiyi/comic.json";
        String json = readJsonFile(filename);
        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(json);
        try {
            return mapper.readValue(json, Comic[].class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}