package com.github.liuyuyu.dictator.common.model.request;

import com.github.liuyuyu.dictator.common.BaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/*
 * @author liuyuyu
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PropertyGetRequest extends BaseProperties {
    /**
     * 属性名
     */
    @NotBlank private String propertyName;

    public static PropertyGetRequest from(@NonNull BaseProperties source){
        PropertyGetRequest target = new PropertyGetRequest();
        target.setAppId(source.getAppId());
        target.setDeploymentId(source.getDeploymentId());
        return target;
    }
}
