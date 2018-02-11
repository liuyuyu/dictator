package com.github.liuyuyu.dictator.server.service;

import com.github.liuyuyu.dictator.common.model.dto.DictatorValueResponse;
import com.github.liuyuyu.dictator.server.service.param.CommonParam;
import com.github.liuyuyu.dictator.server.service.param.ConfigGetParam;

import java.util.Map;

/*
 * @author liuyuyu
 */
public interface ConfigReadService {
    DictatorValueResponse find(ConfigGetParam configGetParam);

    boolean exists(CommonParam commonParam);

    Map<String, String> findAll(CommonParam commonParam);
}
