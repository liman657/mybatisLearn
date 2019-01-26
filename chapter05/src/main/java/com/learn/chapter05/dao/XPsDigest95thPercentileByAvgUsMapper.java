package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XPsDigest95thPercentileByAvgUs;
import java.util.List;

public interface XPsDigest95thPercentileByAvgUsMapper {
    int insert(XPsDigest95thPercentileByAvgUs record);

    List<XPsDigest95thPercentileByAvgUs> selectAll();
}