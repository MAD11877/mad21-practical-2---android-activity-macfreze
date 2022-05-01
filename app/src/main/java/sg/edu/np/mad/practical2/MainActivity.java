package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button followButton;
    boolean followed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        followButton = (Button) findViewById(R.id.followButton);
        followButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (followed){
                    followButton.setText("Follow");
                    followed = false;
                }
                else {
                    followButton.setText("Followed");
                    followed = true;
                }

            }
        });

//        public void follow(View view){
//            TextView txt = findViewById(R.id.followButton);

//        }

    }


}


