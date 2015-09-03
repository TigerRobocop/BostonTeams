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
        mListTeams.add(new Team(Team.CELTICS, R.string.sport_basketballl, "Celtics", "NBA", "Rajon Rondo"));
        mListTeams.add(new Team(Team.BRUINS, R.string.sport_hockey, "Bruins", "NHL", "Zdeno Chara"));
        mListTeams.add(new Team(Team.SOX, R.string.sport_baseball, "Red Sox", "MLB", "Jason Varitek"));
        mListTeams.add(new Team(Team.PATS, R.string.sport_football, "NE Patriots", "NFL", "Tom Brady <3"));
        mListTeams.add(new Team(Team.REV, R.string.sport_soccer, "NE Revolution", "MLS", "Jose Goncalves"));

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
