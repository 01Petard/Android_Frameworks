package com.ixuea.courses.helloworld.tabBar;

import com.ixuea.courses.helloworld.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsDAO {
    public ArrayList<News> getAllNews(){
        ArrayList<News> list = new ArrayList<>();
        News news = new News();
        SimpleDateFormat sf = new SimpleDateFormat("YY-MM-SS HH:mm:ss");
        Date date = new Date();
        for(int i=0;i<10;i++){
            list.add(new News("title","content","writer",sf.format(date),R.drawable.news_content128));
        }
        return list;
    }
}
