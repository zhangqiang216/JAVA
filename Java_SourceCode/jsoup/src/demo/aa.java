package demo;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dao.newsdao;

public class aa {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��ȡ��Ŀ,��ַ,���,ʱ��
		Document doc = Jsoup.connect("https://www.gcores.com/categories/1/originals").get();
        Elements titleLinks = doc.select("div.showcase_text");    //��������ȡÿ�����ŵı��������ӵ�ַ
        Elements descLinks = doc.select("div.showcase_info");//��������ȡÿ�����ŵļ��
        Elements timeLinks = doc.select("div.showcase_time");   //��������ȡÿ�����ŵ�ʱ������Դ
        newsdao dao=new newsdao();
        
        //forѭ��������ȡ��ÿ�����ŵ��ĸ����ݲ���װ��Newsʵ������
        for(int j = 0;j < titleLinks.size();j++){
            String title = titleLinks.get(j).select("a").text();
            System.out.println(title);
            byte[] jiema1= title.getBytes("gb2312") ; //����
            String   t1 = new String(jiema1,"UTF-8");
            String uri = titleLinks.get(j).select("a").attr("href");
            System.out.println(uri);
            
            byte[] jiema2= uri.getBytes("gb2312") ; //����
            
            String   u1 = new String(jiema2,"UTF-8");
            String desc = descLinks.get(j).text();
            
            System.out.println(desc);
            byte[] jiema3=desc.getBytes("gb2312") ; //����
            String   i1 = new String(jiema3,"UTF-8");
            
            String[] time = timeLinks.get(j).text().split(" ");
            
            System.out.println(time[1]);
            byte[] jiema4= time[1].getBytes("gb2312") ; //����
            String   d1 = new String(jiema4,"UTF-8");
            
            dao.addnews(t1, i1, d1, u1);
            
        }
	}

}
