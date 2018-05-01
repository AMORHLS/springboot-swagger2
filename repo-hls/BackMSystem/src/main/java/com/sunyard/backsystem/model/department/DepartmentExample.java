package com.sunyard.backsystem.model.department;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int startRow;

    protected int pageSize;

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public DepartmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCascadeidIsNull() {
            addCriterion("cascadeId is null");
            return (Criteria) this;
        }

        public Criteria andCascadeidIsNotNull() {
            addCriterion("cascadeId is not null");
            return (Criteria) this;
        }

        public Criteria andCascadeidEqualTo(String value) {
            addCriterion("cascadeId =", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotEqualTo(String value) {
            addCriterion("cascadeId <>", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThan(String value) {
            addCriterion("cascadeId >", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThanOrEqualTo(String value) {
            addCriterion("cascadeId >=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThan(String value) {
            addCriterion("cascadeId <", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThanOrEqualTo(String value) {
            addCriterion("cascadeId <=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLike(String value) {
            addCriterion("cascadeId like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotLike(String value) {
            addCriterion("cascadeId not like", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidIn(List<String> values) {
            addCriterion("cascadeId in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotIn(List<String> values) {
            addCriterion("cascadeId not in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidBetween(String value1, String value2) {
            addCriterion("cascadeId between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotBetween(String value1, String value2) {
            addCriterion("cascadeId not between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHotkeyIsNull() {
            addCriterion("hotKey is null");
            return (Criteria) this;
        }

        public Criteria andHotkeyIsNotNull() {
            addCriterion("hotKey is not null");
            return (Criteria) this;
        }

        public Criteria andHotkeyEqualTo(String value) {
            addCriterion("hotKey =", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyNotEqualTo(String value) {
            addCriterion("hotKey <>", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyGreaterThan(String value) {
            addCriterion("hotKey >", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyGreaterThanOrEqualTo(String value) {
            addCriterion("hotKey >=", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyLessThan(String value) {
            addCriterion("hotKey <", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyLessThanOrEqualTo(String value) {
            addCriterion("hotKey <=", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyLike(String value) {
            addCriterion("hotKey like", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyNotLike(String value) {
            addCriterion("hotKey not like", value, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyIn(List<String> values) {
            addCriterion("hotKey in", values, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyNotIn(List<String> values) {
            addCriterion("hotKey not in", values, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyBetween(String value1, String value2) {
            addCriterion("hotKey between", value1, value2, "hotkey");
            return (Criteria) this;
        }

        public Criteria andHotkeyNotBetween(String value1, String value2) {
            addCriterion("hotKey not between", value1, value2, "hotkey");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("parentName is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("parentName is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("parentName =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("parentName <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("parentName >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("parentName >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("parentName <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("parentName <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("parentName like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("parentName not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("parentName in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("parentName not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("parentName between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("parentName not between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNull() {
            addCriterion("isLeaf is null");
            return (Criteria) this;
        }

        public Criteria andIsleafIsNotNull() {
            addCriterion("isLeaf is not null");
            return (Criteria) this;
        }

        public Criteria andIsleafEqualTo(Byte value) {
            addCriterion("isLeaf =", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotEqualTo(Byte value) {
            addCriterion("isLeaf <>", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThan(Byte value) {
            addCriterion("isLeaf >", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafGreaterThanOrEqualTo(Byte value) {
            addCriterion("isLeaf >=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThan(Byte value) {
            addCriterion("isLeaf <", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafLessThanOrEqualTo(Byte value) {
            addCriterion("isLeaf <=", value, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafIn(List<Byte> values) {
            addCriterion("isLeaf in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotIn(List<Byte> values) {
            addCriterion("isLeaf not in", values, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafBetween(Byte value1, Byte value2) {
            addCriterion("isLeaf between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsleafNotBetween(Byte value1, Byte value2) {
            addCriterion("isLeaf not between", value1, value2, "isleaf");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIsNull() {
            addCriterion("isAutoExpand is null");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIsNotNull() {
            addCriterion("isAutoExpand is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandEqualTo(Byte value) {
            addCriterion("isAutoExpand =", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotEqualTo(Byte value) {
            addCriterion("isAutoExpand <>", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandGreaterThan(Byte value) {
            addCriterion("isAutoExpand >", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandGreaterThanOrEqualTo(Byte value) {
            addCriterion("isAutoExpand >=", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandLessThan(Byte value) {
            addCriterion("isAutoExpand <", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandLessThanOrEqualTo(Byte value) {
            addCriterion("isAutoExpand <=", value, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandIn(List<Byte> values) {
            addCriterion("isAutoExpand in", values, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotIn(List<Byte> values) {
            addCriterion("isAutoExpand not in", values, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandBetween(Byte value1, Byte value2) {
            addCriterion("isAutoExpand between", value1, value2, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIsautoexpandNotBetween(Byte value1, Byte value2) {
            addCriterion("isAutoExpand not between", value1, value2, "isautoexpand");
            return (Criteria) this;
        }

        public Criteria andIconnameIsNull() {
            addCriterion("iconName is null");
            return (Criteria) this;
        }

        public Criteria andIconnameIsNotNull() {
            addCriterion("iconName is not null");
            return (Criteria) this;
        }

        public Criteria andIconnameEqualTo(String value) {
            addCriterion("iconName =", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotEqualTo(String value) {
            addCriterion("iconName <>", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameGreaterThan(String value) {
            addCriterion("iconName >", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameGreaterThanOrEqualTo(String value) {
            addCriterion("iconName >=", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLessThan(String value) {
            addCriterion("iconName <", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLessThanOrEqualTo(String value) {
            addCriterion("iconName <=", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameLike(String value) {
            addCriterion("iconName like", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotLike(String value) {
            addCriterion("iconName not like", value, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameIn(List<String> values) {
            addCriterion("iconName in", values, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotIn(List<String> values) {
            addCriterion("iconName not in", values, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameBetween(String value1, String value2) {
            addCriterion("iconName between", value1, value2, "iconname");
            return (Criteria) this;
        }

        public Criteria andIconnameNotBetween(String value1, String value2) {
            addCriterion("iconName not between", value1, value2, "iconname");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBizcodeIsNull() {
            addCriterion("bizCode is null");
            return (Criteria) this;
        }

        public Criteria andBizcodeIsNotNull() {
            addCriterion("bizCode is not null");
            return (Criteria) this;
        }

        public Criteria andBizcodeEqualTo(String value) {
            addCriterion("bizCode =", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotEqualTo(String value) {
            addCriterion("bizCode <>", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeGreaterThan(String value) {
            addCriterion("bizCode >", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bizCode >=", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLessThan(String value) {
            addCriterion("bizCode <", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLessThanOrEqualTo(String value) {
            addCriterion("bizCode <=", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLike(String value) {
            addCriterion("bizCode like", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotLike(String value) {
            addCriterion("bizCode not like", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeIn(List<String> values) {
            addCriterion("bizCode in", values, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotIn(List<String> values) {
            addCriterion("bizCode not in", values, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeBetween(String value1, String value2) {
            addCriterion("bizCode between", value1, value2, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotBetween(String value1, String value2) {
            addCriterion("bizCode not between", value1, value2, "bizcode");
            return (Criteria) this;
        }

        public Criteria andCustomfield1IsNull() {
            addCriterion("customField1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomfield1IsNotNull() {
            addCriterion("customField1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomfield1EqualTo(String value) {
            addCriterion("customField1 =", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1NotEqualTo(String value) {
            addCriterion("customField1 <>", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1GreaterThan(String value) {
            addCriterion("customField1 >", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1GreaterThanOrEqualTo(String value) {
            addCriterion("customField1 >=", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1LessThan(String value) {
            addCriterion("customField1 <", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1LessThanOrEqualTo(String value) {
            addCriterion("customField1 <=", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1Like(String value) {
            addCriterion("customField1 like", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1NotLike(String value) {
            addCriterion("customField1 not like", value, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1In(List<String> values) {
            addCriterion("customField1 in", values, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1NotIn(List<String> values) {
            addCriterion("customField1 not in", values, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1Between(String value1, String value2) {
            addCriterion("customField1 between", value1, value2, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCustomfield1NotBetween(String value1, String value2) {
            addCriterion("customField1 not between", value1, value2, "customfield1");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createId is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createId =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createId <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createId >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createId >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createId <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createId <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createId in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createId not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createId between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createId not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("sortNo is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortNo is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("sortNo =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("sortNo <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("sortNo >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortNo >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("sortNo <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("sortNo <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<Integer> values) {
            addCriterion("sortNo in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<Integer> values) {
            addCriterion("sortNo not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("sortNo between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sortNo not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}