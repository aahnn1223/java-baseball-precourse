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

    boolean checkPlayGameYn(int playerSignal){
        if(playerSignal == 1){
            return true;
        }
        if(playerSignal == 2){
            return false;
        }
        throw new IllegalArgumentException("잘못 입력 하셨습니다.");
    }

    int createThreeDigitRandomNumber(int digitNumber){

        // 생성할 난수의 자릿수
        int digit = digitNumber;
        this.answerNumber = new RandomNumber(digit);
        int createdThreeDigitRandomNumber = answerNumber.getNumber();
        // 생성된 숫자 확인
        //System.out.println(createdThreeDigitRandomNumber);

        return createdThreeDigitRandomNumber;
    }
}
