package zwz.dao;

import zwz.entity.XueshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import zwz.entity.vo.XueshengVO;
import zwz.entity.view.XueshengView;


/**
 * 学生
 * 
 * @author 
 * @email 
 * @date 2021-03-05 14:09:23
 */
public interface XueshengDao extends BaseMapper<XueshengEntity> {
	
	List<XueshengVO> selectListVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
	XueshengVO selectVO(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
	List<XueshengView> selectListView(@Param("ew") Wrapper<XueshengEntity> wrapper);

	List<XueshengView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengEntity> wrapper);
	
	XueshengView selectView(@Param("ew") Wrapper<XueshengEntity> wrapper);
	
}
