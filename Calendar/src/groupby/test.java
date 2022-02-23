package groupby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		test test = new test();
		ArrayList<stu> list = new ArrayList<stu>();
		list.add(test.new stu(1, "11111"));
		list.add(test.new stu(1, "1222"));
		list.add(test.new stu(1, "11222"));
		list.add(test.new stu(2, "222"));
		list.add(test.new stu(3, "22211222"));
		/**
		 * skip跳过
		 * limit 展示几个
		 */
		list.stream().skip(1*2).limit(1).forEach(s->System.out.println(s.getName()));
		System.out.println("----------");
		list.stream().skip(0*3).limit(1).forEach(s->System.out.println(s.getName()));
		
		Map<Integer, List<stu>> map = list.stream().collect(Collectors.groupingBy(stu::getId));
		
		map.forEach((k, y) -> {
			System.out.println(k);
			y.forEach(s->{
				System.out.println("\t"+s.getName());
			});
		});
	}

	class stu {
		public int id;
		public String name;

		public stu(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
