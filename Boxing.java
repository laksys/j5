//boxing unboxing demo

import static java.lang.System.out;

public class Boxing {
	//boxing also called autoboxing. converting primitivs to wrapper
	static void boxing(){
		Integer x = 45; // 45 which is primitives converted into wrapper
		out.println(x);
	}
	//converting wrapper to its primitives value
	static void unboxing(){
		int y = Integer.valueOf(12); // object to primitives
		out.println(y);
	}
	public static void main(String[] args){
		boxing();
		unboxing();
	}
}
