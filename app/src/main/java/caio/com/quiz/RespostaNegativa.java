package caio.com.quiz;

import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class RespostaNegativa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_negativa);
    }
    public void botaoContinuar(View view) {
        RespostaNegativa.this.finish();
        Toast.makeText(getApplicationContext(), "Voltando...", Toast.LENGTH_LONG).show();
    }

    public void botaoFinaliza(View view) {
        RespostaNegativa.this.finish();
        Toast.makeText(getApplicationContext(), "Finalizando...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int idProcessoAtual = Process.myPid();
        Process.killProcess(idProcessoAtual);
    }
}
