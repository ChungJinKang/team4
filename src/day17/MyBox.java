package day17;

// MyBox���� <T>
public class MyBox<T extends Fruit & Eatable> extends Box<T> {	// MyBox<T extends Fruit>
	
}

interface Eatable {
	
}