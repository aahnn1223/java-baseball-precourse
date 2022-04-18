package baseball;

public class GameBoard {
    private GameManager gameManager;
    private Player player;
    private Referee referee;

    GameBoard (){
        this.gameManager = new GameManager();
        this.player = new Player();
        this.referee = new Referee();
    }
    GameBoard (GameManager gameManager, Player player, Referee referee){
        this.gameManager = gameManager;
        this.player = player;
        this.referee = referee;
    }

    void play(int digit){
        int randomNumber = gameManager.createThreeDigitRandomNumber(digit);

        referee.assignReferee(randomNumber);
        boolean playAgain = true;
        while(playAgain) {
            gameManager.askForAnswer();
            int submitAnswerFromPlayer = player.tryAnswer(digit);
            playAgain = referee.checkSubmittedNumber(submitAnswerFromPlayer);
        };
    }
}
