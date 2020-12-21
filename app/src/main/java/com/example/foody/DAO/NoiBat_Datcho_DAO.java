package com.example.foody.DAO;

import com.example.foody.R;
import com.example.foody.model.DatNhieu_Datcho_Model;
import com.example.foody.model.Gantoi_Datcho_Model;
import com.example.foody.model.Moi_Datcho_Model;
import com.example.foody.model.NoiBat_Datcho_Model;
import com.example.foody.model.ThucAn;

import java.util.ArrayList;
import java.util.List;

public class NoiBat_Datcho_DAO {
    List<NoiBat_Datcho_Model> NoiBatList;
    List<DatNhieu_Datcho_Model> DatNhieuList;
    List<Moi_Datcho_Model> MoiList;
    List<Gantoi_Datcho_Model> GantoiList;

    public NoiBat_Datcho_DAO(){
        NoiBatList =new ArrayList<>();
        DatNhieuList = new ArrayList<>();
        MoiList = new ArrayList<>();
        GantoiList = new ArrayList<>();
    }

    public List<NoiBat_Datcho_Model> NoibatList(){
        NoiBatList.clear();
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.amthucthai_datcho,R.drawable.ic_chamdotron,"My Thái Restaurant - Ẩm Thực Thái","389 Trần Hưng Đạo,Q. Sơn Trà, Đà....",">4.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.danabuffet_datcho,R.drawable.ic_chamdotron,"Dana Buffet","56 Nguyễn Chí Thanh, Quận Hải Châu",">1.1km","Buffet/buffet","Cả ngày","Giảm 20% - 40%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.hotpot_datcho,R.drawable.ic_chamdotron,"Mama Hot Pot - Yên Bái","89 Yên Bái, Quận Hải Châu, Đà Nẵng",">2.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 15%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.daynday_datcho,R.drawable.ic_chamdotron,"Đầy N Day - Pizza & Hamburger","03 Hoàng Văn Thụ, Quận Hải Châu, ĐN",">2.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 20%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.dasushi_datcho,R.drawable.ic_chamdotron,"Dasushi - Ăn Nhậu Kiểu Nhật","266 Nguyễn Văn Linh, Quận Thanh....",">3.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.phonuongtokyo_datcho,R.drawable.ic_chamdotron,"Phố Nướng Tokyo","4 Phạm Văn Đồng, Quận Sơn Trà, ĐN",">2.8km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 5%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.coffeepub_datcho,R.drawable.ic_chamdotron,"420 Coffee And Pub","K3/12 Phan Thành Tài, Q.Hải Châu,Đ..",">3.4km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.winecorner_datcho,R.drawable.ic_chamdotron,"Wine Corner","124 Đường 2/9, Quận Hải Châu,Đà Nẵng",">3.3km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.nhahang1988_datcho,R.drawable.ic_chamdotron,"Nhà hàng 1988","195 - 197 Châu Thị Vĩnh Tế, Q.Ngũ...",">4.7km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Đặt Chỗ"));
        NoiBatList.add(new NoiBat_Datcho_Model(R.drawable.thucan1,R.drawable.ic_chamdotron,"Dana Bay Seafood","10 Võ Văn Kiệt, Q. Sơn Trà, Đà Nẵng",">3.3km","Buffet/buffet","Cả ngày","Giảm 5%"));
        return NoiBatList;
    }

    public List<DatNhieu_Datcho_Model> datnhieuList(){
        DatNhieuList.clear();
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.hotpot_datcho,R.drawable.ic_chamdotron,"Mama Hot Pot - Yên Bái","89 Yên Bái, Quận Hải Châu, Đà Nẵng",">2.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 15%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.amthucthai_datcho,R.drawable.ic_chamdotron,"My Thái Restaurant - Ẩm Thực Thái","389 Trần Hưng Đạo,Q. Sơn Trà, Đà....",">4.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.danabuffet_datcho,R.drawable.ic_chamdotron,"Dana Buffet","56 Nguyễn Chí Thanh, Quận Hải Châu",">1.1km","Buffet/buffet","Cả ngày","Giảm 20% - 40%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.daynday_datcho,R.drawable.ic_chamdotron,"Đầy N Day - Pizza & Hamburger","03 Hoàng Văn Thụ, Quận Hải Châu, ĐN",">2.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 20%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.dasushi_datcho,R.drawable.ic_chamdotron,"Dasushi - Ăn Nhậu Kiểu Nhật","266 Nguyễn Văn Linh, Quận Thanh....",">3.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.phonuongtokyo_datcho,R.drawable.ic_chamdotron,"Phố Nướng Tokyo","4 Phạm Văn Đồng, Quận Sơn Trà, ĐN",">2.8km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 5%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.coffeepub_datcho,R.drawable.ic_chamdotron,"420 Coffee And Pub","K3/12 Phan Thành Tài, Q.Hải Châu,Đ..",">3.4km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.winecorner_datcho,R.drawable.ic_chamdotron,"Wine Corner","124 Đường 2/9, Quận Hải Châu,Đà Nẵng",">3.3km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.nhahang1988_datcho,R.drawable.ic_chamdotron,"Nhà hàng 1988","195 - 197 Châu Thị Vĩnh Tế, Q.Ngũ...",">4.7km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Đặt Chỗ"));
        DatNhieuList.add(new DatNhieu_Datcho_Model(R.drawable.thucan1,R.drawable.ic_chamdotron,"Dana Bay Seafood","10 Võ Văn Kiệt, Q. Sơn Trà, Đà Nẵng",">3.3km","Buffet/buffet","Cả ngày","Giảm 5%"));
        return DatNhieuList;
    }

    public List<Moi_Datcho_Model> moiList(){
        MoiList.clear();
        MoiList.add(new Moi_Datcho_Model(R.drawable.nhahang1988_datcho,R.drawable.ic_chamdotron,"Nhà hàng 1988","195 - 197 Châu Thị Vĩnh Tế, Q.Ngũ...",">4.7km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Đặt Chỗ"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.amthucthai_datcho,R.drawable.ic_chamdotron,"My Thái Restaurant - Ẩm Thực Thái","389 Trần Hưng Đạo,Q. Sơn Trà, Đà....",">4.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.danabuffet_datcho,R.drawable.ic_chamdotron,"Dana Buffet","56 Nguyễn Chí Thanh, Quận Hải Châu",">1.1km","Buffet/buffet","Cả ngày","Giảm 20% - 40%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.hotpot_datcho,R.drawable.ic_chamdotron,"Mama Hot Pot - Yên Bái","89 Yên Bái, Quận Hải Châu, Đà Nẵng",">2.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 15%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.daynday_datcho,R.drawable.ic_chamdotron,"Đầy N Day - Pizza & Hamburger","03 Hoàng Văn Thụ, Quận Hải Châu, ĐN",">2.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 20%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.dasushi_datcho,R.drawable.ic_chamdotron,"Dasushi - Ăn Nhậu Kiểu Nhật","266 Nguyễn Văn Linh, Quận Thanh....",">3.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.phonuongtokyo_datcho,R.drawable.ic_chamdotron,"Phố Nướng Tokyo","4 Phạm Văn Đồng, Quận Sơn Trà, ĐN",">2.8km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 5%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.coffeepub_datcho,R.drawable.ic_chamdotron,"420 Coffee And Pub","K3/12 Phan Thành Tài, Q.Hải Châu,Đ..",">3.4km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.winecorner_datcho,R.drawable.ic_chamdotron,"Wine Corner","124 Đường 2/9, Quận Hải Châu,Đà Nẵng",">3.3km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        MoiList.add(new Moi_Datcho_Model(R.drawable.thucan1,R.drawable.ic_chamdotron,"Dana Bay Seafood","10 Võ Văn Kiệt, Q. Sơn Trà, Đà Nẵng",">3.3km","Buffet/buffet","Cả ngày","Giảm 5%"));
        return MoiList;
    }

    public List<Gantoi_Datcho_Model> gantoiList(){
        GantoiList.clear();
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.amthucthai_datcho,R.drawable.ic_chamdotron,"My Thái Restaurant - Ẩm Thực Thái","389 Trần Hưng Đạo,Q. Sơn Trà, Đà....",">4.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.danabuffet_datcho,R.drawable.ic_chamdotron,"Dana Buffet","56 Nguyễn Chí Thanh, Quận Hải Châu",">1.1km","Buffet/buffet","Cả ngày","Giảm 20% - 40%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.hotpot_datcho,R.drawable.ic_chamdotron,"Mama Hot Pot - Yên Bái","89 Yên Bái, Quận Hải Châu, Đà Nẵng",">2.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 15%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.daynday_datcho,R.drawable.ic_chamdotron,"Đầy N Day - Pizza & Hamburger","03 Hoàng Văn Thụ, Quận Hải Châu, ĐN",">2.4km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 20%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.dasushi_datcho,R.drawable.ic_chamdotron,"Dasushi - Ăn Nhậu Kiểu Nhật","266 Nguyễn Văn Linh, Quận Thanh....",">3.2km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.phonuongtokyo_datcho,R.drawable.ic_chamdotron,"Phố Nướng Tokyo","4 Phạm Văn Đồng, Quận Sơn Trà, ĐN",">2.8km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Giảm 5%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.coffeepub_datcho,R.drawable.ic_chamdotron,"420 Coffee And Pub","K3/12 Phan Thành Tài, Q.Hải Châu,Đ..",">3.4km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 10%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.winecorner_datcho,R.drawable.ic_chamdotron,"Wine Corner","124 Đường 2/9, Quận Hải Châu,Đà Nẵng",">3.3km","Bar/Pub/Gia đình/Nhóm hội","Cả ngày","Giảm 25%"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.nhahang1988_datcho,R.drawable.ic_chamdotron,"Nhà hàng 1988","195 - 197 Châu Thị Vĩnh Tế, Q.Ngũ...",">4.7km","Nhà hàng/Gia đình/Nhóm hội","Cả ngày","Đặt Chỗ"));
        GantoiList.add(new Gantoi_Datcho_Model(R.drawable.thucan1,R.drawable.ic_chamdotron,"Dana Bay Seafood","10 Võ Văn Kiệt, Q. Sơn Trà, Đà Nẵng",">3.3km","Buffet/buffet","Cả ngày","Giảm 5%"));
        return GantoiList;
    }

}
