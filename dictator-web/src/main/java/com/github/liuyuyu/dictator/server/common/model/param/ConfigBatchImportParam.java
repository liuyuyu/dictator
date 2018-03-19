package com.github.liuyuyu.dictator.server.common.model.param;

import com.github.liuyuyu.dictator.common.Convertible;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Data
public class ConfigBatchImportParam implements Convertible, OperatorParam {
    /**
     * properties
     * a=1
     * b=2
     */
    @NotBlank private String content;
    /**
     * 应用（服务）ID
     */
    @NotBlank
    private String appId;

    /**
     * 部署的ID（例如：机器名+环境名）
     */
    @NotBlank
    private String deploymentId;

    /**
     * 操作者ID
     */
    private Long operatorId;

    /**
     * 操作者IP
     */
    private String operatorIp;

    /**
     * profile_id
     */
    @NotNull
    private Long profileId;

    /**
     * 分组ID
     */
    private Long groupId;
}