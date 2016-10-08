package com.bupt.itnews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.bupt.itnews.R;
import com.bupt.itnews.common.DefineView;
import com.bupt.itnews.fragment.Base.BaseFragment;

/**
 * Created by ZhaoJie1234 on 2016/10/6.
 */
public class PageFragment extends BaseFragment implements DefineView {
    private static final String KEY = "EXTRA";
    private View mView;
    public static  PageFragment newInstance(String extra){
        Bundle bundle = new Bundle();
        bundle.putString(KEY,extra);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initView() {


    }

    @Override
    public void initValidata() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void bindData() {

    }
}
