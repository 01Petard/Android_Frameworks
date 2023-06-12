package com.ixuea.courses.helloworld.tabBar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ixuea.courses.helloworld.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    private ArrayList<News> mNewsList;
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        ImageView im_img;
        TextView tv_writer;
        TextView tv_time;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.news_title);
            im_img = itemView.findViewById(R.id.news_img);
            tv_writer = itemView.findViewById(R.id.news_writer);
            tv_time = itemView.findViewById(R.id.news_time);
        }
    }

    public NewsAdapter(ArrayList<News> newsList){
        mNewsList = newsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_news_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        News news = mNewsList.get(position);
        holder.tv_title.setText(news.getTitle());
        holder.im_img.setImageResource(news.getImg());
        holder.tv_writer.setText(news.getWriter());
        holder.tv_time.setText(news.getTime());
    }



    @Override
    public int getItemCount() {
        return mNewsList.size();
    }
}
