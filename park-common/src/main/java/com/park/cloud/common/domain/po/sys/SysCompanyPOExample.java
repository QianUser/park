package com.park.cloud.common.domain.po.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCompanyPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCompanyPOExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeEqualTo(Integer value) {
            addCriterion("company_type =", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotEqualTo(Integer value) {
            addCriterion("company_type <>", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThan(Integer value) {
            addCriterion("company_type >", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_type >=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThan(Integer value) {
            addCriterion("company_type <", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("company_type <=", value, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeIn(List<Integer> values) {
            addCriterion("company_type in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotIn(List<Integer> values) {
            addCriterion("company_type not in", values, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeBetween(Integer value1, Integer value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNull() {
            addCriterion("company_fax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIsNotNull() {
            addCriterion("company_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxEqualTo(String value) {
            addCriterion("company_fax =", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotEqualTo(String value) {
            addCriterion("company_fax <>", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThan(String value) {
            addCriterion("company_fax >", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxGreaterThanOrEqualTo(String value) {
            addCriterion("company_fax >=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThan(String value) {
            addCriterion("company_fax <", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLessThanOrEqualTo(String value) {
            addCriterion("company_fax <=", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxLike(String value) {
            addCriterion("company_fax like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotLike(String value) {
            addCriterion("company_fax not like", value, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxIn(List<String> values) {
            addCriterion("company_fax in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotIn(List<String> values) {
            addCriterion("company_fax not in", values, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxBetween(String value1, String value2) {
            addCriterion("company_fax between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyFaxNotBetween(String value1, String value2) {
            addCriterion("company_fax not between", value1, value2, "companyFax");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadIsNull() {
            addCriterion("company_head is null");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadIsNotNull() {
            addCriterion("company_head is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadEqualTo(String value) {
            addCriterion("company_head =", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadNotEqualTo(String value) {
            addCriterion("company_head <>", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadGreaterThan(String value) {
            addCriterion("company_head >", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadGreaterThanOrEqualTo(String value) {
            addCriterion("company_head >=", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadLessThan(String value) {
            addCriterion("company_head <", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadLessThanOrEqualTo(String value) {
            addCriterion("company_head <=", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadLike(String value) {
            addCriterion("company_head like", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadNotLike(String value) {
            addCriterion("company_head not like", value, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadIn(List<String> values) {
            addCriterion("company_head in", values, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadNotIn(List<String> values) {
            addCriterion("company_head not in", values, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadBetween(String value1, String value2) {
            addCriterion("company_head between", value1, value2, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyHeadNotBetween(String value1, String value2) {
            addCriterion("company_head not between", value1, value2, "companyHead");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
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

        public Criteria andPeccThumbnailPicIsNull() {
            addCriterion("pecc_thumbnail_pic is null");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicIsNotNull() {
            addCriterion("pecc_thumbnail_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicEqualTo(String value) {
            addCriterion("pecc_thumbnail_pic =", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicNotEqualTo(String value) {
            addCriterion("pecc_thumbnail_pic <>", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicGreaterThan(String value) {
            addCriterion("pecc_thumbnail_pic >", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicGreaterThanOrEqualTo(String value) {
            addCriterion("pecc_thumbnail_pic >=", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicLessThan(String value) {
            addCriterion("pecc_thumbnail_pic <", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicLessThanOrEqualTo(String value) {
            addCriterion("pecc_thumbnail_pic <=", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicLike(String value) {
            addCriterion("pecc_thumbnail_pic like", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicNotLike(String value) {
            addCriterion("pecc_thumbnail_pic not like", value, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicIn(List<String> values) {
            addCriterion("pecc_thumbnail_pic in", values, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicNotIn(List<String> values) {
            addCriterion("pecc_thumbnail_pic not in", values, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicBetween(String value1, String value2) {
            addCriterion("pecc_thumbnail_pic between", value1, value2, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andPeccThumbnailPicNotBetween(String value1, String value2) {
            addCriterion("pecc_thumbnail_pic not between", value1, value2, "peccThumbnailPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicIsNull() {
            addCriterion("company_pic is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPicIsNotNull() {
            addCriterion("company_pic is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPicEqualTo(String value) {
            addCriterion("company_pic =", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicNotEqualTo(String value) {
            addCriterion("company_pic <>", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicGreaterThan(String value) {
            addCriterion("company_pic >", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicGreaterThanOrEqualTo(String value) {
            addCriterion("company_pic >=", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicLessThan(String value) {
            addCriterion("company_pic <", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicLessThanOrEqualTo(String value) {
            addCriterion("company_pic <=", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicLike(String value) {
            addCriterion("company_pic like", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicNotLike(String value) {
            addCriterion("company_pic not like", value, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicIn(List<String> values) {
            addCriterion("company_pic in", values, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicNotIn(List<String> values) {
            addCriterion("company_pic not in", values, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicBetween(String value1, String value2) {
            addCriterion("company_pic between", value1, value2, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyPicNotBetween(String value1, String value2) {
            addCriterion("company_pic not between", value1, value2, "companyPic");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIsNull() {
            addCriterion("company_lat is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIsNotNull() {
            addCriterion("company_lat is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLatEqualTo(String value) {
            addCriterion("company_lat =", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotEqualTo(String value) {
            addCriterion("company_lat <>", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatGreaterThan(String value) {
            addCriterion("company_lat >", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatGreaterThanOrEqualTo(String value) {
            addCriterion("company_lat >=", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLessThan(String value) {
            addCriterion("company_lat <", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLessThanOrEqualTo(String value) {
            addCriterion("company_lat <=", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatLike(String value) {
            addCriterion("company_lat like", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotLike(String value) {
            addCriterion("company_lat not like", value, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatIn(List<String> values) {
            addCriterion("company_lat in", values, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotIn(List<String> values) {
            addCriterion("company_lat not in", values, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatBetween(String value1, String value2) {
            addCriterion("company_lat between", value1, value2, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLatNotBetween(String value1, String value2) {
            addCriterion("company_lat not between", value1, value2, "companyLat");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIsNull() {
            addCriterion("company_lng is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIsNotNull() {
            addCriterion("company_lng is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLngEqualTo(String value) {
            addCriterion("company_lng =", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotEqualTo(String value) {
            addCriterion("company_lng <>", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngGreaterThan(String value) {
            addCriterion("company_lng >", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngGreaterThanOrEqualTo(String value) {
            addCriterion("company_lng >=", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLessThan(String value) {
            addCriterion("company_lng <", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLessThanOrEqualTo(String value) {
            addCriterion("company_lng <=", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngLike(String value) {
            addCriterion("company_lng like", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotLike(String value) {
            addCriterion("company_lng not like", value, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngIn(List<String> values) {
            addCriterion("company_lng in", values, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotIn(List<String> values) {
            addCriterion("company_lng not in", values, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngBetween(String value1, String value2) {
            addCriterion("company_lng between", value1, value2, "companyLng");
            return (Criteria) this;
        }

        public Criteria andCompanyLngNotBetween(String value1, String value2) {
            addCriterion("company_lng not between", value1, value2, "companyLng");
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