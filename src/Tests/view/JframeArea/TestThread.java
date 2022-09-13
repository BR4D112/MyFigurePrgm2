package Tests.view.JframeArea;

public class TestThread {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("ascendente"+(i+1));
					System.out.println(Thread.currentThread().getName());
				}				
			}
		});
		thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("decendentemente"+(100-(i+1)));
			System.out.println(Thread.currentThread().getName());

		}
	}
}
