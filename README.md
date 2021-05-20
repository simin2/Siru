Siru Project Making History
=============

---

기획 배경
-------------
- 현실, 인터넷 상에서 서로를 헐뜯는 모습이 많아지는 것을 보고 안타까움을 느낌
- 서로의 감정을 공유하며 수용한한다면 감정적으로 생기는 갈등을 줄일 수 있을 것이라 생각
- 감정을 내비치고 공유하는 데에 자연스러운 장소 필요
- 자작 작품 공유(특히 시)를 주로 하는 활성화된 커뮤니티가 많지 않음
	- 대부분 대형 사이트의 카테고리 속에 속함
		- ex) 티스토리, 카카오 브런치, 네이버 블로그 등
- 웹 서비스 운영 경험 필요

---

기획 방향
-------------
- 일반인들을 위한 자작 문학 플랫폼
- 다름을 이해하고 수용할 수 있는 분위기 형성
- 쉽게 시작할 수 있도록 유도
- 하루 하나의 시를 사용자가 볼수 있도록 main 페이지에 게재
- 핵심 기능을 부각하는 UI 설계
	- 글쓰기, 게시물, 로그인 페이지는 어느 곳에서도 들어갈 수 있도록 함
- 감성적인 디자인 (촌스럽지 않게 하느 것이 중요)

---

기대 효과
-------------
- 무명 작가 또는 일반인들에게 이름을 알릴 수 있는 기회 제공
- 다름을 이해하는 커뮤니티 형성으로 긍정적인 사회 분위기 형성에 부분적 기여
- 글을 쓰지 않았던 사람에게 글쓰기의 재미 전파
- 글을 쓰고 나눌 수 있는 플랫폼 제공
- 0부터 100까지 혼자 서비스를 만들어보는 경험

---

Benchmarking
-------------
- Unsplash (사진 공유 사이트)
	- 전세계 사진작가가 찍은 좋은 사진을 공유하며, 작품을 상업적 용도로 무료 사용
	- 대신 작가는 자신의 이름을 알릴 수 있는 구조
	- 작품 저작권 등 게시물 관리에 관한 정책 부분을 따옴
- 밀리의 서재 (E-Book 사이트)
	- 직관적
	- 핵심 기능에 곧바로 접근할 수 있도록 설계된 메인 화면 디자인
- Pinterst (masonry layout의 시조격 사이트)
	- 게시물을 작품 전시하듯 배치

---

이름 정하기
-------------
- 뜻도 뜻이지만 어감을 특히나 중요시 함
- 시루 (詩樓)
	- 詩 : 시 시
	- 樓 : 누
		1. 누각(樓閣)의 준말
		2. 다락집

---

Logo 제작
-------------
- PowerPoint로 제작
	- ".png로 저장하기" 기능 사용
- "시루"의 "ㅅ"과 "ㄹ"을 이미지화
- 바다를 앞에 둔 산 뒤로 해가 지는 모습

---

User eXperience 설계
-------------
- 간결한 경로로 기능에 접근
	- 컨셉이 되는 핵심 기능은 어떠한 페이지에서도 이동 가능
- 빠르게 기능에 접근
	- 기능 접근에 여러 절차가 있으면 답답함
	- Alert창 사용 적게
		- 반드시 확인이 필요한 곳에서만 사용 (삭제 기능 등)
- 감성을 해치지 않는 분위기 필요
	- 색 조합
		- 분명히 대비되어야 함
		- 너무 쨍하지 않은 조합이어야 함
		- 어둑한 하늘의 노을을 표현
		- 빨간 색은 눈에 피로를 주므로 노란 색과 빨간 색 중 노란 색에 가까운 색상으로 강조
- 영어 사용 최소화
	- 주 사용자가 한국인이기 때문에 중간중간 나오는 알파벳은 분위기를 깰 수 있음
	- 닉네임은 길이, 띄어쓰기 등에서 자유도를 주지만 한글만 가능하도록 함

---

User Interface 설계
-------------
- Figma(web deign tool) 사용
	- 화면의 전체적인 배치, 색조합의 색감 등을 조정
- 배경 색상 선정
	- #2d2c2e
	- 저녁~밤 시간대를 의미
- 폰트 색상 선정
	- #faf5e6
	- 쨍하지 않은 흰 색으로 선정
- 강조 색상 선정
	- #fbbd0d
	- 노을 색에서 노란 색의 느낌을 가져와서 선정
	- 진한 황금색

---

User Interface 구현
-------------
- HTML5, CSS, Vanilla JS+ JQuery 사용

---

Server 환경
-------------
- Ubuntu 20.04 LTS
	- 서버와 같은 환경에서 개발하기 위해
	- 배포할 때, 터미널에서 ssh 명령어로로 원격 접속하기 편함
- Apache Tomcat 9.0
	- 가장 최신의 Tomcat 10.0이 있지만, 불안정
	- 안정적인 버전 중에서 가장 최신인 9.0 버전 선택
- Eclipse IDE
	- 많이 사용해본 IDE
	- Java에 적합
- Mysql
	- 오픈 소스 라이센스를 따르기 때문에 무료로 사용 가능
	- Ubuntu 서버 환경 터미널에서 간편하게 설치 가능

---

Backend 구성
-------------
- Spring Framework
	- Model2 방식 (MVC)
		- DAO, Service, Controller 등 구조적으로 만들 수 있는 요소가 많기 때문에 유지보수에 좋음
		- 실제 서비스할 것이므로, 유지보수성을 고려할 필요 있음
	- AOP 사용
		- 중복되는 코드를 Aspect.java에 정의하고 설정 servlet context에서 한번에 관리
	- Exception 사용
		- 중복되는 처리에 대해 미리 정의해둔 예외을 throw하여 GlobalExceptionHandler로 보내어 처리
- Mybatis
	- SQL Query문을 한 파일에서 관리 -> 유지보수성 좋음
	- collection, association 태그 적극 활용

---

DataBase 설계 및 구현
-------------
- member
	- member_id : primary key
	- id
		- 사용자 아이디
	- password
		- 사용자 비밀번호
		- SHA-256으로 암호화하기 때문에 최대 글자수를 100으로 지정
	- nickname
		- 사용자 닉네임
		- 사이트 내에서 다른 사람에게 보여질 이름
	- email
		- 사용자 이메일
		- 아이디, 비밀번호 찾기에 사용됨
	- date
		- 가입 일시
- poem, story
	- story_id, poem_id : primary key
	- member_id
		- member table의 primary key
		- 누가 글을 작성했는지 알 수 있음
		- foreign key 설정에 사용 : member table을 부모로 둠
		- on delete cascade : member가 탈퇴하면 작성한 글도 함께 삭제됨
	- title
		- 글의 제목
		- text 속성을 주어 길이 제한 없음
	- content
		- 글의 내용
		- text 속성을 주어 길이 제한 없음
	- date
		- 글 작성 일시
- likes
	- like가 예약어이므로 likes로 이름 지정
	- like_id : primary key
	- member_id
		- member table의 primary key
		- 누가 공감을 눌렀는지 알 수 있음
		- foreign key 설정에 사용 : member table을 부모로 둠
		- on delete cascade : member가 탈퇴하면 작성한 댓글도 함께 삭제됨
	- story_id, poem_id
		- story table, poem table의 primary key
		- 어떤 글에 공감을 눌렀는지 알 수 있음
		- foreign key 설정에 사용 : story table, poem table을 부모로 둠
		- on delete cascade : 글이 삭제되면 공감도 함께 삭제됨
- comments
	- comment가 예약어이므로 comments로 이름 지정
	- comment_id : primary key
	- member_id
		- member table의 primary key
		- 누가 댓글을 작성했는지 알 수 있음
		- foreign key 설정에 사용 : member table을 부모로 둠
		- on delete cascade : member가 탈퇴하면 작성한 댓글도 함께 삭제됨
	- story_id
		- story table의 primary key
		- 어떤 글에 댓글을 작성했는지 알 수 있음
		- foreign key 설정에 사용 : story table을 부모로 둠
		- on delete cascade : story가 삭제되면 작성한 댓글도 함께 삭제됨
	- content
		- 댓글의 내용
	- date
		- 댓글의 작성 일시
- banner
	- 메인 페이지에 게재될 작품을 위한 table
	- title
		- 메인 작품의 제목
	- content
		- 메인 작품의 내용
	- writer
		- 메인 작품의 작성자
- 사용한 쿼리는 queryscript 파일에서 따로 관리

---

게시물에 관련된 기능 구현
-------------
- 등록
	- 등록할 수 있는 양식에 POST 방식으로 접근하게 함으로써 다른 유저의 악의적 접근을 막음
- 목록
	- Paging 기능
	- masonry layout
- 게시물 보기
	- 수정과 삭제 버튼은 현재 로그인 되어있는 회원과 글의 작성자가 같을 때만 보이도록 처리
- 수정
	- 수정할 수 있는 양식에 POST 방식으로 접근하게 함으로써 다른 유저의 악의적 접근을 막음
- 삭제
	- alert로 확인 후 삭제

---

댓글에 관련된 기능 구현
-------------
- 등록
	- Ajax 비동기 통신으로 등록 후 목록 불러오기
- 목록
	- Ajax 비동기 통신으로 새로고침 없이 언제든지 가져올 수 있도록 구현
	- 처음 접근, 등록, 수정, 삭제 후에 목록을 불러오게 됨
- 수정
	- Ajax 비동기 통신으로 수정 후 목록 다시 불러오기
- 삭제
	- Ajax 비동기 통신으로 삭제 후 목록 다시 불러오기

---

회원에 관련된 기능 구현
-------------
- 가입
	- 각 항목에 대한 유효성 검사 실시
	- 아이디, 닉네임 중복 검사는 Ajax 비동기 통신을 사용하여 검사
		- ResponseData로 상태 코드, 출력 문구 등을 담은 VO를 반환
	- 이를 제외한 모든 유효성 검사는 javascript로 구현
	- 비밀번호는 SHA-256으로 변환 후, Database에 저장
	- 민감한 개인정보를 구하지 않음 (실명, 전화번호 등)
- 로그인
	- Ajax 비동기 통신으로 회원 여부 검사
		- 아이디가 없는 경우, 회원이 아니라는 문구 출력
		- 아이디는 있지만 비밀변호가 다른 경우, 비밀번호가 일치하지 않는다는 문구 출력
		- HttpSession에 회원의 정보 등록 (사용하는 정보는 member_id 뿐임)
- 아이디 찾기 / 비밀번호 변경
	- Ajax 비동기 통신으로 페이지 전환 없이 로그인 영역 내에서 찾을 수 있도록 함
	- 아이디 찾기
		- 가입 시 입력한 이메일을 입력하고, 해당하는 아이디를 출력
	- 비밀번호 변경
		- 이메일과 아이디를 입력하고 새로운 비밀번호를 입력하여 변경
		- 이미 암호화되어있기 때문에 "비밀번호 찾기"는 불가
- 내 정보 수정
	- Ajax 비동기 통신으로 아이디 / 닉네임 중복 확인 수행
		- 현재 내가 쓰고 있는 아이디와 닉네임을 제외하고 검사
	- 비밀번호를 입력하고 유효셩 검사 통과 후, 수정 버튼을 눌러 수정 가능
	- "원래대로" 버튼을 눌러 수정하던 항목들을 다시 되돌릴 수 있음
	- 수정 후에 회원 정보를 가져와 채워둘 member_id로 "직접 접근"하여 항목을 채워둠
		- HttpSession에 들어있는 정보를 가져와 채우면, 업데이트 되지 않은 정보가 채워짐
		- HttpSession에 채운 정보는 로그인할 때의 정보이기 때문
		- 문제 발견 후, Session에서 꺼내와 쓰던 기능을 모두 "member_id 직접 접근 방식"으로 바꾸었음

---

관리자에 관련된 기능 구현
-------------
- 아이디가 administrator인 회원이 관리자이며, 관리자는 관리 탭이 따로 생겨 접근이 가능
- AOP 적용하여 권한 검사 코드 중복 방지
	- 허용되지 않은 사용자가 관리자 권한이 필요한 url을 직접 입력하여 접근하면, home으로 보내버림
- 회원 관리
	- 회원 정보 수정
- 작품 / 이야기 관리
	- 게시물 수정
- 배너 관리
	- 등록
		- 메인 화면에 나오는 작품 등록
		- 수정, 삭제 등 불가 (기록 남기기, 단순화)
	- 불러오기
		- 등록된 글 중, 가장 최신 것을 가져와 출력

---

공감에 관련된 기능 구현
-------------
- 각 게시물의 공감 갯수를 count하여 가져오기
	- 갯수를 Ajax 비동기 통신으로 가져와 화면에 출력
	- 공감 / 취소 시에 매번 count하여 출력
- 공감 / 취소 상태
	- 회원이 해당 게시물에 공감했는지 검사 후, boolean 값 반환
	- False일 때 (공감 버튼을 누르지 않은 상태)
		- 누르지 않은 상태로 보이도록 보통 색상 적용
		- 이 때 클릭하면 likes table에 회원과 게시물의 primary key에 대한 record가 등록되고, 공감 검사와 count 다시 실행 후 출력
	- True일 때 (이미 공감 버튼을 누른 상태)
		- 누른 상태로 보이도록 강조 색상 적용
		- 이 때 클릭하면 likes table에서 해당 record가 삭제되고, 공감 검사와 count 다시 실행 후 출력

---

배포
-------------
- Apache Tomcat 9.0
	- 프로젝트를 .war 파일로 export하여 webapps 폴더에 저장
	- 80번 포트에 대한 접근을 현재 프로젝트로 바꾸어야 하므로, webapps 폴더의 기존 ROOT 폴더를 삭제
		- ROOT 폴더를 지우지 않으면 80번 포트로 접속할 때, Tomcat 서버의 관리자 페이지가 나옴
- AWS EC2
	- Instance (Ubuntu 20.04 LTS)
		- ssh : 개발 pc와 서버 인스턴스에 원격 접속 (발급받은 .pem security key 필요)
		- scp : 개발 pc와 서버 인스턴스 간의 파일 원격 전송 (발급받은 .pem security key 필요)
		- iptable
			- 80번 포트를 사용했을 때, url에 포트 번호를 붙이지 않고 접속 가능
			- Tomcat을 사용했기 때문에 접근이 8080번 포트로 들어오지만, iptable 설정으로 접근을 80번 포트로 다시 돌려줌
			- 보통 NginX를 많이 사용하지만, 단순히 포트를 돌려주는 역할만 필요하기 때문에 iptable 사용
	- Load Balancer
		- 원래 기능 : 트래픽이 한 곳으로 몰리는 것을 분산시켜 과부하를 방지
		- 현재 프로젝트에선 기존 80번 포트로의 접근(http)을 443번 포트(https)로 돌려주는 역할을 함
- AWS Route53
	- siru.link에 ELB(Elastic Load Balancer)를 연결
- AWS Certificate Manager
	- https 접속을 위한 SSL 인증서 발급
	- AWS에서 Amazon certification을 사용하면, 서버 환경에 따로 설정 없이 AWS 내에서 https로 변환 가능

---

Trouble Shooting
-------------
- 502 bad gateway?????????????????















