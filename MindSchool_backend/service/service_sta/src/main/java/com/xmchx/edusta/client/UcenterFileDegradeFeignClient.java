package com.xmchx.edusta.client;

import com.xmchx.commonutils.result.R;
import org.springframework.stereotype.Component;

@Component
public class UcenterFileDegradeFeignClient implements UcenterClient {
   //出错之后会执行
    @Override
    public R countRegister(String day) {
        return R.error().message("查询出错了");
    }
}
