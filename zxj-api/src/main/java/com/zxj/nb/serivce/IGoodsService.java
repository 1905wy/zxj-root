package com.zxj.nb.serivce;



import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.pojo.GoodsPojo;

import java.util.List;

public interface IGoodsService {

    //增加商品
    public boolean insertGoods(GoodsEntity goodsEntity);

    //删除商品
    public boolean deleteGoods(Integer gid);

    //修改商品
    public void updateGoods(GoodsEntity goodsEntity);

    //查询
    public List<GoodsEntity> queryGoodsList();


    public GoodsEntity addGood(GoodsEntity goodsEntity);

    public List<GoodsEntity> findAll();
    public GoodsPojo queryGoodsById(String gid);
}
