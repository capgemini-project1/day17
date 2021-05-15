package labAssignment1;

public class Exercise2 {
	enum Color {
		RED, GREEN, YELLOW;
		}

		Color color;

		public Exercise2(Color color) {
		this.color=color;
		}


		public void choose() {
		switch (color) {
		case RED:
		System.out.println("STOP");
		break;
		case GREEN:
		System.out.println("GO");
		break;
		case YELLOW:
		System.out.println("READY");
		break;

		}
		}

		public static void main(String args[]) {
		String string = "RED";
		Exercise2 e2 = new Exercise2(Color.valueOf(string));
		e2.choose();
		}
		}

