public class ToStringMethod {
    int age = 18;
    String name = "nidaye";
	public static void main(String[] args) {
		ToStringMethod tsm = new ToStringMethod();
		System.out.println(tsm);
	}
	@Override
	public String toString() {
		return "ToStringMethod [age=" + age + ", name=" + name + "]";
	}

}
