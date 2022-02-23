package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Calendar
 * 构造方法都为protected
 * 通过Calendar.getInstance()创建对象
 * @author 哇
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * getInstance() 
		 * 使用当前时间
		 */
		int str[] = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
		             41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 
		             83, 89, 97, 101, 103, 107, 109, 113, 127,
		             131, 137, 139, 149, 151, 157, 163, 167, 173,
		             179, 181, 191, 193, 197, 199, 211, 223, 227,
		             229, 233, 239, 241, 251, 257, 263, 269, 271,
		             277, 281, 283, 293, 307, 311, 313, 317, 331,
		             337, 347, 349, 353, 359, 367, 373, 379, 383,
		             389, 397, 401, 409, 419, 421, 431, 433, 439,
		             443, 449, 457, 461, 463, 467, 479, 487, 491,
		             499, 503, 509, 521, 523, 541, 547, 557, 563,
		             569, 571, 577, 587, 593, 599, 601, 607, 613,
		             617, 619, 631, 641, 643, 647, 653, 659, 661,
		             673, 677, 683, 691, 701, 709, 719, 727, 733,
		             739, 743, 751, 757, 761, 769, 773, 787, 797,
		             809, 811, 821, 823, 827, 829, 839, 853, 857,
		             859, 863, 877, 881, 883, 887, 907, 911, 919,
		             929, 937, 941, 947, 953, 967, 971, 977, 983, 
		             991, 997};
		ArrayList list2 = new ArrayList();
		List list1 =Arrays.stream(str).boxed().collect(Collectors.toList());
		System.out.println(list1.size());
		long s = System.currentTimeMillis();
		boolean b =true;
		int count = 0;
		for (int i = 1; i <= 1000; i++) {
		    int sqrt = (int)Math.sqrt(i);
		    for (int j = 2; j <= sqrt; j++) {
		        if(i % j == 0) {
		        	b =false;
		            break;
		        }
		    }
		    if (b) {
		    	count++;
		    }
		    b =true;
		}
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		System.out.println(count);
		Collection exists=new ArrayList(list2);
        Collection notexists=new ArrayList(list2);
        exists.removeAll(list1);
        System.out.println("_second中不存在于_set中的："+exists);
//        notexists.removeAll(exists);
//        System.out.println("_second中存在于_set中的："+notexists);
//        System.out.println((int)Math.sqrt(143));

	}

}
