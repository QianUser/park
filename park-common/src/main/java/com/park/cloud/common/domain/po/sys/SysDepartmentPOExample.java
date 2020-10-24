package com.park.cloud.common.domain.po.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDepartmentPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDepartmentPOExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIsNull() {
            addCriterion("parent_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIsNotNull() {
            addCriterion("parent_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdEqualTo(Integer value) {
            addCriterion("parent_dept_id =", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotEqualTo(Integer value) {
            addCriterion("parent_dept_id <>", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdGreaterThan(Integer value) {
            addCriterion("parent_dept_id >", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_dept_id >=", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdLessThan(Integer value) {
            addCriterion("parent_dept_id <", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_dept_id <=", value, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdIn(List<Integer> values) {
            addCriterion("parent_dept_id in", values, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotIn(List<Integer> values) {
            addCriterion("parent_dept_id not in", values, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_dept_id between", value1, value2, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andParentDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_dept_id not between", value1, value2, "parentDeptId");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkIsNull() {
            addCriterion("dept_remark is null");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkIsNotNull() {
            addCriterion("dept_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkEqualTo(String value) {
            addCriterion("dept_remark =", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkNotEqualTo(String value) {
            addCriterion("dept_remark <>", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkGreaterThan(String value) {
            addCriterion("dept_remark >", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("dept_remark >=", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkLessThan(String value) {
            addCriterion("dept_remark <", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkLessThanOrEqualTo(String value) {
            addCriterion("dept_remark <=", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkLike(String value) {
            addCriterion("dept_remark like", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkNotLike(String value) {
            addCriterion("dept_remark not like", value, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkIn(List<String> values) {
            addCriterion("dept_remark in", values, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkNotIn(List<String> values) {
            addCriterion("dept_remark not in", values, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkBetween(String value1, String value2) {
            addCriterion("dept_remark between", value1, value2, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptRemarkNotBetween(String value1, String value2) {
            addCriterion("dept_remark not between", value1, value2, "deptRemark");
            return (Criteria) this;
        }

        public Criteria andDeptStatusIsNull() {
            addCriterion("dept_status is null");
            return (Criteria) this;
        }

        public Criteria andDeptStatusIsNotNull() {
            addCriterion("dept_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeptStatusEqualTo(Integer value) {
            addCriterion("dept_status =", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusNotEqualTo(Integer value) {
            addCriterion("dept_status <>", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusGreaterThan(Integer value) {
            addCriterion("dept_status >", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_status >=", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusLessThan(Integer value) {
            addCriterion("dept_status <", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dept_status <=", value, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusIn(List<Integer> values) {
            addCriterion("dept_status in", values, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusNotIn(List<Integer> values) {
            addCriterion("dept_status not in", values, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusBetween(Integer value1, Integer value2) {
            addCriterion("dept_status between", value1, value2, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_status not between", value1, value2, "deptStatus");
            return (Criteria) this;
        }

        public Criteria andDeptSortIsNull() {
            addCriterion("dept_sort is null");
            return (Criteria) this;
        }

        public Criteria andDeptSortIsNotNull() {
            addCriterion("dept_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDeptSortEqualTo(Integer value) {
            addCriterion("dept_sort =", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortNotEqualTo(Integer value) {
            addCriterion("dept_sort <>", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortGreaterThan(Integer value) {
            addCriterion("dept_sort >", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_sort >=", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortLessThan(Integer value) {
            addCriterion("dept_sort <", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortLessThanOrEqualTo(Integer value) {
            addCriterion("dept_sort <=", value, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortIn(List<Integer> values) {
            addCriterion("dept_sort in", values, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortNotIn(List<Integer> values) {
            addCriterion("dept_sort not in", values, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortBetween(Integer value1, Integer value2) {
            addCriterion("dept_sort between", value1, value2, "deptSort");
            return (Criteria) this;
        }

        public Criteria andDeptSortNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_sort not between", value1, value2, "deptSort");
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

        public Criteria andDeptTypeIdIsNull() {
            addCriterion("dept_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdIsNotNull() {
            addCriterion("dept_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdEqualTo(Integer value) {
            addCriterion("dept_type_id =", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotEqualTo(Integer value) {
            addCriterion("dept_type_id <>", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdGreaterThan(Integer value) {
            addCriterion("dept_type_id >", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_type_id >=", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdLessThan(Integer value) {
            addCriterion("dept_type_id <", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_type_id <=", value, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdIn(List<Integer> values) {
            addCriterion("dept_type_id in", values, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotIn(List<Integer> values) {
            addCriterion("dept_type_id not in", values, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_type_id between", value1, value2, "deptTypeId");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_type_id not between", value1, value2, "deptTypeId");
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

        public Criteria andDeptRelationIdIsNull() {
            addCriterion("dept_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdIsNotNull() {
            addCriterion("dept_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdEqualTo(Integer value) {
            addCriterion("dept_relation_id =", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdNotEqualTo(Integer value) {
            addCriterion("dept_relation_id <>", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdGreaterThan(Integer value) {
            addCriterion("dept_relation_id >", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_relation_id >=", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdLessThan(Integer value) {
            addCriterion("dept_relation_id <", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_relation_id <=", value, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdIn(List<Integer> values) {
            addCriterion("dept_relation_id in", values, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdNotIn(List<Integer> values) {
            addCriterion("dept_relation_id not in", values, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_relation_id between", value1, value2, "deptRelationId");
            return (Criteria) this;
        }

        public Criteria andDeptRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_relation_id not between", value1, value2, "deptRelationId");
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