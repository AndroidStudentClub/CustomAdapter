package com.example.mikhail.viewholder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivityFragment extends android.support.v4.app.Fragment{

    private static final String TITLE = "Some Title ";
    private static final String DESCRIPTION= "Some description ";
    private SimpleAdapter simpleAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);


        // Just uncommetn this if you want use adapter with strings
        // Если нужно использовать просто строки (в ListView), то расскоментируй след. 3 строки
        //final String[] items= new String[] { "Item 1", "Item 2", "Item 3" };
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        //listView.setAdapter(adapter);


        // Create List of ItemInfo
        // Создаем список объектов типа ItemInfo
        List<ItemInfo> values = new ArrayList<ItemInfo>();

        // Just fill this list
        // Наполняем список 5 элементами
        for (int i = 0; i < 5; i++){
            ItemInfo singleItem = new ItemInfo(TITLE + i, DESCRIPTION + i);
            values.add(singleItem);
            }

        simpleAdapter = new SimpleAdapter(this.getActivity(),values);
        listView.setAdapter(simpleAdapter);

        return rootView;
    }
}
