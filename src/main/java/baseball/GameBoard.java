package baseball;

public class GameBoard {
    private GameManager gameManager;
    private Player player;
    private Referee referee;
    private int gamesCnt;

    GameBoard (){
        this.gameManager = new GameManager();
        this.player = new Player();
        this.referee = new Referee();
    }

    void play(int digit, int randomNumber){
        boolean isAnswer = false;
        while(!isAnswer) {
            gameManager.askForAnswer();
            int submittedNumberFromPlayer = player.tryAnswer(digit);
            isAnswer = referee.checkStrikeBallCnt(submittedNumberFromPlayer);
        };
    }

    void newGame(int digit){
        boolean playGameYn = true;
        while(playGameYn){
            int randomNumber = gameManager.createThreeDigitRandomNumber(digit);
            referee.assignReferee(randomNumber);
            play(digit, randomNumber);
            playGameYn = referee.askRestartYn();
        }
        System.out.println("게임 종료");
    }
}
