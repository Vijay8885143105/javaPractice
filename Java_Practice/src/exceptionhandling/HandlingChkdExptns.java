package exceptionhandling;

public class HandlingChkdExptns {

	public static void main(String[] args) {
		System.out.println("Programme is started");
		System.out.println("Programme is in Progress");
		{
			try {
				Thread.sleep(4000);
			}catch(InterruptedException h)
			{
			h.printStackTrace();
			}

			System.out.println("Programme is complted");
			System.out.println("Programme is excited");

		}

	}
}
