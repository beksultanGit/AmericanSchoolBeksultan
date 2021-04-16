package kg.chinodev.americanschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout servicesLanguage;
    private ConstraintLayout servicesCamp;
    private ConstraintLayout servicesTalkingClub;
    private ConstraintLayout servicesToefl;
    private TextView callBtn;
    private ConstraintLayout banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        servicesLanguage = findViewById(R.id.services_language);
        servicesCamp = findViewById(R.id.services_camp);
        servicesTalkingClub = findViewById((R.id.services_talkingclub));
        servicesToefl = findViewById(R.id.services_toefl);
        callBtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://google.com";
                Uri myUri = Uri.parse(link);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(myIntent);

            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+996505315535";
                Uri myUri = Uri.parse("tel:" + number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);

            }
        });

        servicesLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.services_language,
                        R.drawable.image_1,
                        R.string.services_language_descr
                );
            }
        });

        servicesCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        servicesTalkingClub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        servicesToefl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    private void startInfoActivity(int titleRes,int  imageRes, int descrRes) {
        Intent myIntent = new Intent(this,InfoActivity.class);
        myIntent.putExtra("title",titleRes);
        myIntent.putExtra("image",titleRes);
        myIntent.putExtra("descr",titleRes);
        startActivity(myIntent);
    }



}