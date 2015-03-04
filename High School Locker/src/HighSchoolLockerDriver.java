
public class HighSchoolLockerDriver {
	public static void main(String[] args){
		
	CombinationLock lockofmickey = new CombinationLock(28, 17, 39);
	Locker  Mickey = new Locker(100,3,"Mickey Mouse",lockofmickey);
	CombinationLock lockofdonald = new CombinationLock(35, 16, 27);
	Locker  Donald = new Locker(275,0,"Donald Duck",lockofdonald);
	
	Mickey.openLocker();
	
	Mickey.putBookInLocker();
	Mickey.putBookInLocker();
	Mickey.putBookInLocker();
	
	Donald.removeBookFromLocker();
	
	System.out.println();
	System.out.println(Mickey);
	System.out.println();
	System.out.println();
	System.out.println(Donald);
	
	
	}
}
