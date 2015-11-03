package com.wasai.bc.controller.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.request.AtbItemsGetRequest;
import com.taobao.api.response.AtbItemsGetResponse;
import com.wasai.bc.controller.BaseController;
import com.wasai.bc.service.item.IItemDetailService;
import com.wasai.bc.utils.JSONUtils;

/**
 * @desc 商品相关功能的controller
 * @author Pigo.can
 * @email rushingpig@163.com
 * @date 2015年8月22日 上午10:40:12
 * @version V1.0
 * 
 */
@Controller
@RequestMapping("/item")
public class ItemController extends BaseController {

	@Autowired
	private IItemDetailService itemService;

	@RequestMapping(value = "search", method = RequestMethod.POST)
	@ResponseBody
	public AtbItemsGetResponse itemList(@RequestBody(required=true) AtbItemsGetRequest itemGetReq,HttpServletRequest request) {
//		request.getReader();
//		System.out.println(JSONUtils.toJsonString(itemGetReq));
		return itemService.queryForItemList(itemGetReq);
	}

	@RequestMapping(value = "info/{itemIds}", method = RequestMethod.GET)
	@ResponseBody
	public TaobaoResponse itemInfo(	@PathVariable String itemIds, HttpServletResponse response) {
		return itemService.queryForItemInfo(itemIds);
	}
}
