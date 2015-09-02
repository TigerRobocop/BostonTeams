package com.training.lsouza.bostonteams;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Team team = (Team)getIntent().getSerializableExtra("team");
        ImageView img = (ImageView)findViewById(R.id.imageView_logo);
        TextView txtSport = (TextView)findViewById(R.id.textView_sport);
        TextView txtName = (TextView)findViewById(R.id.textView_name);

        img.setImageResource(Util.getLogo(team.teamID));
        txtSport.setText(team.sport);
        txtName.setText(team.name);
    }


}
