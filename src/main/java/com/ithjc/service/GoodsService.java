package com.ithjc.service;

import com.ithjc.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsList();
    int addGoods(Goods goods);
    int deleteGoodsById(Integer id);
    Goods findGoodsById(Integer id);
    int updateGoodsById(Goods goods);
}

