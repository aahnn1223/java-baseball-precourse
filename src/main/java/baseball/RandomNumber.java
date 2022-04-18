package baseball;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    private int number;
    private int digit;

    // 전달 받은 자릿수 만큼 난수 생성
    RandomNumber (int digit){
        this.digit = digit;
        int startInclusive = (int)(Math.pow(10, digit-1));
        int endInclusive = (int)(Math.pow(10,digit) -1);

        this.number = Randoms.pickNumberInRange(startInclusive, endInclusive);
    }

    public int getNumber(){
        return this.number;
    }

    public int getDigit(){
        return this.digit;
    }
}
