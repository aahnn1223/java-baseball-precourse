package baseball;

public class GameManager {

    private RandomNumber answerNumber;

    GameManager(){};

    void askPlayGameYn(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    void askForAnswer(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    void checkPlayGameYn(int playerSignal){
        if(playerSignal == 1){
            int digit = answerNumber.getDigit();
            startGame(digit);
        }
        if(playerSignal == 2){
            endGame();
        }

    }

    int startGame(int digitNumber){
        int answer = createThreeDigitRandomNumber(digitNumber);
        return answer;
    }

    void endGame(){
        System.out.println("숫자야구 게임이 종료되었습니다.");
        resetAnswer();
        return;
    }

    int createThreeDigitRandomNumber(int digitNumber){

        // 생성할 난수의 자릿수
        int digit = digitNumber;
        answerNumber = new RandomNumber(digit);
        int createdThreeDigitRandomNumber = answerNumber.getNumber();
        // 생성된 숫자 확인
        System.out.println(createdThreeDigitRandomNumber);

        return createdThreeDigitRandomNumber;
    }

    void resetAnswer(){
        this.answerNumber = null;
    }
}
