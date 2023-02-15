package com.sist.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.GoodsVO;


public interface GoodsMapper {
	@Select("SELECT no,goods_name,goods_price,rownum FROM ${goods_tbl} WHERE rownum<=30 ORDER BY no")
	public List<GoodsVO> goodsListData(Map map);
}
