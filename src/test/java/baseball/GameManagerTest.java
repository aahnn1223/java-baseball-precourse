package baseball;

import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class GameManagerTest{

    @Test
    void 랜덤숫자_생성(){
        GameManager gm = new GameManager();
        int tmpRandomNumber = gm.createThreeDigitRandomNumber(3);
        System.out.println("생성된 숫자 " + tmpRandomNumber);
    }

    @Test
    void 게임_진행_여부_반환타입_확인(){
        int playerSignal1 = 1;
        int playerSignal2 = 2;

        GameManager gm = new GameManager();
        boolean result1 = gm.checkPlayGameYn(playerSignal1);
        System.out.println(result1);
        boolean result2 = gm.checkPlayGameYn(playerSignal2);
        System.out.println(result2);

    }
}