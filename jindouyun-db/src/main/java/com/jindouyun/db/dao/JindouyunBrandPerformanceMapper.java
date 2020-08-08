package com.jindouyun.db.dao;

import com.jindouyun.db.domain.JindouyunBrandPerformance;
import com.jindouyun.db.domain.JindouyunBrandPerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JindouyunBrandPerformanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    long countByExample(JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int deleteByExample(JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int insert(JindouyunBrandPerformance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int insertSelective(JindouyunBrandPerformance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    JindouyunBrandPerformance selectOneByExample(JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    JindouyunBrandPerformance selectOneByExampleSelective(@Param("example") JindouyunBrandPerformanceExample example, @Param("selective") JindouyunBrandPerformance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    List<JindouyunBrandPerformance> selectByExampleSelective(@Param("example") JindouyunBrandPerformanceExample example, @Param("selective") JindouyunBrandPerformance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    List<JindouyunBrandPerformance> selectByExample(JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    JindouyunBrandPerformance selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") JindouyunBrandPerformance.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    JindouyunBrandPerformance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    JindouyunBrandPerformance selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") JindouyunBrandPerformance record, @Param("example") JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") JindouyunBrandPerformance record, @Param("example") JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(JindouyunBrandPerformance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JindouyunBrandPerformance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") JindouyunBrandPerformanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jindouyun_brand_performance
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}