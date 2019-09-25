package com.xzlin.news.service;

import com.xzlin.news.cashUtils.Cash163News;
import com.xzlin.news.dao.INewsDao;
import com.xzlin.news.dto.NewsDTO;
import com.xzlin.news.entity.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class NewsService {
    @Resource
    INewsDao newsDao;

    public     List<News> dealNews(){
        List<News> newsList=  newsDao.showNews();
        for(News n:newsList){
         n.setFtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(n.getCtime()));
        }
        return newsList;
    }

    public void pushRemoteNewsToDB(){
        Cash163News repo =new Cash163News();
        List<NewsDTO> list =repo.cashNews();
        int i= 1;
        for(NewsDTO nd:list){
            News news = new News();
            news.setCtime(Timestamp.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
            news.setDegree(0);
            news.setDiscribe(nd.getDigest());
            news.setImgUrl(nd.getImgsrc());
            news.setIsNice(0);
            news.setIsShow(0);
            news.setLabel("default");
            news.setTitle(nd.getTitle());
            news.setUrl(nd.getUrl());
            i++;
            System.out.println(i+"-->");
            System.out.println(news);
            newsDao.addItem(news);

        }
    }
}
