package echo.ex02;

public class MilitithreadApp {

	public static void main(String[] args) throws Exception {

		Thread thread = new DigitThread();
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			 Thread.sleep(1000);
		}
	}
}
