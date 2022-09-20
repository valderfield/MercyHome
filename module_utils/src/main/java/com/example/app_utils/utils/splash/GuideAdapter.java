package com.example.app_utils.utils.splash;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Date 2022/9/20
 * @Edit
 * @describe
 * @From or To
 * @Mark
 */

public class GuideAdapter extends PagerAdapter {
    private Context context;
    private List<View> views = new ArrayList<>();

    public GuideAdapter(Context context, List<View> views) {
        this.context = context;
        this.views = views;
    }

    //加载viewpager的每个item
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(views.get(position),0);
        return views.get(position);
    }

    //删除ViewPager的item
    @Override
    public void destroyItem(ViewGroup container, int position, @NonNull Object object) {
        container.removeView(views.get(position));
    }
    // 获得当前界面数
    @Override
    public int getCount() {
        return views.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
