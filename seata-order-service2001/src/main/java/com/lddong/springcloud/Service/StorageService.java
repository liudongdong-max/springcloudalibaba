package com.lddong.springcloud.Service;

/**
 * @author lddong
 * @create 2022-10-24 0:34
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 扣减库存
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
