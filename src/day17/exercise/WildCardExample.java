package day17.exercise;

public class WildCardExample {

	public static <T extends Person2> void registerCourse(Course<T> course){
		System.out.println(course);
	}
	
	public static <T extends Student> void registerCourseStudent(Course<T> course){
		System.out.println(course);
	}

	public static void registerCourseWorker(Course<? super Worker> course){
		System.out.println(course);
	}

	
	public static void main(String[] args) {
		Course<Person2> personCourse = new Course<Person2>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person2("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new HighStudent("����л�"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new HighStudent("����л�"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�"));	
	
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		//registerCourseStudent(personCourse); 			// (x)
		//registerCourseStudent(workerCourse); 			// (x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);	
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		//registerCourseWorker(studentCourse); 			// (x)
		//registerCourseWorker(highStudentCourse); 		// (x)
	}
}