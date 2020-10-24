package com.park.cloud.common.domain.po.sys;

import java.util.ArrayList;
import java.util.List;

public class SysPagePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPagePOExample() {
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

        public Criteria andPageIdIsNull() {
            addCriterion("page_id is null");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNotNull() {
            addCriterion("page_id is not null");
            return (Criteria) this;
        }

        public Criteria andPageIdEqualTo(Integer value) {
            addCriterion("page_id =", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotEqualTo(Integer value) {
            addCriterion("page_id <>", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThan(Integer value) {
            addCriterion("page_id >", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_id >=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThan(Integer value) {
            addCriterion("page_id <", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThanOrEqualTo(Integer value) {
            addCriterion("page_id <=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdIn(List<Integer> values) {
            addCriterion("page_id in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotIn(List<Integer> values) {
            addCriterion("page_id not in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdBetween(Integer value1, Integer value2) {
            addCriterion("page_id between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("page_id not between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNull() {
            addCriterion("page_name is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("page_name is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("page_name =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("page_name <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("page_name >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("page_name >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("page_name <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("page_name <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("page_name like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("page_name not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("page_name in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("page_name not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("page_name between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("page_name not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageRemarkIsNull() {
            addCriterion("page_remark is null");
            return (Criteria) this;
        }

        public Criteria andPageRemarkIsNotNull() {
            addCriterion("page_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPageRemarkEqualTo(String value) {
            addCriterion("page_remark =", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkNotEqualTo(String value) {
            addCriterion("page_remark <>", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkGreaterThan(String value) {
            addCriterion("page_remark >", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("page_remark >=", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkLessThan(String value) {
            addCriterion("page_remark <", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkLessThanOrEqualTo(String value) {
            addCriterion("page_remark <=", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkLike(String value) {
            addCriterion("page_remark like", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkNotLike(String value) {
            addCriterion("page_remark not like", value, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkIn(List<String> values) {
            addCriterion("page_remark in", values, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkNotIn(List<String> values) {
            addCriterion("page_remark not in", values, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkBetween(String value1, String value2) {
            addCriterion("page_remark between", value1, value2, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageRemarkNotBetween(String value1, String value2) {
            addCriterion("page_remark not between", value1, value2, "pageRemark");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNull() {
            addCriterion("page_url is null");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNotNull() {
            addCriterion("page_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageUrlEqualTo(String value) {
            addCriterion("page_url =", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotEqualTo(String value) {
            addCriterion("page_url <>", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThan(String value) {
            addCriterion("page_url >", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_url >=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThan(String value) {
            addCriterion("page_url <", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThanOrEqualTo(String value) {
            addCriterion("page_url <=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLike(String value) {
            addCriterion("page_url like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotLike(String value) {
            addCriterion("page_url not like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIn(List<String> values) {
            addCriterion("page_url in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotIn(List<String> values) {
            addCriterion("page_url not in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlBetween(String value1, String value2) {
            addCriterion("page_url between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotBetween(String value1, String value2) {
            addCriterion("page_url not between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andPageIconIsNull() {
            addCriterion("page_icon is null");
            return (Criteria) this;
        }

        public Criteria andPageIconIsNotNull() {
            addCriterion("page_icon is not null");
            return (Criteria) this;
        }

        public Criteria andPageIconEqualTo(String value) {
            addCriterion("page_icon =", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconNotEqualTo(String value) {
            addCriterion("page_icon <>", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconGreaterThan(String value) {
            addCriterion("page_icon >", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconGreaterThanOrEqualTo(String value) {
            addCriterion("page_icon >=", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconLessThan(String value) {
            addCriterion("page_icon <", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconLessThanOrEqualTo(String value) {
            addCriterion("page_icon <=", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconLike(String value) {
            addCriterion("page_icon like", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconNotLike(String value) {
            addCriterion("page_icon not like", value, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconIn(List<String> values) {
            addCriterion("page_icon in", values, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconNotIn(List<String> values) {
            addCriterion("page_icon not in", values, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconBetween(String value1, String value2) {
            addCriterion("page_icon between", value1, value2, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageIconNotBetween(String value1, String value2) {
            addCriterion("page_icon not between", value1, value2, "pageIcon");
            return (Criteria) this;
        }

        public Criteria andPageSortIsNull() {
            addCriterion("page_sort is null");
            return (Criteria) this;
        }

        public Criteria andPageSortIsNotNull() {
            addCriterion("page_sort is not null");
            return (Criteria) this;
        }

        public Criteria andPageSortEqualTo(Integer value) {
            addCriterion("page_sort =", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortNotEqualTo(Integer value) {
            addCriterion("page_sort <>", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortGreaterThan(Integer value) {
            addCriterion("page_sort >", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_sort >=", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortLessThan(Integer value) {
            addCriterion("page_sort <", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortLessThanOrEqualTo(Integer value) {
            addCriterion("page_sort <=", value, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortIn(List<Integer> values) {
            addCriterion("page_sort in", values, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortNotIn(List<Integer> values) {
            addCriterion("page_sort not in", values, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortBetween(Integer value1, Integer value2) {
            addCriterion("page_sort between", value1, value2, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageSortNotBetween(Integer value1, Integer value2) {
            addCriterion("page_sort not between", value1, value2, "pageSort");
            return (Criteria) this;
        }

        public Criteria andPageLevelIsNull() {
            addCriterion("page_level is null");
            return (Criteria) this;
        }

        public Criteria andPageLevelIsNotNull() {
            addCriterion("page_level is not null");
            return (Criteria) this;
        }

        public Criteria andPageLevelEqualTo(Integer value) {
            addCriterion("page_level =", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelNotEqualTo(Integer value) {
            addCriterion("page_level <>", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelGreaterThan(Integer value) {
            addCriterion("page_level >", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_level >=", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelLessThan(Integer value) {
            addCriterion("page_level <", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelLessThanOrEqualTo(Integer value) {
            addCriterion("page_level <=", value, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelIn(List<Integer> values) {
            addCriterion("page_level in", values, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelNotIn(List<Integer> values) {
            addCriterion("page_level not in", values, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelBetween(Integer value1, Integer value2) {
            addCriterion("page_level between", value1, value2, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("page_level not between", value1, value2, "pageLevel");
            return (Criteria) this;
        }

        public Criteria andPageTypeIsNull() {
            addCriterion("page_type is null");
            return (Criteria) this;
        }

        public Criteria andPageTypeIsNotNull() {
            addCriterion("page_type is not null");
            return (Criteria) this;
        }

        public Criteria andPageTypeEqualTo(Integer value) {
            addCriterion("page_type =", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotEqualTo(Integer value) {
            addCriterion("page_type <>", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeGreaterThan(Integer value) {
            addCriterion("page_type >", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_type >=", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeLessThan(Integer value) {
            addCriterion("page_type <", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("page_type <=", value, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeIn(List<Integer> values) {
            addCriterion("page_type in", values, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotIn(List<Integer> values) {
            addCriterion("page_type not in", values, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeBetween(Integer value1, Integer value2) {
            addCriterion("page_type between", value1, value2, "pageType");
            return (Criteria) this;
        }

        public Criteria andPageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("page_type not between", value1, value2, "pageType");
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