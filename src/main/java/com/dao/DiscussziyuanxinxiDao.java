package com.dao;

import com.entity.DiscussziyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussziyuanxinxiVO;
import com.entity.view.DiscussziyuanxinxiView;


/**
 * 资源信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface DiscussziyuanxinxiDao extends BaseMapper<DiscussziyuanxinxiEntity> {
	
	List<DiscussziyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	DiscussziyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	List<DiscussziyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);

	List<DiscussziyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
	DiscussziyuanxinxiView selectView(@Param("ew") Wrapper<DiscussziyuanxinxiEntity> wrapper);
	
}
