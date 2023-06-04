# FLOG
### 시현영상 링크
홀업(Hold Up) - FLOG시현영상 UI 프로토타입 : 

# Project
### 홀업(Hold Up) Organization
https://github.com/EWHA-HOLD-UP

### 프로젝트 레포지토리 정리
https://github.com/EWHA-HOLD-UP/Flog_Camera : 카메라 화면 구현 repository

https://github.com/EWHA-HOLD-UP/FLOGing : FLOGing (상태 공유 조회) 화면 구현 repository

https://github.com/EWHA-HOLD-UP/Chatgpt_family_question_test : ChatGPT로부터 생성된 가족 관련 질문을 어플에 가져와서 나타내는 기술 구현 repository

https://github.com/EWHA-HOLD-UP/ChatGPT_app_test_real : ChatGPT의 답변을 어플로 가져와서 나타내는 기술 구현을 위한 연습용 어플(인스타그램 아이디 생성기) 구현 repository

https://github.com/EWHA-HOLD-UP/FLOG-APP : FLOG Dev repository

### 사용 기술
<img src="https://img.shields.io/badge/Android-green?style=for-the-badge&logo=Android&logoColor=black"/></a>
<img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=Kotlin&logoColor=black"/></a>
<img src="https://img.shields.io/badge/Firebase-yellow?style=for-the-badge&logo=Firebase&logoColor=black"/></a>
<img src="https://img.shields.io/badge/OpenCV-5C3EE8?style=for-the-badge&logo=OpenCV&logoColor=black"/></a>
* ChatGPT API

### 프로젝트의 목적
대부분의 별거가족이 연락하고자하는 의지는 있으나 이를 실천할 실행력과 대화소재가 부족하다. 이 문제를 소프트웨어적으로 해결하기 위해 팝업을 통해 서로의 상태를 사진으로 공유하고, <Q-Puzzle>을 맞추며 함께 질문에 답변하는 가족 추억 저장소 앱을 제작하고자 한다. 

_ "어느샌가 가족 간의 연락을 미루고 있진 않았나요? 혹시 의무적으로, 매번 똑같은 연락을 주고 받고 있지는 않나요? 이 애플리케이션은 당신과 가족의 상태를 부담없이 공유할 수 있게 해주며 소중한 이야깃거리를 제공해줄 것입니다." _
  
### 팀원 기술 블로그
* https://mingorithm.tistory.com/2
* https://yes-im-on.tistory.com/2
*
  
### 시나리오
#### FLOGing
1. 랜덤한 시간에 그룹 구성원들에게 동시에 상태 공유 알림 팝업이 전송된다.
2. 사용자는 알림 팝업을 눌러 사진 찍기 화면으로 이동한다.
3. 사용자는 사진 찍기 화면에서 본인의 전면, 후면 사진을 찍는다. 이때, ChatGPT가 생성한 미션(사진 가이드라인)이 함께 화면에 뜬다.
4. 사진 촬영 후 곧바로 편집 화면으로 이동하며, 편집화면에서는 전면, 후면 사진에 각각 텍스트를 추가하거나 어플 내에서 제공하는 스티커를 부착할 수 있다.
5. 편집이 완료되면 [추가]버튼을 눌러 상태를 추가한다.
6. 본인의 상태를 업로드한 뒤에 다른 구성원들의 상태를 확인할 수 있다.

#### Q-Puzzle
1. 선착순으로 가족 그룹 내 한 구성원이 사진을 등록한다.
2. 등록한 사진으로 자동으로 퍼즐이 생성되며, 가족 그룹 내 모든 구성원이 동일한 퍼즐을 공유하게 된다.
3. 각 퍼즐 조각에는 하나의 질문이 적혀 있으며, 퍼즐 조각각을 open하기 위해서는 가족 그룹 구성원이 퍼즐 조각에 적혀 있는 질문에 모두 대답해야 한다.
4. 모든 구성원이 질문에 답하면, 해당 퍼즐 조각은 open되고 질문에 대한 구성원의 답변들을 확인할 수 있다.

#### 세부 사용자 시나리오
https://docs.google.com/document/d/1JF1gYPakic_rxP0QB2aU8kL16xTBdiGFaFKIAEqCcp4/edit 
  
### Flow Chart
https://www.figma.com/file/Ag1st2N7YRFNfhyvhOB7QB/%5BF-LOG%5D-Flow-Chart?type=whiteboard&node-id=0%3A1&t=3dUkSUqvx126WGxV-1
  

### 구현에 참고한 자료 및 참고 예정 자료
* ChatGPT API를 안드로이드 스튜디오로 따와서 어플 생성하기
  https://youtu.be/bLktoOzb4R0
* 안드로이드에서 ChatGPT 시연하기
  https://github.com/skydoves/chatgpt-android
* 타임랩스 영상 제작 툴 만들기
  https://youtu.be/ZYT8-yU3v9c
* Kotlin에서 OpenCV 사용하기
  https://github.com/ramonrabello/OpenCV-Kotlin-Starter

  
