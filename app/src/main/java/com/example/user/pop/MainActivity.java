package com.example.user.pop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

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
    public void click(View view) {
        switch (view.getId()) {
            case R.id.czat:
                break;
        }
        switch (view.getId()) {
            case R.id.awarie:
                break;
        }
        switch (view.getId()) {
            case R.id.dobrawoda:
                Intent intent=new Intent(MainActivity.this,dobrawoda.class);
                startActivity(intent);
                break;
        }
        switch (view.getId()) {
            case R.id.mojemiasto:
                Intent intent=new Intent(MainActivity.this,mojemiasto.class);
                startActivity(intent);
                break;
        }

    }
}
