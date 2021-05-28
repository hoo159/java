
public class UpDownCasting {

		public static void main(String[] args) {
			Person person = new Student("MadPlay");
			System.out.println(person.name);
			Student student = (Student) person;
			System.out.println(student.name);
			sutdent.name = "KIMTAENG";
			student.dept = "Computer Eng";
		}
}
