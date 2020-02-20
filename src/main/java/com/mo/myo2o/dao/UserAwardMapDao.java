package com.mo.myo2o.dao;

import java.util.List;

import com.mo.myo2o.entity.UserAwardMap;
import org.apache.ibatis.annotations.Param;

public interface UserAwardMapDao {
	/**
	 * 
	 * @param userAwardCondition
	 * @param rowIndex
	 * @param pageSize
	 * @return
	 */
	List<UserAwardMap> queryUserAwardMapList(
			@Param("userAwardCondition") UserAwardMap userAwardCondition,
			@Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

	/**
	 * 
	 * @param userAwardCondition
	 * @return
	 */
	int queryUserAwardMapCount(
			@Param("userAwardCondition") UserAwardMap userAwardCondition);

	/**
	 * 
	 * @param userAwardId
	 * @return
	 */
	UserAwardMap queryUserAwardMapById(long userAwardId);

	/**
	 * 
	 * @param userAwardMap
	 * @return
	 */
	int insertUserAwardMap(UserAwardMap userAwardMap);

	/**
	 * 
	 * @param userAwardMap
	 * @return
	 */
	int updateUserAwardMap(UserAwardMap userAwardMap);
}
