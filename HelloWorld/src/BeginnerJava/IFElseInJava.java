package BeginnerJava;

public class IFElseInJava {

	public static void main(String[] args) {
		// If else statement
		int i = 10;
		
		if(i == 10) {
			System.out.println(i + " :: Value is matched!! ");
		}else {
			System.out.println(i+" :: Value is not matched!! ");
		}
		
		i = 5;
		if(i == 10) {
			System.out.println(i + " :: Value is matched!! ");
		}else {
			System.out.println(i+" :: Value is not matched!! ");
		}
		
		// Nested if else statement
		
		int j = 1;
		
		if(i == 5) {
			if(j == 1) {
				System.out.println(j + " :: Nested value is matched!! ");
			}else {
				System.out.println(j +" :: Nested value is not matched!! ");
			}
		}else {
			if(j == 5) {
				System.out.println(j + " :: Nested value is matched!! ");
			}else {
				System.out.println(j +" :: Nested value is not matched!! ");
			}
		}
		

	}

}
