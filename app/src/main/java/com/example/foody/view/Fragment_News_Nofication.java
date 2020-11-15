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

public class Fragment_News_Nofication extends Fragment {
    ListView lv;
    String[] title = {"[DN] Món Ngon Yêu Thích chỉ 25k","[DN] Rộn ràng Combo Starbucks chỉ 100k","[DN] Cuối tuần tiệc to MUA 1 TẶNG 1","[DN] [Now Table] Ưu đãi 30% - Quán ngon view đẹp, [DN] Lai rai quà vặt chỉ 15K","[DN] Siêu hội NowFood món chỉ 10K, 20K, 30K","[DN] Chiếc Deal Yêu Chiều chỉ từ 5K","[DN] Thứ 4 - Ăn ngon chỉ nửa giá","[DN] Nàng mở tiệc 20K"};
    String[] desc = {"Đầu tuần đón món yêu chỉ từ 25K nè. Món no cho bữa chính, món nhẹ cho bữa xế với quá trời lựa chọn cho thời tiết se lạnh như hôm nay. Ưu đãi giảm món nhiều lắm nha, ghé chọn liền tay!","Chớp ngay cơ hội chanh sả để rinh về những ly cà phê thượng hạng mà giá thì không đáng lo tẹo nào. Ưu đãi giá shock cho combo 2 ly Coffee Frappuccino và Vanilla Cream Frappuccino giá chỉ 100K, ngại gì không đặt nào!!","Cuối tuần tha hồ xả hơi, gọi ngay món ngon kèm ưu đãi MUA 1 TẶNG 1 hoặc x2 topping nè! Đủ món cho cả ngày, thả ga lựa chọn phần ngon nha!","Lọt Top-Trending Sài Gòn các quán đã ngon lại có view cực chất như Lẩu Tứ Xuyên, Sky View, Gang Yu,... Check ngay ưu đãi khủng khi đặt chỗ trước qua NowTable nhé.","Quà vặt xế chiều giá bao ví chỉ từ 15k thôi đó. Bánh ngọt, trà sữa, nem rán, chè khoai dẻo hay bánh mỳ cay... cái gì cũng có mà lại còn rẻ. Now ngay!","Cùng Now ăn 1001 món giảm sập sàn chỉ còn 10k, 20k, 30k. Ngày cuối để săn siêu hội NowFood, mở tiệc ngay!","Siêu hội NowFood luôn ngập tràn deal hot với các món chỉ từ 20k, Aroi, House Of Cha, Phúc Drink, Pizza 4H,... và hơn 50+ quán tham gia bộ sưu tập này. Ghé Now ngay!","Chỉ từ 5k bao la các món ngon quán hot, lại còn chiều lòng Nower với chiếc deal xịn xò có 1 không 2. Nhập mã YEUCHIEU để được giảm 20k cho đơn từ 25k. Now sẵn sàng giao, săn deal thôi nào.","Trả lời cho câu nói ăn gì cũng được với loạt món ăn giảm giá với mã NUAGIA. Giảm 50% tối đa 20k đơn từ 40k, áp dụng duy nhất ngày 21/10 cho bộ sưu tập này nha","Tặng bạn mã DEALCHIEU GIẢM 20k khi thanh toán qua AirPay. Tự tin mở tiệc ăn thỏa thích món ngon không lo về giá nha. Đặt Now thôi!"};
    String[] desc1 = {"22h","2d","2d","3d","3d","4d","4d","4d","5d","6d"};
    int[] img = {R.drawable.doan25k,R.drawable.combostarbuck,R.drawable.now1,R.drawable.now1, R.drawable.combo15k,R.drawable.combo,R.drawable.combo20k,R.drawable.now1,R.drawable.combogiam50,R.drawable.combo20k};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news_nofication,container,false);
        lv = (ListView) view.findViewById(R.id.List);
        lv.setAdapter(new News_Adapter(getActivity(),R.layout.rowlist_news_nofication,title));
        return view;
    }

    class News_Adapter extends ArrayAdapter{
        public News_Adapter (Context context, int resource, String[] objects){
            super(context,resource,objects);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view =((Activity)getContext()).getLayoutInflater().inflate(R.layout.rowlist_news_nofication,null);
            TextView txt1 = (TextView) view.findViewById(R.id.tv1);
            txt1.setText(title[position]);
            TextView txt2 = (TextView) view.findViewById(R.id.tv2);
            txt2.setText(desc[position]);
            TextView txt3 = (TextView) view.findViewById(R.id.tv3);
            txt3.setText((desc1[position]));
            ImageView imgs = (ImageView) view.findViewById(R.id.anh);
            imgs.setBackgroundResource(img[position]);
            return view;
        }
    }
}
