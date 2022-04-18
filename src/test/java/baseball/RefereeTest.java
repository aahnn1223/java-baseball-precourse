package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    @Test
    void 스트라이크_볼_카운트_테스트(){
        Referee referee = new Referee();
        referee.assignReferee(135);

        boolean result1 = referee.checkStrikeBallCnt(123);
        boolean result2 = referee.checkStrikeBallCnt(246);
        boolean result3 = referee.checkStrikeBallCnt(135);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}