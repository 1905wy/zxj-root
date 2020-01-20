package com.zxj.nb.impl;

import com.github.pagehelper.PageHelper;
import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.entity.GoodsTypeEntity;
import com.zxj.nb.mapper.GoodsTypeMapper;
import com.zxj.nb.pojo.GoodsPojo;
import com.zxj.nb.pojo.GoodsTypePojo;
import com.zxj.nb.repository.GoodsRepository;
import com.zxj.nb.serivce.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexServiceImpl implements IIndexService {

    GoodsTypeMapper goodsTypeMapper;



    @Override
    public List<GoodsTypeEntity> queryGoodsTypes() {

        List<GoodsTypePojo> goodsTypePojos = goodsTypeMapper.queryGoodsTypeThree();
        return pojoListToEntityList(goodsTypePojos);
    }

    /**
     * 将pojo转成entity list
     * @param goodsTypePojos
     * @return
     */
    private List<GoodsTypeEntity> pojoListToEntityList(List<GoodsTypePojo> goodsTypePojos){
        List<GoodsTypeEntity> list = new ArrayList<>();

        for(GoodsTypePojo pojo : goodsTypePojos){
            list.add(pojoToEntity(pojo));
        }

        return list;
    }

    /**
     * 将pojo转成entity
     * @param pojo
     * @return
     */
    private GoodsTypeEntity pojoToEntity(GoodsTypePojo pojo){
        GoodsTypeEntity entity = new GoodsTypeEntity();

        if(null != pojo){
            entity.setTid(pojo.getTid());
            entity.setTimage(pojo.getTimage());
            entity.setTname(pojo.getTname());
        }

        return entity;
    }

}
