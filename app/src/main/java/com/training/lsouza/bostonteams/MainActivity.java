package com.training.lsouza.bostonteams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Team> mListTeams;
    ListView mListView_teams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mListTeams = new ArrayList<>();
        mListTeams.add(new Team(Team.CELTICS, "Basketball", "Celtics", "NBA", "Rajon Rondo"));
        mListTeams.add(new Team(Team.BRUINS, "Hockey", "Bruins", "NHL", "Zdeno Chara"));
        mListTeams.add(new Team(Team.SOX, "Baseball", "Red Sox", "MLB", "Jason Varitek"));
        mListTeams.add(new Team(Team.PATS, "Foootball", "NE Patriots", "NFL", "Tom Brady <3"));
        mListTeams.add(new Team(Team.REV, "Soccer", "NE Revolution", "MLS", "Jose Goncalves"));

        mListView_teams = (ListView) findViewById(R.id.listView_teams);

        mListView_teams.setAdapter(new TeamAdapter(this, mListTeams));

        mListView_teams.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent iint = new Intent(MainActivity.this, DetailsActivity.class);
                iint.putExtra("team", mListTeams.get(position));
                startActivity(iint);

            }
        });


    }


}
