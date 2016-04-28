package com.box.sjfood.service;

import java.util.List;

import com.box.sjfood.model.News;
import com.box.sjfood.model.SmallNews;


public interface NewsService {

	List<SmallNews> getSmallNews();

	News getNewsById(Long newsId);

	List<News> getPcAllNews();

	Integer addNews(News news);

	int deleteById(String id);

}
