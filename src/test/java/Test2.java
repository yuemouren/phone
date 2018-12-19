
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileDao;

public class Test2 {

	public static void main(String[] args) {
		
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml");
		StudentService service = context.getBean(StudentService.class);
		List<Student> allStu = service.getAllStu();
		for (Student student : allStu) {
			System.out.println(student);
		}*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
		MobileDao dao = context.getBean(MobileDao.class);
		
		Mobile one = dao.getOne("1899999");
		System.out.println(one);
	
	
	}

}
