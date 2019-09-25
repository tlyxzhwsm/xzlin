package com.xzlin.news.cashUtils;

import com.alibaba.fastjson.JSON;
import com.xzlin.news.dao.INewsDao;
import com.xzlin.news.dto.NewsDTO;
import com.xzlin.news.entity.News;
import org.springframework.stereotype.Service;
import utils.HttpClientUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class Cash163News {

    @Resource
    INewsDao newsDao;

    public List<NewsDTO> cashNews() {
        HttpClientUtils clientUtils = new HttpClientUtils();
        String res = clientUtils.doGet("" +
                "https://3g.163.com/touch/reconstruct/article/list/" +
                "BA8E6OEOwangning/1-20.html", "utf8");
        System.out.println(res);
        String json=res.substring(res.indexOf("{"),res.lastIndexOf(")"));
        System.out.println(json);
        String jsonlist=json.substring(json.indexOf("["),json.lastIndexOf("}"));
        List<NewsDTO> list= JSON.parseArray(jsonlist, NewsDTO.class);
        System.out.println("cash--"+newsDao);

        return list;

    }

}
