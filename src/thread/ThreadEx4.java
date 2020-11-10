package thread;

// '-' 를 출력하는 작업과 '|'를 출력하는 작업을 하나의 쓰레드가 연속적으로 처리하는 시간을 측정
class ThreadEx4 {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();

        for(int i=0; i < 500; i++)
            System.out.printf("%s", new String("-"));

        System.out.print("소요시간1:" +(System.currentTimeMillis()- startTime));    // 37   30  28  28

        for(int i=0; i < 500; i++)
            System.out.printf("%s", new String("|"));

        System.out.print("소요시간2:"+(System.currentTimeMillis() - startTime));    // 56   50  47  48
    }
}
