package demo;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dao.newsdao;

public class aa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//获取题目,网址,简介,时间
		Document doc = Jsoup.connect("https://www.gcores.com/categories/1/originals").get();
        Elements titleLinks = doc.select("div.showcase_text");    //解析来获取每条新闻的标题与链接地址
        Elements descLinks = doc.select("div.showcase_info");//解析来获取每条新闻的简介
        Elements timeLinks = doc.select("div.showcase_time");   //解析来获取每条新闻的时间与来源
        newsdao dao=new newsdao();
        
        //for循环遍历获取到每条新闻的四个数据并封装到News实体类中
        for(int j = 0;j < titleLinks.size();j++){
            String title = titleLinks.get(j).select("a").text();
            System.out.println(title);
            byte[] jiema1= title.getBytes("gb2312") ; //解码
            String   t1 = new String(jiema1,"UTF-8");
            String uri = titleLinks.get(j).select("a").attr("href");
            System.out.println(uri);
            
            byte[] jiema2= uri.getBytes("gb2312") ; //解码
            
            String   u1 = new String(jiema2,"UTF-8");
            String desc = descLinks.get(j).text();
            
            System.out.println(desc);
            byte[] jiema3=desc.getBytes("gb2312") ; //解码
            String   i1 = new String(jiema3,"UTF-8");
            
            String[] time = timeLinks.get(j).text().split(" ");
            
            System.out.println(time[1]);
            byte[] jiema4= time[1].getBytes("gb2312") ; //解码
            String   d1 = new String(jiema4,"UTF-8");
            
            dao.addnews(t1, i1, d1, u1);
            
        }
	}

}
