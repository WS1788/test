package simpledateformat;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;

class JTest {

	@Test
	void test() {
		new SimpleDateFormat();
		LocalDateTime localDateTime = LocalDateTime.now();
		int i[] = {1,2,3,0,9,6};Arrays.sort(i);
		System.out.println(Arrays.toString(i));
	}

}
