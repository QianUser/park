package com.park.cloud.common.domain.po.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAreaAssPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAreaAssPOExample() {
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

        public Criteria andAreaassIdIsNull() {
            addCriterion("areaass_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaassIdIsNotNull() {
            addCriterion("areaass_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaassIdEqualTo(Integer value) {
            addCriterion("areaass_id =", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdNotEqualTo(Integer value) {
            addCriterion("areaass_id <>", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdGreaterThan(Integer value) {
            addCriterion("areaass_id >", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaass_id >=", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdLessThan(Integer value) {
            addCriterion("areaass_id <", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdLessThanOrEqualTo(Integer value) {
            addCriterion("areaass_id <=", value, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdIn(List<Integer> values) {
            addCriterion("areaass_id in", values, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdNotIn(List<Integer> values) {
            addCriterion("areaass_id not in", values, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdBetween(Integer value1, Integer value2) {
            addCriterion("areaass_id between", value1, value2, "areaassId");
            return (Criteria) this;
        }

        public Criteria andAreaassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("areaass_id not between", value1, value2, "areaassId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeIsNull() {
            addCriterion("area_ass_type is null");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeIsNotNull() {
            addCriterion("area_ass_type is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeEqualTo(Integer value) {
            addCriterion("area_ass_type =", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeNotEqualTo(Integer value) {
            addCriterion("area_ass_type <>", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeGreaterThan(Integer value) {
            addCriterion("area_ass_type >", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_ass_type >=", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeLessThan(Integer value) {
            addCriterion("area_ass_type <", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeLessThanOrEqualTo(Integer value) {
            addCriterion("area_ass_type <=", value, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeIn(List<Integer> values) {
            addCriterion("area_ass_type in", values, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeNotIn(List<Integer> values) {
            addCriterion("area_ass_type not in", values, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeBetween(Integer value1, Integer value2) {
            addCriterion("area_ass_type between", value1, value2, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andAreaAssTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("area_ass_type not between", value1, value2, "areaAssType");
            return (Criteria) this;
        }

        public Criteria andCityIdsIsNull() {
            addCriterion("city_ids is null");
            return (Criteria) this;
        }

        public Criteria andCityIdsIsNotNull() {
            addCriterion("city_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdsEqualTo(String value) {
            addCriterion("city_ids =", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotEqualTo(String value) {
            addCriterion("city_ids <>", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsGreaterThan(String value) {
            addCriterion("city_ids >", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("city_ids >=", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLessThan(String value) {
            addCriterion("city_ids <", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLessThanOrEqualTo(String value) {
            addCriterion("city_ids <=", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsLike(String value) {
            addCriterion("city_ids like", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotLike(String value) {
            addCriterion("city_ids not like", value, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsIn(List<String> values) {
            addCriterion("city_ids in", values, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotIn(List<String> values) {
            addCriterion("city_ids not in", values, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsBetween(String value1, String value2) {
            addCriterion("city_ids between", value1, value2, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCityIdsNotBetween(String value1, String value2) {
            addCriterion("city_ids not between", value1, value2, "cityIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsIsNull() {
            addCriterion("canton_ids is null");
            return (Criteria) this;
        }

        public Criteria andCantonIdsIsNotNull() {
            addCriterion("canton_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCantonIdsEqualTo(String value) {
            addCriterion("canton_ids =", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsNotEqualTo(String value) {
            addCriterion("canton_ids <>", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsGreaterThan(String value) {
            addCriterion("canton_ids >", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsGreaterThanOrEqualTo(String value) {
            addCriterion("canton_ids >=", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsLessThan(String value) {
            addCriterion("canton_ids <", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsLessThanOrEqualTo(String value) {
            addCriterion("canton_ids <=", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsLike(String value) {
            addCriterion("canton_ids like", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsNotLike(String value) {
            addCriterion("canton_ids not like", value, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsIn(List<String> values) {
            addCriterion("canton_ids in", values, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsNotIn(List<String> values) {
            addCriterion("canton_ids not in", values, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsBetween(String value1, String value2) {
            addCriterion("canton_ids between", value1, value2, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andCantonIdsNotBetween(String value1, String value2) {
            addCriterion("canton_ids not between", value1, value2, "cantonIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNull() {
            addCriterion("area_ids is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIsNotNull() {
            addCriterion("area_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdsEqualTo(String value) {
            addCriterion("area_ids =", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotEqualTo(String value) {
            addCriterion("area_ids <>", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThan(String value) {
            addCriterion("area_ids >", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsGreaterThanOrEqualTo(String value) {
            addCriterion("area_ids >=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThan(String value) {
            addCriterion("area_ids <", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLessThanOrEqualTo(String value) {
            addCriterion("area_ids <=", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsLike(String value) {
            addCriterion("area_ids like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotLike(String value) {
            addCriterion("area_ids not like", value, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsIn(List<String> values) {
            addCriterion("area_ids in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotIn(List<String> values) {
            addCriterion("area_ids not in", values, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsBetween(String value1, String value2) {
            addCriterion("area_ids between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andAreaIdsNotBetween(String value1, String value2) {
            addCriterion("area_ids not between", value1, value2, "areaIds");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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