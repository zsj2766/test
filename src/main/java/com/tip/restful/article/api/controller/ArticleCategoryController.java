package com.tip.restful.article.api.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.tip.restful.article.api.entity.Article;
import com.tip.restful.article.api.entity.ArticleCategory;
import com.tip.restful.article.api.service.IArticleCategoryService;
import com.tip.restful.article.api.service.impl.ArticleCategoryServiceImpl;
import com.tip.restful.core.common.helper.JSONHelper;
import com.tip.restful.core.controller.TControllerBase;
import com.tip.restful.core.controller.param.query.QueryParam;
import com.tip.restful.core.controller.result.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/article/category/")
public class ArticleCategoryController extends TControllerBase<ArticleCategory, ArticleCategoryServiceImpl> {
    @Autowired
    private IArticleCategoryService articleCategoryService;
    private ArticleCategory articleCategory;
    /**
     * 新增一个分类
     * @param articleCategory
     * @param bindingResult
     * @return JsonResult
     */
    @ApiOperation("新增文章分类")
    @RequestMapping(
            value = {"add"},
            method = {RequestMethod.POST}
    )
    public JsonResult<?> add(@Valid @RequestBody ArticleCategory articleCategory, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return this.ResultToJson(false,bindingResult.getFieldError().getDefaultMessage());
        }
        articleCategoryService.insert(articleCategory);
        return this.ResultToJson(articleCategory);
    }


    /**
     * 根据分类ID，更新分类
     * @param articleCategory
     * @return 返回更新的文章
     */
    @ApiOperation("根据ID更新分类")
    @RequestMapping(value = {"updateById"},method = {RequestMethod.POST})
    public JsonResult<?> updateById(@Valid @RequestBody ArticleCategory articleCategory) {
        articleCategoryService.updateById(articleCategory);
        return this.ResultToJson(articleCategory);
    }

    /**
     * 根据ID删除分类
     * @param id 分类主键
     * @return 返回是否成功标志
     */
    @ApiOperation("根据ID删除分类")
    @RequestMapping(
            value = {"deleteById"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> deleteById(String id) {
        boolean flag = articleCategoryService.deleteById(id);
        return this.ResultToJson(flag);
    }

    /**
     * 根据分类主键获取分类内容
     * @param id 主键
     * @return 返回文章内容
     */
    @ApiOperation("根据ID获取分类")
    @RequestMapping( value = {"getSingleById"}, method = {RequestMethod.GET})
    @Override
    public JsonResult<?> getSingleById(String id) {
        articleCategory = articleCategoryService.selectById(id);
        articleCategory.loadRelations();
        return this.ResultToJson(articleCategory);
    }


    /**
     * 获取文章分类列表
     * @param json 查询条件
     * @return 返回文章分类列表数据
     */
    @ApiOperation("获取所有文章列表")
    @RequestMapping(
            value = {"getListAll"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> getListAll(String json) {
        QueryParam<ArticleCategory> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        List<ArticleCategory> list = articleCategoryService.selectList(queryData.getEw());
        return this.ResultToJson(list);
    }

    @ApiOperation("获取文章分类分页记录列表")
    @RequestMapping(
            value = {"getListPage"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> getListPage(String json) {
        QueryParam<ArticleCategory> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        this.CustomQueryParams(queryData);
        Page<ArticleCategory> page = articleCategoryService.selectPage(queryData.getPage(), queryData.getEw());
        return this.ResultToJson(page);
    }
    @ApiOperation("批量删除文章分类")
    @RequestMapping(
            value = {"deleteBatchIds"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> deleteBatchIds(String json) {
        List<String> idList = JSONHelper.jsonToEntityList(json, String.class);
        boolean flag = articleCategoryService.deleteBatchIds(idList);
        return this.ResultToJson(flag);
    }
}
