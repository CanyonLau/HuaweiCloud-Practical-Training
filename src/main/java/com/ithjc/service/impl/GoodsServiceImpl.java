package com.ithjc.service.impl;

import com.ithjc.mapper.GoodsMapper;
import com.ithjc.pojo.Goods;
import com.ithjc.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.getGoodsList();
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsMapper.addGoods(goods);
    }

    @Override
    public int deleteGoodsById(Integer id) {
        return goodsMapper.deleteGoodsById(id);
    }

    @Override
    public Goods findGoodsById(Integer id) {
        return goodsMapper.findGoodsById(id);
    }

    @Override
    public int updateGoodsById(Goods goods) {
        return goodsMapper.updateGoodsById(goods);
    }

}