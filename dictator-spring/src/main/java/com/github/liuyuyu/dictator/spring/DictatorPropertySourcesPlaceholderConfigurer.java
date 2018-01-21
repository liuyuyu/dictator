package com.github.liuyuyu.dictator.spring;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/*
 * @author liuyuyu
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DictatorPropertySourcesPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
//    private ConfigService configService;
//
//    @Override
//    protected String resolvePlaceholder(@NonNull String placeholder, Properties props, int systemPropertiesMode) {
//        String localPropertyValue = super.resolvePlaceholder(placeholder, props, systemPropertiesMode);
//        if (StringUtils.isNotEmpty(localPropertyValue)) {
//            return localPropertyValue;
//        }
//        ConfigGetParam configGetParam = new ConfigGetParam();
//        configGetParam.setKey(placeholder);
//        return this.configService.find(configGetParam);
//    }
}
