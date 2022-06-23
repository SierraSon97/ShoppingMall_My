package com.example.shoppingmall_my.Dto;

import com.example.shoppingmall_my.constant.ItemSellStatus;
import lombok.Data;

@Data
public class ItemSearchDto {
    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";
}
