package com.xmchx.educms.feign;


import com.xmchx.commonutils.result.R;
import com.xmchx.educms.feign.fallback.OssFileServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xmchx
 *  8
 */
@Service
@FeignClient(value = "service-oss", fallback = OssFileServiceFallBack.class)
public interface OssFileService {

    @DeleteMapping("/eduoss/fileoss/remove")
    R removeFile(@RequestBody String url);
}