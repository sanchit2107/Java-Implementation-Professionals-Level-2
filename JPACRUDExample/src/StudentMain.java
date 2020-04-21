import com.bean.Student;
import com.dao.StudentDao;

public class StudentMain {
	public static void main(String args[]) {
		
		StudentDao sdao = new StudentDao();
		
		
//		String result = sdao.createStudent(new Student(102, "Sam", 98, 20));
//		String result2 = sdao.createStudent(new Student(103, "Ram", 78, 22));
//		String result3 = sdao.createStudent(new Student(104, "Shayam", 89, 28));
//		System.out.println(result);
		
		
		String result3 = sdao.createStudent(new Student(105, "Panther", 98, 25));
		System.out.println(result3);
		
//		String updateResult = sdao.updateStudentAge(104, 27, "Marvel");
//		System.out.println(updateResult);
	}
}
