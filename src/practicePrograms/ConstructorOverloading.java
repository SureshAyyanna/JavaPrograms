package practicePrograms;

public class ConstructorOverloading {

	String name;
	
	ConstructorOverloading() {
		System.out.println("Constructor method called.");
	}

	ConstructorOverloading(String t) {
		name = t;
	}

	public static void main(String[] args) {
		ConstructorOverloading cpp = new ConstructorOverloading();
		ConstructorOverloading java = new ConstructorOverloading("Java");
		cpp.setName("C++");
		java.getName();
		cpp.getName();
	}

	void setName(String t) {
		name = t;
	}

	void getName() {
		System.out.println("Language name: " + name);
	}
}
