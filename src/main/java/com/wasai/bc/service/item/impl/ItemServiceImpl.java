package com.wasai.bc.service.item.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AtbItemsGetRequest;
import com.taobao.api.request.TaeItemsListRequest;
import com.taobao.api.response.AtbItemsGetResponse;
import com.taobao.api.response.TaeItemsListResponse;
import com.wasai.bc.common.Constants;
import com.wasai.bc.service.item.IItemDetailService;
import com.wasai.bc.utils.JSONUtils;
import com.wasai.bc.utils.TAEUtils;

/**
 * @desc   
 * @author Pigo.can
 * @email  rushingpig@163.com
 * @date   2015年8月20日 下午3:55:37
 * @version V1.0
 * 
 */
@Service
public class ItemServiceImpl implements IItemDetailService{
	
	private final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

	@Override
	public AtbItemsGetResponse queryForItemList(AtbItemsGetRequest itemGetReq) {
		TaobaoClient client = TAEUtils.getTBClient();
		
		/*AtbItemsGetRequest req=new AtbItemsGetRequest();
		req.setArea("杭州");
		req.setAutoSend("true");
		req.setCid(123L);
		req.setEndCommissionNum("10000");
		req.setEndCommissionRate("2345");
		req.setEndCredit("1heart");
		req.setEndPrice("999");
		req.setEndTotalnum("10");
		req.setFields("open_iid");
		req.setGuarantee("true");
		req.setRealDescribe("true");
		req.setKeyword("abc");
		req.setCashCoupon("true");
		req.setVipCard("true");
		req.setPageNo(1L);
		req.setPageSize(40L);
		req.setOverseasItem("true");
		req.setOnemonthRepair("true");
		req.setSevendaysReturn("true");
		req.setSort("price_desc");
		req.setStartCommissionNum("1000");
		req.setStartCommissionRate("1234");
		req.setStartCredit("1heart");
		req.setStartPrice("1");
		req.setStartTotalnum("1");
		req.setSupportCod("true");
		req.setMallItem("true");*/
		AtbItemsGetResponse response = null;
		try {
			response = client.execute(itemGetReq);
		} catch (ApiException e) {
			logger.error("根据条件查询商品列表时异常",e);
		}
		return response;
	}
	
	@Override
	public TaeItemsListResponse queryForItemInfo(String itemIds){
		TaobaoClient client = TAEUtils.getTBClient();
		TaeItemsListRequest req=new TaeItemsListRequest();
		req.setFields("title,nick,pic_url,location,cid,price,post_fee,promoted_service,ju,shop_name");
		//	判断传过来的是商品ID还是混淆ID
		if(isNormalItemID(itemIds))
			req.setNumIids(itemIds);
		else
			req.setOpenIids(itemIds);
		TaeItemsListResponse response = null;
		try {
			response = client.execute(req);
		} catch (ApiException e) {
			logger.error("根据商品ID/混淆ID ： 【itemids】查询商品信息有误",e);
		}
		return response;
	}
	
	
	private boolean isNormalItemID(String itemIds){
		Pattern p = Pattern.compile(Constants.RegularExp.REG_ITEM_ID);
		Matcher m = p.matcher(itemIds);
		return m.matches();
	}
	
	public static void main(String[] args) {
		ItemServiceImpl impl = new ItemServiceImpl();
		
		AtbItemsGetRequest req=new AtbItemsGetRequest();
		req.setPageNo(2L);
		req.setPageSize(40L);
		req.setFields("open_iid,title,nick,pic_url,price,commission,commission_rate,commission_num,commission_volume,seller_credit_score,item_location,volume");
		req.setKeyword("宝宝");
		
		AtbItemsGetResponse response = impl.queryForItemList(req);
//		TaobaoResponse response = impl.queryForItemInfo("AAH1BCC0ACBnMHgpuwVQOWed");
		System.out.println(JSONUtils.toJsonString(response,true));
//		System.out.println(impl.isNormalItemID("35325164038,35325164038,,"));
	
//		AtbItemsGetRequest itemGetReq = new AtbItemsGetRequest();
//		System.out.println(JSONUtils.toJsonString(itemGetReq,true));
	}
	
}
