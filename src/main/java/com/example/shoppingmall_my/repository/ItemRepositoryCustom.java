package com.example.shoppingmall_my.repository;

import com.example.shoppingmall_my.Dto.ItemSearchDto;

import com.example.shoppingmall_my.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {
    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);
}
