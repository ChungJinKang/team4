package day17;

// MyBox¿¡µµ <T>
public class MyBox<T extends Fruit & Eatable> extends Box<T> {	// MyBox<T extends Fruit>
	
}

interface Eatable {
	
}