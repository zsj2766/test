package com.tip.restful.article.api.service.impl;

import com.tip.restful.article.api.dao.ArticleCategoryMapper;
import com.tip.restful.article.api.entity.ArticleCategory;
import com.tip.restful.article.api.service.IArticleCategoryService;
import com.tip.restful.core.service.ServiceBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleCategoryServiceImpl extends ServiceBaseImpl<ArticleCategoryMapper, ArticleCategory> implements IArticleCategoryService {
}

