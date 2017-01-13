package solutions.epictech.www.myapplication;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class GameActivity extends Activity {
    TDView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get a display objectto detect the screen
        Display display = getWindowManager().getDefaultDisplay();
        //Load resolution into Point Object
        Point size= new Point();
        display.getSize(size);
        gameView = new TDView(this,size.x,size.y);
        setContentView(gameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }


    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }
}
