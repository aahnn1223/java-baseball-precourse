package baseball;

import java.util.ArrayList;
import java.util.Map;

public class Referee {

    private int answer;
    private int answerLength;
    private ArrayList<Integer> answerIdxAndValue;
    private ArrayList<Integer> submittedAnswerFromPlayer;
    private GameManager gameManager;
    private Player player;

    Referee () {}

    void assignReferee(int answer){
        this.answer = answer;
        this.answerLength = getNumberLength(answer);
        setanswerIdxAndValue(answer);
        gameManager = new GameManager();
        player = new Player();
    }

    void setanswerIdxAndValue(int answer){
        int length = answerLength;

        ArrayList<Integer> answerArray = new ArrayList<>();
        for(int idx = 0; idx < length; idx++){
            int inputNum = getIdxValueOfNumber(answer, idx);
            answerArray.add(inputNum);
        }
        this.answerIdxAndValue = answerArray;
    }

    void setSubittedAsnwerFromPlayer(int submittedAnswer){
        int length = getNumberLength(submittedAnswer);
        ArrayList<Integer> submittedAnswerArray = new ArrayList<>();
        for(int idx = 0; idx < length; idx++){
            submittedAnswerArray.add(getIdxValueOfNumber(submittedAnswer, idx));
        }
        this.submittedAnswerFromPlayer = submittedAnswerArray;
    }

    int getNumberLength(int answer){
        return (int)(Math.log10(answer)+1);
    }

    int getIdxValueOfNumber(int number, int idx){
        String inputNumber = String.valueOf(number);
        char digit[] = inputNumber.toCharArray();
        int answerIdxValue = Character.getNumericValue(digit[idx]);
        return answerIdxValue;
    }

    void checkSubmittedNumber(int submittedAnswer){
        int strike = 0;
        int ball = 0;
        int length = this.answerLength;

        setSubittedAsnwerFromPlayer(submittedAnswer);

        for(int idx = 0; idx < length; idx++){
            strike += isStrike(answerIdxAndValue.get(idx), submittedAnswerFromPlayer.get(idx));
            ball += isBall(answerIdxAndValue.get(idx), submittedAnswerFromPlayer.get(idx));
        }

        announce(strike, ball);
    }

    int isStrike(int answer, int submittedAnswer){
        if(answer == submittedAnswer){
            return 1;
        }
        return 0;
    }

    int isBall(int answer, int submittedAnswer){

        int strike = isStrike(answer, submittedAnswer);
        if(strike != 0){
            return 0;
        }

        boolean isContain = answerIdxAndValue.contains(submittedAnswer);
        if(isContain){
            return 1;
        }

        return 0;
    }

    void announce(int strikeCnt, int ballCnt){
        if(strikeCnt == 0 && ballCnt == 0){
            System.out.println("낫싱");
        }
        if(strikeCnt != 0 && ballCnt == 0 && strikeCnt != 3){
            System.out.println(strikeCnt + "스트라이크");
        }
        if(strikeCnt == 0 && ballCnt != 0){
            System.out.println(ballCnt + "볼");
        }
        if(strikeCnt != 0 && ballCnt != 0){
            System.out.println(ballCnt + "볼" + strikeCnt + "스트라이크");
        }
        if(strikeCnt == 3 && ballCnt == 0){
            System.out.println(strikeCnt + "스트라이크");
            gameManager.askPlayGameYn();
            int playerIntesion = player.expressIntesion();
            gameManager.checkPlayGameYn(playerIntesion);
        }
    }

}