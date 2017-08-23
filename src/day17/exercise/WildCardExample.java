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
		Course<Person2> personCourse = new Course<Person2>("일반인과정", 5);
		personCourse.add(new Person2("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));	
	
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