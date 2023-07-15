# Sampling Project List
* [ActivityForResultProject](#ActivityForResultProject)
* [AlarmManagerSampling](#AlarmManagerSampling)
* [AnimationSampling](#AnimationSampling)
* [AppMsgProject](#AppMsgProject)
* [CalendarWithRecyclerViewSampling](#CalendarWithRecyclerViewSampling)
* [ChartSampling](#ChartSampling)
* [ColorPickerProject](#ColorPickerProject)
* [ComponentSizeAndPositionProject](#ComponentSizeAndPositionProject)
* [ContentProviderSampling](#ContentProviderSampling)
* [CustomComponentProject](#CustomComponentProject)
* [CustomDrawingSampling](#CustomDrawingSampling)
* [CustomInputLayoutSampling](#CustomInputLayoutSampling)
* [DatePickerProject](#DatePickerProject)
* [DialogActivityProject](#DialogActivityProject)
* [DpAndSpProject](#DpAndSpProject)
* [FCMProject](#FCMProject)
* [FCM_Token](#FCM_Token)
* [FCM_Topic](#FCM_Topic)
* [FcmSampling](#FcmSampling)
* [FragmentBackStackProject](#FragmentBackStackProject)
* [MultiFragmentSwipeEventSampling](#MultiFragmentSwipeEventSampling)
* [NavigationBackStackProject](#NavigationBackStackProject)
* [NumberPickerSampling](#NumberPickerSampling)
* [ProgressbarProject](#ProgressbarProject)
* [RecyclerViewScrollProject](#RecyclerViewScrollProject)
* [RegularIncomeAndInstallmentSampling](#RegularIncomeAndInstallmentSampling)
* [RoomDBImageSampling](#RoomDBImageSampling)
* [RoomDBSampling](#RoomDBSampling)
* [RoomSampling](#RoomSampling)
* [RyougaeSampling](#RyougaeSampling)
* [SeekbarProject](#SeekbarProject)
* [service-sampling](#service-sampling)
* [ServiceProject](#ServiceProject)
* [ServiceThreadExample](#ServiceThreadExample)
* [SwitchProject](#SwitchProject)
* [TransparentViewSampling](#TransparentViewSampling)
* [ViewPagerProject](#ViewPagerProject)
* [ViewPagerSampling](#ViewPagerSampling)

# [ActivityForResultProject](#ActivityForResultProject)
- ActivityForResult Launcherを利用してSubActivityからTextを受け取ってMainAcitivyに表示し、Galleryから写真を持ってきて表示する機能
- ActivityForResult Launcher를 이용해 SubActivity로부터 Text를 받아와 MainAcitivy에 표시하고, Gallery로부터 사진을 가져와 표시하는 기능
- Feature to receive text from SubActivity using ActivityForResult Launcher, display it in MainACTIVITY, and import and display photos from Gallery
- ./00_[ProjectResult]/ActivityForResultProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212525985-ea845f87-5aab-4bf8-aa4e-7cbdf0e3c8fb.mp4" muted="false"></video></div>

# [AlarmManagerSampling](#AlarmManagerSampling)
- Alarm ManagerとBroadCast Receiverを通じてNotification表示及びNotificationクリックすると希望するActivityに移動。BroadCast Receiverで設定したIntent Extraを該当Activityに表示する機能
- AlarmManager와 BroadCast Receiver를 통해 Notification 표시 및 Notification 클릭시 원하는 Activity로 이동. BroadCast Receiver에서 설정한 Intent Extra를 해당 Activity에 표시하는 기능
- Display Notification through Alarm Manager and BroadCast Receiver and click Notification to navigate to the desired activity. Feature to display Intent Extra set by the BroadCast Receiver in that activity
- ./00_[ProjectResult]/AlarmManagerSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212528070-0e4ad395-ef52-4d2f-912a-c2db28164abb.mp4" muted="false"></video></div>

# [AnimationSampling](#AnimationSampling)
- ObjectAnimatorを活用してViewのアニメーション効果を具現。
- ObjectAnimator를 활용해 View의 애니메이션 효과를 구현.
- Use ObjectAnimator to realize the animation effect of View.
- ./00_[ProjectResult]/AnimationSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212529376-909d1c40-2fd9-4295-b9af-f6a293358e50.mp4" muted="false"></video></div>

# [AppMsgProject](#AppMsgProject)
- Android で基本的に提供されるToast Text が見えにくい問題などがある。 ということでメッセージライブラリの一つをサンプリング。
- ライブラリの内容が簡単で、必要に応じてメッセージレイアウトを修正してCustomもできる。
- Android에서 기본적으로 제공되는 Toast Text가 잘 보이지 않는 문제 등이 있다. 그래서 메시지 라이브러리 중 하나 샘플링.
- 라이브러리 내용이 간단해 필요에 따라 메시지 레이아웃을 수정해 Custom도 할 수 있음.
- There is a problem that Toast Text, which is basically provided on Android, is difficult to see. So sampling one of the message libraries.
- The library contents are simple, so you can customize the message layout as needed.
- ./00_[ProjectResult]/AppMsgProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212533849-d8a828f4-df3f-4389-9523-0fc62845e886.mp4" muted="false"></video></div>

# [CalendarWithRecyclerViewSampling](#CalendarWithRecyclerViewSampling)
- 家計簿アプリのクローン中にカレンダーView機能の実装が必要で始めたサンプリングプロジェクト。
- 7*5サイズのカレンダーで内部に消費、所得、結果値を設定し、今日の日付の場合はViewのBackground Colorを埋めて強調した。
- 가계부 어플 클론하는 중 달력 View 기능 구현이 필요해서 시작한 샘플링 프로젝트.
- 7*5 크기의 달력으로 내부에 소비, 소득, 결과값을 설정하고, 오늘 날짜일 경우 View의 Background Color를 채워 강조했다.
- Sampling project started due to the need to implement calendar view function while cloning account book applications.
- Consumption, income, and results are set internally with a 7*5 calendar, and if it is today's date, it is highlighted by filling in View's Background Color.
- ./00_[ProjectResult]/CalendarWithRecyclerViewSampling.jpg
![CalendarWithRecyclerViewSampling](https://user-images.githubusercontent.com/56281493/212535146-21050c24-4e54-45a1-92d8-63f9c731a295.jpg)

# [ChartSampling](#ChartSampling)
- 家計簿アプリのクローン中に統計関連してチャートを作る場合が生じそうでサンプリングを進めた。
- Android で最も多く活用されるMPAndroid Chart を使用した。
- 가계부 어플 클론하는 중 통계관련해서 차트를 만들 경우가 생길 것 같아 샘플링을 진행했다.
- Android에서 가장 많이 활용되는 MPAndroidChart를 사용했다.
- Sampling was conducted because it seemed that there would be a case of making a chart related to statistics while cloning the accounting book application.
- We used MPandroidChart, which is the most widely used on Android.
- ./00_[ProjectResult]/ChartSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212537145-4bd34666-3548-40be-88f9-b78711e702d1.mp4" muted="false"></video></div>

# [ColorPickerProject](#ColorPickerProject)
- 以前サンプリング作業をしながら進行したColor Pickerプロジェクト。
- LightテーマでDialogボタンが明確な色で表示されない問題があり、該当ライブラリ[github issue](https://github.com/Dhaval2404/ColorPicker/issues/16))を見たが、特に解決策はないようだ。
- 이전에 샘플링 작업을 하면서 진행했던 Color Picker 프로젝트.
- Light테마에서 Dialog 버튼이 명확한 색상으로 표시되지 않는 문제가 있어 해당 라이브러리 [github issue](https://github.com/Dhaval2404/ColorPicker/issues/16)를 봤으나, 딱히 해결방안은 없는 듯 보임.
- The Color Picker project that was previously carried out while sampling.
- I saw the library [github issue] (https://github.com/Dhaval2404/ColorPicker/issues/16) because the Dialog button is not clearly displayed in the light theme, but there seems to be no solution.
- ./00_[ProjectResult]/ColorPickerProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212549242-4b30ad6f-614f-4b6c-aa26-68b4ede26342.mp4" muted="false"></video></div>

# [ComponentSizeAndPositionProject](#ComponentSizeAndPositionProject)
- ScrollViewの最下段位置確認イベントの実装。 関連する計算ロジックは注釈により説明。
- ScrollView의 최하단 위치 확인 이벤트 구현. 관련한 계산 로직은 주석을 통해 설명.
- Implementation of ScrollView's lowest positioning event. The relevant computational logic is explained in the comments.
- ./00_[ProjectResult]/ComponentSizeAndPositionProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212914589-94cffa8f-85ff-4a5d-a6eb-46ab5719b093.mp4" muted="false"></video></div>

# [ContentProviderSampling](#ContentProviderSampling)
- ContentProviderProjectA: 簡単なDBとContentProvider具現(readable & writable)
- ContentProviderProjectB:ContentProviderProjectAのContentProviderにアクセスしてDBデータを抽出して表示。
- ContentProviderProjectA: 간단한 DB 구현과 ContentProvider 구현(readable & writable).
- ContentProviderProjectB: ContentProviderProjectA의 ContentProvider에 접근해 DB 데이터를 추출해서 표시.
ContentProviderProjectA: Implementation Simple DB and ContentProvider (readable & writable)
- ContentProviderProjectB: Access ContentProvider of ContentProviderProjectA to extract and display DB data.
- ./00_[ProjectResult]/ContentProviderSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/212921416-ea9a03c6-7ef2-436a-a056-19e2ce8f2b0a.mp4" muted="false"></video></div>

# [CustomComponentProject](#CustomComponentProject)
- ProgressBar、Circle ProgressBar、SeekBar、CheckBox、Switch関連のサンプリングプロジェクト。
- 関連してViewを活用するためにUpAndDownゲームを作成。
- ProgressBar, Circle ProgressBar, SeekBar, CheckBox, Switch 관련한 샘플링 프로젝트.
- 관련해 View를 활용보기 위해 UpAndDown 게임을 만듬.
- Sampling projects related to ProgressBar, Circle ProgressBar, SeekBar, CheckBox, Switch.
- In relation to this, I created an UpAndDown game to utilize View.
- ./00_[ProjectResult]/CustomComponentProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213180449-3a028244-0d9f-4be2-abf5-e503cb69d785.mp4
" muted="false"></video></div>

# [CustomDrawingSampling](#CustomDrawingSampling)
- View.onDrawを利用したCustom Viewサンプリング。
- 賭けによく使うはしごゲーム、ルーレット機能を具現してみた。
- View.onDraw를 이용한 Custom View 샘플링.
- 내기에 자주 사용하는 사다리 게임, 룰렛 기능을 구현해봤다.
- Custom View Sampling with View.onDraw.
- I implemented ladder games and roulette functions that are often used for betting.
- ./00_[ProjectResult]/CustomDrawingSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213182730-0e5174f4-6170-42c1-8ec4-7fbff52beea1.mp4" muted="false"></video></div>

# [CustomInputLayoutSampling](#CustomInputLayoutSampling)
- 家計簿アプリの実装中に必要なエディットTextの新しい入力レイアウトの実装。
- EditText Focus時、キーボードではなく入力レイアウト表示及び関連作業遂行。BottomSheetDialogFragment活用.
- 가계부 어플 구현 중 필요한 EditText의 새로운 입력 레이아웃 구현.
- EditText Focus시, 키보드가 아닌 입력 레이아웃 표시 및 관련 작업 수행. BottomSheetDialogFragment 활용.
- Implementation of a new input layout of EditText required during the implementation of the diary application.
- During EditText Focus, displaying input layout and performing related tasks, not keyboards. With BottomSheetDialogFragment.
- ./00_[ProjectResult]/CustomInputLayoutSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213188521-12c52c2b-faac-46a8-8ca3-75a5d4641a17.mp4" muted="false"></video></div>

# [DatePickerProject](#DatePickerProject)
- DatePickerに関連してString→Date、Date→String処理サンプリング。
- DialogFragment와 DatePickerDialog를 구현함. 今になって見ると、それほど必要なサンプリングではなかったような気もする。
- 内容が不十分すぎて、"AfterDate<PrevDate->PrevDate=AfterDate-1"、"PrevDate>AfterDate->AfterDate=PrevDate+1"に変更されるように処理を追加。
- DatePicker 관련해서 String -> Date, Date -> String 처리 샘플링.
- DialogFragment와 DatePickerDialog를 구현함. 지금 와서 보니 그리 필요한 샘플링이 아니었던 것 같기도 함.
- 내용이 너무 부실해서 "AfterDate < PrevDate -> PrevDate = AfterDate-1", "PrevDate > AfterDate -> AfterDate = PrevDate+1"로 변경되도록 처리 추가.
- String -> Date, Date -> String treatment sampling in relation to DatePicker.
- DialogFragment와 DatePickerDialog를 구현함. Now that I look at it, I don't think it was a necessary sampling.
- Added treatment to change to "AfterDate < PrevDate -> PrevDate = AfterDate-1", "PrevDate > AfterDate -> AfterDate = PrevDate+1" because the content is too poor.
- ./00_[ProjectResult]/DatePickerProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213461426-c785a857-a457-4292-b616-0062d91d7fa1.mp4" muted="false"></video></div>
  
# [DialogActivityProject](#DialogActivityProject)
- AppMsgを出力する機能を作成中、DialogFragmentでAppMsgを出力するとDialogの上に出力されるのではなく、下から出力される問題が発生。
- AppMsgがcontextを基準に出力される問題と見られる。 そこで、ActivityをDialogのように作ったDialogActivityを利用してAppMsgをDialogの上から出力されるようなトリックを与えた。
- 今後、透明アクティビティが必要になれば、Theme.Transparentを参考にすればいい。
- AppMsg를 출력하는 기능을 만들던 중, DialogFragment에서 AppMsg를 출력하면 Dialog 위에 출력되는 것이 아니라 밑에서 출력되는 문제가 발생.
- AppMsg가 context를 기준으로 출력되는 문제로 보여짐. 그래서 Activity를 Dialog와 같이 만든 DialogActivity를 이용해 AppMsg를 Dialog 위에서 출력되는 듯한 트릭을 주었다.
- 추후 투명 액티비티가 필요해지면 Theme.Transparent를 참고하면 되겠다.
- While creating a function to output AppMsg, when you output AppMsg from Dialog Fragment, the problem occurs that it is output from the bottom rather than on the Dialog.
- AppMsg appears to be a problem output based on context. So, using DialogActivity, which made Activity like Dialog, AppMsg was given a trick that seemed to be printed on Dialog.
- If you need transparent activities in the future, you can refer to Theme.Transparent.
- ./00_[ProjectResult]/DialogActivityProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213465470-b2a4c3a1-5b28-451c-96c3-47464dd8b128.mp4" muted="false"></video></div>
  
# [DpAndSpProject](#DpAndSpProject)
- 最初はDPとSpの違いを調べる概念のプロジェクト。
- dp(画面によるサイズ変化X)、sp(画面によるサイズ変化O)
- 内容が不十分で、dp、sp、in、mm、pt、pxまでサイズタイプを並べてサイズの違いを調べる。
- 처음엔 Dp와 Sp의 차이점을 조사하는 개념의 프로젝트.
- dp(화면에 따른 사이즈 변화 X), sp(화면에 따른 사이즈 변화 O)
- 내용이 부실해서 dp, sp, in, mm, pt, px까지 사이즈 타입을 나열해서 크기 차이를 살펴봄
- A project of the concept of investigating the difference between Dp and Sp.
- dp (size change X according to screen), sp (size change O according to screen)
- Because the content is poor, list the size types up to dp, sp, in, mm, pt, px and examine the size difference.
- ./00_[ProjectResult]/DpAndSpProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213724494-cbb7b491-0ca4-45bf-bb62-62912f7a07e5.mp4" muted="false"></video></div>
 
# [FCMProject](#FCMProject)
- 今後追加勉強が必要
- 추후 추가공부 필요
- Additional study is required in the future

# [FCM_Token](#FCM_Token)
- 今後追加勉強が必要
- 추후 추가공부 필요
- Additional study is required in the future

# [FCM_Topic](#FCM_Topic)
- 今後追加勉強が必要
- 추후 추가공부 필요
- Additional study is required in the future

# [FcmSampling](#FcmSampling)
- Fcmは以前サンプリングしたことがあり、新たにリマインドする感じでアップデートを実施。
- しかし、無料アカウントのためか、Fcmディレーが長すぎてプロジェクト進行に困難があった。
- 以前使用したHTTP API方式もHTTP v1 APIにアップグレードされ、新しいアプローチが必要。 今後追加的な勉強が必要。
- Token、Topicによる発行だけでなく、click_eventなど様々な機能をサンプリングする必要がある。
- Fcm은 이전에 샘플링한 적이 있어 새롭게 리마인드하는 느낌으로 업데이트를 진행.
- 그러나 무료 계정이라서인지 Fcm 딜레이가 너무 길어 프로젝트 진행에 어려운 점이 있었음.
- 이전에 사용했던 HTTP API 방식도 HTTP v1 API으로 업그레이드되서 새로운 접근이 필요함. 추후 추가적 공부 필요.
- Token, Topic을 통한 발행 뿐만 아니라 click_event 등 다양한 기능을 샘플링해볼 필요가 있음
- Fcm has been sampled before, so it is updated as if it is being reminded.
- However, there was a difficulty in proceeding with the project because the Fcm delay was too long, perhaps because it was a free account.
- The previous HTTP API method was also upgraded to HTTP v1 API, requiring new access. Additional study is required later.
- It is necessary to sample various functions such as click_event as well as publishing through Token and Topic.
- ./00_[ProjectResult]/FcmSampling1.png
- ./00_[ProjectResult]/FcmSampling2.png
- ./00_[ProjectResult]/FcmSampling1.png
![FcmSampling1](https://user-images.githubusercontent.com/56281493/214305709-a05335da-38ae-4c51-8e27-a2fb4a989f44.png)
![FcmSampling2](https://user-images.githubusercontent.com/56281493/214305748-0eb1d2e5-ecc3-463b-9cf2-aa391db60819.png)
![FcmSampling3](https://user-images.githubusercontent.com/56281493/214305755-306412c9-5785-4ab0-aff7-6872e69561de.PNG)

# [FragmentBackStackProject](#FragmentBackStackProject)
- プロジェクトをアップデートしながら、BackStackにあるFragmentに交換する作業を進めようとしたが、関連するAPIが見つからない。
- "support Fragment Manager.pop Back Stack"は、該当Fragmentの次のFragmentをすべてPOP! 消し止め
- 現在の機能が開発にどのように役立つのか見つからない。追加的な勉強が必要!!!
- 프로젝트 업데이트하면서 BackStack에 있는 Fragment로 교체하는 작업을 진행하려했는데, 관련된 API를 찾지 못함.
- "supportFragmentManager.popBackStack"는 해당Fragment의 다음 Fragment들을 모두 POP! 없애버림.
- 현재 기능이 개발에 어떤 도움이 되는지 찾지 못함. !!!추가적인 공부 필요!!!
- While updating the project, I tried to replace it with a fragment in BackStack, but I couldn't find the related API.
- "supportFragmentManager.popBackStack" POP all of the following fragments of the corresponding fragment! getting rid of
- Couldn't find out how the current feature is helping development. !!!Need additional study!!!
- ./00_[ProjectResult]/FragmentBackStackProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/213921768-2e795b57-861f-4d76-b150-17a85a5a2002.mp4" muted="false"></video></div>

# [MultiFragmentSwipeEventSampling](#MultiFragmentSwipeEventSampling)
- 家計簿アプリの実装中、フレグメントに対するスワイプイベントをアクティビティで受け取り、フレグメントにばら撒く機能が必要。
- それと共にスワイプイベント動作時、現在のフレグメントによって日·月間·週間·年間に日付を変更する機能を追加。
- 様々な機能を合わせて作り出したものなので、最近サンプリングしたものの中で一番胸がいっぱいになるサンプリング。
- 가계부 어플 구현 중 프레그먼트에 대한 스와이프 이벤트를 액티비티에서 받아서 프레그먼트에 뿌려주는 기능이 필요.
- 그와 함께 스와이프 이벤트 동작시 현재 프레그먼트에 따라 일일, 월간, 주간, 연간으로 날짜를 변경해주는 기능을 추가.
- 여러가지 기능들을 합쳐서 만들어낸거라 최근 샘플링한 것 중 가장 뿌듯한 샘플링.
- During the implementation of the household accounting application, the function to receive swipe events for fragments from the activity and spray them on the fragments is required.
- In addition, the function to change the date to daily, monthly, weekly, and annual according to the current fragment during the swipe event operation is added.
- It's the most satisfying sampling of the recent sampling because it's a combination of various functions.
- ./00_[ProjectResult]/MultiFragmentSwipeEventSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/214579358-f3384783-2e0f-41c8-b200-30202acea760.mp4" muted="false"></video></div>

# [NavigationBackStackProject](#NavigationBackStackProject)
- ResourcesのNavigationファイルを通じてNavigation転移図を作成し、setupActionBarWithNavControllerを通じてNavigation Controllerを追加すると、navigationの機能が追加されたフラグメントを利用することができる。 全体的なアプリ転移度が決まっていれば、簡単に具現でき、backstackなどもシステムが管理してくれるので便利な機能だと思う。
- Resources의 Navigation 파일을 통해 Navigation 전이도를 만들고, setupActionBarWithNavController를 통해 Navigation Controller를 추가하면, navigation의 기능이 추가된 fragment를 이용할 수 있다. 전체적인 앱 전이도가 정해져있다면, 쉽게 구현할 수 있고, backstack 등도 시스템이 관리해주니 편리한 기능이라고 생각한다.
- If you create a Navigation transition diagram through the Navigation file in Resources and add a Navigation Controller through the setupActionBarWithNav Controller, you can use a fragment with the added function of Navigation. If the overall app conductivity is set, it can be easily implemented, and I think it is a convenient function because the system manages the backstack.
- ./00_[ProjectResult]/NavigationBackStackProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215265304-855e5025-d856-49a6-b698-56b3fbcf18c8.mp4" muted="false"></video></div>

# [NumberPickerSampling](#NumberPickerSampling)
- 社内教育プロジェクトで家計簿アプリを開発中、週間統計画面で週間を選択する機能が必要。
- 簡単に作れると思ったが、詳しく入ってみると気を使わなければならない部分が多かった。
- 사내 교육 프로젝트에서 가계부 앱을 개발하던 중, 주간 통계 화면에서 주간을 선택하는 기능이 필요.
- 쉽게 만들 수 있을 줄 알았는데, 자세히 들어가보니 신경써야할 부분이 많았다.
- While developing a diary app in an in-house education project, the ability to select a weekly from the weekly statistics screen is required.
- I thought it would be easy to make, but when I went into detail, there were many things to pay attention to.
- ./00_[ProjectResult]/NumberPickerSampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215305228-4c969382-4e58-46b8-a98a-f2d48969d43e.mp4" muted="false"></video></div>

# [ProgressbarProject](#ProgressbarProject)
- [CustomComponentProject](#CustomComponentProject)でも活用しましたが、もう一度確実に確認するためサンプリング。
- ローディング中であることを知らせるProgressBarと進行中であることを知らせるHorizontal ProgressBarを活用してタイマーの動作を表示するプロジェクト。
- 長かったり、動作時間が予想できない作業の場合に活用できる。
- [CustomComponentProject](#CustomComponentProject)에서도 활용했지만, 한번 더 확실히 확인하기 위해 샘플링.
- 로딩중임을 알리는 ProgressBar와 진행중임을 알리는 Horizontal ProgressBar를 활용해 타이머의 동작을 표시하는 프로젝트.
- 길거나 동작 시간이 예상안되는 작업의 경우 활용할 수 있음.
- It was also used in [CustomComponentProject](#CustomComponentProject), but sampling to make sure once more.
- A project that displays the behavior of a timer using ProgressBar indicating that it is loading and Horizontal ProgressBar indicating that it is in progress.
- Can be utilized for long or unexpected operational times.
- ./00_[ProjectResult]/ProgressbarProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215306147-7d4ffa60-956d-42d5-b5b2-ef9624be96ae.mp4" muted="false"></video></div>

# [RecyclerViewScrollProject](#RecyclerViewScrollProject)
- [ComponentSizeAndPositionProject](#ComponentSizeAndPositionProject)でも実装した機能.
- RecyclerViewのcanScrollVerticallyを利用して最上段、最下段を確認するロジックを実現。
- 最下段に到達すると、RecyclerViewにアイテムを追加、AppMsgを表示。
- [ComponentSizeAndPositionProject](#ComponentSizeAndPositionProject)에서도 구현한 기능.
- RecyclerView의 canScrollVertically를 이용해 최상단, 최하단 확인하는 로직 구현.
- 최하단 도달시 RecyclerView에 Item 추가, AppMsg 표시.
- Features also implemented in [ComponentSizeAndPositionProject](#ComponentSizeAndPositionProject)
- The logic of checking the top and bottom using RecyclerView's canScroll Vertically is implemented.
- Add items to RecyclerView when reaching the lowest level, and display AppMsg.
- ./00_[ProjectResult]/RecyclerViewScrollProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215307937-c670a10a-aaab-414f-93d3-f2a9c987a372.mp4" muted="false"></video></div>

# [RegularIncomeAndInstallmentSampling](#RegularIncomeAndInstallmentSampling)
- RegularIncomeAndInstallmentSampling
# [RoomDBImageSampling](#RoomDBImageSampling)
- RoomDBImageSampling
# [RoomDBSampling](#RoomDBSampling)
- RoomDBSampling
# [RoomSampling](#RoomSampling)
- RoomSampling
# [RyougaeSampling](#RyougaeSampling)
- 家計簿アプリの実装中、為替レートの表示が必要。 公共API活用
- 가계부 어플 구현 중, 환율 표시가 필요함. 공공 API 활용
- The exchange rate indication is required while implementing the household accounting application. Utilize public APIs
- ./00_[ProjectResult]/RyougaeSampling.jpg
![RyougaeSampling](https://user-images.githubusercontent.com/56281493/215492504-3d536acc-261d-4835-8c7e-036348161e94.jpg)
  
# [SeekbarProject](#SeekbarProject)
- Seekbarのchangeeventlistenerを利用してtextの明るさ、textのsizeを調節する機能を実現
- Seekbar의 change event listener를 이용해 text의 밝기, text의 size를 조절하는 기능 구현
- Using Seekbar's change event listener, the function of adjusting the brightness of the text and the size of the text is implemented.
- ./00_[ProjectResult]/SeekbarProject.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215495297-7cd1c1f7-8bb9-4440-bcb2-8803aa13772c.mp4" muted="false"></video></div>

# [service-sampling](#service-sampling)
- ServiceのonStartCommandの戻り値をSTART_STICKYに設定し、backgroundでも実行できるように実装。
- 万歩計機能のためにサービス関連サンプリングを実施。
- Service on DestoryでBroadcast Receiverを開く方法も検討中。
- Service의 onStartCommand의 반환값을 START_STICKY으로 설정해 background에서도 실행할 수 있도록 구현.
- 만보계 기능을 위해 Service 관련 샘플링을 진행.
- Service onDestory에서 Broadcast Receiver를 여는 방법도 고려중.
- The return value of the service's onStartCommand is set to START_STICKY so that it can be executed even in the background.
- Sampling related to service for pedometer function.
- I am also considering opening Broadcast Receiver in Service on Destory.
- ./00_[ProjectResult]/service-sampling.mp4
<div><video controls src="https://user-images.githubusercontent.com/56281493/215763301-b4fe58f9-2c0f-412b-8ace-0a4d36d2779f.mp4" muted="false"></video></div>
  
# [ServiceProject](#ServiceProject)
- ServiceProject
# [ServiceThreadExample](#ServiceThreadExample)
- ServiceThreadExample
# [SwitchProject](#SwitchProject)
- SwitchProject
# [TransparentViewSampling](#TransparentViewSampling)
- TransparentViewSampling
# [ViewPagerProject](#ViewPagerProject)
- ViewPagerProject
# [ViewPagerSampling](#ViewPagerSampling)
- ViewPagerSampling
