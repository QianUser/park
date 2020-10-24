package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraWxjlCouponPolicyPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraWxjlCouponPolicyPOExample() {
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

        public Criteria andWxjlCpNameIsNull() {
            addCriterion("wxjl_cp_name is null");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameIsNotNull() {
            addCriterion("wxjl_cp_name is not null");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameEqualTo(String value) {
            addCriterion("wxjl_cp_name =", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameNotEqualTo(String value) {
            addCriterion("wxjl_cp_name <>", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameGreaterThan(String value) {
            addCriterion("wxjl_cp_name >", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameGreaterThanOrEqualTo(String value) {
            addCriterion("wxjl_cp_name >=", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameLessThan(String value) {
            addCriterion("wxjl_cp_name <", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameLessThanOrEqualTo(String value) {
            addCriterion("wxjl_cp_name <=", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameLike(String value) {
            addCriterion("wxjl_cp_name like", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameNotLike(String value) {
            addCriterion("wxjl_cp_name not like", value, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameIn(List<String> values) {
            addCriterion("wxjl_cp_name in", values, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameNotIn(List<String> values) {
            addCriterion("wxjl_cp_name not in", values, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameBetween(String value1, String value2) {
            addCriterion("wxjl_cp_name between", value1, value2, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andWxjlCpNameNotBetween(String value1, String value2) {
            addCriterion("wxjl_cp_name not between", value1, value2, "wxjlCpName");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(Integer value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(Integer value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(Integer value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(Integer value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<Integer> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<Integer> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(Integer value1, Integer value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andUseNumberIsNull() {
            addCriterion("use_number is null");
            return (Criteria) this;
        }

        public Criteria andUseNumberIsNotNull() {
            addCriterion("use_number is not null");
            return (Criteria) this;
        }

        public Criteria andUseNumberEqualTo(Integer value) {
            addCriterion("use_number =", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotEqualTo(Integer value) {
            addCriterion("use_number <>", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberGreaterThan(Integer value) {
            addCriterion("use_number >", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_number >=", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberLessThan(Integer value) {
            addCriterion("use_number <", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("use_number <=", value, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberIn(List<Integer> values) {
            addCriterion("use_number in", values, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotIn(List<Integer> values) {
            addCriterion("use_number not in", values, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberBetween(Integer value1, Integer value2) {
            addCriterion("use_number between", value1, value2, "useNumber");
            return (Criteria) this;
        }

        public Criteria andUseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("use_number not between", value1, value2, "useNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIsNull() {
            addCriterion("rules_type is null");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIsNotNull() {
            addCriterion("rules_type is not null");
            return (Criteria) this;
        }

        public Criteria andRulesTypeEqualTo(Integer value) {
            addCriterion("rules_type =", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotEqualTo(Integer value) {
            addCriterion("rules_type <>", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeGreaterThan(Integer value) {
            addCriterion("rules_type >", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rules_type >=", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeLessThan(Integer value) {
            addCriterion("rules_type <", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rules_type <=", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIn(List<Integer> values) {
            addCriterion("rules_type in", values, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotIn(List<Integer> values) {
            addCriterion("rules_type not in", values, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeBetween(Integer value1, Integer value2) {
            addCriterion("rules_type between", value1, value2, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rules_type not between", value1, value2, "rulesType");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(String value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(String value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(String value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(String value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(String value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLike(String value) {
            addCriterion("coupon_money like", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotLike(String value) {
            addCriterion("coupon_money not like", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<String> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<String> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(String value1, String value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(String value1, String value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(Float value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(Float value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(Float value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(Float value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(Float value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<Float> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<Float> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(Float value1, Float value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(Float value1, Float value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNull() {
            addCriterion("coupon_num is null");
            return (Criteria) this;
        }

        public Criteria andCouponNumIsNotNull() {
            addCriterion("coupon_num is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNumEqualTo(Integer value) {
            addCriterion("coupon_num =", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotEqualTo(Integer value) {
            addCriterion("coupon_num <>", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThan(Integer value) {
            addCriterion("coupon_num >", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_num >=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThan(Integer value) {
            addCriterion("coupon_num <", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_num <=", value, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumIn(List<Integer> values) {
            addCriterion("coupon_num in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotIn(List<Integer> values) {
            addCriterion("coupon_num not in", values, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andCouponNumNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_num not between", value1, value2, "couponNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNull() {
            addCriterion("surplus_num is null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIsNotNull() {
            addCriterion("surplus_num is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusNumEqualTo(Integer value) {
            addCriterion("surplus_num =", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotEqualTo(Integer value) {
            addCriterion("surplus_num <>", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThan(Integer value) {
            addCriterion("surplus_num >", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_num >=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThan(Integer value) {
            addCriterion("surplus_num <", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_num <=", value, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumIn(List<Integer> values) {
            addCriterion("surplus_num in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotIn(List<Integer> values) {
            addCriterion("surplus_num not in", values, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumBetween(Integer value1, Integer value2) {
            addCriterion("surplus_num between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andSurplusNumNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_num not between", value1, value2, "surplusNum");
            return (Criteria) this;
        }

        public Criteria andParkingIdListIsNull() {
            addCriterion("parking_id_list is null");
            return (Criteria) this;
        }

        public Criteria andParkingIdListIsNotNull() {
            addCriterion("parking_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andParkingIdListEqualTo(String value) {
            addCriterion("parking_id_list =", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListNotEqualTo(String value) {
            addCriterion("parking_id_list <>", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListGreaterThan(String value) {
            addCriterion("parking_id_list >", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListGreaterThanOrEqualTo(String value) {
            addCriterion("parking_id_list >=", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListLessThan(String value) {
            addCriterion("parking_id_list <", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListLessThanOrEqualTo(String value) {
            addCriterion("parking_id_list <=", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListLike(String value) {
            addCriterion("parking_id_list like", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListNotLike(String value) {
            addCriterion("parking_id_list not like", value, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListIn(List<String> values) {
            addCriterion("parking_id_list in", values, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListNotIn(List<String> values) {
            addCriterion("parking_id_list not in", values, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListBetween(String value1, String value2) {
            addCriterion("parking_id_list between", value1, value2, "parkingIdList");
            return (Criteria) this;
        }

        public Criteria andParkingIdListNotBetween(String value1, String value2) {
            addCriterion("parking_id_list not between", value1, value2, "parkingIdList");
            return (Criteria) this;
        }


        public Criteria andSectionIdListIsNull() {
            addCriterion("section_id_list is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdListIsNotNull() {
            addCriterion("section_id_list is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdListEqualTo(String value) {
            addCriterion("section_id_list =", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListNotEqualTo(String value) {
            addCriterion("section_id_list <>", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListGreaterThan(String value) {
            addCriterion("section_id_list >", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListGreaterThanOrEqualTo(String value) {
            addCriterion("section_id_list >=", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListLessThan(String value) {
            addCriterion("section_id_list <", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListLessThanOrEqualTo(String value) {
            addCriterion("section_id_list <=", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListLike(String value) {
            addCriterion("section_id_list like", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListNotLike(String value) {
            addCriterion("section_id_list not like", value, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListIn(List<String> values) {
            addCriterion("section_id_list in", values, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListNotIn(List<String> values) {
            addCriterion("section_id_list not in", values, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListBetween(String value1, String value2) {
            addCriterion("section_id_list between", value1, value2, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andSectionIdListNotBetween(String value1, String value2) {
            addCriterion("section_id_list not between", value1, value2, "sectionIdList");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIsNull() {
            addCriterion("term_of_validity is null");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIsNotNull() {
            addCriterion("term_of_validity is not null");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityEqualTo(Integer value) {
            addCriterion("term_of_validity =", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotEqualTo(Integer value) {
            addCriterion("term_of_validity <>", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityGreaterThan(Integer value) {
            addCriterion("term_of_validity >", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_of_validity >=", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityLessThan(Integer value) {
            addCriterion("term_of_validity <", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityLessThanOrEqualTo(Integer value) {
            addCriterion("term_of_validity <=", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIn(List<Integer> values) {
            addCriterion("term_of_validity in", values, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotIn(List<Integer> values) {
            addCriterion("term_of_validity not in", values, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityBetween(Integer value1, Integer value2) {
            addCriterion("term_of_validity between", value1, value2, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotBetween(Integer value1, Integer value2) {
            addCriterion("term_of_validity not between", value1, value2, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andCpStatusIsNull() {
            addCriterion("cp_status is null");
            return (Criteria) this;
        }

        public Criteria andCpStatusIsNotNull() {
            addCriterion("cp_status is not null");
            return (Criteria) this;
        }

        public Criteria andCpStatusEqualTo(Integer value) {
            addCriterion("cp_status =", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusNotEqualTo(Integer value) {
            addCriterion("cp_status <>", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusGreaterThan(Integer value) {
            addCriterion("cp_status >", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp_status >=", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusLessThan(Integer value) {
            addCriterion("cp_status <", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cp_status <=", value, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusIn(List<Integer> values) {
            addCriterion("cp_status in", values, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusNotIn(List<Integer> values) {
            addCriterion("cp_status not in", values, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusBetween(Integer value1, Integer value2) {
            addCriterion("cp_status between", value1, value2, "cpStatus");
            return (Criteria) this;
        }

        public Criteria andCpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cp_status not between", value1, value2, "cpStatus");
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