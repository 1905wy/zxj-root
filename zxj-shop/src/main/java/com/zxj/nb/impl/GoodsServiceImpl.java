package com.zxj.nb.impl;


import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.pojo.GoodsPojo;
import com.zxj.nb.repository.GoodsRepository;
import com.zxj.nb.serivce.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {


    GoodsRepository goodsRepository;

    @Override
    public boolean insertGoods(GoodsEntity goodsEntity) {
        return false;
    }

    @Override
    public boolean deleteGoods(Integer gid) {
        try {
            goodsRepository.deleteById(gid);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    @Override
    public void updateGoods(GoodsEntity goodsEntity) {
        goodsRepository.save(goodsEntity);
    }

    @Override
    public List<GoodsEntity> queryGoodsList() {
        return goodsRepository.findAll();
    }

    @Override
    public GoodsEntity addGood(GoodsEntity goodsEntity) {
        return goodsRepository.save(goodsEntity);
    }

    @Override
    public List<GoodsEntity> findAll() {
        return goodsRepository.findAll();
    }



    @Override
    public GoodsPojo queryGoodsById(String gid) {
        return goodsRepository.findByGid(gid);
    }
}
