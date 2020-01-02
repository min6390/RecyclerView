package com.example.recyclerview2row

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val madapter1 = AdapterRecyclerView1(arr1)
        val madapter2 = AdapterRecyclerView2(arr2)
        recyclerView1.adapter = madapter1
        recyclerView2.adapter = madapter2

    }
    private var arr1 : Array<data> = arrayOf(
        data(R.drawable.lava,"Lava Coffee - Quang Trung",
            "61 Quang Trung, P. 10, Gò Vấp, TP. HCM","Giảm trực tiếp 20% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"),
        data(R.drawable.banhhue,"Bánh Huế Thu Thảo - Shop Online","36/2A Hoàng Xuân Nhị, P. Phú Trung, Tân Phú, TP. HCM",
            "Giảm trực tiếp 20% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"),
        data(R.drawable.chilltea,"Chill Tea - Thống Nhất","63 Thống Nhất, P. Bình Thọ, Thủ Đức, TP. HCM",
            "Giảm trực tiếp 10% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"),
        data(R.drawable.traicay,"Funfarm - Trái Cây Tô & Nước Ép","25/1 Giải Phóng, P. 4, Tân Bình, TP. HCM",
            "Giảm trực tiếp 50% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn"),
        data(R.drawable.viva,"Viva Star Coffee - Hoàng Hoa Thám","45 Hoàng Hoa Thám, P. 13, Tân Bình, TP. HCM",
            "Giảm trực tiếp 30% trên giá món. Nhập mã ưu đãi để được giảm nhiều hơn")
    )

    private  var arr2 : Array<data> = arrayOf(
        data(R.drawable.bao,"Bao Bei - Chinese Restaurant", "Tầng 2 Viettel Tower, 285 Cách Mạng Tháng 8, P. 12, Quận 10",
            "Cả ngày - Giảm 10% tổng hóa đơn khi đặt chỗ qua TableNow"),
        data(R.drawable.crab,"The Crab Shack - Nhà Hàng Hải Sản - Phú Mỹ Hưng","SB8 - 1, Mỹ Khánh 2, Nguyễn Đức Cảnh, Quận 7",
            "Cả ngày - Giảm 5% tổng hóa đơn khi đặt chỗ qua TableNow"),
        data(R.drawable.pachi,"Pachi Pachi - Thịt Nướng Nhật Bản","52 Mạc Đĩnh Chi, P. Đakao, Quận 1",
            "Cả ngày - Đặt bàn để đảm bảo chỗ đến"),
        data(R.drawable.pasta,"Pastamania - Nhà Hàng Ý - Vạn Hạnh Mall","Tầng 6 GH 6-17 Vạn Hạnh Mall, 11 Sư Vạn Hạnh, P. 12, Quận 10",
            "Giảm 20% tổng hóa đơn khi đặt chỗ qua TableNow"),
        data(R.drawable.spice,"Spice Temple - Nhà Hàng Thái Lan","81 Mạc Thị Bưởi, P. Bến Nghé, Quận 1",
            "Cả ngày - Giảm 10% tổng hóa đơn khi đặt chỗ qua TableNow")
    )

}

