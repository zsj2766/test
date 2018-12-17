package com.tip.restful.dealPublish.api.service;

import com.tip.restful.dealPublish.api.entity.DealGrade;

public interface IDealGradeService {

    int insert(DealGrade record);

    String selectByName(String companyName);
}
