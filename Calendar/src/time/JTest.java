package time;

import org.junit.Test;

class JTest {

	@Test
	void test() {
//		HashMap<K, V>

		int m = 12;//1100
		int n = 5;//  101
		System.out.println("m & n :" + (m & n));//100
		System.out.println("m | n :" + (m | n));//1101
		System.out.println("m ^ n :" + (m ^ n));//1001
		System.out.println("~ n :" + (~n) + " n"+n);//
		System.out.println(" n << 2 :" + (n<<2) + " n"+n);//
		System.out.println(" n << 2 :" + ((0-n)<<2) + " n"+n);//
		
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);
//		switch (10000000000000000000L) {
//		case 1:
//
//			break;
//
//		default:
//			break;
//		}
	}

}
