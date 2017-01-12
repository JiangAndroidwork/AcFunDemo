package com.laojiang.acfundemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.laojiang.acfundemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 类介绍（必填）：
 * Created by Jiang on 2017/1/11 10:55.
 */

public class TuiJianFragment extends Fragment {
    @BindView(R.id.tv_page)
    TextView tvPage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_page, container, false);
        ButterKnife.bind(this, inflate);
        initView();
        return inflate;
    }

    private void initView() {
        tvPage.setText("推荐");
    }
}
