package ca.georgebrown.comp3074.trymecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors =new int[]{Color.CYAN,Color.BLUE,Color.YELLOW,Color.GREEN};
        windowView=findViewById(R.id.windowViewId);
        //windowView.setBackgroundColor();

        tryMeButton=(Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLenght=colors.length;
                Random random=new Random();
                int randomNum=random.nextInt(colorArrayLenght);
                windowView.setBackgroundColor(colors[randomNum]);
                //Log.d("TEST","Tap");

            }
        });




    }
}