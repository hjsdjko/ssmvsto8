package com.dao;

import com.entity.RenwulingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwulingquVO;
import com.entity.view.RenwulingquView;


/**
 * 任务领取
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface RenwulingquDao extends BaseMapper<RenwulingquEntity> {
	
	List<RenwulingquVO> selectListVO(@Param("ew") Wrapper<RenwulingquEntity> wrapper);
	
	RenwulingquVO selectVO(@Param("ew") Wrapper<RenwulingquEntity> wrapper);
	
	List<RenwulingquView> selectListView(@Param("ew") Wrapper<RenwulingquEntity> wrapper);

	List<RenwulingquView> selectListView(Pagination page,@Param("ew") Wrapper<RenwulingquEntity> wrapper);
	
	RenwulingquView selectView(@Param("ew") Wrapper<RenwulingquEntity> wrapper);
	
}
