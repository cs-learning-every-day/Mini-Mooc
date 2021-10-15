package com.xmchx.eduucenter.service;

import com.xmchx.eduucenter.entity.UcenterMember;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xmchx.eduucenter.entity.vo.ChangeVo;
import com.xmchx.eduucenter.entity.vo.LoginVo;
import com.xmchx.eduucenter.entity.vo.RegisterVo;

/**
 * 会员表 服务类
 * @author 西门吹雪
 *
 */
public interface UcenterMemberService extends IService<UcenterMember> {

    //登录的方法
    String login(LoginVo loginVo);

    //注册的方法
    void register(RegisterVo registerVo);

    //根据openid判断是否有相同微信数据
    UcenterMember getOpenIdMember(String openid);

    //查询某天注册人数
    Integer countRegisterDay(String day);

    //更改密码
    void changePasswd(ChangeVo changeVo);
}
