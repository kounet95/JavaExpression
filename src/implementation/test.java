package implementation;

import java.util.*;
import java.util.function.Consumer;

public class test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AddInterface addInterface =new AddInterface() {@Override public void m11(int c, int d) {System.out.println(c+d);}};
		//AddInterface addInterface =new test() ;addInterface.add(58, 8);}
		
	 Hello hello= (String name)-> "kounet"+name;
	 System.out.println(hello.sayHello("Diallo"));
	 List<Integer>numbers=new ArrayList<>();
		
	 //numbers.add(14);
	 //numbers.add(188);
	 //numbers.add(12);
	 //numbers.add(4);
	 //numbers.add(8);
	 //numbers.add(6);
	 //numbers.add(52);
	 //for (Integer n:numbers) {
		// System.out.println(n);
//	 }
	 List <String> names =Arrays.asList("kounet","diallo","bayo");
	 Consumer<String>resul=(name)->System.out.println(name);
	 names.forEach(resul);
}
}
		 
	
