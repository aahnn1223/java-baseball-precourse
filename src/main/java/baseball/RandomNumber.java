package baseball;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class RandomNumber {
    private int number;
    private ArrayList<Integer> pickNumbers;

    RandomNumber (int digit){
        pickRandomNumber(digit);
        makeRandomNumber(digit);
    }

    void pickRandomNumber(int digit){
        pickNumbers = new ArrayList<>();
        while(pickNumbers.size() < digit) {
            addNumber(Randoms.pickNumberInRange(1, 9));
        }
    }

    void addNumber(int pickNumber){
        if(!pickNumbers.contains(pickNumber)){
            pickNumbers.add(pickNumber);
        }
    }

    void makeRandomNumber(int digit){
        int tmpNum = 0;
        for(int idx = 0; idx < digit; idx++){
            tmpNum += pickNumbers.get(idx) * Math.pow(10, digit-idx-1);
        }
        this.number = tmpNum;
    }

    public int getNumber(){
        return this.number;
    }
}
