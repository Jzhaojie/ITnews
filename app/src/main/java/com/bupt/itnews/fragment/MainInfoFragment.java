package com.bupt.itnews.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;


import com.bupt.itnews.R;
import com.bupt.itnews.adapter.FixedPagerAdapter;
import com.bupt.itnews.common.DefineView;
import com.bupt.itnews.entity.CategoriesBean;
import com.bupt.itnews.fragment.Base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhaoJie1234 on 2016/9/8.
 */
public class MainInfoFragment extends BaseFragment implements DefineView,ViewPager.OnPageChangeListener {
    private View mView;
    private TabLayout tab_layout;
    private ViewPager info_viewpager;
    private FixedPagerAdapter fixedPagerAdapter;
    private List<BaseFragment> fragments;
    private String[] titles = new String[]{"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","时尚"};

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        if(mView==null){
            mView=inflater.inflate(R.layout.main_info_fragment_layout,container,false);
            initView();
            initValidata();
            initListener();
            bindData();
        }
        return mView;
    }
    @Override
    public void initView() {
        tab_layout=(TabLayout)mView.findViewById(R.id.tab_layout);
        info_viewpager =(ViewPager)mView.findViewById(R.id.info_viewpager);

    }

    @Override
    public void initValidata() {
        fixedPagerAdapter = new FixedPagerAdapter(getChildFragmentManager());
        fixedPagerAdapter.setTitles(titles);
        fragments = new ArrayList<BaseFragment>();
        for(int i=0;i<titles.length;i++){
            fragments.add(PageFragment.newInstance(titles[i]));
        }
        fixedPagerAdapter.setFragments(fragments);
        tab_layout.setTabMode(TabLayout.MODE_SCROLLABLE);
        info_viewpager.setAdapter(fixedPagerAdapter);
        tab_layout.setupWithViewPager(info_viewpager);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void bindData() {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
