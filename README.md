# Today-s-Message-App
안드로이드 앱을 이용한 오늘의 '메시지어플'
1. drawable: 이미지 파일
2. layout: XML 코드
3. todaymessage java 코드


✅ 개요

간단한 운세 조회 앱으로, 사용자가 이름과 생년월일을 입력하면 앱에서 고유한 메시지를 전합니다.

UI 구성부터 Activity 간 데이터 전달, 날짜 기반  Seed 생성 등 기초 안드로이드 개발 전반을 경험할 수 있는

구조입니다.

🔧 주요 기능 구현

1. 화면 구성 및 Activity 흐름
**·** `MainActivity`: 시작 화면, “시작하기” 버튼 클릭 시 `InputActivity`로 이동
**·** `InputActivity`: 이름과 생년월일 입력 후 “운세 보기” 버튼 클릭 시 `ResultActivity`로 이동
**·** `ResultActivity`: 고정된 seed(이름 + 생년월일 + 날짜)로 운세 텍스트 출력
2. UI 요소 `XML`
**·**  배경 이미지: `ImageView`를 활용해 배경 제공
**·** 사용자 입력: `EditText`로 이름, 생년월일 입력
**· 메시지** 표시: `TextView`로 결과 오늘 메시지 출력
3. 데이터 처리
**·** `Intent`를 통해 Activity 간 데이터 전달 (`putExtra`, `getStringExtra`)
**·** 날짜(`yyyyMMdd`) + 이름 + 생년월일을 Hash하여 Seed 생성
**·** 운세 배열에서 Hash 기반 인덱스로 메시지 결정 → 매일, 각 사용자마다 고유한 운세 제공
    

💡 기여 및 배운 점

- **Activity 간 데이터 전달 방식(Intent)**의 구조적 이해
- `XML`을 활용한 **레이아웃 구성 및 뷰 배치**
- Java 코드에서 **리소스 연결 (findViewById)** 및 **이벤트 처리**
- 고정된 운세를 고려 Hash **기반 Seed 처리 방식 구현**
- 실용적인 프로젝트를 통해 **안드로이드 앱 개발 기초 전반** 학습
