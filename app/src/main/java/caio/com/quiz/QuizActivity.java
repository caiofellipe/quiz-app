package caio.com.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    Random r = new Random();
    String perguntas [] = {"1+1 = 2", "1*2 = 3", "20*20 = 40", "Raiz quadrada de 25, é 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        for (int i = 0; i< r.nextInt(perguntas.length); i++){
            String teste = perguntas[r.nextInt(perguntas.length)];
            TextView pergunta1 = this.<TextView>findViewById(R.id.textPergunta);
            pergunta1.setText(teste);
            System.out.print(teste);
        }
    }
    public void ResultadoPergunta(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton verdadeiro = (RadioButton) findViewById(R.id.radioVerdadeiro);
        RadioButton falso = (RadioButton) findViewById(R.id.radioFalso);
        Boolean resposta1 = true;
        Boolean resposta2 = false;
        Boolean resposta3 = false;
        Boolean resposta4 = true;

        if (verdadeiro.isChecked() && resposta1 == true || falso.isChecked() && resposta2 == false || falso.isChecked() && resposta3 == false || verdadeiro.isChecked() && resposta4 == true){
            Intent a = new Intent(this, RespostaActivity.class);
            startActivity(a);
        }else if(falso.isChecked() && resposta1 == false || verdadeiro.isChecked() && resposta2 == true || verdadeiro.isChecked() && resposta3 == true || falso.isChecked() && resposta4 == false){
            Intent b = new Intent(this, RespostaNegativa.class);
            startActivity(b);
        }
    }
}
