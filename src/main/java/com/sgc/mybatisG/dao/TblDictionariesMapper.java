package com.sgc.mybatisG.dao;

import com.sgc.mybatisG.model.TblDictionaries;

public interface TblDictionariesMapper {
    /**
     *
     * @mbg.generated 2020-03-10
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-03-10
     */
    int insert(TblDictionaries record);

    /**
     *
     * @mbg.generated 2020-03-10
     */
    int insertSelective(TblDictionaries record);

    /**
     *
     * @mbg.generated 2020-03-10
     */
    TblDictionaries selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2020-03-10
     */
    int updateByPrimaryKeySelective(TblDictionaries record);

    /**
     *
     * @mbg.generated 2020-03-10
     */
    int updateByPrimaryKey(TblDictionaries record);
}