package com.xmchx.eduucenter.mapper;

import com.xmchx.eduucenter.entity.UcenterMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 会员表 Mapper 接口
 * @author 西门吹雪
 *
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    //查询某天注册人数
    Integer countRegister(String day);
}
