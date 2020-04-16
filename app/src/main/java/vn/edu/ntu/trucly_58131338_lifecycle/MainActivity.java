package vn.edu.ntu.trucly_58131338_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate called");

        Context context = getApplicationContext();
        CharSequence text = "onCreate called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart called");

        Context context = getApplicationContext();
        CharSequence text = "onStart called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart called");

        Context context = getApplicationContext();
        CharSequence text = "onRestart called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume called");
        Context context = getApplicationContext();
        CharSequence text = "onResume called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause called");

        Context context = getApplicationContext();
        CharSequence text = "onPause called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop called");

        Context context = getApplicationContext();
        CharSequence text = "onStop called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy called");

        Context context = getApplicationContext();
        CharSequence text = "onDestroy called!";
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
