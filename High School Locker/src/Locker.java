import java.util.Scanner;

public class Locker {

	private int lockernumber, numofbooks;
	private String studentname;
	private CombinationLock lock = new CombinationLock();

	public Locker() {

		lockernumber = 0;
		numofbooks = 0;
		studentname = "";
		lock.setCombo1(0);
		lock.setCombo2(0);
		lock.setCombo3(0);
		lock.setDial(0);

	}

	public Locker(int lockernumber, int numofbooks, String studentname,
			CombinationLock lock) {
		super();
		this.lockernumber = lockernumber;
		this.numofbooks = numofbooks;
		this.studentname = studentname;
		this.lock = lock;
	}

	public int getLockernumber() {
		return lockernumber;
	}

	public void setLockernumber(int lockernumber) {
		this.lockernumber = lockernumber;
	}

	public int getNumofbooks() {
		return numofbooks;
	}

	public void setNumofbooks(int numofbooks) {
		this.numofbooks = numofbooks;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public CombinationLock getLock() {
		return lock;
	}

	public void setLock(CombinationLock lock) {
		this.lock = lock;
	}

	public void putBookInLocker() {
		numofbooks++;
	}

	public boolean removeBookFromLocker() {
		if (numofbooks > 0) {
			numofbooks--;
			return true;
		} else
			return false;

	}

	public void openLocker() {
		System.out.println("Hi, " + studentname + ".");
		System.out.println("Enter the first combination");
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		System.out.println("Enter the second combination");
		int b = keyboard.nextInt();
		System.out.println("Enter the third combination");
		int c = keyboard.nextInt();

		if (lock.openLock(a, b, c) == true) {
			System.out.println("Success!");
		} else
			System.out.println("Wrong Combination");
	}

	public String toString() {
		return "Locker number:" + lockernumber + "\n" + "Number of books: "
				+ numofbooks + "\n" + "Student name: " + studentname + "\n"
				+ lock.toString();
	}
}
