package baseball;

import camp.nextstep.edu.missionutils.Randoms;


public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        // N 자릿수 숫자 야구 게임
        int playRandomNumberDigit = 3;

        GameBoard gameBoard = new GameBoard();
        gameBoard.play(playRandomNumberDigit);

    }
}
