package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

public class Grid_Item_MoiDay extends AppCompatActivity {
    TextView name,name1;
    ImageView img;

    GridView gridView;
    String[] fruitName = {"Cơm văn phòng","Nhà hàng lẩu","SalaFoody","Lẩu Thái Lan"};
    String[] fruitDetail ={"Quán bán online thôi, phần cơm 30k khá là đầy đặn luôn","Nhà hàng lẩu & nướng là có những món ngon tuyệt vời","Không khí quá vui có phòng riêng nên chúng mình có thể vừa thưởng thức vừa hát hò","Cơm ở đây khá được phần 30k khá rẻ"};
    int[] fruitImage={R.drawable.comvanphong,R.drawable.nhahanglau,R.drawable.salafoody,R.drawable.lauthai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__item__moi_day);
        name = findViewById(R.id.tv_griditem_moiday);
        name1 = findViewById(R.id.tv_griditem_moiday1);

        img = findViewById(R.id.img_griditem_moiday);
        Intent intent = getIntent();
        name1.setText(intent.getStringExtra("name"));
        name.setText(intent.getStringExtra("name"));
        img.setImageResource(intent.getIntExtra("image",0));

        gridView = findViewById(R.id.gridview_diadiemlancan);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getApplicationContext(),Grid_Item_LanCan.class);
//                intent.putExtra("name",fruitName[position]);
//                intent.putExtra("detail",fruitDetail[position]);
//                intent.putExtra("image",fruitImage[position]);
//                startActivity(intent);
//            }
//        });

//        TextView txt_back = findViewById(R.id.back_detail_product);
//        txt_back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(Grid_Item_MoiDay.this,MainActivity.class);
//                startActivity(intent1);
//            }
//        });
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
            View view1 = getLayoutInflater().inflate(R.layout.row_data_lancan,null);
            TextView name = view1.findViewById(R.id.tv_item_lancan);
            TextView detail = view1.findViewById(R.id.tv_item_lancan_detail);
            ImageView image = view1.findViewById(R.id.img_item_lancan);

            name.setText(fruitName[position]);
            detail.setText(fruitDetail[position]);
            image.setImageResource(fruitImage[position]);
            return  view1;
        }
    }
}