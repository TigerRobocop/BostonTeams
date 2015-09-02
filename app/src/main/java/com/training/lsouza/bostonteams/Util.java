package com.training.lsouza.bostonteams;

import com.training.lsouza.bostonteams.R;

/**
 * Created by Livia on 01/09/2015.
 */
public class Util {

    public static int getLogo(int teamID){

        int[] logos = new int[]{
                R.drawable.celtics,
                R.drawable.bruins,
                R.drawable.redsox,
                R.drawable.patriots,
                R.drawable.revolution
        };

        return logos[teamID];
    }
}
