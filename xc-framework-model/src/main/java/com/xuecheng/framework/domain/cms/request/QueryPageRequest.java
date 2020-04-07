package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author pan
 * @version l.0
 * @className QueryPageRequest
 * @date 2020/4/6 15:51
 * @description TODO
 **/
@Data
public class QueryPageRequest {
    //接收页面查询的查询条件
    //站点id
    @ApiModelProperty("站点id")
    private String siteId;

    @ApiModelProperty("页面ID")
    private String pageId;

    @ApiModelProperty("页面名称")
    private String pageName;

    @ApiModelProperty("别名")
    private String pageAliase;

    @ApiModelProperty("模版id")
    private String templateId;
    //....
}
