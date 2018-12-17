package com.tip.restful.dealPublish.api.dao;


import com.tip.restful.dealPublish.api.entity.DealGrade;

import java.util.List;

public interface EfBnDealGradeMapper {
    int deleteByPrimaryKey(String dealId);

    int insert(DealGrade record);

    String selectByApplyId(String applyId);

    List<DealGrade> selectAll();

}