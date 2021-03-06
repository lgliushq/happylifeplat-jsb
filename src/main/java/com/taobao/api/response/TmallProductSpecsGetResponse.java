package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductSpec;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmallProductSpecsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6246648314367765417L;
    @ApiListField("product_specs")
    @ApiField("product_spec")
    private List<ProductSpec> productSpecs;

    public void setProductSpecs(List<ProductSpec> productSpecs) {
        this.productSpecs = productSpecs;
    }

    public List<ProductSpec> getProductSpecs() {
        return this.productSpecs;
    }
}


