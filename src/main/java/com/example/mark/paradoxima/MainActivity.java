package com.example.mark.paradoxima;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView task;
    Button A;
    Button B;
    Button C;
    RelativeLayout back;
    public int n =(int)(Math.random()*4);
    public String[] randompicture = {"слонят","котят","единорогов","китов","копибар"};
    public String[] textcolor ={"#888888","#ff585a","#FF0000","#ff7d38","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#ffffff","#888088","#808888","#888808"};
    public String[] tasks = {"Вы просыпаетесь от оглушительного звона будильника. Вы открываете глаза, но видите лишь множество размытых цветных пятен.",
            "Размытые пятна превращаются в цветных "+randompicture[n]+". Вы не можете вспомнить почему выбрали именно такие обои. Будильник продолжает надрываться.",
            "Вы резко перекатываетесь в бок и падаете на пол. И какраз вовремя, ибо в эту же секунду вашу любимую кроватку разрезает на две половинки гигантская бензопила. Будильник продолжает истошно звенеть, перекрывая даже шум бензопилы.",
            "Под столом вы обнаруживаете три двери, надпись над ними гласит: Две из них уводят в Ад, Третьей каждый будет рад. Чтобы не пойти ко дну, Выбери из них одну.",
            "Вы смело проходите в дверь, перед тем как она захлопнется вы успеваете услышать звук разрезаемого на части будильника. Дверь закрывается за вами и всё вокруг поглощает тьма.",
            "Вы идёте вперёд по тёмному, тихому коридору, ваши шаги гулко отдаются в его сводах.",
            "У вас под ногами чтото хлюпает.",
            "Овсянка.",
            "Вы продолжаете свой путь.",
            "Вы видите белый свет в конце коридора.",
            "Вы слышите постепенно нарастающий звук.",
            "Вы выходите в белое заполненное светом пространство, в котором царит жуткий звон.",
            "Звон становится невыносим",
    "Вы выключаете будильник и снова проваливаетесь в сон.",
    "Вы встаёте, ударяетесь головой о балку и вырубаетесь.",
    "Подушка забивает механизм пилы. Комната заполняется летающими перьями и гарью. У вас темнеет в глазах и вы засыпаете от недостатка кислорода.",
    "Бензопила начинает размалывать адскую машинку на маленькие части. Один из винтиков застревает в цепи бензопилы, она глохнет и в комнате устанавливается полная тишина вы довольно засыпаете."};
    public String[][] turns = {{"Надеть очки.","Упасть на пол","Застопорить бензопилу перьевой подушкой","Левая дверь","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Проснуться","Проснуться","Очнуться","Проснуться","Проснуться"},
            {"Попытаться выключить будильник.","Попытаться выключить чёртов будильник.","Переползти под стол.","Средняя дверь","Идти вперёд.","Идти вперёд.","Идти назад.","Идти назад.","Идти назад.","Идти назад.","Идти назад.","Идти назад.","Проснуться","Проснуться","Очнуться","Проснуться","Проснуться"},
            {"Протереть глаза.","Попытаться встать.","Швырнуть несмолкающий будильник в бензопилу.","Правая дверь","Идти вперёд.","Идти вперёд.","Посмотреть, что хлюпает.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Идти вперёд.","Проснуться","Проснуться","Очнуться","Проснуться","Проснуться"}};
    public int[] turnbutsA ={1,2,15,4,5,6,8,8,9,10,11,12,0,0,0,0,0};
    public int[] turnbutsB ={13,13,3,4,5,6,5,6,6,8,9,10,12,0,0,0,0,0};
    public int[] turnbutsC ={1,14,16,4,5,6,7,8,9,10,11,12,0,0,0,0,0};
    public int turn=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task = (TextView)findViewById(R.id.task);
        A = (Button)findViewById(R.id.A);
        B = (Button)findViewById(R.id.B);
        C = (Button)findViewById(R.id.C);

        back = (RelativeLayout) findViewById(R.id.back);
        task.setText(tasks[0]);
        A.setText(turns[0][0]);
        B.setText(turns[1][0]);
        C.setText(turns[2][0]);
        back.setBackgroundResource(R.drawable.wakeup);
        task.setTextColor(Color.parseColor(textcolor[turn]));
        turn = 0;


    }
    public void AA(View v){
        task = (TextView)findViewById(R.id.task);
        A = (Button)findViewById(R.id.A);
        B = (Button)findViewById(R.id.B);
        C = (Button)findViewById(R.id.C);
        back = (RelativeLayout) findViewById(R.id.back);


        task.setText(tasks[turnbutsA[turn]]);
        A.setText(turns[0][turnbutsA[turn]]);
        B.setText(turns[1][turnbutsA[turn]]);
        C.setText(turns[2][turnbutsA[turn]]);
        switch(turnbutsA[turn]){
            case 0:back.setBackgroundResource(R.drawable.wakeup); break;
            case 1:switch(n){
                case 0:back.setBackgroundResource(R.drawable.elefant); break;
                case 1:back.setBackgroundResource(R.drawable.cat); break;
                case 2:back.setBackgroundResource(R.drawable.unicorn); break;
                case 3:back.setBackgroundResource(R.drawable.kit); break;
                case 4:back.setBackgroundResource(R.drawable.kopibara); break;
            };break;
            case 2:back.setBackgroundResource(R.drawable.pila); break;
            case 3:back.setBackgroundResource(R.drawable.doors); break;
            case 4:back.setBackgroundResource(R.drawable.door); break;
            case 5:back.setBackgroundResource(R.drawable.kor1); break;
            case 6:back.setBackgroundResource(R.drawable.kor2); break;
            case 7:back.setBackgroundResource(R.drawable.ovs); break;
            case 8:back.setBackgroundResource(R.drawable.kor3); break;
            case 9:back.setBackgroundResource(R.drawable.korlight); break;
            case 10:back.setBackgroundResource(R.drawable.korvoice); break;
            case 11:back.setBackgroundResource(R.drawable.light); break;
            case 12:back.setBackgroundResource(R.drawable.end); break;
            case 13:back.setBackgroundResource(R.drawable.wakedown); break;
            case 14:back.setBackgroundResource(R.drawable.wakedown); break;
            case 15:back.setBackgroundResource(R.drawable.poduska); break;
            case 16:back.setBackgroundResource(R.drawable.budil); break;
        }
        task.setTextColor(Color.parseColor(textcolor[turnbutsA[turn]]));

        turn = turnbutsA[turn];
    }
    public void BB(View v){
        task = (TextView)findViewById(R.id.task);
        A = (Button)findViewById(R.id.A);
        B = (Button)findViewById(R.id.B);
        C = (Button)findViewById(R.id.C);
        back = (RelativeLayout) findViewById(R.id.back);

        task.setText(tasks[turnbutsB[turn]]);
        A.setText(turns[0][turnbutsB[turn]]);
        B.setText(turns[1][turnbutsB[turn]]);
        C.setText(turns[2][turnbutsB[turn]]);
        switch(turnbutsB[turn]){
            case 0:back.setBackgroundResource(R.drawable.wakeup); break;
            case 1:switch(n){
                case 0:back.setBackgroundResource(R.drawable.elefant); break;
                case 1:back.setBackgroundResource(R.drawable.cat); break;
                case 2:back.setBackgroundResource(R.drawable.unicorn); break;
                case 3:back.setBackgroundResource(R.drawable.kit); break;
                case 4:back.setBackgroundResource(R.drawable.kopibara); break;
            };break;
            case 2:back.setBackgroundResource(R.drawable.pila); break;
            case 3:back.setBackgroundResource(R.drawable.doors); break;
            case 4:back.setBackgroundResource(R.drawable.door); break;
            case 5:back.setBackgroundResource(R.drawable.kor1); break;
            case 6:back.setBackgroundResource(R.drawable.kor2); break;
            case 7:back.setBackgroundResource(R.drawable.ovs); break;
            case 8:back.setBackgroundResource(R.drawable.kor3); break;
            case 9:back.setBackgroundResource(R.drawable.korlight); break;
            case 10:back.setBackgroundResource(R.drawable.korvoice); break;
            case 11:back.setBackgroundResource(R.drawable.light); break;
            case 12:back.setBackgroundResource(R.drawable.end); break;
            case 13:back.setBackgroundResource(R.drawable.wakedown); break;
            case 14:back.setBackgroundResource(R.drawable.wakedown); break;
            case 15:back.setBackgroundResource(R.drawable.poduska); break;
            case 16:back.setBackgroundResource(R.drawable.budil); break;
        }
        task.setTextColor(Color.parseColor(textcolor[turnbutsB[turn]]));

        turn = turnbutsB[turn];
    }
    public void CC(View v){
        task = (TextView)findViewById(R.id.task);
        A = (Button)findViewById(R.id.A);
        B = (Button)findViewById(R.id.B);
        C = (Button)findViewById(R.id.C);
        back = (RelativeLayout) findViewById(R.id.back);

        task.setText(tasks[turnbutsC[turn]]);
        A.setText(turns[0][turnbutsC[turn]]);
        B.setText(turns[1][turnbutsC[turn]]);
        C.setText(turns[2][turnbutsC[turn]]);
        switch(turnbutsC[turn]){
            case 0:back.setBackgroundResource(R.drawable.wakeup); break;
            case 1:switch(n){
                case 0:back.setBackgroundResource(R.drawable.elefant); break;
                case 1:back.setBackgroundResource(R.drawable.cat); break;
                case 2:back.setBackgroundResource(R.drawable.unicorn); break;
                case 3:back.setBackgroundResource(R.drawable.kit); break;
                case 4:back.setBackgroundResource(R.drawable.kopibara); break;
            };break;
            case 2:back.setBackgroundResource(R.drawable.pila); break;
            case 3:back.setBackgroundResource(R.drawable.doors); break;
            case 4:back.setBackgroundResource(R.drawable.door); break;
            case 5:back.setBackgroundResource(R.drawable.kor1); break;
            case 6:back.setBackgroundResource(R.drawable.kor2); break;
            case 7:back.setBackgroundResource(R.drawable.ovs); break;
            case 8:back.setBackgroundResource(R.drawable.kor3); break;
            case 9:back.setBackgroundResource(R.drawable.korlight); break;
            case 10:back.setBackgroundResource(R.drawable.korvoice); break;
            case 11:back.setBackgroundResource(R.drawable.light); break;
            case 12:back.setBackgroundResource(R.drawable.end); break;
            case 13:back.setBackgroundResource(R.drawable.wakedown); break;
            case 14:back.setBackgroundResource(R.drawable.wakedown); break;
            case 15:back.setBackgroundResource(R.drawable.poduska); break;
            case 16:back.setBackgroundResource(R.drawable.budil); break;
        }
        task.setTextColor(Color.parseColor(textcolor[turnbutsC[turn]]));

        turn = turnbutsC[turn];
    }

}
