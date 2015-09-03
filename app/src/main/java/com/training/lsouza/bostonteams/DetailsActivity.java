package com.training.lsouza.bostonteams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Team team = (Team)getIntent().getSerializableExtra("team");
        ImageView img = (ImageView)findViewById(R.id.imageView_logo);
        TextView txtSport = (TextView)findViewById(R.id.textView_sport);
        TextView txtName = (TextView)findViewById(R.id.textView_name);
        TextView txtLeague = (TextView)findViewById(R.id.textView_lblLeague);
        TextView txtCaptain = (TextView)findViewById(R.id.textView_lblCaptain);

        img.setImageResource(Util.getLogo(team.teamID));
        txtSport.setText(team.sport);
        txtName.setText(team.name);
        txtLeague.setText(txtLeague.getText().toString() + ": " + team.league);
        txtCaptain.setText(txtCaptain.getText().toString() + ": " + team.captain);

    }


}
