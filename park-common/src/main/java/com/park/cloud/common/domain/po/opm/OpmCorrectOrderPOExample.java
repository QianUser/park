package com.park.cloud.common.domain.po.opm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OpmCorrectOrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpmCorrectOrderPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCorrectIdIsNull() {
            addCriterion("correct_id is null");
            return (Criteria) this;
        }

        public Criteria andCorrectIdIsNotNull() {
            addCriterion("correct_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectIdEqualTo(Integer value) {
            addCriterion("correct_id =", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdNotEqualTo(Integer value) {
            addCriterion("correct_id <>", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdGreaterThan(Integer value) {
            addCriterion("correct_id >", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_id >=", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdLessThan(Integer value) {
            addCriterion("correct_id <", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdLessThanOrEqualTo(Integer value) {
            addCriterion("correct_id <=", value, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdIn(List<Integer> values) {
            addCriterion("correct_id in", values, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdNotIn(List<Integer> values) {
            addCriterion("correct_id not in", values, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdBetween(Integer value1, Integer value2) {
            addCriterion("correct_id between", value1, value2, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_id not between", value1, value2, "correctId");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIsNull() {
            addCriterion("\"correct _code\" is null");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIsNotNull() {
            addCriterion("\"correct _code\" is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeEqualTo(String value) {
            addCriterion("\"correct _code\" =", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotEqualTo(String value) {
            addCriterion("\"correct _code\" <>", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeGreaterThan(String value) {
            addCriterion("\"correct _code\" >", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("\"correct _code\" >=", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLessThan(String value) {
            addCriterion("\"correct _code\" <", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLessThanOrEqualTo(String value) {
            addCriterion("\"correct _code\" <=", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeLike(String value) {
            addCriterion("\"correct _code\" like", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotLike(String value) {
            addCriterion("\"correct _code\" not like", value, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeIn(List<String> values) {
            addCriterion("\"correct _code\" in", values, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotIn(List<String> values) {
            addCriterion("\"correct _code\" not in", values, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeBetween(String value1, String value2) {
            addCriterion("\"correct _code\" between", value1, value2, "correctCode");
            return (Criteria) this;
        }

        public Criteria andCorrectCodeNotBetween(String value1, String value2) {
            addCriterion("\"correct _code\" not between", value1, value2, "correctCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeIsNull() {
            addCriterion("berth_code is null");
            return (Criteria) this;
        }

        public Criteria andBerthCodeIsNotNull() {
            addCriterion("berth_code is not null");
            return (Criteria) this;
        }

        public Criteria andBerthCodeEqualTo(String value) {
            addCriterion("berth_code =", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotEqualTo(String value) {
            addCriterion("berth_code <>", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeGreaterThan(String value) {
            addCriterion("berth_code >", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("berth_code >=", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLessThan(String value) {
            addCriterion("berth_code <", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLessThanOrEqualTo(String value) {
            addCriterion("berth_code <=", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeLike(String value) {
            addCriterion("berth_code like", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotLike(String value) {
            addCriterion("berth_code not like", value, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeIn(List<String> values) {
            addCriterion("berth_code in", values, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotIn(List<String> values) {
            addCriterion("berth_code not in", values, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeBetween(String value1, String value2) {
            addCriterion("berth_code between", value1, value2, "berthCode");
            return (Criteria) this;
        }

        public Criteria andBerthCodeNotBetween(String value1, String value2) {
            addCriterion("berth_code not between", value1, value2, "berthCode");
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

        public Criteria andXjIdIsNull() {
            addCriterion("xj_id is null");
            return (Criteria) this;
        }

        public Criteria andXjIdIsNotNull() {
            addCriterion("xj_id is not null");
            return (Criteria) this;
        }

        public Criteria andXjIdEqualTo(Integer value) {
            addCriterion("xj_id =", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdNotEqualTo(Integer value) {
            addCriterion("xj_id <>", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdGreaterThan(Integer value) {
            addCriterion("xj_id >", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xj_id >=", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdLessThan(Integer value) {
            addCriterion("xj_id <", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdLessThanOrEqualTo(Integer value) {
            addCriterion("xj_id <=", value, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdIn(List<Integer> values) {
            addCriterion("xj_id in", values, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdNotIn(List<Integer> values) {
            addCriterion("xj_id not in", values, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdBetween(Integer value1, Integer value2) {
            addCriterion("xj_id between", value1, value2, "xjId");
            return (Criteria) this;
        }

        public Criteria andXjIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xj_id not between", value1, value2, "xjId");
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
            addCriterionForJDBCDate("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterionForJDBCDate("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterionForJDBCDate("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andParkStatusIsNull() {
            addCriterion("park_status is null");
            return (Criteria) this;
        }

        public Criteria andParkStatusIsNotNull() {
            addCriterion("park_status is not null");
            return (Criteria) this;
        }

        public Criteria andParkStatusEqualTo(Integer value) {
            addCriterion("park_status =", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotEqualTo(Integer value) {
            addCriterion("park_status <>", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusGreaterThan(Integer value) {
            addCriterion("park_status >", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("park_status >=", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusLessThan(Integer value) {
            addCriterion("park_status <", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusLessThanOrEqualTo(Integer value) {
            addCriterion("park_status <=", value, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusIn(List<Integer> values) {
            addCriterion("park_status in", values, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotIn(List<Integer> values) {
            addCriterion("park_status not in", values, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusBetween(Integer value1, Integer value2) {
            addCriterion("park_status between", value1, value2, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andParkStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("park_status not between", value1, value2, "parkStatus");
            return (Criteria) this;
        }

        public Criteria andCorrectStateIsNull() {
            addCriterion("correct_state is null");
            return (Criteria) this;
        }

        public Criteria andCorrectStateIsNotNull() {
            addCriterion("correct_state is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectStateEqualTo(Integer value) {
            addCriterion("correct_state =", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateNotEqualTo(Integer value) {
            addCriterion("correct_state <>", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateGreaterThan(Integer value) {
            addCriterion("correct_state >", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("correct_state >=", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateLessThan(Integer value) {
            addCriterion("correct_state <", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateLessThanOrEqualTo(Integer value) {
            addCriterion("correct_state <=", value, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateIn(List<Integer> values) {
            addCriterion("correct_state in", values, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateNotIn(List<Integer> values) {
            addCriterion("correct_state not in", values, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateBetween(Integer value1, Integer value2) {
            addCriterion("correct_state between", value1, value2, "correctState");
            return (Criteria) this;
        }

        public Criteria andCorrectStateNotBetween(Integer value1, Integer value2) {
            addCriterion("correct_state not between", value1, value2, "correctState");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterionForJDBCDate("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(Integer value) {
            addCriterion("audit_user_id =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(Integer value) {
            addCriterion("audit_user_id <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(Integer value) {
            addCriterion("audit_user_id >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(Integer value) {
            addCriterion("audit_user_id <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<Integer> values) {
            addCriterion("audit_user_id in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<Integer> values) {
            addCriterion("audit_user_id not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andDownStateIsNull() {
            addCriterion("down_state is null");
            return (Criteria) this;
        }

        public Criteria andDownStateIsNotNull() {
            addCriterion("down_state is not null");
            return (Criteria) this;
        }

        public Criteria andDownStateEqualTo(Integer value) {
            addCriterion("down_state =", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateNotEqualTo(Integer value) {
            addCriterion("down_state <>", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateGreaterThan(Integer value) {
            addCriterion("down_state >", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_state >=", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateLessThan(Integer value) {
            addCriterion("down_state <", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateLessThanOrEqualTo(Integer value) {
            addCriterion("down_state <=", value, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateIn(List<Integer> values) {
            addCriterion("down_state in", values, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateNotIn(List<Integer> values) {
            addCriterion("down_state not in", values, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateBetween(Integer value1, Integer value2) {
            addCriterion("down_state between", value1, value2, "downState");
            return (Criteria) this;
        }

        public Criteria andDownStateNotBetween(Integer value1, Integer value2) {
            addCriterion("down_state not between", value1, value2, "downState");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNull() {
            addCriterion("result_state is null");
            return (Criteria) this;
        }

        public Criteria andResultStateIsNotNull() {
            addCriterion("result_state is not null");
            return (Criteria) this;
        }

        public Criteria andResultStateEqualTo(Integer value) {
            addCriterion("result_state =", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotEqualTo(Integer value) {
            addCriterion("result_state <>", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThan(Integer value) {
            addCriterion("result_state >", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_state >=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThan(Integer value) {
            addCriterion("result_state <", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateLessThanOrEqualTo(Integer value) {
            addCriterion("result_state <=", value, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateIn(List<Integer> values) {
            addCriterion("result_state in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotIn(List<Integer> values) {
            addCriterion("result_state not in", values, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateBetween(Integer value1, Integer value2) {
            addCriterion("result_state between", value1, value2, "resultState");
            return (Criteria) this;
        }

        public Criteria andResultStateNotBetween(Integer value1, Integer value2) {
            addCriterion("result_state not between", value1, value2, "resultState");
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
    }
}