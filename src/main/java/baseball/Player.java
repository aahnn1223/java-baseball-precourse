package baseball;

import camp.nextstep.edu.missionutils.Console;

/**
 * 게임에 참영하는 플레이어
 * : 컴퓨터가 랜덤으로 생성한 숫자를 맞추는 플레이어 */
public class Player {

    Player () {}

    int tryAnswer(int digit){
        String beforeSubmit = Console.readLine();
        int submit = Integer.parseInt(beforeSubmit);

        int startInclusive = (int)(Math.pow(10, digit-1));
        int endInclusive = (int)(Math.pow(10,digit) -1);

        if(submit < startInclusive || endInclusive < submit){
            throw new IllegalArgumentException("범위 밖의 숫자를 입력하셨습니다.");
        }

        return submit;
    }

    int expressIntesion(){
        String beforeSubmit = Console.readLine();
        int submit = Integer.parseInt(beforeSubmit);

        return submit;
    }

}
