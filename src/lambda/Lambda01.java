package lambda;

public class Lambda01 {

	int max(int a, int b) {
		return a > b ? a : b;
	}
//	(int a, int b) -> { return a > b ? a : b; }
//	(int a, int b) -> a > b ? a : b;
//	(a, b) -> a > b ? a : b
	
	void printVar (String name, int i) {
		System.out.println(name+"="+i);
	}
//	(String name, int i) -> { System.out.println(name+"="i); }
//	(name, i) -> { System.out.println(name+"="i); }
//	(name, i) -> System.out.println(name+"="i)
	
	int square(int x) {
		return x * x;
	}
//	(int x) -> { return x*x; }
//	(x) -> x*x
//	x -> x*x
	
	int roll() {
		return (int) (Math.random() * 6);
	}
//	() -> { return return (int) (Math.random() * 6); }
//	() -> return (int) (Math.random() * 6)
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
//	(int[] arr) -> {
//		int sum = 0;
//		for(int i : arr)
//			sum += i;
//		return sum;
//	}

}
