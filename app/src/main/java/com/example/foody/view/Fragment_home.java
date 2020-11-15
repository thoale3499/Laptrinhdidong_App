package com.example.foody.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;

import com.example.foody.adapter.ImageAdapter;
import com.example.foody.view.Grid_Item_MoiDay;

public class Fragment_home extends Fragment {
    GridView gridView;
    String[] fruitName = {"Cơm văn phòng","Nhà hàng lẩu","Sala Foody","Lẩu Thái Lan"};
    String[] fruitDetail ={"Quán bán online thôi, phần cơm 30k khá là đầy đặn luôn","Nhà hàng lẩu & nướng là có những món ngon tuyệt vời","Không khí quá vui có phòng riêng nên chúng mình có thể vừa thưởng thức vừa hát hò","Cơm ở đây khá được phần 30k khá rẻ"};
    int[] fruitImage={R.drawable.comvanphong,R.drawable.nhahanglau,R.drawable.salafoody,R.drawable.lauthai};
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ViewPager viewPager = v.findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(getContext());
        viewPager.setAdapter(adapter);

        gridView = v.findViewById(R.id.gridview_moiday);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Grid_Item_MoiDay.class);
                intent.putExtra("name",fruitName[position]);
                intent.putExtra("detail",fruitDetail[position]);
                intent.putExtra("image",fruitImage[position]);
                startActivity(intent);
            }
        });

        return v;
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImage.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data_moiday,null);
            TextView name = view1.findViewById(R.id.tv_item_moiday);
            TextView detail = view1.findViewById(R.id.tv_item_moiday_detail);
            ImageView image = view1.findViewById(R.id.img_item_moiday);

            name.setText(fruitName[position]);
            detail.setText(fruitDetail[position]);
            image.setImageResource(fruitImage[position]);
            return  view1;
        }
    }
}