package com.xzlin.news.controller;


import com.xzlin.news.cashUtils.NewsContainer;
import com.xzlin.news.entity.News;
import com.xzlin.news.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Resource
    NewsService newsService;

    @ResponseBody
    @RequestMapping("/get")
    public List<News> dealNews(){
        NewsContainer newsItem=new NewsContainer();
        newsItem.setNewsItem(newsService.dealNews());
        return newsService.dealNews();
    }
}
