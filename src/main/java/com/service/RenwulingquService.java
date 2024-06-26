package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwulingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwulingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwulingquView;


/**
 * 任务领取
 *
 * @author 
 * @email 
 * @date 2021-06-03 18:40:16
 */
public interface RenwulingquService extends IService<RenwulingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwulingquVO> selectListVO(Wrapper<RenwulingquEntity> wrapper);
   	
   	RenwulingquVO selectVO(@Param("ew") Wrapper<RenwulingquEntity> wrapper);
   	
   	List<RenwulingquView> selectListView(Wrapper<RenwulingquEntity> wrapper);
   	
   	RenwulingquView selectView(@Param("ew") Wrapper<RenwulingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwulingquEntity> wrapper);
   	
}

