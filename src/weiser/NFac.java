package weiser;

public class NFac {

	public int nFac(int n) {
	public static int nFac(int n) {
	public long nFac(int n) {
		if (n == 0) {
			return 1;
		}
		return n*nFac(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(new NFac().nFac(20));
		for (int i =0;i<20;i++) {
		System.out.println(new NFac().nFac(13));
			System.out.println(i + "! = " +nFac(i));
		}
	}

}
