package generics;

import java.util.ArrayList;

/**
 * 와일드카드 : 오버로딩을 할떄 지네릭타입이 다른것만으로는 오버로딩이 성립하지 않는다. 그래서 고안된 것이 와일드카드. 기호는 '?'로 표현
 * <? extends T> : 와일드카드의 상한 제한, T와 그 자손들만 가능
 * <? super T> : 와일드카드의 하한 제한, T와 그 조상들만 가능
 * <?> : 제한 없음. 모든 타입이 가능. <? extends Object>와 동일
 */
/*
class Fruit		          { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy {}

class Juice {
    String name;

    Juice(String name)	     { this.name = name + "Juice"; }
    public String toString() { return name;		 }
}

class Juicer {             // Fruit 클래스와 그 자손들 모두 사용가능
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for(Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}
public class FruitBox03 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
//        fruitBox.add(new Toy());  // Fruit의 자손이 아니므로 사용 불가능

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }  // main
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    //class FruitBox<T extends Fruit> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list;  }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}*/