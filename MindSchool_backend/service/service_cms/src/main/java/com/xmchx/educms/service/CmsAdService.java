package com.xmchx.educms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xmchx.educms.entity.CmsAd;
import com.xmchx.educms.entity.vo.AdVo;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author Helen
 *
 */
public interface CmsAdService extends IService<CmsAd> {

    IPage<AdVo> selectPage(Long page, Long limit);

    boolean removeAdImageById(String id);

    List<CmsAd> selectByAdTypeId(String adTypeId);
}
