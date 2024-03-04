package jp.co.internous.ecsite.model.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblPurchaseMapper {

	
	int indert(int userID, int goodsId, String goodsName, int itemCount,int total);
	
}
