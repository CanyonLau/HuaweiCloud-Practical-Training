package com.ithjc.mapper;

import com.ithjc.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsMapper {
    /**
     * 查询所有商品信息
     * @return
     */
    List<Goods> getGoodsList();

    /**
     * 添加商品信息
     * @param goods
     * @return
     */
    int addGoods(Goods goods);

    /**
     * 根据id删除商品信息
     * @param //id
     * @return
     */
    int deleteGoodsById(@Param("id") Integer id);

    /**
     * 根据id查询商品信息
     * @param //id
     * @return
     */
    Goods findGoodsById(@Param("id") Integer id);

    /**
     * 根据id修改商品信息
     * @param //id
     * @return
     */
    int updateGoodsById(Goods goods);
}

