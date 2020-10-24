package com.park.cloud.common.domain.po.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictAreaPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictAreaPOExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andCantonIdIsNull() {
            addCriterion("canton_id is null");
            return (Criteria) this;
        }

        public Criteria andCantonIdIsNotNull() {
            addCriterion("canton_id is not null");
            return (Criteria) this;
        }

        public Criteria andCantonIdEqualTo(Integer value) {
            addCriterion("canton_id =", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotEqualTo(Integer value) {
            addCriterion("canton_id <>", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdGreaterThan(Integer value) {
            addCriterion("canton_id >", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("canton_id >=", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdLessThan(Integer value) {
            addCriterion("canton_id <", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdLessThanOrEqualTo(Integer value) {
            addCriterion("canton_id <=", value, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdIn(List<Integer> values) {
            addCriterion("canton_id in", values, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotIn(List<Integer> values) {
            addCriterion("canton_id not in", values, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdBetween(Integer value1, Integer value2) {
            addCriterion("canton_id between", value1, value2, "cantonId");
            return (Criteria) this;
        }

        public Criteria andCantonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("canton_id not between", value1, value2, "cantonId");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkIsNull() {
            addCriterion("area_remark is null");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkIsNotNull() {
            addCriterion("area_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkEqualTo(String value) {
            addCriterion("area_remark =", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkNotEqualTo(String value) {
            addCriterion("area_remark <>", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkGreaterThan(String value) {
            addCriterion("area_remark >", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("area_remark >=", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkLessThan(String value) {
            addCriterion("area_remark <", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkLessThanOrEqualTo(String value) {
            addCriterion("area_remark <=", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkLike(String value) {
            addCriterion("area_remark like", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkNotLike(String value) {
            addCriterion("area_remark not like", value, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkIn(List<String> values) {
            addCriterion("area_remark in", values, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkNotIn(List<String> values) {
            addCriterion("area_remark not in", values, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkBetween(String value1, String value2) {
            addCriterion("area_remark between", value1, value2, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAreaRemarkNotBetween(String value1, String value2) {
            addCriterion("area_remark not between", value1, value2, "areaRemark");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNull() {
            addCriterion("add_user is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIsNotNull() {
            addCriterion("add_user is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserEqualTo(Integer value) {
            addCriterion("add_user =", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotEqualTo(Integer value) {
            addCriterion("add_user <>", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThan(Integer value) {
            addCriterion("add_user >", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_user >=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThan(Integer value) {
            addCriterion("add_user <", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserLessThanOrEqualTo(Integer value) {
            addCriterion("add_user <=", value, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserIn(List<Integer> values) {
            addCriterion("add_user in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotIn(List<Integer> values) {
            addCriterion("add_user not in", values, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserBetween(Integer value1, Integer value2) {
            addCriterion("add_user between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andAddUserNotBetween(Integer value1, Integer value2) {
            addCriterion("add_user not between", value1, value2, "addUser");
            return (Criteria) this;
        }

        public Criteria andNetworkNumIsNull() {
            addCriterion("network_num is null");
            return (Criteria) this;
        }

        public Criteria andNetworkNumIsNotNull() {
            addCriterion("network_num is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkNumEqualTo(String value) {
            addCriterion("network_num =", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumNotEqualTo(String value) {
            addCriterion("network_num <>", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumGreaterThan(String value) {
            addCriterion("network_num >", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumGreaterThanOrEqualTo(String value) {
            addCriterion("network_num >=", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumLessThan(String value) {
            addCriterion("network_num <", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumLessThanOrEqualTo(String value) {
            addCriterion("network_num <=", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumLike(String value) {
            addCriterion("network_num like", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumNotLike(String value) {
            addCriterion("network_num not like", value, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumIn(List<String> values) {
            addCriterion("network_num in", values, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumNotIn(List<String> values) {
            addCriterion("network_num not in", values, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumBetween(String value1, String value2) {
            addCriterion("network_num between", value1, value2, "networkNum");
            return (Criteria) this;
        }

        public Criteria andNetworkNumNotBetween(String value1, String value2) {
            addCriterion("network_num not between", value1, value2, "networkNum");
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