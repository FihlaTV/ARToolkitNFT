package org.artoolkit.ar.samples.nftSimple;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MarkerDetailActivity extends AppCompatActivity {

    private final static String EXTRA_ID = "id";

    private int id;
    private TextView textView;
    private ImageView imageView;

    public static Intent newIntent(Context context, int id){
        Intent i = new Intent(context,MarkerDetailActivity.class);
        i.putExtra(EXTRA_ID,id);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marker_detail);
        textView = findViewById(R.id.found_marker);
        imageView = findViewById(R.id.imageView);
        id = getIntent().getIntExtra(EXTRA_ID,0);
        switch (id){
            case 0:
                textView.setText(getString(R.string.marker_found,"National Museum"));
                imageView.setImageResource(R.drawable.national_museum_of_anthropolog);
                break;
            case 1:
                textView.setText(getString(R.string.marker_found,"Pinball"));
                imageView.setImageResource(R.drawable.pinball);
                break;
            case 2:
                textView.setText(getString(R.string.marker_found,"Desk"));
                imageView.setImageResource(R.drawable.desk);
                break;
            case 3:
                textView.setText(getString(R.string.marker_found,"Donald"));
                imageView.setImageResource(R.drawable.donald);
                break;
            case 4:
                textView.setText(getString(R.string.marker_found,"Obama"));
                imageView.setImageResource(R.drawable.obama);
                break;
        }
    }
}
