package com.tip.restful.article.api.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.tip.restful.article.api.entity.Article;
import com.tip.restful.article.api.entity.ArticleCategory;
import com.tip.restful.article.api.service.IArticleCategoryService;
import com.tip.restful.article.api.service.impl.ArticleServiceImpl;
import com.tip.restful.core.common.helper.JSONHelper;
import com.tip.restful.core.controller.helper.JsonResultHelper;
import com.tip.restful.core.controller.param.form.FormParam;
import com.tip.restful.core.controller.param.query.QueryParam;
import com.tip.restful.core.controller.result.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tip.restful.core.controller.TControllerBase;
import javax.validation.Valid;
import java.util.List;

/**
 * 文章管理控制器
 *
 * @author 庞亦华
 * @version 0.1
 * @since 2018-9-26
 */
@RestController
@RequestMapping("/api/article")
public class ArticleController extends TControllerBase<Article, ArticleServiceImpl> {

    private Article article;

    /**
     * 新增一篇文章
     *
     * @param article
     * @param bindingResult
     * @return JsonResult
     */
    @ApiOperation("新增一篇文章")
    @RequestMapping(
            value = {"add"},
            method = {RequestMethod.POST}
    )
    public JsonResult<?> add(@Valid @RequestBody Article article, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return this.ResultToJson(false, bindingResult.getFieldError().getDefaultMessage());
        }
        baseService.insert(article);
        return this.ResultToJson(article);
    }

    /**
     * 根据文章ID，更新文章
     *
     * @param article
     * @return 返回更新的文章
     */
    @ApiOperation("根据ID更新文章")
    @RequestMapping(value = {"updateById"}, method = {RequestMethod.POST})
    public JsonResult<?> updateById(@Valid @RequestBody Article article) {
        baseService.updateById(article);
        return this.ResultToJson(article);
    }

    /**
     * 根据文章ID删除文章
     *
     * @param id 文章主键
     * @return 返回是否成功标志
     */
    @ApiOperation("根据ID删除文章")
    @RequestMapping(
            value = {"deleteById"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> deleteById(String id) {
        boolean flag = baseService.deleteById(id);
        return this.ResultToJson(flag);
    }

    /**
     * 根据文章主键获取文章内容
     *
     * @param id 主键
     * @return 返回文章内容
     */
    @ApiOperation("根据ID获取文章")
    @RequestMapping(value = {"getSingleById"}, method = {RequestMethod.GET})
    @Override
    public JsonResult<?> getSingleById(String id) {
        article = baseService.selectById(id);
        article.loadRelations();
        return this.ResultToJson(article);
    }

    /**
     * 获取文章列表
     *
     * @param json 查询条件
     * @return 返回文章列表数据
     */
    @ApiOperation("获取所有文章列表")
    @RequestMapping(
            value = {"getListAll"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> getListAll(String json) {
        QueryParam<Article> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        List<Article> list = baseService.selectList(queryData.getEw());
        return this.ResultToJson(list);
    }

    @ApiOperation("获取文章分页记录列表")
    @RequestMapping(
            value = {"getListPage"},
            method = {RequestMethod.GET}
    )
    @Override
    public JsonResult<?> getListPage(String json) {
        QueryParam<Article> queryData = QueryParam.parseQueryData(json, this, this.entityClazz);
        this.CustomQueryParams(queryData);
        Page<Article> page = baseService.selectPage(queryData.getPage(), queryData.getEw());
        return this.ResultToJson(page);
    }

    protected void CustomQueryParams(QueryParam<Article> queryData) {
    }

    @ApiOperation("批量新增文章")
    @RequestMapping(
            value = {"addBatch"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> addBatch(String json) {
        FormParam formData = FormParam.parseFormData(json);
        List<Article> entityList = formData.genFormEntityList(this.entityClazz);
        boolean flag = baseService.insertBatch(entityList);
        return this.ResultToJson(flag);
    }

    @ApiOperation("批量更新文章")
    @RequestMapping(
            value = {"updateBatch"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> updateBatch(String json) {
        FormParam formData = FormParam.parseFormData(json);
        List<Article> entityList = formData.genFormEntityList(this.entityClazz);
        boolean flag = baseService.updateBatchById(entityList);
        return this.ResultToJson(flag);
    }

    @ApiOperation("批量保存文章")
    @RequestMapping(
            value = {"dataSaveBatch"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> dataSaveBatch(String json) {
        FormParam formData = FormParam.parseFormData(json);
        List<Article> entityList = formData.genFormEntityList(this.entityClazz);
        boolean flag = baseService.dataSaveBatch(entityList);
        return this.ResultToJson(flag);
    }

    @ApiOperation("批量新增或修改文章")
    @RequestMapping(
            value = {"insertOrUpdateBatch"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> insertOrUpdateBatch(String json) {
        FormParam formData = FormParam.parseFormData(json);
        List<Article> entityList = formData.genFormEntityList(this.entityClazz);
        boolean flag = baseService.insertOrUpdateBatch(entityList, entityList.size());
        return this.ResultToJson(flag);
    }

    @ApiOperation("批量删除文章")
    @RequestMapping(
            value = {"deleteBatchIds"},
            method = {RequestMethod.POST}
    )
    @Override
    public JsonResult<?> deleteBatchIds(String json) {
        List<String> idList = JSONHelper.jsonToEntityList(json, String.class);
        boolean flag = baseService.deleteBatchIds(idList);
        return this.ResultToJson(flag);
    }


    // region 分类操作
    @Autowired
    private IArticleCategoryService articleCategoryService;

    /**
     * 新增一个分类
     *
     * @param articleCategory
     * @param bindingResult
     * @return JsonResult
     */
    @ApiOperation("新增文章分类")
    @RequestMapping(
            value = {"addCategory"},
            method = {RequestMethod.POST}
    )
    public JsonResult<?> addCategory(@Valid @RequestBody ArticleCategory articleCategory, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return this.ResultToJson(false, bindingResult.getFieldError().getDefaultMessage());
        }
        articleCategoryService.insert(articleCategory);
        return JsonResultHelper.ResultToJson(articleCategory);
//        return this.ResultToJson(articleCategory);
    }

    public JsonResult<?> addBatchCategory(String json) {
        FormParam formData = FormParam.parseFormData(json);
        List<ArticleCategory> entityList = formData.genFormEntityList(ArticleCategory.class);
        boolean flag = articleCategoryService.insertBatch(entityList);
        return this.ResultToJson(flag);
    }

    // endregion
}
