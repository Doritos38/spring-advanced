# SPRING ADVANCED

# Lv 5-1
### 1. [문제 인식 및 정의]
* 프로젝트가 실행이 안됨

### 2. [해결 방안]
#### 2-1. [의사결정 과정]
* 에러 메세지를 확인 -> 시크릿 키 문제임을 확인
#### 2-2. [해결 과정]
* 1차시도 : application.properties에 임의로 키 설정 -> 짧다고 안됨
* 2차시도 : 저번 프로젝트에서 시크릿키가 인코딩 되지 않은것이 작동했어서 된는줄 알고 더 길게 입력
-> Base64로 인코딩이 안되어있어 안됨 -> Base64로 인코딩 하는 로직이 있음을 인지 에러 메세지 다시 확인
* 3차 시도 : JwtUtil에 init메서드 확인 -> 시크릿 키에 대해 자세히 검색 환경변수를 이용한 시크릿 키 설정이 가장 권장하는 방법임을 확인 
-> 시크릿 키 자동생성 사이트엣 256bit key 발급 후 base64 인코딩 -> 환경변수 등록 -> 실행 성공
### 3. [해결 완료]
#### 3-1. [회고]
* 애매하게 아는게 더 위험하다고 느꼈다. 차라리 아예 몰랐으면 검색해서 처음부터 성공했을 문제인데 애매하게 알아 빙빙 돌아갔다.
####  3-2. [전후 데이터 비교]
* 실패 -> 성공

# Lv 5-2
### 1. [문제 인식 및 정의]
* TodoReposotory에 사용되지 않는 countById 메서드 발견

### 2. [해결 방안]
#### 2-1. [의사결정 과정]
* countById를 쓸만한 곳이 있지 않을까 없음 코드를 지워야겠다 없으면 지워야 겠다 판단
#### 2-2. [해결 과정]
* 1차시도 : 이전 프로젝트에서 jpa가 자동으로 처리하는 count() sql문이 비효율적인 경우가 있다던 게 생각남 -> Repository를 다시한번 찾아봄
### 3. [해결 완료]
#### 3-1. [회고]
* 
####  3-2. [전후 데이터 비교]
* 