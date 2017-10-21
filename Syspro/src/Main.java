import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> pro=Arrays.asList(1,2,3,4,5);
		/*pro.add(120);
		pro.add(220);
		pro.add(440);*/
		pro.forEach(i->{System.out.println(i*2);
		System.out.println(i*3);
		});
		pro.stream().filter(i->i>2).forEach(System.out::println);;
		/*
		for (Object list1 : list) {
			System.out.println(list1);
		}
		for(int j=0;j<list.length;j++){
			System.out.println(list[j]);
		}*/
		
	//	pro.forEach((k,v)->System.out.println(k+" "+v));
		//System.getProperties().forEach((k,v)->{System.out.println(k+" = "+v);});
	}
}
