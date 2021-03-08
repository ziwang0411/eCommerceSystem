package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

public class Product {
	private Long productId;
	private String productName;
	private String productDesc;
	private String imgAddr;// thumbnail
	private String normalPrice;
	private String promotionPrice;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private Integer enableStatus; //0: delisted 1: displaying

	private List<ProductImg> productImgList;
	private ProductCategory productCategory;
	private Shop shop;
}
