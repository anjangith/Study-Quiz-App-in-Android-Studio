package duiet.developer.anjan.learnc;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by HP on 30-08-2017.
 */

public class fragment_learn extends Fragment {

    private static final String TAG = "LEARN";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<listItem> listItem;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.learn, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        listItem=new ArrayList<>();
        listItem li=new listItem("BASICS OF C++","Learn all the basics of c++ like data types,variables,etc ");
        listItem operator=new listItem("OPERATORS","This tutorials covers all the operators that are being used in c++");
        listItem input=new listItem("INPUT AND OUTPUT","This tutorial covers how an user can input and fetch data in C++ ");
        listItem functions=new listItem("FUNCTIONS","Learn the basics of functions in C++");
        listItem friendFunction=new listItem("FRIEND FUNCTIONS","What are friend function in C++?");
        listItem pointers=new listItem("POINTERS","Learn how to create a pointer in C++ and how pointers works in c++");
        listItem arrays=new listItem("ARRAYS AND STRINGS","This tutorial covers how arrays and strings works in C++");
        listItem dma=new listItem("DYNAMIC MEMORY ALLOCATION","Learn how memory is allocated with the help of dynamic memory allocation in c++");
        listItem oop=new listItem("OBJECT ORIENTED PROGRAMMING","Learn the basics of object oriented programming with the help of C++");
        listItem overload=new listItem("FUNCTION OVERLOADING","What is function overloading in C++");
        listItem templates=new listItem("TEMPLATES","What are templates in C++");


            listItem.add(li);
            listItem.add(operator);
            listItem.add(input);
            listItem.add(pointers);
            listItem.add(functions);
            listItem.add(friendFunction);
            listItem.add(overload);
            listItem.add(arrays);
            listItem.add(dma);
            listItem.add(oop);
            listItem.add(templates);



        adapter=new myAdapter(listItem,getActivity());
        recyclerView.setAdapter(adapter);



        return view;


    }
}
