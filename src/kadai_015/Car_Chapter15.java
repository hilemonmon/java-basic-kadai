package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;
	private int speed = 10;

	public Car_Chapter15() {
		System.out.println("カーインスタンスを作成");
	}

	public void gearChange(int afterGear) {
		this.gear = afterGear;
		System.out.println("ギアが" + this.gear + "に変更されました");
	}

	public void run() {
		switch (this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		System.out.println("現在の速度は時速" + this.speed + "kmです");
	}
}
