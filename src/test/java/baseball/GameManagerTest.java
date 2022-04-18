package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GameManagerTest {

    @Test
    @DisplayName("랜덤 숫자 생성 확인")
    void makeRandomNumber(){
        GameManager gm = new GameManager();
        int tmpRandomNumber = gm.createThreeDigitRandomNumber(3);
        System.out.println("생성된 숫자 " + tmpRandomNumber);
    }
}