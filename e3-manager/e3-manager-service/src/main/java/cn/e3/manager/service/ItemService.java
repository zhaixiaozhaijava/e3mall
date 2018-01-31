package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	/*
	 * 根据商品的Id查询商品的数据
	 * 参数  Long itemId
	 * 返回值 是    TbItem
	 */
	public TbItem findItemById(Long itemId);
}
