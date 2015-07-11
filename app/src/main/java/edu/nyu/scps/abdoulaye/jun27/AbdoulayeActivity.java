package edu.nyu.scps.abdoulaye.jun27;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.Toast;


public class AbdoulayeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdoulaye);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_abdoulaye, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void AsaClick(View view) {

        Intent asaIntent = new Intent();
        ComponentName asaComponent = new ComponentName(
                "edu.nyu.scps.asa.jun27",            //name of package
                "edu.nyu.scps.asa.jun27.AsaActivity" //name of class
        );
        asaIntent.setComponent(asaComponent);
//        while (ActivityNotFoundException != true)
//            try {
                startActivity(asaIntent);
//            } catch (ActivityNotFoundException activityNotFoundException) {
//                Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
//                toast.show();
//            }
    }

    public void AlrickClick(View view) {

        Intent alrickIntent = new Intent();
        ComponentName alrickComponent = new ComponentName(
                "edu.nyu.scps.alrick.jun27",               //name of package
                "edu.nyu.scps.alrick.jun27.AlrickActivity" //name of class
        );
        alrickIntent.setComponent(alrickComponent);
        startActivity(alrickIntent);
    }

    public void DavidClick(View view) {

        Intent davidIntent = new Intent();
        ComponentName davidComponent = new ComponentName(
                "edu.nyu.scps.david.jun27",
                "edu.nyu.scps.david.jun27.DavidActivity"
        );
        davidIntent.setComponent(davidComponent);
//        do {
            startActivity(davidIntent);
//        }
//        }while (startActivity(davidIntent)!= )
    }

    public void DeepaliClick(View view) {
        Intent deepIntent = new Intent();
        ComponentName deepaliComponent = new ComponentName(
                "edu.nyu.scps.deepali.jun27",
                "edu.nyu.scps.deepali.jun27.DeepaliActivity"
        );
        deepIntent.setComponent(deepaliComponent);
        startActivity(deepIntent);


    }

    public void JaxonClick(View view) {

        Intent jaxonIntent = new Intent();
        ComponentName jaxonComponent = new ComponentName(
                "edu.nyu.scps.jaxon.jun27",              //name of package
                "edu.nyu.scps.jaxon.jun27.JaxonActivity" //name of class
        );
        jaxonIntent.setComponent(jaxonComponent);
        startActivity(jaxonIntent);
    }

    public void JeffreyClick(View view) {

        Intent jeffreyIntent = new Intent();
        ComponentName jeffreyComponent = new ComponentName(
                "edu.nyu.scps.jeffrey.jun27",                //name of package
                "edu.nyu.scps.jeffrey.jun27.JeffreyActivity" //name of class
        );
        jeffreyIntent.setComponent(jeffreyComponent);
        startActivity(jeffreyIntent);
    }

    public void JoeyClick(View view) {
        Intent joeyIntent = new Intent();
        ComponentName joeyComponent = new ComponentName(
                "edu.nyu.scps.joey.jun27",             //name of package
                "edu.nyu.scps.joey.jun27.JoeyActivity" //name of class
        );
        joeyIntent.setComponent(joeyComponent);
        startActivity(joeyIntent);
    }

    public void KeenenClick(View view) {
        Intent keenenIntent = new Intent();
        ComponentName keenenComponent = new ComponentName(
                "edu.nyu.scps.keenen.jun27",               //name of package
                "edu.nyu.scps.keenen.jun27.KeenenActivity" //name of class
        );
        keenenIntent.setComponent(keenenComponent);
        startActivity(keenenIntent);
    }

    public void MarkClick(View view) {
        Intent markIntent = new Intent();
        ComponentName markComponent = new ComponentName(
                "edu.nyu.scps.david.jun27",
                "edu.nyu.scps.david.jun27.MarkActivity"
        );
        markIntent.setComponent(markComponent);
        startActivity(markIntent);
    }
}
