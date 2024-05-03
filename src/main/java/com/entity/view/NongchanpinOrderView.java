package com.entity.view;

import com.entity.NongchanpinOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 农产品订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("nongchanpin_order")
public class NongchanpinOrderView extends NongchanpinOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String nongchanpinOrderValue;
		/**
		* 支付类型的值
		*/
		private String nongchanpinOrderPaymentValue;



		//级联表 address
			/**
			* 收货地址 的 创建用户
			*/
			private Integer addressYonghuId;
			/**
			* 收货人
			*/
			private String addressName;
			/**
			* 电话
			*/
			private String addressPhone;
			/**
			* 地址
			*/
			private String addressDizhi;
			/**
			* 是否默认地址
			*/
			private Integer isdefaultTypes;
				/**
				* 是否默认地址的值
				*/
				private String isdefaultValue;

		//级联表 nongchanpin
			/**
			* 农产品 的 商家
			*/
			private Integer nongchanpinShangjiaId;
			/**
			* 农产品名称
			*/
			private String nongchanpinName;
			/**
			* 农产品照片
			*/
			private String nongchanpinPhoto;
			/**
			* 农产品类型
			*/
			private Integer nongchanpinTypes;
				/**
				* 农产品类型的值
				*/
				private String nongchanpinValue;
			/**
			* 农产品库存
			*/
			private Integer nongchanpinKucunNumber;
			/**
			* 农产品原价
			*/
			private Double nongchanpinOldMoney;
			/**
			* 现价
			*/
			private Double nongchanpinNewMoney;
			/**
			* 点击次数
			*/
			private Integer nongchanpinClicknum;
			/**
			* 农产品介绍
			*/
			private String nongchanpinContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer nongchanpinDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public NongchanpinOrderView() {

	}

	public NongchanpinOrderView(NongchanpinOrderEntity nongchanpinOrderEntity) {
		try {
			BeanUtils.copyProperties(this, nongchanpinOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getNongchanpinOrderValue() {
				return nongchanpinOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setNongchanpinOrderValue(String nongchanpinOrderValue) {
				this.nongchanpinOrderValue = nongchanpinOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getNongchanpinOrderPaymentValue() {
				return nongchanpinOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setNongchanpinOrderPaymentValue(String nongchanpinOrderPaymentValue) {
				this.nongchanpinOrderPaymentValue = nongchanpinOrderPaymentValue;
			}




				//级联表的get和set address
					/**
					* 获取：收货地址 的 创建用户
					*/
					public Integer getAddressYonghuId() {
						return addressYonghuId;
					}
					/**
					* 设置：收货地址 的 创建用户
					*/
					public void setAddressYonghuId(Integer addressYonghuId) {
						this.addressYonghuId = addressYonghuId;
					}

					/**
					* 获取： 收货人
					*/
					public String getAddressName() {
						return addressName;
					}
					/**
					* 设置： 收货人
					*/
					public void setAddressName(String addressName) {
						this.addressName = addressName;
					}
					/**
					* 获取： 电话
					*/
					public String getAddressPhone() {
						return addressPhone;
					}
					/**
					* 设置： 电话
					*/
					public void setAddressPhone(String addressPhone) {
						this.addressPhone = addressPhone;
					}
					/**
					* 获取： 地址
					*/
					public String getAddressDizhi() {
						return addressDizhi;
					}
					/**
					* 设置： 地址
					*/
					public void setAddressDizhi(String addressDizhi) {
						this.addressDizhi = addressDizhi;
					}
					/**
					* 获取： 是否默认地址
					*/
					public Integer getIsdefaultTypes() {
						return isdefaultTypes;
					}
					/**
					* 设置： 是否默认地址
					*/
					public void setIsdefaultTypes(Integer isdefaultTypes) {
						this.isdefaultTypes = isdefaultTypes;
					}


						/**
						* 获取： 是否默认地址的值
						*/
						public String getIsdefaultValue() {
							return isdefaultValue;
						}
						/**
						* 设置： 是否默认地址的值
						*/
						public void setIsdefaultValue(String isdefaultValue) {
							this.isdefaultValue = isdefaultValue;
						}

















				//级联表的get和set nongchanpin
					/**
					* 获取：农产品 的 商家
					*/
					public Integer getNongchanpinShangjiaId() {
						return nongchanpinShangjiaId;
					}
					/**
					* 设置：农产品 的 商家
					*/
					public void setNongchanpinShangjiaId(Integer nongchanpinShangjiaId) {
						this.nongchanpinShangjiaId = nongchanpinShangjiaId;
					}

					/**
					* 获取： 农产品名称
					*/
					public String getNongchanpinName() {
						return nongchanpinName;
					}
					/**
					* 设置： 农产品名称
					*/
					public void setNongchanpinName(String nongchanpinName) {
						this.nongchanpinName = nongchanpinName;
					}
					/**
					* 获取： 农产品照片
					*/
					public String getNongchanpinPhoto() {
						return nongchanpinPhoto;
					}
					/**
					* 设置： 农产品照片
					*/
					public void setNongchanpinPhoto(String nongchanpinPhoto) {
						this.nongchanpinPhoto = nongchanpinPhoto;
					}
					/**
					* 获取： 农产品类型
					*/
					public Integer getNongchanpinTypes() {
						return nongchanpinTypes;
					}
					/**
					* 设置： 农产品类型
					*/
					public void setNongchanpinTypes(Integer nongchanpinTypes) {
						this.nongchanpinTypes = nongchanpinTypes;
					}


						/**
						* 获取： 农产品类型的值
						*/
						public String getNongchanpinValue() {
							return nongchanpinValue;
						}
						/**
						* 设置： 农产品类型的值
						*/
						public void setNongchanpinValue(String nongchanpinValue) {
							this.nongchanpinValue = nongchanpinValue;
						}
					/**
					* 获取： 农产品库存
					*/
					public Integer getNongchanpinKucunNumber() {
						return nongchanpinKucunNumber;
					}
					/**
					* 设置： 农产品库存
					*/
					public void setNongchanpinKucunNumber(Integer nongchanpinKucunNumber) {
						this.nongchanpinKucunNumber = nongchanpinKucunNumber;
					}
					/**
					* 获取： 农产品原价
					*/
					public Double getNongchanpinOldMoney() {
						return nongchanpinOldMoney;
					}
					/**
					* 设置： 农产品原价
					*/
					public void setNongchanpinOldMoney(Double nongchanpinOldMoney) {
						this.nongchanpinOldMoney = nongchanpinOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getNongchanpinNewMoney() {
						return nongchanpinNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setNongchanpinNewMoney(Double nongchanpinNewMoney) {
						this.nongchanpinNewMoney = nongchanpinNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getNongchanpinClicknum() {
						return nongchanpinClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setNongchanpinClicknum(Integer nongchanpinClicknum) {
						this.nongchanpinClicknum = nongchanpinClicknum;
					}
					/**
					* 获取： 农产品介绍
					*/
					public String getNongchanpinContent() {
						return nongchanpinContent;
					}
					/**
					* 设置： 农产品介绍
					*/
					public void setNongchanpinContent(String nongchanpinContent) {
						this.nongchanpinContent = nongchanpinContent;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getNongchanpinDelete() {
						return nongchanpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setNongchanpinDelete(Integer nongchanpinDelete) {
						this.nongchanpinDelete = nongchanpinDelete;
					}





















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}




}
