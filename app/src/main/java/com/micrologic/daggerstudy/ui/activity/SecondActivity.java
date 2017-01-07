package com.micrologic.daggerstudy.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.micrologic.daggerstudy.MyApplication;
import com.micrologic.daggerstudy.R;
import com.micrologic.daggerstudy.data.Cloth;
import com.micrologic.daggerstudy.data.ClothHandler;
import com.micrologic.daggerstudy.di.ioc.BlueCloth;
import com.micrologic.daggerstudy.di.ioc.component.DaggerSecondComponent;
import com.micrologic.daggerstudy.di.ioc.component.SecondComponent;
import com.micrologic.daggerstudy.di.ioc.module.SecondModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @Inject
    ClothHandler mClothHandler;
    @Inject
    @BlueCloth
    Cloth cloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        SecondComponent secondComponent = DaggerSecondComponent.builder()
                .baseComponent(((MyApplication) getApplication()).getBaseComponent())
                .secondModule(new SecondModule())
                .build();
        secondComponent.inject(this);

        mTv.setText("蓝布料加工后变成了：" + mClothHandler.Handler(cloth) + "\nclothHandler地址:" + mClothHandler);

    }
}
