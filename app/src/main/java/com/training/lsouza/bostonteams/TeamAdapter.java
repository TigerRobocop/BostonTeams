package com.training.lsouza.bostonteams;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.training.lsouza.bostonteams.R;
import com.training.lsouza.bostonteams.Team;

import java.util.List;

/**
 * Created by Livia on 01/09/2015.
 *
 *
 */
public class TeamAdapter extends ArrayAdapter<Team> {

    public TeamAdapter(Context context, List<Team> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //01 implement view
        View view = LayoutInflater.from(getContext()).inflate(R.layout.team_item, null);

        //02 get item at position
        Team team = getItem(position);

        //03 setup data into layout
        ImageView imgLogo = (ImageView)view.findViewById(R.id.img_logo);
        TextView txtSport = (TextView)view.findViewById(R.id.textView_sport);
        TextView txtName = (TextView)view.findViewById(R.id.textView_teamName);

        imgLogo.setImageResource(Util.getLogo(team.teamID));
        txtSport.setText(team.sport);
        txtName.setText(team.name);

        //04 return view
        return view;
    }


}
