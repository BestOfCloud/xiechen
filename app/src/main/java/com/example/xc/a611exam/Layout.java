package com.example.xc.a611exam;

import android.content.Context;
import android.drm.DrmStore;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by XC on 2018/6/11.
 *
 *
 * */

public class Layout extends ListView {

    private ListView listView;
    List<String> list=new ArrayList<>();
    //    char things1[]={'A,'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public Layout(Context context) {
        super(context);
    }

    public Layout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


}


