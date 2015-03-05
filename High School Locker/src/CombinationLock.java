public class CombinationLock {

	private int combo1;
	private int combo2;
	private int combo3;
	private int dial;

	public CombinationLock(int combo1, int combo2, int combo3, int dial) {

		super();
		this.combo1 = combo1;
		this.combo2 = combo2;
		this.combo3 = combo3;
		this.dial = dial;
	}

	public CombinationLock() {
		combo1 = 0;
		combo2 = 0;
		combo3 = 0;
	}

	public CombinationLock(int combo1, int combo2, int combo3) {
		super();
		this.combo1 = combo1;
		this.combo2 = combo2;
		this.combo3 = combo3;
	}

	public int getCombo1() {
		return combo1;
	}

	public void setCombo1(int combo1) {
		this.combo1 = combo1;
	}

	public int getCombo2() {
		return combo2;
	}

	public void setCombo2(int combo2) {
		this.combo2 = combo2;
	}

	public int getCombo3() {
		return combo3;
	}

	public void setCombo3(int combo3) {
		this.combo3 = combo3;
	}

	public int getDial() {
		return dial;
	}

	public void setDial(int dial) {
		this.dial = dial;
	}

	public void resetDial() {
		dial = 0;
	}

	public void turnRight(int ticks) {

		
		dial = (40 - (ticks-dial)) % 40;
	}

	public void turnLeft(int ticks) {
		dial = ((ticks + dial) + 40) % 40;
	}

	public boolean openLock(int a, int b, int c) {
		turnLeft(a);
		if (dial == combo1) {
			turnRight(b);
			if (dial == combo2) {
				turnLeft(c);
				if (dial == combo3)
					return true;
				else
					return false;
			} else
				return false;
		} else
			return false;
	}

	public String toString() {
		return "Combinations: " + combo1 + "," + combo2 + "," + combo3 + ".";
	}

}
