package lambda;

@FunctionalInterface
interface Myfunction2 {
	void myMethod();  // public abstract void myMethod();
}

class Test {
	public static void main(String[] args) {
		Myfunction2 f = ()->{}; // MyFunction f = (MyFunction)(()->{}); 
		Object obj = (Myfunction2)(()-> {});  // Object타입으로 형변환이 생략됨
		String str = ((Object)(Myfunction2)(()-> {})).toString();

		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);

//		System.out.println(()->{});	// 에러. 람다식은 Object타입으로 형변환 안됨
		System.out.println((Myfunction2)(()-> {}));
//		System.out.println((MyFunction)(()-> {}).toString()); // 에러
		System.out.println(((Object)(Myfunction2)(()-> {})).toString());
	}
}
