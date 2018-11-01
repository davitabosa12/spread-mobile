package smd.ufc.br.spread;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import smd.ufc.br.spread.utils.TokenUtil;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(userHasLogin()){

        } else {
            startActivity(new Intent(this, LoginActivity2.class)); //go to login
        }
        changeUI();

    }

    private boolean userHasLogin() {
        //TODO: Check SharedPrefs for login JWT tokens.
        TokenUtil util = new TokenUtil(this);
        String login = util.getLogin();
        return !(login == null);
    }

    private void changeUI() {
        //Mudar UI de acordo com o usuario (Aluno/Professor)
    }
}
