#구현할 기능 목록

-[ ] 0~9 랜덤 숫자 생성기 RandomNumberGenerator 클래스 구현


-[ ] 입력값을 검증하는 InputValidator 인터페이스 구현
  -[ ] 자동차 이름을 검증하는 CarNameInputValidator 구현
    - 자동차 이름은 5자 이하여야한다. 실패시 IllegalArgumentException 반환
  -[ ] 경주게임을 시도할 숫자를 검증하는 GameCoinInputValidator 클래스 구현
    - 경주게임을 시도할 숫자는 Int여야 한다. Int로 변환 실패시 IllegalArgumentException 반환


-[ ] 자동차의 이름(name)과 전진한 횟수(move)를 담고있는 Car 클래스 구현
  - 생성자에서 CarNameInputValidator 로 검증
  - RandomNumberGenerator를 통해 나온값으로 전진 가능을 반환하는 boolean 반환 메소드 구현
  - 전진(move)값을 1 증가시키는 메소드 구현
  - Car의 상태를 출력하는 메소드 구현


-[ ] List<Car>을 가지고있는 일급 컬렉션 Cars 클래스 구현
  - List<Car>를 순회하며 자동차가 움직일수있을때 움직이는 메서드 구현
  - List<Car>를 순회하며 제일 많이 전진한 자동차 이름 리스트를 반환하는 메서드 구현
  - List<Car>를 순회하며 Car의 상태를 출력하는 메소드 구현


-[ ] 경주게임을 시도할 숫자를 가지고있는 Coin 클래스 구현
  - 생성자에서 GameCoinInputValidator 로 검증


-[ ] 입력값을 파싱하는 Parser 인터페이스 구현
  -[ ] 자동차의 이름을 파싱하는 InputCarNameParser 클래스 구현


-[ ] 사용자로부터 자동차이름과 경주게임을 시도할 숫자를 입력받는 InputReader 클래스 구현
  - 값을 읽고 파싱한뒤 자동차 이름 리스트를 반환하는 메서드 구현
  - 값을 읽고 경주게임을 시도할값을 반환하는 메서드 구현


-[ ] 사용자에게 값 입력을 유도하는 대사와 함께 InputReader를 통해 값을 입력받는 InputView 클래스 구현
  - 자동차 이름을 입력해달라는 대사와 함께 InputReader를 통해 값을 입력받는 메서드 구현
  - 게임을 시도할 회수를 입력해달라는 대사와 함께 InputReader를 통해 값을 입력받는 메서드 구현


-[ ] 사용자에게 게임결과와 우승자를 반환하는 OutputView 클래스 구현
  - 게임실행 결과를 반환하는 메서드 구현
  - 게임의 최종 우승자를 반환하는 메서드 구현


-[ ] 여러 클래스를 조합하여 실제 게임을 실행하는 GameController 클래스 구현