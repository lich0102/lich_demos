package samples;





import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by licanhui on 2016/12/29.
 */
public class Test {

    private Configuration cfg;            //模版配置对象

    public void init() throws Exception {
        //初始化FreeMarker配置
        //创建一个Configuration实例
        cfg = new Configuration();
        System.out.print(getClass().getResource("/").getFile().toString());
        //设置FreeMarker的模版文件夹位置
        cfg.setDirectoryForTemplateLoading(  new File(getClass().getResource("/").getFile().toString()+"/static"));

    }

    public void process() throws Exception {
        //构造填充数据的Map
        Map map = new HashMap();
        map.put("user", "lavasoft");
        map.put("url", "http://www.baidu.com/");
        map.put("name", "百度");
        //创建模版对象
        Template t = cfg.getTemplate("test.ftl");
        //在模版上执行插值操作，并输出到制定的输出流中
        t.process(map, new OutputStreamWriter(new FileOutputStream( new File(getClass().getResource("/").getFile().toString()+"/static/test.ftl"))));
    }

    public static void main(String[] args) throws Exception {
        Test hf = new Test();
        hf.init();
        hf.process();
    }
//    public static void main(String[] args){
//        Template t = null;
//        try {
//            t = new Template(null, new StringReader("用户名：${user};URL：    ${url};姓名： 　${name}"), null);
//            //创建插值的Map
//            Map map = new HashMap();
//            map.put("user", "lavasoft");
//            map.put("url", "http://www.baidu.com/");
//            map.put("name", "百度");
//            //执行插值，并输出到指定的输出流中
//            t.process(map, new OutputStreamWriter(System.out));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}
