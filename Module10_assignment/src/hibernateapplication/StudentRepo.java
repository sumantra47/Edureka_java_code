package hibernateapplication;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class StudentRepo {

	public static void main(String[] args) {
		
		StudentRepo repository = new StudentRepo();
		repository.save(new Student("Student1", 64)); // insert records
		repository.save(new Student("Student2", 84));
		repository.save(new Student("Student3", 24));
		repository.save(new Student("Student4", 54));
		repository.save(new Student("Student5", 74));
		repository.save(new Student("Student6", 14));
		repository.save(new Student("Student7", 04));
		repository.save(new Student("Student8", 56));
		repository.save(new Student("Student9", 89));
		repository.save(new Student("Student10", 93));
		repository.update(18,78); // update a student marks
		List<Student> studlist = repository.getStudentbyMarks(35);
		int delstudId =studlist.get(0).getId();
		System.out.println(delstudId);
		repository.delete(delstudId);//deleting a student id whose marks <35
		repository.get(0);// get all student
		

	}
	
	public static Session getSession() {
		Configuration confi = new Configuration();
		confi.configure("/hibernateapplication/hibernate.cfg.xml");
		SessionFactory factory= confi.buildSessionFactory();
		Session session = factory.openSession();
		return session;
		
	}
	
	public static void save(Student student) {
		Session session =getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("Record saved");
		
	}
	
	public void get(int id) {
		Session session =getSession();
		if(id!=0) {
			Student student = session.get(Student.class,id);
			System.out.println(student);
		}else {
			String hql = "From Student";
			List<Student> list = session.createQuery(hql).list();
			for (Student stud : list) {
				System.out.println(stud);
			}
		}
	}
	
	public void update(int id, int marks) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		Student studentfromdb = session.load(Student.class, id);
		studentfromdb.setMarks(marks);
		transaction.commit();
		session.close();
		System.out.println("Record updated");

	}
	
	public List getStudentbyMarks(int marks) {
		Session session = getSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> studlist = criteria.add(Restrictions.lt("marks",marks)).list();
		for(Student stu:studlist) {
			System.out.println(stu);
		}
		return studlist;
	}
	
	public void delete(int id) {
		Session session = getSession();
		Student student = session.load(Student.class, id);
		session.delete(student);
		session.beginTransaction().commit();
		session.close();
		System.out.println("Record deleted");

	}
	
	

}
