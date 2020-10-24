package com.park.cloud.common.domain.po.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRolePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRolePOExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIsNull() {
            addCriterion("role_remark is null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIsNotNull() {
            addCriterion("role_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkEqualTo(String value) {
            addCriterion("role_remark =", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotEqualTo(String value) {
            addCriterion("role_remark <>", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThan(String value) {
            addCriterion("role_remark >", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("role_remark >=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThan(String value) {
            addCriterion("role_remark <", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThanOrEqualTo(String value) {
            addCriterion("role_remark <=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLike(String value) {
            addCriterion("role_remark like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotLike(String value) {
            addCriterion("role_remark not like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIn(List<String> values) {
            addCriterion("role_remark in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotIn(List<String> values) {
            addCriterion("role_remark not in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkBetween(String value1, String value2) {
            addCriterion("role_remark between", value1, value2, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotBetween(String value1, String value2) {
            addCriterion("role_remark not between", value1, value2, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andPageIdsIsNull() {
            addCriterion("page_ids is null");
            return (Criteria) this;
        }

        public Criteria andPageIdsIsNotNull() {
            addCriterion("page_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPageIdsEqualTo(String value) {
            addCriterion("page_ids =", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsNotEqualTo(String value) {
            addCriterion("page_ids <>", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsGreaterThan(String value) {
            addCriterion("page_ids >", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsGreaterThanOrEqualTo(String value) {
            addCriterion("page_ids >=", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsLessThan(String value) {
            addCriterion("page_ids <", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsLessThanOrEqualTo(String value) {
            addCriterion("page_ids <=", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsLike(String value) {
            addCriterion("page_ids like", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsNotLike(String value) {
            addCriterion("page_ids not like", value, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsIn(List<String> values) {
            addCriterion("page_ids in", values, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsNotIn(List<String> values) {
            addCriterion("page_ids not in", values, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsBetween(String value1, String value2) {
            addCriterion("page_ids between", value1, value2, "pageIds");
            return (Criteria) this;
        }

        public Criteria andPageIdsNotBetween(String value1, String value2) {
            addCriterion("page_ids not between", value1, value2, "pageIds");
            return (Criteria) this;
        }

        public Criteria andMenuContentIsNull() {
            addCriterion("menu_content is null");
            return (Criteria) this;
        }

        public Criteria andMenuContentIsNotNull() {
            addCriterion("menu_content is not null");
            return (Criteria) this;
        }

        public Criteria andMenuContentEqualTo(String value) {
            addCriterion("menu_content =", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotEqualTo(String value) {
            addCriterion("menu_content <>", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentGreaterThan(String value) {
            addCriterion("menu_content >", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentGreaterThanOrEqualTo(String value) {
            addCriterion("menu_content >=", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLessThan(String value) {
            addCriterion("menu_content <", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLessThanOrEqualTo(String value) {
            addCriterion("menu_content <=", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentLike(String value) {
            addCriterion("menu_content like", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotLike(String value) {
            addCriterion("menu_content not like", value, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentIn(List<String> values) {
            addCriterion("menu_content in", values, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotIn(List<String> values) {
            addCriterion("menu_content not in", values, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentBetween(String value1, String value2) {
            addCriterion("menu_content between", value1, value2, "menuContent");
            return (Criteria) this;
        }

        public Criteria andMenuContentNotBetween(String value1, String value2) {
            addCriterion("menu_content not between", value1, value2, "menuContent");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNull() {
            addCriterion("role_status is null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNotNull() {
            addCriterion("role_status is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusEqualTo(Integer value) {
            addCriterion("role_status =", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotEqualTo(Integer value) {
            addCriterion("role_status <>", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThan(Integer value) {
            addCriterion("role_status >", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_status >=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThan(Integer value) {
            addCriterion("role_status <", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("role_status <=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIn(List<Integer> values) {
            addCriterion("role_status in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotIn(List<Integer> values) {
            addCriterion("role_status not in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusBetween(Integer value1, Integer value2) {
            addCriterion("role_status between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("role_status not between", value1, value2, "roleStatus");
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