
public class Cuttoff {

	public static void main(String[] args) {
		int physics, chemistry, maths;
		double cutoffmark;
		physics = 100;
		chemistry = 200;
		maths = 200;
		cutoffmark = ((physics / 4) + (chemistry / 4) + (maths / 2));
		System.out.println(cutoffmark);
		if (99 >= cutoffmark) {
			System.out.println("NotEligible");
		} else if (200 >= cutoffmark && 180 <= cutoffmark) {
			System.out.println("Eligible For Medical");
		} else if (179 >= cutoffmark && 120 <= cutoffmark) {
			System.out.println("Eligible For Engineering");
		} else if (120 <= cutoffmark && 100 >= cutoffmark) {
			System.out.println("eligible For Arts");
		} else if (200 < cutoffmark) {
			System.out.println("Error");
		}

	}

}
