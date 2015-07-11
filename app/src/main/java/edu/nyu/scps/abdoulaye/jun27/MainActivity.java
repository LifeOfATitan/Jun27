package edu.nyu.scps.abdoulaye.jun27;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homebutton = (Button) findViewById(R.id.home_button_id);
        ViewPropertyAnimator homeRunSpinAnimation = homebutton.animate();

        homeRunSpinAnimation.rotationX(20f);
        homeRunSpinAnimation.setDuration(100000l);
        homeRunSpinAnimation.alpha(400f);
        homeRunSpinAnimation.scaleX(1f);
        homeRunSpinAnimation.rotation(9990f);

        while (homeRunSpinAnimation.getDuration() < 1000l) {
            homeRunSpinAnimation.y(300f);
        }
        homeRunSpinAnimation.setStartDelay(100l);
        homeRunSpinAnimation.translationX(1000f);

//       homebutton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void TakeMe(View view) {
        Intent goToAbdoulaye = new Intent(this, AbdoulayeActivity.class);
        startActivity(goToAbdoulaye);


    }
}
