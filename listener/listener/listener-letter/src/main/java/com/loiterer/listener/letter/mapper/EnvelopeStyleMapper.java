package com.loiterer.listener.letter.mapper;

import com.loiterer.listener.letter.model.entity.EnvelopeStyle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xzj
 * @since 2020-11-05
 */
@Repository
@Mapper
public interface EnvelopeStyleMapper extends BaseMapper<EnvelopeStyle> {

}
