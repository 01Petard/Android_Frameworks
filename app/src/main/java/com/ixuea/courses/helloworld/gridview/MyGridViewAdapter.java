package com.ixuea.courses.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ixuea.courses.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            convertView =  mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_grid);
            holder.textView = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //赋值
        holder.textView.setText("花");
        Glide.with(mContext).load("http://img4.imgtn.bdimg.com/it/u=2738531068,2088586606&fm=26&gp=0.jpg").into(holder.imageView);
        return convertView;
    }
}
