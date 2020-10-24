package com.park.cloud.common.domain.po.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictCityPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictCityPOExample() {
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

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityRemarkIsNull() {
            addCriterion("city_remark is null");
            return (Criteria) this;
        }

        public Criteria andCityRemarkIsNotNull() {
            addCriterion("city_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCityRemarkEqualTo(String value) {
            addCriterion("city_remark =", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkNotEqualTo(String value) {
            addCriterion("city_remark <>", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkGreaterThan(String value) {
            addCriterion("city_remark >", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("city_remark >=", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkLessThan(String value) {
            addCriterion("city_remark <", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkLessThanOrEqualTo(String value) {
            addCriterion("city_remark <=", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkLike(String value) {
            addCriterion("city_remark like", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkNotLike(String value) {
            addCriterion("city_remark not like", value, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkIn(List<String> values) {
            addCriterion("city_remark in", values, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkNotIn(List<String> values) {
            addCriterion("city_remark not in", values, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkBetween(String value1, String value2) {
            addCriterion("city_remark between", value1, value2, "cityRemark");
            return (Criteria) this;
        }

        public Criteria andCityRemarkNotBetween(String value1, String value2) {
            addCriterion("city_remark not between", value1, value2, "cityRemark");
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

        public Criteria andCityLatIsNull() {
            addCriterion("city_lat is null");
            return (Criteria) this;
        }

        public Criteria andCityLatIsNotNull() {
            addCriterion("city_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCityLatEqualTo(String value) {
            addCriterion("city_lat =", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatNotEqualTo(String value) {
            addCriterion("city_lat <>", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatGreaterThan(String value) {
            addCriterion("city_lat >", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatGreaterThanOrEqualTo(String value) {
            addCriterion("city_lat >=", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatLessThan(String value) {
            addCriterion("city_lat <", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatLessThanOrEqualTo(String value) {
            addCriterion("city_lat <=", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatLike(String value) {
            addCriterion("city_lat like", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatNotLike(String value) {
            addCriterion("city_lat not like", value, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatIn(List<String> values) {
            addCriterion("city_lat in", values, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatNotIn(List<String> values) {
            addCriterion("city_lat not in", values, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatBetween(String value1, String value2) {
            addCriterion("city_lat between", value1, value2, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLatNotBetween(String value1, String value2) {
            addCriterion("city_lat not between", value1, value2, "cityLat");
            return (Criteria) this;
        }

        public Criteria andCityLngIsNull() {
            addCriterion("city_lng is null");
            return (Criteria) this;
        }

        public Criteria andCityLngIsNotNull() {
            addCriterion("city_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCityLngEqualTo(String value) {
            addCriterion("city_lng =", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngNotEqualTo(String value) {
            addCriterion("city_lng <>", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngGreaterThan(String value) {
            addCriterion("city_lng >", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngGreaterThanOrEqualTo(String value) {
            addCriterion("city_lng >=", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngLessThan(String value) {
            addCriterion("city_lng <", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngLessThanOrEqualTo(String value) {
            addCriterion("city_lng <=", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngLike(String value) {
            addCriterion("city_lng like", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngNotLike(String value) {
            addCriterion("city_lng not like", value, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngIn(List<String> values) {
            addCriterion("city_lng in", values, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngNotIn(List<String> values) {
            addCriterion("city_lng not in", values, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngBetween(String value1, String value2) {
            addCriterion("city_lng between", value1, value2, "cityLng");
            return (Criteria) this;
        }

        public Criteria andCityLngNotBetween(String value1, String value2) {
            addCriterion("city_lng not between", value1, value2, "cityLng");
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