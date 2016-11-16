package solutions.epictech.www.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reference of button in layout
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        //click listner to button
        buttonPlay.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent in = new Intent(MainActivity.this,GameActivity.class);
        startActivity(in);
        finish();
    }
}
