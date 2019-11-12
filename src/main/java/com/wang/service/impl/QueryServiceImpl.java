package com.wang.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wang.bean.ShopOrder;
import com.wang.mapper.ShopOrderMapper;
import com.wang.service.QueryService;

@Service("queryService")
public class QueryServiceImpl implements QueryService{
	@Autowired
	ShopOrderMapper shopOrderMapper;
	
	public String query() {
		List<Long> orderIds = new ArrayList<Long>();
        orderIds.add(50000280834672L);
        List<ShopOrder> orders = shopOrderMapper.getShopOrderByShopOrderIds(orderIds);
		String str=String.valueOf(orders.get(0).getOrderId())+"--"+orders.get(0).getSellerUserId();
		return str;
	}
	
}
