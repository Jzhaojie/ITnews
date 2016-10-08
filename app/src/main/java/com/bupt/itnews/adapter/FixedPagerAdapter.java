package com.bupt.itnews.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import com.bupt.itnews.entity.CategoriesBean;
import com.bupt.itnews.fragment.Base.BaseFragment;

import java.util.List;

/**
 * Created by ZhaoJie1234 on 2016/9/8.
 */
public class FixedPagerAdapter extends FragmentStatePagerAdapter {
    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    //    private List<CategoriesBean> categoriesBeans;
//    public void setCategoriesBeans(List<CategoriesBean> categoriesBeans){
//        this.categoriesBeans = categoriesBeans;
//    }
    private String[] titles;
    public List<BaseFragment> fragments;
    public void setFragments(List<BaseFragment> fragments){
        this.fragments = fragments;
    }
    public FixedPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       Fragment fragment = null;
        try{
            fragment =(Fragment)super.instantiateItem(container,position);
        }catch (Exception e){

        }
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
  @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
