package com.example.mywork;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class weixinFragment extends Fragment {
    private Context context;
    private List<chat> mList = new ArrayList<chat>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public weixinFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static weixinFragment newInstance(String param1, String param2) {
        weixinFragment fragment = new weixinFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_weixin, container, false);
        context = (Activity) view.getContext();
        InitData();
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        myadapter adapter = new myadapter(context,mList);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(context,LinearLayoutManager.VERTICAL ));
        myadapter.setRecyclerItemClickListener(new myadapter.OnRecyclerItemClickListener() {


            @Override
            public void onRecyclerItemClick(int position) {
                Toast.makeText(getActivity(),"在线",Toast.LENGTH_LONG).show();
                if (position==0){
                    Intent intent=new Intent(getActivity(),Main2Activity.class);
                    startActivity(intent);}

            }
        });
        return view;
    }

    private void InitData() {
        for (int i = 0; i < 10; i++) {
            chat friend_1 = new chat(i, R.drawable.friend_1, "刘婧","我们一起出去玩吧");
            mList.add(friend_1);
            chat friend_2= new chat(i, R.drawable.friend_2, "高妍","你想去看电影吗");
            mList.add(friend_2);
            chat friend_3 = new chat(i, R.drawable.friend_3, "占明润","可好看了");
            mList.add(friend_3);
            chat friend_4 = new chat(i, R.drawable.friend_4, "陈飞宇","哈哈哈哈笑死了");
            mList.add(friend_4);
            chat friend_5 = new chat(i, R.drawable.friend_5, "徐洲","冲冲冲");
            mList.add(friend_5);
            chat friend_6 = new chat(i, R.drawable.friend_6, "黄林海","哎哟");
            mList.add(friend_6);
            chat friend_7 = new chat(i, R.drawable.friend_7, "胡凯","那就行");
            mList.add(friend_7);
            chat friend_8 = new chat(i, R.drawable.friend_8, "陈聪颖","去打球吧");
            mList.add(friend_8);
            chat friend_9 = new chat(i, R.drawable.friend_9, "余畅","我也觉得");
            mList.add(friend_9);
            chat friend_10 = new chat(i, R.drawable.friend_10, "余梦珂","莫？");
            mList.add(friend_10);
        }
    }


}
