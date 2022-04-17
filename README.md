# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
### PlayBoard
: 게임을 진행하는 장소로 GamaManager, Player, Referee 로 구성 

### GameManager
: 게임 운영하는 매니저
1. 참가자의 의사에 따라 게임 진행 여부 통제
* boolean askPlayGameYn()
* void checkPlayGameYn(boolean playerSignal) { 1 : 진행, 2 : 중단, 1,2 외에 입력 시 입력값 범위 오류}
2. 게임 시작, 종료
* void startGame()
* void endGame()
3. 문제 출제
* int createThreeDigitRandomNumber()

### Player
: 게임에 참가하는 플레이어
1. 정답 제출
* int tryAnswer()

### Referee
: GameManager 가 출제 한 문제와 Player가 제출한 정답을 비교하여 결과를 GamaManager에 전달
* void checkNumberSubmitted(int submittedAnswer)
