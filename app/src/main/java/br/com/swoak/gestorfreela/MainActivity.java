package br.com.swoak.gestorfreela;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayot;
    private ActionBarDrawerToggle mToggle;

    //Ativa Menu Lateral
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayot=(DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayot, R.string.navi_abrir, R.string.navi_fechar);

        mDrawerLayot.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Ativa Botão do Menu Lateral
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void MensagemSobre() {
        AlertDialog Mensagem;
        Mensagem = new AlertDialog.Builder(this).create();
        Mensagem.setTitle(R.string.app_name);
        Mensagem.setMessage("Desenvolvido por Softwares Oak");
        Mensagem.show();
    }

    public void MensagemAlerta(View View) {
        AlertDialog Mensagem;
        Mensagem = new AlertDialog.Builder(this).create();
        Mensagem.setTitle(R.string.app_name);
        Mensagem.setMessage("Esse é um exemplo de AlertDialog");
        Mensagem.show();
    }

    public void FecharApp(View View) {
        System.exit(0);
    }

    public static final String[] PAISES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain"
    };

}
