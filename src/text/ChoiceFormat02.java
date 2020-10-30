package text;

import java.text.ChoiceFormat;

public class ChoiceFormat02 {
    /**
     *  패턴을 사용하여 변경. 보다 간결함.
     *  구분자로 '#', '<' 제공 (limit#value 형태)
     *  # : 경계값을 범위에 포함
     *  < : 포함시키지 않음
     */
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A";     // 80은 < 이기 때문에 B가 아닌 C
        int[] scores = {91,90,80,88,70,52,60};

        ChoiceFormat form = new ChoiceFormat(pattern);
        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
