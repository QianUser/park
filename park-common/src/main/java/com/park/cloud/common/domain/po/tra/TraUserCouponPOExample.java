package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraUserCouponPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraUserCouponPOExample() {
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

        public Criteria andUcIdIsNull() {
            addCriterion("uc_id is null");
            return (Criteria) this;
        }

        public Criteria andUcIdIsNotNull() {
            addCriterion("uc_id is not null");
            return (Criteria) this;
        }

        public Criteria andUcIdEqualTo(Integer value) {
            addCriterion("uc_id =", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdNotEqualTo(Integer value) {
            addCriterion("uc_id <>", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdGreaterThan(Integer value) {
            addCriterion("uc_id >", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uc_id >=", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdLessThan(Integer value) {
            addCriterion("uc_id <", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdLessThanOrEqualTo(Integer value) {
            addCriterion("uc_id <=", value, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdIn(List<Integer> values) {
            addCriterion("uc_id in", values, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdNotIn(List<Integer> values) {
            addCriterion("uc_id not in", values, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdBetween(Integer value1, Integer value2) {
            addCriterion("uc_id between", value1, value2, "ucId");
            return (Criteria) this;
        }

        public Criteria andUcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uc_id not between", value1, value2, "ucId");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIsNull() {
            addCriterion("u_coupon_code is null");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIsNotNull() {
            addCriterion("u_coupon_code is not null");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeEqualTo(String value) {
            addCriterion("u_coupon_code =", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotEqualTo(String value) {
            addCriterion("u_coupon_code <>", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeGreaterThan(String value) {
            addCriterion("u_coupon_code >", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("u_coupon_code >=", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLessThan(String value) {
            addCriterion("u_coupon_code <", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("u_coupon_code <=", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeLike(String value) {
            addCriterion("u_coupon_code like", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotLike(String value) {
            addCriterion("u_coupon_code not like", value, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeIn(List<String> values) {
            addCriterion("u_coupon_code in", values, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotIn(List<String> values) {
            addCriterion("u_coupon_code not in", values, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeBetween(String value1, String value2) {
            addCriterion("u_coupon_code between", value1, value2, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andUCouponCodeNotBetween(String value1, String value2) {
            addCriterion("u_coupon_code not between", value1, value2, "uCouponCode");
            return (Criteria) this;
        }

        public Criteria andCopIdIsNull() {
            addCriterion("cop_id is null");
            return (Criteria) this;
        }

        public Criteria andCopIdIsNotNull() {
            addCriterion("cop_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopIdEqualTo(Integer value) {
            addCriterion("cop_id =", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotEqualTo(Integer value) {
            addCriterion("cop_id <>", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdGreaterThan(Integer value) {
            addCriterion("cop_id >", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cop_id >=", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdLessThan(Integer value) {
            addCriterion("cop_id <", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdLessThanOrEqualTo(Integer value) {
            addCriterion("cop_id <=", value, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdIn(List<Integer> values) {
            addCriterion("cop_id in", values, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotIn(List<Integer> values) {
            addCriterion("cop_id not in", values, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdBetween(Integer value1, Integer value2) {
            addCriterion("cop_id between", value1, value2, "copId");
            return (Criteria) this;
        }

        public Criteria andCopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cop_id not between", value1, value2, "copId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdIsNull() {
            addCriterion("wxjl_cp_id is null");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdIsNotNull() {
            addCriterion("wxjl_cp_id is not null");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdEqualTo(Integer value) {
            addCriterion("wxjl_cp_id =", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdNotEqualTo(Integer value) {
            addCriterion("wxjl_cp_id <>", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdGreaterThan(Integer value) {
            addCriterion("wxjl_cp_id >", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wxjl_cp_id >=", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdLessThan(Integer value) {
            addCriterion("wxjl_cp_id <", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("wxjl_cp_id <=", value, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdIn(List<Integer> values) {
            addCriterion("wxjl_cp_id in", values, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdNotIn(List<Integer> values) {
            addCriterion("wxjl_cp_id not in", values, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdBetween(Integer value1, Integer value2) {
            addCriterion("wxjl_cp_id between", value1, value2, "wxjlCpId");
            return (Criteria) this;
        }

        public Criteria andWxjlCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wxjl_cp_id not between", value1, value2, "wxjlCpId");
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

        public Criteria andTsurplusNumIsNull() {
            addCriterion("tsurplus_num is null");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumIsNotNull() {
            addCriterion("tsurplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumEqualTo(Integer value) {
            addCriterion("tsurplus_num =", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumNotEqualTo(Integer value) {
            addCriterion("tsurplus_num <>", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumGreaterThan(Integer value) {
            addCriterion("tsurplus_num >", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsurplus_num >=", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumLessThan(Integer value) {
            addCriterion("tsurplus_num <", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumLessThanOrEqualTo(Integer value) {
            addCriterion("tsurplus_num <=", value, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumIn(List<Integer> values) {
            addCriterion("tsurplus_num in", values, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumNotIn(List<Integer> values) {
            addCriterion("tsurplus_num not in", values, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumBetween(Integer value1, Integer value2) {
            addCriterion("tsurplus_num between", value1, value2, "tsurplusNum");
            return (Criteria) this;
        }

        public Criteria andTsurplusNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tsurplus_num not between", value1, value2, "tsurplusNum");
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

        public Criteria andPlateTypeIsNull() {
            addCriterion("plate_type is null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIsNotNull() {
            addCriterion("plate_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlateTypeEqualTo(Integer value) {
            addCriterion("plate_type =", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotEqualTo(Integer value) {
            addCriterion("plate_type <>", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThan(Integer value) {
            addCriterion("plate_type >", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_type >=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThan(Integer value) {
            addCriterion("plate_type <", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("plate_type <=", value, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeIn(List<Integer> values) {
            addCriterion("plate_type in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotIn(List<Integer> values) {
            addCriterion("plate_type not in", values, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeBetween(Integer value1, Integer value2) {
            addCriterion("plate_type between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andPlateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_type not between", value1, value2, "plateType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCmUidIsNull() {
            addCriterion("cm_uid is null");
            return (Criteria) this;
        }

        public Criteria andCmUidIsNotNull() {
            addCriterion("cm_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCmUidEqualTo(String value) {
            addCriterion("cm_uid =", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidNotEqualTo(String value) {
            addCriterion("cm_uid <>", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidGreaterThan(String value) {
            addCriterion("cm_uid >", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidGreaterThanOrEqualTo(String value) {
            addCriterion("cm_uid >=", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidLessThan(String value) {
            addCriterion("cm_uid <", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidLessThanOrEqualTo(String value) {
            addCriterion("cm_uid <=", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidLike(String value) {
            addCriterion("cm_uid like", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidNotLike(String value) {
            addCriterion("cm_uid not like", value, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidIn(List<String> values) {
            addCriterion("cm_uid in", values, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidNotIn(List<String> values) {
            addCriterion("cm_uid not in", values, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidBetween(String value1, String value2) {
            addCriterion("cm_uid between", value1, value2, "cmUid");
            return (Criteria) this;
        }

        public Criteria andCmUidNotBetween(String value1, String value2) {
            addCriterion("cm_uid not between", value1, value2, "cmUid");
            return (Criteria) this;
        }

        public Criteria andPushStatusIsNull() {
            addCriterion("push_status is null");
            return (Criteria) this;
        }

        public Criteria andPushStatusIsNotNull() {
            addCriterion("push_status is not null");
            return (Criteria) this;
        }

        public Criteria andPushStatusEqualTo(Integer value) {
            addCriterion("push_status =", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotEqualTo(Integer value) {
            addCriterion("push_status <>", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusGreaterThan(Integer value) {
            addCriterion("push_status >", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("push_status >=", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusLessThan(Integer value) {
            addCriterion("push_status <", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusLessThanOrEqualTo(Integer value) {
            addCriterion("push_status <=", value, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusIn(List<Integer> values) {
            addCriterion("push_status in", values, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotIn(List<Integer> values) {
            addCriterion("push_status not in", values, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusBetween(Integer value1, Integer value2) {
            addCriterion("push_status between", value1, value2, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andPushStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("push_status not between", value1, value2, "pushStatus");
            return (Criteria) this;
        }

        public Criteria andEffTimeIsNull() {
            addCriterion("eff_time is null");
            return (Criteria) this;
        }

        public Criteria andEffTimeIsNotNull() {
            addCriterion("eff_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffTimeEqualTo(Date value) {
            addCriterion("eff_time =", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeNotEqualTo(Date value) {
            addCriterion("eff_time <>", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeGreaterThan(Date value) {
            addCriterion("eff_time >", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_time >=", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeLessThan(Date value) {
            addCriterion("eff_time <", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeLessThanOrEqualTo(Date value) {
            addCriterion("eff_time <=", value, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeIn(List<Date> values) {
            addCriterion("eff_time in", values, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeNotIn(List<Date> values) {
            addCriterion("eff_time not in", values, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeBetween(Date value1, Date value2) {
            addCriterion("eff_time between", value1, value2, "effTime");
            return (Criteria) this;
        }

        public Criteria andEffTimeNotBetween(Date value1, Date value2) {
            addCriterion("eff_time not between", value1, value2, "effTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNull() {
            addCriterion("failure_time is null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNotNull() {
            addCriterion("failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeEqualTo(Date value) {
            addCriterion("failure_time =", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotEqualTo(Date value) {
            addCriterion("failure_time <>", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThan(Date value) {
            addCriterion("failure_time >", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("failure_time >=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThan(Date value) {
            addCriterion("failure_time <", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("failure_time <=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIn(List<Date> values) {
            addCriterion("failure_time in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotIn(List<Date> values) {
            addCriterion("failure_time not in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeBetween(Date value1, Date value2) {
            addCriterion("failure_time between", value1, value2, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("failure_time not between", value1, value2, "failureTime");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateIsNull() {
            addCriterion("uparking_down_state is null");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateIsNotNull() {
            addCriterion("uparking_down_state is not null");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateEqualTo(Integer value) {
            addCriterion("uparking_down_state =", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateNotEqualTo(Integer value) {
            addCriterion("uparking_down_state <>", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateGreaterThan(Integer value) {
            addCriterion("uparking_down_state >", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("uparking_down_state >=", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateLessThan(Integer value) {
            addCriterion("uparking_down_state <", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateLessThanOrEqualTo(Integer value) {
            addCriterion("uparking_down_state <=", value, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateIn(List<Integer> values) {
            addCriterion("uparking_down_state in", values, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateNotIn(List<Integer> values) {
            addCriterion("uparking_down_state not in", values, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateBetween(Integer value1, Integer value2) {
            addCriterion("uparking_down_state between", value1, value2, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUparkingDownStateNotBetween(Integer value1, Integer value2) {
            addCriterion("uparking_down_state not between", value1, value2, "uparkingDownState");
            return (Criteria) this;
        }

        public Criteria andUsageStateIsNull() {
            addCriterion("usage_state is null");
            return (Criteria) this;
        }

        public Criteria andUsageStateIsNotNull() {
            addCriterion("usage_state is not null");
            return (Criteria) this;
        }

        public Criteria andUsageStateEqualTo(Integer value) {
            addCriterion("usage_state =", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateNotEqualTo(Integer value) {
            addCriterion("usage_state <>", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateGreaterThan(Integer value) {
            addCriterion("usage_state >", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("usage_state >=", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateLessThan(Integer value) {
            addCriterion("usage_state <", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateLessThanOrEqualTo(Integer value) {
            addCriterion("usage_state <=", value, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateIn(List<Integer> values) {
            addCriterion("usage_state in", values, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateNotIn(List<Integer> values) {
            addCriterion("usage_state not in", values, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateBetween(Integer value1, Integer value2) {
            addCriterion("usage_state between", value1, value2, "usageState");
            return (Criteria) this;
        }

        public Criteria andUsageStateNotBetween(Integer value1, Integer value2) {
            addCriterion("usage_state not between", value1, value2, "usageState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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