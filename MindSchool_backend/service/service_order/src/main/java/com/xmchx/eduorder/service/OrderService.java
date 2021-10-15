package com.xmchx.eduorder.service;

import com.xmchx.eduorder.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 订单 服务类
 * @author 西门吹雪
 *
 */
public interface OrderService extends IService<Order> {

    //创建订单
    String createOrders(String courseId, String memberIdByJwtToken);

    //获取当前用户订单列表
    List<Order> selectByMemberId(String memberId);

    //删除订单
    boolean removeById(String orderId, String memberId);

    //判断课程是否已经购买
    Boolean isBoughtByCourseId(String courseId, String memberId);
}
