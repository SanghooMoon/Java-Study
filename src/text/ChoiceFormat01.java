package text;

import java.text.ChoiceFormat;

/**
 * ChoiceFormat은 특정 범위에 속하는 값을 문자열로 변환
 */
public class ChoiceFormat01 {
    /*
    limits 배열 : 범위의 경계값을 저장하는데 사용, 반드시 오름차순으로 정렬되어있어야함
    grades 배열 : 범위에 포함된 값을 치환할 문자열을 저장하는데 사용
    두 배열의 원소의 개수는 반드시 일치해야한다. 아니면 예외발생
     */
    public static void main(String[] args) {
        double[] limits = {60,70,80,90};    // 낮은 값부터 큰 값의 순서로 적어야한다.
        // limits, grades간의 순서와 개수를 맞추어야 한다.
        String[] grades = {"D","C","B","A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i=0; i< scores.length; i++){
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
