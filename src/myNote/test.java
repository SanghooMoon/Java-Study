package myNote;

// 데코레이션 패턴 예제
abstract class Coffe{
    public abstract void brewing();
}

class Americano extends Coffe{
    @Override
    public void brewing() {
        System.out.print("Americano ");
    }
}


abstract class Decorator extends Americano{

    Coffe coffe;

    public Decorator(Coffe coffe) {
        this.coffe=coffe;
    }

    @Override
    public void brewing() {
        coffe.brewing();

    }
}

class Latte extends Decorator{

    public Latte(Coffe coffe) {
        super(coffe);
    }

    @Override
    public void brewing() {
        super.brewing();

        System.out.print("Add milk ");
    }
}

class Moka extends Decorator{

    public Moka(Coffe coffe) {
        super(coffe);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Add Moka");
    }

}



public class test {


    public static void main(String[] args) {

        Coffe americano=new Americano();
        americano.brewing();

        System.out.println();

        Coffe latte=new Latte(new Americano());
        latte.brewing();

        System.out.println();

        Coffe moka=new Moka(new Latte(new Americano()));
        moka.brewing();

    }
}
