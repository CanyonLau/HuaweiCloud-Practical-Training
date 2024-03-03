package com.ithjc.controller;

import com.ithjc.pojo.Goods;
import com.ithjc.service.GoodsService;
import com.ithjc.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 19407
 */
@RestController
@RequestMapping
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getAll")
    //@ResponseBody
    public R getAll() {
        List<Goods> goodsList = goodsService.getGoodsList();
        return R.ok().data("goodsList", goodsList);
    }

    @RequestMapping("/addGoods")
    //@ResponseBody
    public R addGoods(Goods goods) {
        int i = goodsService.addGoods(goods);
        return R.ok().data("addGoods", i);
    }

    @RequestMapping("/deleteGoods")
    //@ResponseBody
    public R deleteGoodsById(@RequestParam("id") Integer id) {
        int i = goodsService.deleteGoodsById(id);
        return R.ok().data("deleteGoods", i);
    }

    @RequestMapping("/getGoods")
    //@ResponseBody
    public R getGoodsById(@RequestParam("id") Integer id) {
        Goods goods = goodsService.findGoodsById(id);
        return R.ok().data("goods", goods);
    }

     @RequestMapping("/updateGoods")
    //@ResponseBody
    public R updateGoodsById(Goods goods) {
        int i = goodsService.updateGoodsById(goods);
        return R.ok().data("updateGoods", i);
    }

}

