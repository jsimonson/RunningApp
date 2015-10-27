package com.softwaredevclub.jake.runningapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Jake on 10/27/2015.
 */
public class HomeScreenActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home_layout);
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

    public void startCustomRunActivity(View view) {
        Intent startCustomRunIntent = new Intent(getApplicationContext(),
                CustomRunActivity.class);

        startActivity(startCustomRunIntent);

    }

    public void startQuickRunActivity(View view) {
        Intent startQuickRunIntent = new Intent(getApplicationContext(),
                QuickRunActivity.class);

        startActivity(startQuickRunIntent);
    }

    public void startSettingsActivity(View view) {
        Intent startSettingsIntent = new Intent(getApplicationContext(),
                SettingsActivity.class);

        startActivity(startSettingsIntent);
    }

    public void startRunHistoryActivity(View view) {
        Intent startRunHistoryIntent = new Intent(getApplicationContext(),
                RunHistoryActivity.class);

        startActivity(startRunHistoryIntent);
    }

    public void startCurrentRunActivity(View view) {
        Intent startCurrentRunIntent = new Intent(getApplicationContext(),
                CurrentRunActivity.class);

        startActivity(startCurrentRunIntent);
    }
}
