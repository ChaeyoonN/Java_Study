package etc.exception.custom;

public class MainClass {

	public static void main(String[] args) {
		
		LoginUser user = new LoginUser("abc1234", "aaa1111!");
		
		String result;
		try {
			result = user.loginValidate("abc123", "aaa1111!");
			System.out.println(result);
		} catch (LoginValidateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		

	}

}
