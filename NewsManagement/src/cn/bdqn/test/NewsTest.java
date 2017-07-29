package cn.bdqn.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.bean.News_detail;
import cn.bdqn.service.DetailService;

public class NewsTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		DetailService service = (DetailService) context
				.getBean("detailService");
		News_detail t = new News_detail();
		t.setAuthor("子华");
		t.setSummary("谁是谁的谁");
		t.setCreateDate(new Date());
		t.setTitle("是谁");
		service.add(t);

		/*List<News_detail> findList = service.findList();
		for (News_detail news_detail : findList) {
			System.out.println(news_detail);
		}*/
	}

}
