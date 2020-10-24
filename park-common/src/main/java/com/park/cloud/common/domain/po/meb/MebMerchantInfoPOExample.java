package com.park.cloud.common.domain.po.meb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MebMerchantInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MebMerchantInfoPOExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeIsNull() {
            addCriterion("m_info_code is null");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeIsNotNull() {
            addCriterion("m_info_code is not null");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeEqualTo(String value) {
            addCriterion("m_info_code =", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeNotEqualTo(String value) {
            addCriterion("m_info_code <>", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeGreaterThan(String value) {
            addCriterion("m_info_code >", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("m_info_code >=", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeLessThan(String value) {
            addCriterion("m_info_code <", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeLessThanOrEqualTo(String value) {
            addCriterion("m_info_code <=", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeLike(String value) {
            addCriterion("m_info_code like", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeNotLike(String value) {
            addCriterion("m_info_code not like", value, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeIn(List<String> values) {
            addCriterion("m_info_code in", values, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeNotIn(List<String> values) {
            addCriterion("m_info_code not in", values, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeBetween(String value1, String value2) {
            addCriterion("m_info_code between", value1, value2, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoCodeNotBetween(String value1, String value2) {
            addCriterion("m_info_code not between", value1, value2, "mInfoCode");
            return (Criteria) this;
        }

        public Criteria andMInfoNameIsNull() {
            addCriterion("m_info_name is null");
            return (Criteria) this;
        }

        public Criteria andMInfoNameIsNotNull() {
            addCriterion("m_info_name is not null");
            return (Criteria) this;
        }

        public Criteria andMInfoNameEqualTo(String value) {
            addCriterion("m_info_name =", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameNotEqualTo(String value) {
            addCriterion("m_info_name <>", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameGreaterThan(String value) {
            addCriterion("m_info_name >", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_info_name >=", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameLessThan(String value) {
            addCriterion("m_info_name <", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameLessThanOrEqualTo(String value) {
            addCriterion("m_info_name <=", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameLike(String value) {
            addCriterion("m_info_name like", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameNotLike(String value) {
            addCriterion("m_info_name not like", value, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameIn(List<String> values) {
            addCriterion("m_info_name in", values, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameNotIn(List<String> values) {
            addCriterion("m_info_name not in", values, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameBetween(String value1, String value2) {
            addCriterion("m_info_name between", value1, value2, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoNameNotBetween(String value1, String value2) {
            addCriterion("m_info_name not between", value1, value2, "mInfoName");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsIsNull() {
            addCriterion("m_info_contacts is null");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsIsNotNull() {
            addCriterion("m_info_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsEqualTo(String value) {
            addCriterion("m_info_contacts =", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsNotEqualTo(String value) {
            addCriterion("m_info_contacts <>", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsGreaterThan(String value) {
            addCriterion("m_info_contacts >", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsGreaterThanOrEqualTo(String value) {
            addCriterion("m_info_contacts >=", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsLessThan(String value) {
            addCriterion("m_info_contacts <", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsLessThanOrEqualTo(String value) {
            addCriterion("m_info_contacts <=", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsLike(String value) {
            addCriterion("m_info_contacts like", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsNotLike(String value) {
            addCriterion("m_info_contacts not like", value, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsIn(List<String> values) {
            addCriterion("m_info_contacts in", values, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsNotIn(List<String> values) {
            addCriterion("m_info_contacts not in", values, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsBetween(String value1, String value2) {
            addCriterion("m_info_contacts between", value1, value2, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMInfoContactsNotBetween(String value1, String value2) {
            addCriterion("m_info_contacts not between", value1, value2, "mInfoContacts");
            return (Criteria) this;
        }

        public Criteria andMTelephoneIsNull() {
            addCriterion("m_telephone is null");
            return (Criteria) this;
        }

        public Criteria andMTelephoneIsNotNull() {
            addCriterion("m_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andMTelephoneEqualTo(String value) {
            addCriterion("m_telephone =", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneNotEqualTo(String value) {
            addCriterion("m_telephone <>", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneGreaterThan(String value) {
            addCriterion("m_telephone >", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("m_telephone >=", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneLessThan(String value) {
            addCriterion("m_telephone <", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneLessThanOrEqualTo(String value) {
            addCriterion("m_telephone <=", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneLike(String value) {
            addCriterion("m_telephone like", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneNotLike(String value) {
            addCriterion("m_telephone not like", value, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneIn(List<String> values) {
            addCriterion("m_telephone in", values, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneNotIn(List<String> values) {
            addCriterion("m_telephone not in", values, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneBetween(String value1, String value2) {
            addCriterion("m_telephone between", value1, value2, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMTelephoneNotBetween(String value1, String value2) {
            addCriterion("m_telephone not between", value1, value2, "mTelephone");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNull() {
            addCriterion("m_address is null");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNotNull() {
            addCriterion("m_address is not null");
            return (Criteria) this;
        }

        public Criteria andMAddressEqualTo(String value) {
            addCriterion("m_address =", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotEqualTo(String value) {
            addCriterion("m_address <>", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThan(String value) {
            addCriterion("m_address >", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThanOrEqualTo(String value) {
            addCriterion("m_address >=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThan(String value) {
            addCriterion("m_address <", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThanOrEqualTo(String value) {
            addCriterion("m_address <=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLike(String value) {
            addCriterion("m_address like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotLike(String value) {
            addCriterion("m_address not like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressIn(List<String> values) {
            addCriterion("m_address in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotIn(List<String> values) {
            addCriterion("m_address not in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressBetween(String value1, String value2) {
            addCriterion("m_address between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotBetween(String value1, String value2) {
            addCriterion("m_address not between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMUidIsNull() {
            addCriterion("m_uid is null");
            return (Criteria) this;
        }

        public Criteria andMUidIsNotNull() {
            addCriterion("m_uid is not null");
            return (Criteria) this;
        }

        public Criteria andMUidEqualTo(String value) {
            addCriterion("m_uid =", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidNotEqualTo(String value) {
            addCriterion("m_uid <>", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidGreaterThan(String value) {
            addCriterion("m_uid >", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidGreaterThanOrEqualTo(String value) {
            addCriterion("m_uid >=", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidLessThan(String value) {
            addCriterion("m_uid <", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidLessThanOrEqualTo(String value) {
            addCriterion("m_uid <=", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidLike(String value) {
            addCriterion("m_uid like", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidNotLike(String value) {
            addCriterion("m_uid not like", value, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidIn(List<String> values) {
            addCriterion("m_uid in", values, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidNotIn(List<String> values) {
            addCriterion("m_uid not in", values, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidBetween(String value1, String value2) {
            addCriterion("m_uid between", value1, value2, "mUid");
            return (Criteria) this;
        }

        public Criteria andMUidNotBetween(String value1, String value2) {
            addCriterion("m_uid not between", value1, value2, "mUid");
            return (Criteria) this;
        }

        public Criteria andMPwdIsNull() {
            addCriterion("m_pwd is null");
            return (Criteria) this;
        }

        public Criteria andMPwdIsNotNull() {
            addCriterion("m_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMPwdEqualTo(String value) {
            addCriterion("m_pwd =", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdNotEqualTo(String value) {
            addCriterion("m_pwd <>", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdGreaterThan(String value) {
            addCriterion("m_pwd >", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdGreaterThanOrEqualTo(String value) {
            addCriterion("m_pwd >=", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdLessThan(String value) {
            addCriterion("m_pwd <", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdLessThanOrEqualTo(String value) {
            addCriterion("m_pwd <=", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdLike(String value) {
            addCriterion("m_pwd like", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdNotLike(String value) {
            addCriterion("m_pwd not like", value, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdIn(List<String> values) {
            addCriterion("m_pwd in", values, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdNotIn(List<String> values) {
            addCriterion("m_pwd not in", values, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdBetween(String value1, String value2) {
            addCriterion("m_pwd between", value1, value2, "mPwd");
            return (Criteria) this;
        }

        public Criteria andMPwdNotBetween(String value1, String value2) {
            addCriterion("m_pwd not between", value1, value2, "mPwd");
            return (Criteria) this;
        }

        public Criteria andSubMidIsNull() {
            addCriterion("sub_mid is null");
            return (Criteria) this;
        }

        public Criteria andSubMidIsNotNull() {
            addCriterion("sub_mid is not null");
            return (Criteria) this;
        }

        public Criteria andSubMidEqualTo(Integer value) {
            addCriterion("sub_mid =", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidNotEqualTo(Integer value) {
            addCriterion("sub_mid <>", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidGreaterThan(Integer value) {
            addCriterion("sub_mid >", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_mid >=", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidLessThan(Integer value) {
            addCriterion("sub_mid <", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidLessThanOrEqualTo(Integer value) {
            addCriterion("sub_mid <=", value, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidIn(List<Integer> values) {
            addCriterion("sub_mid in", values, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidNotIn(List<Integer> values) {
            addCriterion("sub_mid not in", values, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidBetween(Integer value1, Integer value2) {
            addCriterion("sub_mid between", value1, value2, "subMid");
            return (Criteria) this;
        }

        public Criteria andSubMidNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_mid not between", value1, value2, "subMid");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenIsNull() {
            addCriterion("merchant_token is null");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenIsNotNull() {
            addCriterion("merchant_token is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenEqualTo(String value) {
            addCriterion("merchant_token =", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenNotEqualTo(String value) {
            addCriterion("merchant_token <>", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenGreaterThan(String value) {
            addCriterion("merchant_token >", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_token >=", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenLessThan(String value) {
            addCriterion("merchant_token <", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenLessThanOrEqualTo(String value) {
            addCriterion("merchant_token <=", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenLike(String value) {
            addCriterion("merchant_token like", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenNotLike(String value) {
            addCriterion("merchant_token not like", value, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenIn(List<String> values) {
            addCriterion("merchant_token in", values, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenNotIn(List<String> values) {
            addCriterion("merchant_token not in", values, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenBetween(String value1, String value2) {
            addCriterion("merchant_token between", value1, value2, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andMerchantTokenNotBetween(String value1, String value2) {
            addCriterion("merchant_token not between", value1, value2, "merchantToken");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Integer value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Integer value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Integer value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Integer value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Integer value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Integer> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Integer> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Integer value1, Integer value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusIsNull() {
            addCriterion("m_user_status is null");
            return (Criteria) this;
        }

        public Criteria andMUserStatusIsNotNull() {
            addCriterion("m_user_status is not null");
            return (Criteria) this;
        }

        public Criteria andMUserStatusEqualTo(Integer value) {
            addCriterion("m_user_status =", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusNotEqualTo(Integer value) {
            addCriterion("m_user_status <>", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusGreaterThan(Integer value) {
            addCriterion("m_user_status >", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_user_status >=", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusLessThan(Integer value) {
            addCriterion("m_user_status <", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("m_user_status <=", value, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusIn(List<Integer> values) {
            addCriterion("m_user_status in", values, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusNotIn(List<Integer> values) {
            addCriterion("m_user_status not in", values, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("m_user_status between", value1, value2, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andMUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("m_user_status not between", value1, value2, "mUserStatus");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiIsNull() {
            addCriterion("device_eimi is null");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiIsNotNull() {
            addCriterion("device_eimi is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiEqualTo(String value) {
            addCriterion("device_eimi =", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiNotEqualTo(String value) {
            addCriterion("device_eimi <>", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiGreaterThan(String value) {
            addCriterion("device_eimi >", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiGreaterThanOrEqualTo(String value) {
            addCriterion("device_eimi >=", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiLessThan(String value) {
            addCriterion("device_eimi <", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiLessThanOrEqualTo(String value) {
            addCriterion("device_eimi <=", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiLike(String value) {
            addCriterion("device_eimi like", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiNotLike(String value) {
            addCriterion("device_eimi not like", value, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiIn(List<String> values) {
            addCriterion("device_eimi in", values, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiNotIn(List<String> values) {
            addCriterion("device_eimi not in", values, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiBetween(String value1, String value2) {
            addCriterion("device_eimi between", value1, value2, "deviceEimi");
            return (Criteria) this;
        }

        public Criteria andDeviceEimiNotBetween(String value1, String value2) {
            addCriterion("device_eimi not between", value1, value2, "deviceEimi");
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

        public Criteria andMerchantOpenIdIsNull() {
            addCriterion("merchant_open_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdIsNotNull() {
            addCriterion("merchant_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdEqualTo(String value) {
            addCriterion("merchant_open_id =", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdNotEqualTo(String value) {
            addCriterion("merchant_open_id <>", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdGreaterThan(String value) {
            addCriterion("merchant_open_id >", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_open_id >=", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdLessThan(String value) {
            addCriterion("merchant_open_id <", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_open_id <=", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdLike(String value) {
            addCriterion("merchant_open_id like", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdNotLike(String value) {
            addCriterion("merchant_open_id not like", value, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdIn(List<String> values) {
            addCriterion("merchant_open_id in", values, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdNotIn(List<String> values) {
            addCriterion("merchant_open_id not in", values, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdBetween(String value1, String value2) {
            addCriterion("merchant_open_id between", value1, value2, "merchantOpenId");
            return (Criteria) this;
        }

        public Criteria andMerchantOpenIdNotBetween(String value1, String value2) {
            addCriterion("merchant_open_id not between", value1, value2, "merchantOpenId");
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