package com.xzlin.news.dao;

import com.xzlin.news.entity.News;
import com.xzlin.news.service.NewsService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INewsDao {

    int addItem(News news);
   List<News> showNews();

}
