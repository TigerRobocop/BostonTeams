package com.training.lsouza.bostonteams;

import android.content.Context;
import android.util.Log;
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
 */
public class TeamAdapter extends ArrayAdapter<Team> {

    public TeamAdapter(Context context, List<Team> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        //01 implement view - UPDATED
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.team_item, null);
            viewHolder = new ViewHolder();
            viewHolder.imgLogo = (ImageView) convertView.findViewById(R.id.img_logo);
            viewHolder.txtSport = (TextView) convertView.findViewById(R.id.textView_sport);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.textView_teamName);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //02 get item at position
        Team team = getItem(position);

        //03 setup data into layout
        if (team != null) {
            viewHolder.imgLogo.setImageResource(Util.getLogo(team.teamID));
            viewHolder.txtSport.setText(team.sport);
            viewHolder.txtName.setText(team.name);
        }

        //04 return view
        return convertView;
    }
}

class ViewHolder {
    ImageView imgLogo;
    TextView txtSport;
    TextView txtName;
}
