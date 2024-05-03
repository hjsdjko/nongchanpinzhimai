package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 农产品
 *
 * @author 
 * @email
 */
@TableName("nongchanpin")
public class NongchanpinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NongchanpinEntity() {

	}

	public NongchanpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 商家
     */
    @TableField(value = "shangjia_id")

    private Integer shangjiaId;


    /**
     * 农产品名称
     */
    @TableField(value = "nongchanpin_name")

    private String nongchanpinName;


    /**
     * 农产品照片
     */
    @TableField(value = "nongchanpin_photo")

    private String nongchanpinPhoto;


    /**
     * 农产品类型
     */
    @TableField(value = "nongchanpin_types")

    private Integer nongchanpinTypes;


    /**
     * 农产品库存
     */
    @TableField(value = "nongchanpin_kucun_number")

    private Integer nongchanpinKucunNumber;


    /**
     * 农产品原价
     */
    @TableField(value = "nongchanpin_old_money")

    private Double nongchanpinOldMoney;


    /**
     * 现价
     */
    @TableField(value = "nongchanpin_new_money")

    private Double nongchanpinNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "nongchanpin_clicknum")

    private Integer nongchanpinClicknum;


    /**
     * 农产品介绍
     */
    @TableField(value = "nongchanpin_content")

    private String nongchanpinContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "nongchanpin_delete")

    private Integer nongchanpinDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：农产品名称
	 */
    public String getNongchanpinName() {
        return nongchanpinName;
    }


    /**
	 * 获取：农产品名称
	 */

    public void setNongchanpinName(String nongchanpinName) {
        this.nongchanpinName = nongchanpinName;
    }
    /**
	 * 设置：农产品照片
	 */
    public String getNongchanpinPhoto() {
        return nongchanpinPhoto;
    }


    /**
	 * 获取：农产品照片
	 */

    public void setNongchanpinPhoto(String nongchanpinPhoto) {
        this.nongchanpinPhoto = nongchanpinPhoto;
    }
    /**
	 * 设置：农产品类型
	 */
    public Integer getNongchanpinTypes() {
        return nongchanpinTypes;
    }


    /**
	 * 获取：农产品类型
	 */

    public void setNongchanpinTypes(Integer nongchanpinTypes) {
        this.nongchanpinTypes = nongchanpinTypes;
    }
    /**
	 * 设置：农产品库存
	 */
    public Integer getNongchanpinKucunNumber() {
        return nongchanpinKucunNumber;
    }


    /**
	 * 获取：农产品库存
	 */

    public void setNongchanpinKucunNumber(Integer nongchanpinKucunNumber) {
        this.nongchanpinKucunNumber = nongchanpinKucunNumber;
    }
    /**
	 * 设置：农产品原价
	 */
    public Double getNongchanpinOldMoney() {
        return nongchanpinOldMoney;
    }


    /**
	 * 获取：农产品原价
	 */

    public void setNongchanpinOldMoney(Double nongchanpinOldMoney) {
        this.nongchanpinOldMoney = nongchanpinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getNongchanpinNewMoney() {
        return nongchanpinNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setNongchanpinNewMoney(Double nongchanpinNewMoney) {
        this.nongchanpinNewMoney = nongchanpinNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getNongchanpinClicknum() {
        return nongchanpinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setNongchanpinClicknum(Integer nongchanpinClicknum) {
        this.nongchanpinClicknum = nongchanpinClicknum;
    }
    /**
	 * 设置：农产品介绍
	 */
    public String getNongchanpinContent() {
        return nongchanpinContent;
    }


    /**
	 * 获取：农产品介绍
	 */

    public void setNongchanpinContent(String nongchanpinContent) {
        this.nongchanpinContent = nongchanpinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getNongchanpinDelete() {
        return nongchanpinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setNongchanpinDelete(Integer nongchanpinDelete) {
        this.nongchanpinDelete = nongchanpinDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Nongchanpin{" +
            "id=" + id +
            ", shangjiaId=" + shangjiaId +
            ", nongchanpinName=" + nongchanpinName +
            ", nongchanpinPhoto=" + nongchanpinPhoto +
            ", nongchanpinTypes=" + nongchanpinTypes +
            ", nongchanpinKucunNumber=" + nongchanpinKucunNumber +
            ", nongchanpinOldMoney=" + nongchanpinOldMoney +
            ", nongchanpinNewMoney=" + nongchanpinNewMoney +
            ", nongchanpinClicknum=" + nongchanpinClicknum +
            ", nongchanpinContent=" + nongchanpinContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", nongchanpinDelete=" + nongchanpinDelete +
            ", createTime=" + createTime +
        "}";
    }
}
