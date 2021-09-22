package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imageId = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
                R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i};
        String[] name = {"Саша","Олег","Маша","МИХАЛЫЧ","Александр","Иван",
                        "Петя","Дмитрий","Паша"};
        String[] lastMessage = {"Не спишь?","Го программировать","Мне 13",
                "У тебя спина белая","Кто прочёл - тот воскрес","Перешли это сообщение",
                "ЗАВТРА КОНЕЦ СВЕТА!","Петушествие во времени!!","Го кс"};
        String[] lastMsgTime = {"01:12","12:54","23:59","19:42","12:42","00:01","12:48","53:92","18:20"};
        String[] phoneNo = {"+7(977)777-77-77","+7(977)767-67-67","+7(977)656-56-56",
                "+7(977)545-45-45","+7(977)434-34-34","+7(977)323-23-23",
                "+7(495)197-61-62","+7(977)737-23-13","+7(985)321-21-12"};
        String[] country = {"Россия","Россия","Украина","Украина","Россия","Украина","Россия","Украина","Россия"};

        ArrayList<User> userArrayList = new ArrayList();

        for (int i = 0; i < imageId.length; i++){
            User user = new User(name[i],lastMessage[i],lastMsgTime[i],phoneNo[i],country[i],imageId[i]);
            userArrayList.add(user);
        }
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        Intent intent = new Intent(this,UserActivity.class);
        /*
        intent.putExtra("name", name[position]);
        intent.putExtra("phoneNo", phoneNo[position]);
        intent.putExtra("country", country[position]);
        intent.putExtra("imageId", imageId[position]);
        */
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}