package com.park.cloud.common.domain.po.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictCantonPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictCantonPOExample() {
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

        public Criteria andCantonNameIsNull() {
            addCriterion("canton_name is null");
            return (Criteria) this;
        }

        public Criteria andCantonNameIsNotNull() {
            addCriterion("canton_name is not null");
            return (Criteria) this;
        }

        public Criteria andCantonNameEqualTo(String value) {
            addCriterion("canton_name =", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameNotEqualTo(String value) {
            addCriterion("canton_name <>", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameGreaterThan(String value) {
            addCriterion("canton_name >", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameGreaterThanOrEqualTo(String value) {
            addCriterion("canton_name >=", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameLessThan(String value) {
            addCriterion("canton_name <", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameLessThanOrEqualTo(String value) {
            addCriterion("canton_name <=", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameLike(String value) {
            addCriterion("canton_name like", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameNotLike(String value) {
            addCriterion("canton_name not like", value, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameIn(List<String> values) {
            addCriterion("canton_name in", values, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameNotIn(List<String> values) {
            addCriterion("canton_name not in", values, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameBetween(String value1, String value2) {
            addCriterion("canton_name between", value1, value2, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonNameNotBetween(String value1, String value2) {
            addCriterion("canton_name not between", value1, value2, "cantonName");
            return (Criteria) this;
        }

        public Criteria andCantonCodeIsNull() {
            addCriterion("canton_code is null");
            return (Criteria) this;
        }

        public Criteria andCantonCodeIsNotNull() {
            addCriterion("canton_code is not null");
            return (Criteria) this;
        }

        public Criteria andCantonCodeEqualTo(String value) {
            addCriterion("canton_code =", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeNotEqualTo(String value) {
            addCriterion("canton_code <>", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeGreaterThan(String value) {
            addCriterion("canton_code >", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("canton_code >=", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeLessThan(String value) {
            addCriterion("canton_code <", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeLessThanOrEqualTo(String value) {
            addCriterion("canton_code <=", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeLike(String value) {
            addCriterion("canton_code like", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeNotLike(String value) {
            addCriterion("canton_code not like", value, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeIn(List<String> values) {
            addCriterion("canton_code in", values, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeNotIn(List<String> values) {
            addCriterion("canton_code not in", values, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeBetween(String value1, String value2) {
            addCriterion("canton_code between", value1, value2, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonCodeNotBetween(String value1, String value2) {
            addCriterion("canton_code not between", value1, value2, "cantonCode");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkIsNull() {
            addCriterion("canton_remark is null");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkIsNotNull() {
            addCriterion("canton_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkEqualTo(String value) {
            addCriterion("canton_remark =", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkNotEqualTo(String value) {
            addCriterion("canton_remark <>", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkGreaterThan(String value) {
            addCriterion("canton_remark >", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("canton_remark >=", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkLessThan(String value) {
            addCriterion("canton_remark <", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkLessThanOrEqualTo(String value) {
            addCriterion("canton_remark <=", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkLike(String value) {
            addCriterion("canton_remark like", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkNotLike(String value) {
            addCriterion("canton_remark not like", value, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkIn(List<String> values) {
            addCriterion("canton_remark in", values, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkNotIn(List<String> values) {
            addCriterion("canton_remark not in", values, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkBetween(String value1, String value2) {
            addCriterion("canton_remark between", value1, value2, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCantonRemarkNotBetween(String value1, String value2) {
            addCriterion("canton_remark not between", value1, value2, "cantonRemark");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
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

        public Criteria andCantonLatIsNull() {
            addCriterion("canton_lat is null");
            return (Criteria) this;
        }

        public Criteria andCantonLatIsNotNull() {
            addCriterion("canton_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCantonLatEqualTo(String value) {
            addCriterion("canton_lat =", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatNotEqualTo(String value) {
            addCriterion("canton_lat <>", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatGreaterThan(String value) {
            addCriterion("canton_lat >", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatGreaterThanOrEqualTo(String value) {
            addCriterion("canton_lat >=", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatLessThan(String value) {
            addCriterion("canton_lat <", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatLessThanOrEqualTo(String value) {
            addCriterion("canton_lat <=", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatLike(String value) {
            addCriterion("canton_lat like", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatNotLike(String value) {
            addCriterion("canton_lat not like", value, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatIn(List<String> values) {
            addCriterion("canton_lat in", values, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatNotIn(List<String> values) {
            addCriterion("canton_lat not in", values, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatBetween(String value1, String value2) {
            addCriterion("canton_lat between", value1, value2, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLatNotBetween(String value1, String value2) {
            addCriterion("canton_lat not between", value1, value2, "cantonLat");
            return (Criteria) this;
        }

        public Criteria andCantonLngIsNull() {
            addCriterion("canton_lng is null");
            return (Criteria) this;
        }

        public Criteria andCantonLngIsNotNull() {
            addCriterion("canton_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCantonLngEqualTo(String value) {
            addCriterion("canton_lng =", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngNotEqualTo(String value) {
            addCriterion("canton_lng <>", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngGreaterThan(String value) {
            addCriterion("canton_lng >", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngGreaterThanOrEqualTo(String value) {
            addCriterion("canton_lng >=", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngLessThan(String value) {
            addCriterion("canton_lng <", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngLessThanOrEqualTo(String value) {
            addCriterion("canton_lng <=", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngLike(String value) {
            addCriterion("canton_lng like", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngNotLike(String value) {
            addCriterion("canton_lng not like", value, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngIn(List<String> values) {
            addCriterion("canton_lng in", values, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngNotIn(List<String> values) {
            addCriterion("canton_lng not in", values, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngBetween(String value1, String value2) {
            addCriterion("canton_lng between", value1, value2, "cantonLng");
            return (Criteria) this;
        }

        public Criteria andCantonLngNotBetween(String value1, String value2) {
            addCriterion("canton_lng not between", value1, value2, "cantonLng");
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