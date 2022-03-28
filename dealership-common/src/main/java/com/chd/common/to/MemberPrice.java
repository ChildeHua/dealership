/**
  * Copyright 2019 bejson.com 
  */
package com.chd.common.to;

import lombok.Data;

import java.math.BigDecimal;

/** TO(Transfer 0bject)，数据传输对象传输的对象不同的应用程序之间传输的对象。微服务
 * Auto-generated: 2022-3-24 10:50:34
 *
 * @author chd
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}