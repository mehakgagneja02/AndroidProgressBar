package edmt.dev.androidcircularseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.akaita.android.circularseekbar.CircularSeekBar;
import com.google.android.material.snackbar.Snackbar;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
CircularSeekBar seekBar,seekBar1;
    float a,a1;
    TextView txt,txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        txt1 = findViewById(R.id.txt1);
        int x = (int) a;
        int y = (int) a1;
        seekBar1 = findViewById(R.id.seekbar1);
        seekBar = findViewById(R.id.seekbar);
        seekBar.setProgressTextFormat(new DecimalFormat("###,###,##0") {});
        seekBar1.setProgressTextFormat(new DecimalFormat("###,###,##0"){});
        seekBar.setRingColor(Color.RED);
        seekBar1.setRingColor(Color.RED);

        seekBar.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {

            @Override
            public void onProgressChanged(CircularSeekBar seekBar, float progress, boolean fromUser) {
                a = progress;
                int x = (int) a;
                txt.setText("DATE : "+x);
                if(progress<3)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<6)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<9)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<12)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<15)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<18)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<21)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<24)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<27)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<31)
                    seekBar.setRingColor(Color.GREEN);

            }
            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });
        seekBar1.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {

            @Override
            public void onProgressChanged(CircularSeekBar seekBar, float progress, boolean fromUser) {
                a1 = progress;
                int y = (int) a1;
                txt1.setText("MONTH : "+y);
                if(progress<1)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<2)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<3)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<4)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<5)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<6)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<7)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<8)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<9)
                    seekBar.setRingColor(Color.GREEN);
                else if(progress<10)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<11)
                    seekBar.setRingColor(Color.YELLOW);
                else if(progress<12)
                    seekBar.setRingColor(Color.YELLOW);
            }
            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });

    }
}
