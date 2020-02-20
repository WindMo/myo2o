package com.mo.myo2o.service;

import com.mo.myo2o.dto.UserShopMapExecution;
import com.mo.myo2o.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
			int pageIndex, int pageSize);

}
