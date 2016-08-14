package com.example.angad.funfacts;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorBook {
    List<String>list=new ArrayList<>();
    private  String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#8b4513", //  bronze
            "#b7c0c7", // light gray
            "#ddca8b"  // gold
    };
    public int getColors(){

        String color;
        int colorAsInt;
        Random randomGenerator=new Random();
        color = mColors[randomGenerator.nextInt(mColors.length)];
        colorAsInt = Color.parseColor(color);
        if(list.isEmpty()) {
            list.add(color);
             colorAsInt= Color.parseColor(color);
            return colorAsInt;
        }
        if(list.size()<mColors.length) {
            while (list.contains(color)) {
                color = mColors[randomGenerator.nextInt(mColors.length)];
            }
            list.add(color);
            colorAsInt = Color.parseColor(color);
            return colorAsInt;
        }

        list.clear();
        list.add(color);
        return colorAsInt;
    }
}
