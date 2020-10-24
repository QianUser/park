package com.park.cloud.common.domain.po.tra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraCouponPurchasePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraCouponPurchasePOExample() {
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

        public Criteria andCmuIdIsNull() {
            addCriterion("cmu_id is null");
            return (Criteria) this;
        }

        public Criteria andCmuIdIsNotNull() {
            addCriterion("cmu_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmuIdEqualTo(String value) {
            addCriterion("cmu_id =", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdNotEqualTo(String value) {
            addCriterion("cmu_id <>", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdGreaterThan(String value) {
            addCriterion("cmu_id >", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdGreaterThanOrEqualTo(String value) {
            addCriterion("cmu_id >=", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdLessThan(String value) {
            addCriterion("cmu_id <", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdLessThanOrEqualTo(String value) {
            addCriterion("cmu_id <=", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdLike(String value) {
            addCriterion("cmu_id like", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdNotLike(String value) {
            addCriterion("cmu_id not like", value, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdIn(List<String> values) {
            addCriterion("cmu_id in", values, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdNotIn(List<String> values) {
            addCriterion("cmu_id not in", values, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdBetween(String value1, String value2) {
            addCriterion("cmu_id between", value1, value2, "cmuId");
            return (Criteria) this;
        }

        public Criteria andCmuIdNotBetween(String value1, String value2) {
            addCriterion("cmu_id not between", value1, value2, "cmuId");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIsNull() {
            addCriterion("buyer_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIsNotNull() {
            addCriterion("buyer_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeEqualTo(Integer value) {
            addCriterion("buyer_type =", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotEqualTo(Integer value) {
            addCriterion("buyer_type <>", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThan(Integer value) {
            addCriterion("buyer_type >", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyer_type >=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThan(Integer value) {
            addCriterion("buyer_type <", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("buyer_type <=", value, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeIn(List<Integer> values) {
            addCriterion("buyer_type in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotIn(List<Integer> values) {
            addCriterion("buyer_type not in", values, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeBetween(Integer value1, Integer value2) {
            addCriterion("buyer_type between", value1, value2, "buyerType");
            return (Criteria) this;
        }

        public Criteria andBuyerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("buyer_type not between", value1, value2, "buyerType");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNull() {
            addCriterion("p_number is null");
            return (Criteria) this;
        }

        public Criteria andPNumberIsNotNull() {
            addCriterion("p_number is not null");
            return (Criteria) this;
        }

        public Criteria andPNumberEqualTo(Integer value) {
            addCriterion("p_number =", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotEqualTo(Integer value) {
            addCriterion("p_number <>", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThan(Integer value) {
            addCriterion("p_number >", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_number >=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThan(Integer value) {
            addCriterion("p_number <", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberLessThanOrEqualTo(Integer value) {
            addCriterion("p_number <=", value, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberIn(List<Integer> values) {
            addCriterion("p_number in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotIn(List<Integer> values) {
            addCriterion("p_number not in", values, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberBetween(Integer value1, Integer value2) {
            addCriterion("p_number between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andPNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("p_number not between", value1, value2, "pNumber");
            return (Criteria) this;
        }

        public Criteria andBuAmountIsNull() {
            addCriterion("bu_amount is null");
            return (Criteria) this;
        }

        public Criteria andBuAmountIsNotNull() {
            addCriterion("bu_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBuAmountEqualTo(String value) {
            addCriterion("bu_amount =", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountNotEqualTo(String value) {
            addCriterion("bu_amount <>", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountGreaterThan(String value) {
            addCriterion("bu_amount >", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountGreaterThanOrEqualTo(String value) {
            addCriterion("bu_amount >=", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountLessThan(String value) {
            addCriterion("bu_amount <", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountLessThanOrEqualTo(String value) {
            addCriterion("bu_amount <=", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountLike(String value) {
            addCriterion("bu_amount like", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountNotLike(String value) {
            addCriterion("bu_amount not like", value, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountIn(List<String> values) {
            addCriterion("bu_amount in", values, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountNotIn(List<String> values) {
            addCriterion("bu_amount not in", values, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountBetween(String value1, String value2) {
            addCriterion("bu_amount between", value1, value2, "buAmount");
            return (Criteria) this;
        }

        public Criteria andBuAmountNotBetween(String value1, String value2) {
            addCriterion("bu_amount not between", value1, value2, "buAmount");
            return (Criteria) this;
        }

        public Criteria andRTensionIsNull() {
            addCriterion("r_tension is null");
            return (Criteria) this;
        }

        public Criteria andRTensionIsNotNull() {
            addCriterion("r_tension is not null");
            return (Criteria) this;
        }

        public Criteria andRTensionEqualTo(Integer value) {
            addCriterion("r_tension =", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionNotEqualTo(Integer value) {
            addCriterion("r_tension <>", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionGreaterThan(Integer value) {
            addCriterion("r_tension >", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_tension >=", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionLessThan(Integer value) {
            addCriterion("r_tension <", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionLessThanOrEqualTo(Integer value) {
            addCriterion("r_tension <=", value, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionIn(List<Integer> values) {
            addCriterion("r_tension in", values, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionNotIn(List<Integer> values) {
            addCriterion("r_tension not in", values, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionBetween(Integer value1, Integer value2) {
            addCriterion("r_tension between", value1, value2, "rTension");
            return (Criteria) this;
        }

        public Criteria andRTensionNotBetween(Integer value1, Integer value2) {
            addCriterion("r_tension not between", value1, value2, "rTension");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelIsNull() {
            addCriterion("buying_channel is null");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelIsNotNull() {
            addCriterion("buying_channel is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelEqualTo(Integer value) {
            addCriterion("buying_channel =", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelNotEqualTo(Integer value) {
            addCriterion("buying_channel <>", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelGreaterThan(Integer value) {
            addCriterion("buying_channel >", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("buying_channel >=", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelLessThan(Integer value) {
            addCriterion("buying_channel <", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelLessThanOrEqualTo(Integer value) {
            addCriterion("buying_channel <=", value, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelIn(List<Integer> values) {
            addCriterion("buying_channel in", values, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelNotIn(List<Integer> values) {
            addCriterion("buying_channel not in", values, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelBetween(Integer value1, Integer value2) {
            addCriterion("buying_channel between", value1, value2, "buyingChannel");
            return (Criteria) this;
        }

        public Criteria andBuyingChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("buying_channel not between", value1, value2, "buyingChannel");
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

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNull() {
            addCriterion("payer_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIsNotNull() {
            addCriterion("payer_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoEqualTo(String value) {
            addCriterion("payer_trade_no =", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotEqualTo(String value) {
            addCriterion("payer_trade_no <>", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThan(String value) {
            addCriterion("payer_trade_no >", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("payer_trade_no >=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThan(String value) {
            addCriterion("payer_trade_no <", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLessThanOrEqualTo(String value) {
            addCriterion("payer_trade_no <=", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoLike(String value) {
            addCriterion("payer_trade_no like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotLike(String value) {
            addCriterion("payer_trade_no not like", value, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoIn(List<String> values) {
            addCriterion("payer_trade_no in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotIn(List<String> values) {
            addCriterion("payer_trade_no not in", values, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoBetween(String value1, String value2) {
            addCriterion("payer_trade_no between", value1, value2, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andPayerTradeNoNotBetween(String value1, String value2) {
            addCriterion("payer_trade_no not between", value1, value2, "payerTradeNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoIsNull() {
            addCriterion("coupon_purchase_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoIsNotNull() {
            addCriterion("coupon_purchase_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoEqualTo(String value) {
            addCriterion("coupon_purchase_order_no =", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoNotEqualTo(String value) {
            addCriterion("coupon_purchase_order_no <>", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoGreaterThan(String value) {
            addCriterion("coupon_purchase_order_no >", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_purchase_order_no >=", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoLessThan(String value) {
            addCriterion("coupon_purchase_order_no <", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoLessThanOrEqualTo(String value) {
            addCriterion("coupon_purchase_order_no <=", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoLike(String value) {
            addCriterion("coupon_purchase_order_no like", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoNotLike(String value) {
            addCriterion("coupon_purchase_order_no not like", value, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoIn(List<String> values) {
            addCriterion("coupon_purchase_order_no in", values, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoNotIn(List<String> values) {
            addCriterion("coupon_purchase_order_no not in", values, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoBetween(String value1, String value2) {
            addCriterion("coupon_purchase_order_no between", value1, value2, "couponPurchaseOrderNo");
            return (Criteria) this;
        }

        public Criteria andCouponPurchaseOrderNoNotBetween(String value1, String value2) {
            addCriterion("coupon_purchase_order_no not between", value1, value2, "couponPurchaseOrderNo");
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