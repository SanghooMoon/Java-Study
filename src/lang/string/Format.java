package lang.string;


public class Format {
    public static void main(String[] args) {
        /**
         *  형식화된 문자열을 만드는 간단한 방법. printf() 와 동일
         */
        String str = String.format("%d 더하기 %d는 %d입니다", 3,5,3+5);
        System.out.println(str);

        /**
         *  기본형 값을 String으로 변환하는 방법 두 가지, 빈 문자열을 더하는 방법이 간단하고 편하지만, 성능향상이 필요할떈 valueOf 메서드 활용
         */
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

        /**
         * String을 기본형 값으로 변환하는 방법 두 가지, 두 메서드는 반환타입만 다르지 같은 메서드
         */
        int i1 = Integer.parseInt("100");
        int i2 = Integer.valueOf("100");    // Integer형으로 반환되지만 오토박싱으로 int 로 자동변환

    }
}
