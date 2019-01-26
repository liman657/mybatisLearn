package com.learn.chapter05.dao;

import com.learn.chapter05.domain.XPsDigestAvgLatencyDistribution;
import java.util.List;

public interface XPsDigestAvgLatencyDistributionMapper {
    int insert(XPsDigestAvgLatencyDistribution record);

    List<XPsDigestAvgLatencyDistribution> selectAll();
}