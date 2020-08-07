package com.jindouyun.db.service;

import com.github.pagehelper.PageHelper;

import com.jindouyun.db.dao.JindouyunBrandMapper;
import com.jindouyun.db.domain.JindouyunBrand;
import com.jindouyun.db.domain.JindouyunBrand.Column;
import com.jindouyun.db.domain.JindouyunBrandExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class JindouyunBrandService {
    @Resource
    private JindouyunBrandMapper brandMapper;
    private Column[] columns = new Column[]{Column.id, Column.name, Column.desc, Column.notice, Column.picUrl, Column.floorPrice};

    /**
     * 分页查询所有商家
     * @param page
     * @param limit
     * @param sort
     * @param order
     * @return
     */
    public List<JindouyunBrand> query(Integer page, Integer limit, String sort, String order) {
        JindouyunBrandExample example = new JindouyunBrandExample();
        example.or().andDeletedEqualTo(false);
        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        PageHelper.startPage(page, limit);
        return brandMapper.selectByExampleSelective(example, columns);
    }

    public List<JindouyunBrand> query(Integer page, Integer limit) {
        return query(page, limit, null, null);
    }

    public JindouyunBrand findByUserId(Integer userId){
        JindouyunBrandExample example = new JindouyunBrandExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return brandMapper.selectOneByExampleSelective(example);
    }

    public JindouyunBrand findById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * 通过 id 或 name 查询 商家
     * @param id
     * @param name
     * @param page
     * @param size
     * @param sort
     * @param order
     * @return
     */
    public List<JindouyunBrand> querySelective(String id, String name, Integer page, Integer size, String sort, String order) {
        JindouyunBrandExample example = new JindouyunBrandExample();
        JindouyunBrandExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(id)) {
            criteria.andIdEqualTo(Integer.valueOf(id));
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return brandMapper.selectByExample(example);
    }

    public int updateById(JindouyunBrand brand) {
        brand.setUpdateTime(LocalDateTime.now());
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    public void deleteById(Integer id) {
        brandMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(JindouyunBrand brand) {
        brand.setAddTime(LocalDateTime.now());
        brand.setUpdateTime(LocalDateTime.now());
        brandMapper.insertSelective(brand);
    }

    public List<JindouyunBrand> all() {
        JindouyunBrandExample example = new JindouyunBrandExample();
        example.or().andDeletedEqualTo(false);
        return brandMapper.selectByExample(example);
    }
}
