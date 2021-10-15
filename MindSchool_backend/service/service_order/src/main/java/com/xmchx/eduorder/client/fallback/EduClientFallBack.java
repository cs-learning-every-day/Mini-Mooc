package com.xmchx.eduorder.client.fallback;

import com.xmchx.commonutils.ordervo.CourseWebVoOrder;
import com.xmchx.commonutils.result.R;
import com.xmchx.eduorder.client.EduClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EduClientFallBack implements EduClient {
    @Override
    public CourseWebVoOrder getCourseInfoOrder(String id) {
        log.error("熔断器被执行");
        return null;
    }

    public R updateBuyCountById(String id) {
        log.error("熔断器被执行");
        return R.error();
    }
}
