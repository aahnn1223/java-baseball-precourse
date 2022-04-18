# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
### GameBoard
: 게임을 진행하는 장소로 GamaManager, Player, Referee 로 구성 
* play() : 랜덤 숫자를 플레이어가 맞춘다 (입력/출력 반복)
* newGame() : 게임 개시 (랜덤 숫자 생성과 게임 시작과 종료)

### GameManager
: 게임 운영하는 매니저
* askPlagGameYn() : 게임 종료 조건 시 플레이어에게 진행 여부를 선택 할 수 있도록 안내 문구 출력
* askForAnswer() : 플레이어가 정답을 맞추기 위해 숫자를 입력 할 수 있도록 안내 문구 출력
* checkPlayGameYn(int playerSignal) : 플레이어가 표현한 의사에 따라 게임을 진행/종료
* createThreeDigitRandomNumber(int digitNumber) : 자릿수를 입력 받은 만큼 N자릿수 랜덤 숫자를 생성

### Player
: 게임에 참가하는 플레이어
* tryAnswer(int digit) : 플레이어가 숫자를 입력할 수 있다
* expressIntesion() : 플레이어가 게임 종료 조건시(정답을 맞췄을 때) 게임 진행 의사를 전달
* validate(int digit, int submit) : 플레이어가 정답을 입력할 때 범위 내 숫자를 입력 했는지 확인

### Referee
: 랜덤 숫자를 관리하고 플레이어가 입력한 숫자를 정답을 판단한다.
* assignReferee(int answer) : 생성 된 랜덤 숫자(정답)을 전달받아 관리함
* setAnswerIdxAndValue(int answer) : 생성 된 랜덤 숫자(정답)를 각 자리 수 마다 분리하여 List에 저장
* setSubittedanswerFromPlayer(int submittedAnswer) : 플레이어가 전달한 숫자를 각 자리 수 마다 분리하여 List에 저장
* getNumberLength(int answer) : 전달받은 숫자의 자릿수를 구함
* getIdxValueOfNumber(int number, int idx) : 전달받은 숫자를 각 자릿수의 숫자를 추출 (ex. getIdxValueOfNumber(1234, 2) : 1234의 숫자의 2번째 숫자는 2)
* checkStrikeBallCnt(int submittedAnswer) : 플레이어가 입력한 숫자와 정답을 비교하여 Strike, ball 카운트를 보여준다
* isStrike(int answer, int submittedAnswer) : 플레이어가 입력한 숫자와 정답을 비교하여 Strike 수 반환한다
* isBall(int answer, int submittedAnswer) : 플레이어가 입력한 숫자와 정답을 비교하여 Ball 수 반환한다
* announce(int StrikeCnt, int ballCnt) : Strike 와 Ball 카운트를 출력한다
* askRestartYn() : GameManager를 통해 플레이어의 진행 여부를 확인한다

### RandomNumber
: 랜덤 숫자와 자릿수에 대한 정보가 들어있는 객체
* RandomNumber(int digit) : 전달 받은 자릿수 만큼 랜덤 숫자를 생성
* pickNumbers(int digit) : 1~9 랜덤 숫자를 뽑아서 digit 만큼 생성
* addNumber(int pickNumber) : pickNumbers 할 때 중복 숫자 등록 방지
* makeRandomNumber(int digit) : ArrayList로 만들었던 랜덤 숫자를 int 로 변환
* public int getNumber() : 생성된 랜덤 숫자 제공


