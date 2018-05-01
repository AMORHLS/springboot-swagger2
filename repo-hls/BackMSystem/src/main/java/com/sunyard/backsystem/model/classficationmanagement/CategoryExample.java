package com.sunyard.backsystem.model.classficationmanagement;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCascadeidEqualTo(Integer value) {
            addCriterion("cascadeId =", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotEqualTo(Integer value) {
            addCriterion("cascadeId <>", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThan(Integer value) {
            addCriterion("cascadeId >", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cascadeId >=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThan(Integer value) {
            addCriterion("cascadeId <", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidLessThanOrEqualTo(Integer value) {
            addCriterion("cascadeId <=", value, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidIn(List<Integer> values) {
            addCriterion("cascadeId in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotIn(List<Integer> values) {
            addCriterion("cascadeId not in", values, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidBetween(Integer value1, Integer value2) {
            addCriterion("cascadeId between", value1, value2, "cascadeid");
            return (Criteria) this;
        }

        public Criteria andCascadeidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andRootkeyIsNull() {
            addCriterion("rootKey is null");
            return (Criteria) this;
        }

        public Criteria andRootkeyIsNotNull() {
            addCriterion("rootKey is not null");
            return (Criteria) this;
        }

        public Criteria andRootkeyEqualTo(String value) {
            addCriterion("rootKey =", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyNotEqualTo(String value) {
            addCriterion("rootKey <>", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyGreaterThan(String value) {
            addCriterion("rootKey >", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyGreaterThanOrEqualTo(String value) {
            addCriterion("rootKey >=", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyLessThan(String value) {
            addCriterion("rootKey <", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyLessThanOrEqualTo(String value) {
            addCriterion("rootKey <=", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyLike(String value) {
            addCriterion("rootKey like", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyNotLike(String value) {
            addCriterion("rootKey not like", value, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyIn(List<String> values) {
            addCriterion("rootKey in", values, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyNotIn(List<String> values) {
            addCriterion("rootKey not in", values, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyBetween(String value1, String value2) {
            addCriterion("rootKey between", value1, value2, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootkeyNotBetween(String value1, String value2) {
            addCriterion("rootKey not between", value1, value2, "rootkey");
            return (Criteria) this;
        }

        public Criteria andRootnameIsNull() {
            addCriterion("rootName is null");
            return (Criteria) this;
        }

        public Criteria andRootnameIsNotNull() {
            addCriterion("rootName is not null");
            return (Criteria) this;
        }

        public Criteria andRootnameEqualTo(String value) {
            addCriterion("rootName =", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameNotEqualTo(String value) {
            addCriterion("rootName <>", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameGreaterThan(String value) {
            addCriterion("rootName >", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameGreaterThanOrEqualTo(String value) {
            addCriterion("rootName >=", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameLessThan(String value) {
            addCriterion("rootName <", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameLessThanOrEqualTo(String value) {
            addCriterion("rootName <=", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameLike(String value) {
            addCriterion("rootName like", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameNotLike(String value) {
            addCriterion("rootName not like", value, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameIn(List<String> values) {
            addCriterion("rootName in", values, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameNotIn(List<String> values) {
            addCriterion("rootName not in", values, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameBetween(String value1, String value2) {
            addCriterion("rootName between", value1, value2, "rootname");
            return (Criteria) this;
        }

        public Criteria andRootnameNotBetween(String value1, String value2) {
            addCriterion("rootName not between", value1, value2, "rootname");
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