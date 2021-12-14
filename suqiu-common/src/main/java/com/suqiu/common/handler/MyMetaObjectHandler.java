package com.suqiu.common.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description: mybatis-plus 自动填充
 * @Author: suqiu
 * @Date: 2021-12-04 15:00
 **/
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

	/**
	 * 插入时自动更新
	 * @param metaObject
	 */
	@Override
	public void insertFill(MetaObject metaObject) {
		log.info("start insert fill ....");
		this.strictInsertFill(metaObject, "createTime", Date.class, new Date()); // 起始版本 3.3.0(推荐使用)
		this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
	}

	/**
	 * 更新时自动更新
	 * @param metaObject
	 */
	@Override
	public void updateFill(MetaObject metaObject) {
		log.info("start update fill ....");
		this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());

	}
}
