package com.iot.todaydestiny;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ResultActivity extends AppCompatActivity {

    TextView textResult;

    String[] fortunes = {
            "오늘은 새로운 기회가 찾아올테니 붙잡으세요.",
            "조심해야 할 일이 생길 수 있어요 사리죠?.",
            "오늘은 집밖으로 나가지마세요",
            "누군가 당신을 해칠 것 입니다.",
            "오늘은 복권을 사볼까요?",
            "연인이 있다면 같이 있고, 솔로면 마음에 드는 사람에게 다가가보세요!",
            "평소보다 더 가족에게 연락하세요",

            "오늘은 그동안 쌓아온 실력을 보여줄 수 있는 날입니다.",
            "준비한 만큼 결과도 따라올 테니, 자신감을 가지세요!",
            "예상치 못한 기회가 당신을 기다리고 있어요.",
            "실수는 있어도 결과는 나쁘지 않을 것입니다.",
            "오늘은 도전보다는 복습과 마무리에 집중해보세요.",
            "운도 중요하지만 꾸준함이 더 큰 힘이 됩니다.",
            "당신의 매력이 오늘 빛을 발할 수 있는 날이에요.",
            "마음에 두고 있던 사람과 가까워질 수 있는 기회가 생깁니다.",
            "작은 친절이 사랑으로 이어질 수 있어요.",
            "고백하기엔 아직 이르니 조금 더 기다려보세요.",
            "새로운 만남보다는 익숙한 사람 속에서 인연이 숨어 있어요.",
            "연애보다는 자신을 돌아볼 시간이 필요해요.",
            "현재 누군가의 관계가 한 단계 더 깊어질 수 있는 시기입니다.",
            "결혼에 대한 고민은 조금 더 신중하게 생각해보세요.",
            "가까운 사람과의 인연이 깊어질 가능성이 높습니다.",
            "갑작스러운 변화는 오히려 좋은 결과를 가져올 수 있어요.",
            "배우자운이 강한 하루! 뜻밖의 만남이 있을지도 몰라요.",
            "미래를 함께할 사람은 지금 곁에 있을 수 있습니다.",
            "오랜 친구와의 연락이 기분 좋은 소식을 가져올 수 있어요.",
            "사소한 말실수가 갈등으로 번질 수 있으니 조심하세요.",
            "믿었던 친구에게서 뜻밖의 실망을 느낄 수 있어요.",
            "새로운 인맥이 좋은 기회를 가져다줄 수 있습니다.",
            "주변 사람들과의 신뢰를 다시 쌓을 좋은 기회입니다.",
            "혼자보다는 친구와 함께하는 활동이 행운을 부릅니다.",
            "컨디션이 좋은 하루! 체력적으로 무리해도 괜찮습니다.",
            "작은 통증이라도 무시하지 말고 관리가 필요해요.",
            "운동을 시작하기에 좋은 날입니다.",
            "스트레스가 쌓이기 쉬우니 마음의 여유를 가지세요.",
            "충분한 휴식이 필요한 시기입니다.",
            "건강을 위한 식습관을 점검해보는 것이 좋겠어요.",
            "새로운 시작을 위한 좋은 징조가 보입니다.",
            "과거의 노력이 결실을 맺게 될 것입니다.",
            "갑작스러운 변화가 오히려 좋은 결과를 가져다줄 수 있어요.",
            "오늘의 선택이 앞으로의 방향을 크게 바꿉니다.",
            "불안해하지 마세요, 당신의 미래는 생각보다 밝습니다.",
            "멀게만 느껴졌던 꿈이 조금씩 현실로 다가옵니다."

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);
        textResult = findViewById(R.id.textResult);

        String birth = getIntent().getStringExtra("birth");
        String name = getIntent().getStringExtra("name");

        // 오늘 날짜를 가져오기
        String today = new SimpleDateFormat("yyyyMMdd", Locale.KOREA).format(new Date());

        // 고정된 Seed 값 생성 (오늘 날짜 + 이름 + 생년월일)
        String seedData = today + name + birth;

        // 해시코드 기반으로 운세 고정
        int index = Math.abs(seedData.hashCode()) % fortunes.length;
        String fortune = fortunes[index];

        textResult.setText("[" + name + "], 오늘의 메시지\n\n" + fortune);
    }
}