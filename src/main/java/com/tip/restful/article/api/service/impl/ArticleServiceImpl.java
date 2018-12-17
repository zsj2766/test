package com.tip.restful.article.api.service.impl;

import com.tip.restful.article.api.dao.ArticleMapper;
import com.tip.restful.article.api.entity.Article;
import com.tip.restful.article.api.service.IArticleService;
import com.tip.restful.core.service.ServiceBaseImpl;
import org.springframework.stereotype.Service;


/**
 * @author 庞亦华
 * @since 2018-9-26
 */
@Service
public class ArticleServiceImpl extends ServiceBaseImpl<ArticleMapper, Article> implements IArticleService {
}
