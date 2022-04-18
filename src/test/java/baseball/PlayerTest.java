package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void 입력값_유효성_테스트(){
        Player player = new Player();
        boolean result1 = player.validate(3, 123);
        boolean result2 = player.validate(3, 1234);

        System.out.println(result1);
        System.out.println(result2);

    }
}