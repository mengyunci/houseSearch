package com.unknow.service;

import com.unknow.dto.BaseMenu;
import com.unknow.entity.Area;

import java.util.List;

/**
 * Created by hotman on 2017/4/16.
 */
public interface AreaService {

    List<BaseMenu> findTreeByEmplayeeId(String id);


}
