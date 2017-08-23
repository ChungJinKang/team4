package phone.step1;

public class Phone implements Comparable <Phone> {
	private String name;
	private String number;
	private static int mode;
	
	public Phone() {
		super();
	}
	public Phone(String number) {
		super();
		this.number = number;
	}
	public Phone(String name, String number) {
		this(number);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", number=" + number + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Phone) {
			if( this.number.equals(((Phone) obj).number) )
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Phone o) {
		switch(mode) {
		case 1:
			return number.compareTo(o.getNumber());			
		case 2:
			return o.getNumber().compareTo(number);
		case 3:
			return name.compareTo(o.getName());
		case 4:
			return o.getName().compareTo(name);
		default:
			System.out.println("잘못된 입력입니다.");
			return 0;
		}
	}
}
