package com.example.foody.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.foody.R;

public class Recentview_Search_Nofication extends Fragment {
    ListView listView;
    String[] titles = {"Cơm Tấm Mộc - Phan Thanh","BBQ Hanatei - Buffet Nướng Nhật Bản","Hạnh - Bún Mắm & Bánh Tráng Đập","Say - Mỳ cay & Trà Sữa","Tea Rex Milk Tea & Coffee","Lẩu 1 Người", "Fmax Coffee - Trà Chanh"};
    String[] desc = {"8 Phan Thanh, Quận Thanh Khê, Đà Nẵng", "1 - 3 Đống Đa, P.Thuận Phước, Quận Hải Châu, Đà Nẵng", "45B Châu Thượng Văn, Quận Hải Châu, Đà Nẵng","70 Dũng Sĩ Thanh Khê, Quận Thanh Khê, Đà Nẵng","353 Điện Biên Phủ, Quận Thanh Khê, Đà Nẵng","183 Bế Văn Đàn, Quận Thanh Khê, Đà Nẵng","4 Phan Thanh, Quận Thanh Khê, Đà Nẵng"};
    String[] desc1 = {"Quán ăn","Nhà hàng","Quán ăn","Quán ăn","Ăn vặt","Quán ăn","Cafe"};
    String[] check = {"121","292","2","37","66","518","69"};
    String[] cmt = {"98","50","2","15","19","101","5"};
    String[] rate = {"8.7","8.0","8.5","8.6","7.1","7.5","7.4"};
    int[] img = {R.drawable.comtam,R.drawable.buffetnuong,R.drawable.bunmam,R.drawable.mycay,R.drawable.tearex,R.drawable.lau1nguoi,R.drawable.fmax};
    public Recentview_Search_Nofication() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recentview_search_nofication,container,false);
        listView = (ListView) view.findViewById(R.id.List_recentview);
        listView.setAdapter(new Recentview_Adapter(getActivity(),R.layout.rowlist_recentview_nofication,titles));
        return view;
    }
    class Recentview_Adapter extends ArrayAdapter{
        public Recentview_Adapter (Context context, int resource, String[] objects){
            super(context,resource,objects);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view =((Activity)getContext()).getLayoutInflater().inflate(R.layout.rowlist_recentview_nofication,null);
            TextView txt1 = (TextView) view.findViewById(R.id.tv1_view);
            txt1.setText(titles[position]);
            TextView txt2 = (TextView) view.findViewById(R.id.tv2_view);
            txt2.setText(desc[position]);
            TextView txt3 = (TextView) view.findViewById(R.id.tv3_view);
            txt3.setText((desc1[position]));
            TextView txt4 = (TextView) view.findViewById(R.id.tv4_view);
            txt4.setText(check[position]);
            TextView txt6 = (TextView) view.findViewById(R.id.tv6_view);
            txt6.setText(rate[position]);
            ImageView imgs = (ImageView) view.findViewById(R.id.anh_view);
            imgs.setBackgroundResource(img[position]);
            TextView txt5 = (TextView) view.findViewById(R.id.tv5_view);
            txt5.setText(cmt[position]);
            return view;
        }

    }
}
