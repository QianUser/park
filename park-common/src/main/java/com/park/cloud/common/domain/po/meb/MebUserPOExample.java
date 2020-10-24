package com.park.cloud.common.domain.po.meb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MebUserPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MebUserPOExample() {
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

        public Criteria andMebUserIdIsNull() {
            addCriterion("meb_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMebUserIdIsNotNull() {
            addCriterion("meb_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMebUserIdEqualTo(Integer value) {
            addCriterion("meb_user_id =", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdNotEqualTo(Integer value) {
            addCriterion("meb_user_id <>", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdGreaterThan(Integer value) {
            addCriterion("meb_user_id >", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meb_user_id >=", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdLessThan(Integer value) {
            addCriterion("meb_user_id <", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("meb_user_id <=", value, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdIn(List<Integer> values) {
            addCriterion("meb_user_id in", values, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdNotIn(List<Integer> values) {
            addCriterion("meb_user_id not in", values, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdBetween(Integer value1, Integer value2) {
            addCriterion("meb_user_id between", value1, value2, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andMebUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meb_user_id not between", value1, value2, "mebUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIsNull() {
            addCriterion("park_user_id is null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIsNotNull() {
            addCriterion("park_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andParkUserIdEqualTo(String value) {
            addCriterion("park_user_id =", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotEqualTo(String value) {
            addCriterion("park_user_id <>", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThan(String value) {
            addCriterion("park_user_id >", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("park_user_id >=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThan(String value) {
            addCriterion("park_user_id <", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLessThanOrEqualTo(String value) {
            addCriterion("park_user_id <=", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdLike(String value) {
            addCriterion("park_user_id like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotLike(String value) {
            addCriterion("park_user_id not like", value, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdIn(List<String> values) {
            addCriterion("park_user_id in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotIn(List<String> values) {
            addCriterion("park_user_id not in", values, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdBetween(String value1, String value2) {
            addCriterion("park_user_id between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andParkUserIdNotBetween(String value1, String value2) {
            addCriterion("park_user_id not between", value1, value2, "parkUserId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileCodeIsNull() {
            addCriterion("mobile_code is null");
            return (Criteria) this;
        }

        public Criteria andMobileCodeIsNotNull() {
            addCriterion("mobile_code is not null");
            return (Criteria) this;
        }

        public Criteria andMobileCodeEqualTo(String value) {
            addCriterion("mobile_code =", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeNotEqualTo(String value) {
            addCriterion("mobile_code <>", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeGreaterThan(String value) {
            addCriterion("mobile_code >", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_code >=", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeLessThan(String value) {
            addCriterion("mobile_code <", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeLessThanOrEqualTo(String value) {
            addCriterion("mobile_code <=", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeLike(String value) {
            addCriterion("mobile_code like", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeNotLike(String value) {
            addCriterion("mobile_code not like", value, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeIn(List<String> values) {
            addCriterion("mobile_code in", values, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeNotIn(List<String> values) {
            addCriterion("mobile_code not in", values, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeBetween(String value1, String value2) {
            addCriterion("mobile_code between", value1, value2, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andMobileCodeNotBetween(String value1, String value2) {
            addCriterion("mobile_code not between", value1, value2, "mobileCode");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNull() {
            addCriterion("user_open_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIsNotNull() {
            addCriterion("user_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdEqualTo(String value) {
            addCriterion("user_open_id =", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotEqualTo(String value) {
            addCriterion("user_open_id <>", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThan(String value) {
            addCriterion("user_open_id >", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_open_id >=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThan(String value) {
            addCriterion("user_open_id <", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLessThanOrEqualTo(String value) {
            addCriterion("user_open_id <=", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdLike(String value) {
            addCriterion("user_open_id like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotLike(String value) {
            addCriterion("user_open_id not like", value, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdIn(List<String> values) {
            addCriterion("user_open_id in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotIn(List<String> values) {
            addCriterion("user_open_id not in", values, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdBetween(String value1, String value2) {
            addCriterion("user_open_id between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andUserOpenIdNotBetween(String value1, String value2) {
            addCriterion("user_open_id not between", value1, value2, "userOpenId");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNull() {
            addCriterion("pay_pwd is null");
            return (Criteria) this;
        }

        public Criteria andPayPwdIsNotNull() {
            addCriterion("pay_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPayPwdEqualTo(String value) {
            addCriterion("pay_pwd =", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotEqualTo(String value) {
            addCriterion("pay_pwd <>", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThan(String value) {
            addCriterion("pay_pwd >", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_pwd >=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThan(String value) {
            addCriterion("pay_pwd <", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLessThanOrEqualTo(String value) {
            addCriterion("pay_pwd <=", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdLike(String value) {
            addCriterion("pay_pwd like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotLike(String value) {
            addCriterion("pay_pwd not like", value, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdIn(List<String> values) {
            addCriterion("pay_pwd in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotIn(List<String> values) {
            addCriterion("pay_pwd not in", values, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdBetween(String value1, String value2) {
            addCriterion("pay_pwd between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPayPwdNotBetween(String value1, String value2) {
            addCriterion("pay_pwd not between", value1, value2, "payPwd");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameIsNull() {
            addCriterion("user_true_name is null");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameIsNotNull() {
            addCriterion("user_true_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameEqualTo(String value) {
            addCriterion("user_true_name =", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameNotEqualTo(String value) {
            addCriterion("user_true_name <>", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameGreaterThan(String value) {
            addCriterion("user_true_name >", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_true_name >=", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameLessThan(String value) {
            addCriterion("user_true_name <", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameLessThanOrEqualTo(String value) {
            addCriterion("user_true_name <=", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameLike(String value) {
            addCriterion("user_true_name like", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameNotLike(String value) {
            addCriterion("user_true_name not like", value, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameIn(List<String> values) {
            addCriterion("user_true_name in", values, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameNotIn(List<String> values) {
            addCriterion("user_true_name not in", values, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameBetween(String value1, String value2) {
            addCriterion("user_true_name between", value1, value2, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserTrueNameNotBetween(String value1, String value2) {
            addCriterion("user_true_name not between", value1, value2, "userTrueName");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberIsNull() {
            addCriterion("user_idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberIsNotNull() {
            addCriterion("user_idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberEqualTo(String value) {
            addCriterion("user_idcard_number =", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberNotEqualTo(String value) {
            addCriterion("user_idcard_number <>", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberGreaterThan(String value) {
            addCriterion("user_idcard_number >", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcard_number >=", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberLessThan(String value) {
            addCriterion("user_idcard_number <", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("user_idcard_number <=", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberLike(String value) {
            addCriterion("user_idcard_number like", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberNotLike(String value) {
            addCriterion("user_idcard_number not like", value, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberIn(List<String> values) {
            addCriterion("user_idcard_number in", values, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberNotIn(List<String> values) {
            addCriterion("user_idcard_number not in", values, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberBetween(String value1, String value2) {
            addCriterion("user_idcard_number between", value1, value2, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("user_idcard_number not between", value1, value2, "userIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
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

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("bank_type like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("bank_type not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankPhoneIsNull() {
            addCriterion("bank_phone is null");
            return (Criteria) this;
        }

        public Criteria andBankPhoneIsNotNull() {
            addCriterion("bank_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBankPhoneEqualTo(String value) {
            addCriterion("bank_phone =", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneNotEqualTo(String value) {
            addCriterion("bank_phone <>", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneGreaterThan(String value) {
            addCriterion("bank_phone >", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_phone >=", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneLessThan(String value) {
            addCriterion("bank_phone <", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneLessThanOrEqualTo(String value) {
            addCriterion("bank_phone <=", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneLike(String value) {
            addCriterion("bank_phone like", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneNotLike(String value) {
            addCriterion("bank_phone not like", value, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneIn(List<String> values) {
            addCriterion("bank_phone in", values, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneNotIn(List<String> values) {
            addCriterion("bank_phone not in", values, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneBetween(String value1, String value2) {
            addCriterion("bank_phone between", value1, value2, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andBankPhoneNotBetween(String value1, String value2) {
            addCriterion("bank_phone not between", value1, value2, "bankPhone");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIsNull() {
            addCriterion("acct_status is null");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIsNotNull() {
            addCriterion("acct_status is not null");
            return (Criteria) this;
        }

        public Criteria andAcctStatusEqualTo(String value) {
            addCriterion("acct_status =", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotEqualTo(String value) {
            addCriterion("acct_status <>", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusGreaterThan(String value) {
            addCriterion("acct_status >", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusGreaterThanOrEqualTo(String value) {
            addCriterion("acct_status >=", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLessThan(String value) {
            addCriterion("acct_status <", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLessThanOrEqualTo(String value) {
            addCriterion("acct_status <=", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusLike(String value) {
            addCriterion("acct_status like", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotLike(String value) {
            addCriterion("acct_status not like", value, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusIn(List<String> values) {
            addCriterion("acct_status in", values, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotIn(List<String> values) {
            addCriterion("acct_status not in", values, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusBetween(String value1, String value2) {
            addCriterion("acct_status between", value1, value2, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andAcctStatusNotBetween(String value1, String value2) {
            addCriterion("acct_status not between", value1, value2, "acctStatus");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIsBindBankIsNull() {
            addCriterion("is_bind_bank is null");
            return (Criteria) this;
        }

        public Criteria andIsBindBankIsNotNull() {
            addCriterion("is_bind_bank is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindBankEqualTo(Boolean value) {
            addCriterion("is_bind_bank =", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankNotEqualTo(Boolean value) {
            addCriterion("is_bind_bank <>", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankGreaterThan(Boolean value) {
            addCriterion("is_bind_bank >", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_bind_bank >=", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankLessThan(Boolean value) {
            addCriterion("is_bind_bank <", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankLessThanOrEqualTo(Boolean value) {
            addCriterion("is_bind_bank <=", value, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankIn(List<Boolean> values) {
            addCriterion("is_bind_bank in", values, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankNotIn(List<Boolean> values) {
            addCriterion("is_bind_bank not in", values, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bind_bank between", value1, value2, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIsBindBankNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bind_bank not between", value1, value2, "isBindBank");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesIsNull() {
            addCriterion("illegal_times is null");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesIsNotNull() {
            addCriterion("illegal_times is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesEqualTo(Integer value) {
            addCriterion("illegal_times =", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesNotEqualTo(Integer value) {
            addCriterion("illegal_times <>", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesGreaterThan(Integer value) {
            addCriterion("illegal_times >", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("illegal_times >=", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesLessThan(Integer value) {
            addCriterion("illegal_times <", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesLessThanOrEqualTo(Integer value) {
            addCriterion("illegal_times <=", value, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesIn(List<Integer> values) {
            addCriterion("illegal_times in", values, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesNotIn(List<Integer> values) {
            addCriterion("illegal_times not in", values, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesBetween(Integer value1, Integer value2) {
            addCriterion("illegal_times between", value1, value2, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andIllegalTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("illegal_times not between", value1, value2, "illegalTimes");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorIsNull() {
            addCriterion("mobile_operator is null");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorIsNotNull() {
            addCriterion("mobile_operator is not null");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorEqualTo(String value) {
            addCriterion("mobile_operator =", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorNotEqualTo(String value) {
            addCriterion("mobile_operator <>", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorGreaterThan(String value) {
            addCriterion("mobile_operator >", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_operator >=", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorLessThan(String value) {
            addCriterion("mobile_operator <", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorLessThanOrEqualTo(String value) {
            addCriterion("mobile_operator <=", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorLike(String value) {
            addCriterion("mobile_operator like", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorNotLike(String value) {
            addCriterion("mobile_operator not like", value, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorIn(List<String> values) {
            addCriterion("mobile_operator in", values, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorNotIn(List<String> values) {
            addCriterion("mobile_operator not in", values, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorBetween(String value1, String value2) {
            addCriterion("mobile_operator between", value1, value2, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andMobileOperatorNotBetween(String value1, String value2) {
            addCriterion("mobile_operator not between", value1, value2, "mobileOperator");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionIsNull() {
            addCriterion("number_attribution is null");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionIsNotNull() {
            addCriterion("number_attribution is not null");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionEqualTo(String value) {
            addCriterion("number_attribution =", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionNotEqualTo(String value) {
            addCriterion("number_attribution <>", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionGreaterThan(String value) {
            addCriterion("number_attribution >", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionGreaterThanOrEqualTo(String value) {
            addCriterion("number_attribution >=", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionLessThan(String value) {
            addCriterion("number_attribution <", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionLessThanOrEqualTo(String value) {
            addCriterion("number_attribution <=", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionLike(String value) {
            addCriterion("number_attribution like", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionNotLike(String value) {
            addCriterion("number_attribution not like", value, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionIn(List<String> values) {
            addCriterion("number_attribution in", values, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionNotIn(List<String> values) {
            addCriterion("number_attribution not in", values, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionBetween(String value1, String value2) {
            addCriterion("number_attribution between", value1, value2, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andNumberAttributionNotBetween(String value1, String value2) {
            addCriterion("number_attribution not between", value1, value2, "numberAttribution");
            return (Criteria) this;
        }

        public Criteria andMobileModelsIsNull() {
            addCriterion("mobile_models is null");
            return (Criteria) this;
        }

        public Criteria andMobileModelsIsNotNull() {
            addCriterion("mobile_models is not null");
            return (Criteria) this;
        }

        public Criteria andMobileModelsEqualTo(String value) {
            addCriterion("mobile_models =", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsNotEqualTo(String value) {
            addCriterion("mobile_models <>", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsGreaterThan(String value) {
            addCriterion("mobile_models >", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_models >=", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsLessThan(String value) {
            addCriterion("mobile_models <", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsLessThanOrEqualTo(String value) {
            addCriterion("mobile_models <=", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsLike(String value) {
            addCriterion("mobile_models like", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsNotLike(String value) {
            addCriterion("mobile_models not like", value, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsIn(List<String> values) {
            addCriterion("mobile_models in", values, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsNotIn(List<String> values) {
            addCriterion("mobile_models not in", values, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsBetween(String value1, String value2) {
            addCriterion("mobile_models between", value1, value2, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileModelsNotBetween(String value1, String value2) {
            addCriterion("mobile_models not between", value1, value2, "mobileModels");
            return (Criteria) this;
        }

        public Criteria andMobileSystemIsNull() {
            addCriterion("mobile_system is null");
            return (Criteria) this;
        }

        public Criteria andMobileSystemIsNotNull() {
            addCriterion("mobile_system is not null");
            return (Criteria) this;
        }

        public Criteria andMobileSystemEqualTo(String value) {
            addCriterion("mobile_system =", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemNotEqualTo(String value) {
            addCriterion("mobile_system <>", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemGreaterThan(String value) {
            addCriterion("mobile_system >", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_system >=", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemLessThan(String value) {
            addCriterion("mobile_system <", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemLessThanOrEqualTo(String value) {
            addCriterion("mobile_system <=", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemLike(String value) {
            addCriterion("mobile_system like", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemNotLike(String value) {
            addCriterion("mobile_system not like", value, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemIn(List<String> values) {
            addCriterion("mobile_system in", values, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemNotIn(List<String> values) {
            addCriterion("mobile_system not in", values, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemBetween(String value1, String value2) {
            addCriterion("mobile_system between", value1, value2, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andMobileSystemNotBetween(String value1, String value2) {
            addCriterion("mobile_system not between", value1, value2, "mobileSystem");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("is_special is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("is_special is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(Integer value) {
            addCriterion("is_special =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(Integer value) {
            addCriterion("is_special <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(Integer value) {
            addCriterion("is_special >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_special >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(Integer value) {
            addCriterion("is_special <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(Integer value) {
            addCriterion("is_special <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<Integer> values) {
            addCriterion("is_special in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<Integer> values) {
            addCriterion("is_special not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(Integer value1, Integer value2) {
            addCriterion("is_special between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(Integer value1, Integer value2) {
            addCriterion("is_special not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathIsNull() {
            addCriterion("idcard_scan_file_path is null");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathIsNotNull() {
            addCriterion("idcard_scan_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathEqualTo(String value) {
            addCriterion("idcard_scan_file_path =", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathNotEqualTo(String value) {
            addCriterion("idcard_scan_file_path <>", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathGreaterThan(String value) {
            addCriterion("idcard_scan_file_path >", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_scan_file_path >=", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathLessThan(String value) {
            addCriterion("idcard_scan_file_path <", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathLessThanOrEqualTo(String value) {
            addCriterion("idcard_scan_file_path <=", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathLike(String value) {
            addCriterion("idcard_scan_file_path like", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathNotLike(String value) {
            addCriterion("idcard_scan_file_path not like", value, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathIn(List<String> values) {
            addCriterion("idcard_scan_file_path in", values, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathNotIn(List<String> values) {
            addCriterion("idcard_scan_file_path not in", values, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathBetween(String value1, String value2) {
            addCriterion("idcard_scan_file_path between", value1, value2, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanFilePathNotBetween(String value1, String value2) {
            addCriterion("idcard_scan_file_path not between", value1, value2, "idcardScanFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathIsNull() {
            addCriterion("idcard_scan_anti_file_path is null");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathIsNotNull() {
            addCriterion("idcard_scan_anti_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathEqualTo(String value) {
            addCriterion("idcard_scan_anti_file_path =", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathNotEqualTo(String value) {
            addCriterion("idcard_scan_anti_file_path <>", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathGreaterThan(String value) {
            addCriterion("idcard_scan_anti_file_path >", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_scan_anti_file_path >=", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathLessThan(String value) {
            addCriterion("idcard_scan_anti_file_path <", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathLessThanOrEqualTo(String value) {
            addCriterion("idcard_scan_anti_file_path <=", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathLike(String value) {
            addCriterion("idcard_scan_anti_file_path like", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathNotLike(String value) {
            addCriterion("idcard_scan_anti_file_path not like", value, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathIn(List<String> values) {
            addCriterion("idcard_scan_anti_file_path in", values, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathNotIn(List<String> values) {
            addCriterion("idcard_scan_anti_file_path not in", values, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathBetween(String value1, String value2) {
            addCriterion("idcard_scan_anti_file_path between", value1, value2, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIdcardScanAntiFilePathNotBetween(String value1, String value2) {
            addCriterion("idcard_scan_anti_file_path not between", value1, value2, "idcardScanAntiFilePath");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyIsNull() {
            addCriterion("if_first_top_eccancy is null");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyIsNotNull() {
            addCriterion("if_first_top_eccancy is not null");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyEqualTo(Integer value) {
            addCriterion("if_first_top_eccancy =", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyNotEqualTo(Integer value) {
            addCriterion("if_first_top_eccancy <>", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyGreaterThan(Integer value) {
            addCriterion("if_first_top_eccancy >", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_first_top_eccancy >=", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyLessThan(Integer value) {
            addCriterion("if_first_top_eccancy <", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyLessThanOrEqualTo(Integer value) {
            addCriterion("if_first_top_eccancy <=", value, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyIn(List<Integer> values) {
            addCriterion("if_first_top_eccancy in", values, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyNotIn(List<Integer> values) {
            addCriterion("if_first_top_eccancy not in", values, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyBetween(Integer value1, Integer value2) {
            addCriterion("if_first_top_eccancy between", value1, value2, "ifFirstTopEccancy");
            return (Criteria) this;
        }

        public Criteria andIfFirstTopEccancyNotBetween(Integer value1, Integer value2) {
            addCriterion("if_first_top_eccancy not between", value1, value2, "ifFirstTopEccancy");
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