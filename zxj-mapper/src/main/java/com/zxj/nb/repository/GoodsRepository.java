package com.zxj.nb.repository;


import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.pojo.GoodsPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository extends JpaRepository<GoodsEntity, Integer> {


    public GoodsEntity findByGname(String name);

    public GoodsEntity findByGnameAndGprice(String name, float price);
    public GoodsPojo findByGid(String id);
}
