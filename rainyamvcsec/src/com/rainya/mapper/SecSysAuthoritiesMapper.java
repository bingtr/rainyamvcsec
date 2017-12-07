package com.rainya.mapper;

import com.rainya.po.SecSysAuthorities;
import com.rainya.po.SecSysAuthoritiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecSysAuthoritiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int countByExample(SecSysAuthoritiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int deleteByExample(SecSysAuthoritiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String authorityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int insert(SecSysAuthorities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int insertSelective(SecSysAuthorities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    List<SecSysAuthorities> selectByExample(SecSysAuthoritiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    SecSysAuthorities selectByPrimaryKey(String authorityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SecSysAuthorities record, @Param("example") SecSysAuthoritiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SecSysAuthorities record, @Param("example") SecSysAuthoritiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SecSysAuthorities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sec_sys_authorities
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SecSysAuthorities record);
}