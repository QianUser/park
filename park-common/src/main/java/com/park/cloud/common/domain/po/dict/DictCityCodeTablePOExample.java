package com.park.cloud.common.domain.po.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictCityCodeTablePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictCityCodeTablePOExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
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

        public Criteria andNumberCodeIsNull() {
            addCriterion("number_code is null");
            return (Criteria) this;
        }

        public Criteria andNumberCodeIsNotNull() {
            addCriterion("number_code is not null");
            return (Criteria) this;
        }

        public Criteria andNumberCodeEqualTo(String value) {
            addCriterion("number_code =", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeNotEqualTo(String value) {
            addCriterion("number_code <>", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeGreaterThan(String value) {
            addCriterion("number_code >", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("number_code >=", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeLessThan(String value) {
            addCriterion("number_code <", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeLessThanOrEqualTo(String value) {
            addCriterion("number_code <=", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeLike(String value) {
            addCriterion("number_code like", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeNotLike(String value) {
            addCriterion("number_code not like", value, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeIn(List<String> values) {
            addCriterion("number_code in", values, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeNotIn(List<String> values) {
            addCriterion("number_code not in", values, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeBetween(String value1, String value2) {
            addCriterion("number_code between", value1, value2, "numberCode");
            return (Criteria) this;
        }

        public Criteria andNumberCodeNotBetween(String value1, String value2) {
            addCriterion("number_code not between", value1, value2, "numberCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeIsNull() {
            addCriterion("letter_code is null");
            return (Criteria) this;
        }

        public Criteria andLetterCodeIsNotNull() {
            addCriterion("letter_code is not null");
            return (Criteria) this;
        }

        public Criteria andLetterCodeEqualTo(String value) {
            addCriterion("letter_code =", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotEqualTo(String value) {
            addCriterion("letter_code <>", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeGreaterThan(String value) {
            addCriterion("letter_code >", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("letter_code >=", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLessThan(String value) {
            addCriterion("letter_code <", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLessThanOrEqualTo(String value) {
            addCriterion("letter_code <=", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeLike(String value) {
            addCriterion("letter_code like", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotLike(String value) {
            addCriterion("letter_code not like", value, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeIn(List<String> values) {
            addCriterion("letter_code in", values, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotIn(List<String> values) {
            addCriterion("letter_code not in", values, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeBetween(String value1, String value2) {
            addCriterion("letter_code between", value1, value2, "letterCode");
            return (Criteria) this;
        }

        public Criteria andLetterCodeNotBetween(String value1, String value2) {
            addCriterion("letter_code not between", value1, value2, "letterCode");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNull() {
            addCriterion("code_type is null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNotNull() {
            addCriterion("code_type is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeEqualTo(Integer value) {
            addCriterion("code_type =", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotEqualTo(Integer value) {
            addCriterion("code_type <>", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThan(Integer value) {
            addCriterion("code_type >", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_type >=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThan(Integer value) {
            addCriterion("code_type <", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("code_type <=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIn(List<Integer> values) {
            addCriterion("code_type in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotIn(List<Integer> values) {
            addCriterion("code_type not in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeBetween(Integer value1, Integer value2) {
            addCriterion("code_type between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("code_type not between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeIsNull() {
            addCriterion("parent_number_code is null");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeIsNotNull() {
            addCriterion("parent_number_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeEqualTo(String value) {
            addCriterion("parent_number_code =", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeNotEqualTo(String value) {
            addCriterion("parent_number_code <>", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeGreaterThan(String value) {
            addCriterion("parent_number_code >", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_number_code >=", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeLessThan(String value) {
            addCriterion("parent_number_code <", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_number_code <=", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeLike(String value) {
            addCriterion("parent_number_code like", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeNotLike(String value) {
            addCriterion("parent_number_code not like", value, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeIn(List<String> values) {
            addCriterion("parent_number_code in", values, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeNotIn(List<String> values) {
            addCriterion("parent_number_code not in", values, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeBetween(String value1, String value2) {
            addCriterion("parent_number_code between", value1, value2, "parentNumberCode");
            return (Criteria) this;
        }

        public Criteria andParentNumberCodeNotBetween(String value1, String value2) {
            addCriterion("parent_number_code not between", value1, value2, "parentNumberCode");
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