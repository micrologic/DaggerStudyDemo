package com.micrologic.daggerstudy.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.micrologic.daggerstudy.MyApplication;
import com.micrologic.daggerstudy.data.ClothHandler;
import com.micrologic.daggerstudy.di.ioc.BlueCloth;
import com.micrologic.daggerstudy.data.Cloth;
import com.micrologic.daggerstudy.data.Clothes;
import com.micrologic.daggerstudy.R;
import com.micrologic.daggerstudy.data.Shoe;
import com.micrologic.daggerstudy.di.ioc.component.DaggerMainComponent;
import com.micrologic.daggerstudy.di.ioc.component.MainComponent;
import com.micrologic.daggerstudy.di.ioc.module.MainModule;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv)
    TextView mTv1;
    @BindView(R.id.tv2)
    TextView mTv2;
    @BindView(R.id.tv3)
    TextView mTv3;
    @BindView(R.id.tv4)
    TextView mTv4;


    @Inject
    Cloth cloth;
    @Inject
    Shoe shoe;
    @Inject
    Clothes clothes;

    @Inject
    @BlueCloth
    Cloth blueCloth;
    @Inject
    @Named("black")
    Cloth blackCloth;

    @Inject
    ClothHandler mClothHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        MainComponent build = DaggerMainComponent.builder()
                .baseComponent(((MyApplication) getApplication()).getBaseComponent())
                .mainModule(new MainModule())
                .build();
        build.inject(this);
        mTv1.setText("我现在有：" + cloth + "和" + shoe + "和" + clothes + "和" + blueCloth + "和" + blackCloth);
        mTv2.setText("clothes.getCloth() = redCloth 的吗？" + (clothes.getCloth() == blackCloth));
        mTv3.setText("红布料加工后变成了：" + mClothHandler.Handler(cloth) + "\nclothHandler地址:" + mClothHandler);

    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void SignIn(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(this, SubActivity.class);
                startActivity(intent2);
                break;
        }

    }
}
