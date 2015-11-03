package com.wasai.bc.service.item;

import com.taobao.api.request.AtbItemsGetRequest;
import com.taobao.api.response.AtbItemsGetResponse;
import com.taobao.api.response.TaeItemsListResponse;

/**
 * @desc   
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月20日 下午3:56:05
 * @version V1.0
 * 
 */
public interface IItemDetailService {

	/**
	 * 根据各种筛选条件查询商品列表
	 * @return
	 */
	AtbItemsGetResponse queryForItemList(AtbItemsGetRequest itemGetReq);

	/**
	 * 根据商品ID或者混淆ID查询商品的相关信息
	 * @param itemIds
	 * @return
	 */
	TaeItemsListResponse queryForItemInfo(String itemIds);

}
