package com.spring_boot.onlab_03.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum City {
    AllCity("All cities"),
    HaNoi("Ha Noi"),
    HoChiMinh("Ho Chi Minh"),
    HaiPhong("Hai Phong"),
    DaNang("Da Nang"),
    Others("Others");

    public final String label;
}
