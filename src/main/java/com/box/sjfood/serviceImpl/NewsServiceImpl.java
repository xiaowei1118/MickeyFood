package com.box.sjfood.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.sjfood.mapper.NewsMapper;
import com.box.sjfood.model.News;
import com.box.sjfood.model.SmallNews;
import com.box.sjfood.service.NewsService;


@Service("/newsService")
public class NewsServiceImpl implements NewsService {
	private NewsMapper newsMapper;

	public NewsMapper getNewsMapper() {
		return newsMapper;
	}

	@Autowired
	public void setNewsMapper(NewsMapper newsMapper) {
		this.newsMapper = newsMapper;
	}

	public List<SmallNews> getSmallNews() {
		return newsMapper.getSmallNews();
	}

	public News getNewsById(Long newsId) {
		return newsMapper.selectByPrimaryKey(newsId);
	}

	public List<News> getPcAllNews() {
		return newsMapper.getPcAllNews();
	}

	public Integer addNews(News news) {
       return newsMapper.insert(news);		
	}

	public int deleteById(String id) {
		return newsMapper.deleteByPrimaryKey(Long.valueOf(id));
	}

	
}
