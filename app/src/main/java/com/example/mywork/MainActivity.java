package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Fragment weixinFragment=new weixinFragment();
    private Fragment friendFragment= new friendFragment();
    private Fragment contactFragment=new contactFragment();
    private Fragment configFragment=new configFragment();

    private FragmentManager fragmentManager;
    private LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;
    private ImageView imageView1,imageView2,imageView3,imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        linearLayout1=findViewById(R.id.LinearLayout_weixin);
        linearLayout2=findViewById(R.id.LinearLayout_friend);
        linearLayout3=findViewById(R.id.LinearLayout_contact);
        linearLayout4=findViewById(R.id.LinearLayout_config);

        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);

        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);

        initFragment();
        showfragment(0);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);

    }

    private void initFragment(){
        fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.id_content,weixinFragment);
        transaction.add(R.id.id_content,friendFragment);
        transaction.add(R.id.id_content,contactFragment);
        transaction.add(R.id.id_content,configFragment);
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction  transaction){
        transaction.hide(weixinFragment);
        transaction.hide(friendFragment);
        transaction.hide(contactFragment);
        transaction.hide(configFragment);

    }

    @Override
    public void onClick(View v) {
        setSelect();
        switch(v.getId()) {
            case R.id.imageView1:
                showfragment(0);
                break;
            case R.id.imageView2:
                showfragment(1);
                break;
            case R.id.imageView3:
                showfragment(2);
                break;
            case R.id.imageView4:
                showfragment(3);
                break;
            default:
                break;
        }
    }

    private void  setSelect() {
        imageView1.setImageResource(R.drawable.weixin_b);
        imageView2.setImageResource(R.drawable.friend_b);
        imageView3.setImageResource(R.drawable.contact_b);
        imageView4.setImageResource(R.drawable.config_b);

    }

    private void showfragment(int i){
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case 0:
                transaction.show(weixinFragment);
                imageView1.setImageResource(R.drawable.weixin_a);
                break;
            case 1:
                transaction.show(friendFragment);
                imageView2.setImageResource(R.drawable.friend_a);
                break;
            case 2:
                transaction.show(contactFragment);
                imageView3.setImageResource(R.drawable.contact_a);
                break;
            case 3:
                transaction.show(configFragment);
                imageView4.setImageResource(R.drawable.config_a);
                break;
            default:
                break;
        }
        transaction.commit();
    }
}
