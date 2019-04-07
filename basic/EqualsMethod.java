public class EqualsMethod {

	int age;
	String name;
	
	public static void main(String[] args) {
		EqualsMethod em1 = new EqualsMethod();
		em1.age = 18;
		em1.name = "wangerxiao";
		
		EqualsMethod em2 = new EqualsMethod();
		em2.age = 18;
		em2.name = "wangerxiao";
		if(em1.equals(em2)) {
			System.out.println("对象em1与对象em2相同");
		}else {
			System.out.println("对象em1与对象em2相同");
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
			
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		EqualsMethod other = (EqualsMethod) obj;
		if (age != other.age){
			return false;
		}
			
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)){
			return false;
		}
			
		return true;
	}
	
}
