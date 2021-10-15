package com.xmchx.eduservice.client.fallback;

import com.xmchx.commonutils.ordervo.UcenterMemberOrder;
import com.xmchx.eduservice.client.UcenterClient;
import org.springframework.stereotype.Component;

@Component
public class UcenterFileDegradeFeignClient implements UcenterClient {
    @Override
    public UcenterMemberOrder getUserInfoOrder(String id) {
        return null;
    }
}
