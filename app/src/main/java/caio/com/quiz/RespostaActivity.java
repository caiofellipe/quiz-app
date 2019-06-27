package caio.com.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.os.Process;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_positiva);
    }
    public void botaoContinuar(View view) {
        RespostaActivity.this.finish();
        Toast.makeText(getApplicationContext(), "Voltando...", Toast.LENGTH_LONG).show();
    }

    public void botaoFinaliza(View view) {
        RespostaActivity.this.finish();
        Toast.makeText(getApplicationContext(), "Finalizando...", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int idProcessoAtual = Process.myPid();
        Process.killProcess(idProcessoAtual);
    }
}
