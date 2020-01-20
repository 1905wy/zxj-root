package com.zxj.nb.web;

import com.zxj.nb.entity.GoodsEntity;
import com.zxj.nb.entity.GoodsTypeEntity;
import com.zxj.nb.pojo.CustomerPojo;
import com.zxj.nb.serivce.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    IIndexService indexService;

    @RequestMapping("index")
    public String index(Model model){

        //查询商品类别列表 只查询了3个类别
        List<GoodsTypeEntity> list = indexService.queryGoodsTypes();
        model.addAttribute("goodsTypeList",list);
        return "index";
    }



}
