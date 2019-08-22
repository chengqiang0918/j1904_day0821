package com.j1904.pojo;

import java.util.ArrayList;
import java.util.List;

public class BusinessTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessTableExample() {
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

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Integer value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Integer value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Integer value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Integer value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Integer value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Integer> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Integer> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Integer value1, Integer value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Integer value1, Integer value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessName not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdIsNull() {
            addCriterion("businessPwd is null");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdIsNotNull() {
            addCriterion("businessPwd is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdEqualTo(String value) {
            addCriterion("businessPwd =", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdNotEqualTo(String value) {
            addCriterion("businessPwd <>", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdGreaterThan(String value) {
            addCriterion("businessPwd >", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdGreaterThanOrEqualTo(String value) {
            addCriterion("businessPwd >=", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdLessThan(String value) {
            addCriterion("businessPwd <", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdLessThanOrEqualTo(String value) {
            addCriterion("businessPwd <=", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdLike(String value) {
            addCriterion("businessPwd like", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdNotLike(String value) {
            addCriterion("businessPwd not like", value, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdIn(List<String> values) {
            addCriterion("businessPwd in", values, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdNotIn(List<String> values) {
            addCriterion("businessPwd not in", values, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdBetween(String value1, String value2) {
            addCriterion("businessPwd between", value1, value2, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinesspwdNotBetween(String value1, String value2) {
            addCriterion("businessPwd not between", value1, value2, "businesspwd");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNull() {
            addCriterion("businessAddress is null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIsNotNull() {
            addCriterion("businessAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressEqualTo(String value) {
            addCriterion("businessAddress =", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotEqualTo(String value) {
            addCriterion("businessAddress <>", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThan(String value) {
            addCriterion("businessAddress >", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressGreaterThanOrEqualTo(String value) {
            addCriterion("businessAddress >=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThan(String value) {
            addCriterion("businessAddress <", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLessThanOrEqualTo(String value) {
            addCriterion("businessAddress <=", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressLike(String value) {
            addCriterion("businessAddress like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotLike(String value) {
            addCriterion("businessAddress not like", value, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressIn(List<String> values) {
            addCriterion("businessAddress in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotIn(List<String> values) {
            addCriterion("businessAddress not in", values, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressBetween(String value1, String value2) {
            addCriterion("businessAddress between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessaddressNotBetween(String value1, String value2) {
            addCriterion("businessAddress not between", value1, value2, "businessaddress");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNull() {
            addCriterion("businessPhone is null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIsNotNull() {
            addCriterion("businessPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneEqualTo(String value) {
            addCriterion("businessPhone =", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotEqualTo(String value) {
            addCriterion("businessPhone <>", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThan(String value) {
            addCriterion("businessPhone >", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneGreaterThanOrEqualTo(String value) {
            addCriterion("businessPhone >=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThan(String value) {
            addCriterion("businessPhone <", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLessThanOrEqualTo(String value) {
            addCriterion("businessPhone <=", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneLike(String value) {
            addCriterion("businessPhone like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotLike(String value) {
            addCriterion("businessPhone not like", value, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneIn(List<String> values) {
            addCriterion("businessPhone in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotIn(List<String> values) {
            addCriterion("businessPhone not in", values, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneBetween(String value1, String value2) {
            addCriterion("businessPhone between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessphoneNotBetween(String value1, String value2) {
            addCriterion("businessPhone not between", value1, value2, "businessphone");
            return (Criteria) this;
        }

        public Criteria andBusinessstateIsNull() {
            addCriterion("businessState is null");
            return (Criteria) this;
        }

        public Criteria andBusinessstateIsNotNull() {
            addCriterion("businessState is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessstateEqualTo(Integer value) {
            addCriterion("businessState =", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotEqualTo(Integer value) {
            addCriterion("businessState <>", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateGreaterThan(Integer value) {
            addCriterion("businessState >", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessState >=", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateLessThan(Integer value) {
            addCriterion("businessState <", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateLessThanOrEqualTo(Integer value) {
            addCriterion("businessState <=", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateIn(List<Integer> values) {
            addCriterion("businessState in", values, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotIn(List<Integer> values) {
            addCriterion("businessState not in", values, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateBetween(Integer value1, Integer value2) {
            addCriterion("businessState between", value1, value2, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotBetween(Integer value1, Integer value2) {
            addCriterion("businessState not between", value1, value2, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoIsNull() {
            addCriterion("businessInfo is null");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoIsNotNull() {
            addCriterion("businessInfo is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoEqualTo(String value) {
            addCriterion("businessInfo =", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoNotEqualTo(String value) {
            addCriterion("businessInfo <>", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoGreaterThan(String value) {
            addCriterion("businessInfo >", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoGreaterThanOrEqualTo(String value) {
            addCriterion("businessInfo >=", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoLessThan(String value) {
            addCriterion("businessInfo <", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoLessThanOrEqualTo(String value) {
            addCriterion("businessInfo <=", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoLike(String value) {
            addCriterion("businessInfo like", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoNotLike(String value) {
            addCriterion("businessInfo not like", value, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoIn(List<String> values) {
            addCriterion("businessInfo in", values, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoNotIn(List<String> values) {
            addCriterion("businessInfo not in", values, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoBetween(String value1, String value2) {
            addCriterion("businessInfo between", value1, value2, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessinfoNotBetween(String value1, String value2) {
            addCriterion("businessInfo not between", value1, value2, "businessinfo");
            return (Criteria) this;
        }

        public Criteria andBusinessimgIsNull() {
            addCriterion("businessImg is null");
            return (Criteria) this;
        }

        public Criteria andBusinessimgIsNotNull() {
            addCriterion("businessImg is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessimgEqualTo(String value) {
            addCriterion("businessImg =", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgNotEqualTo(String value) {
            addCriterion("businessImg <>", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgGreaterThan(String value) {
            addCriterion("businessImg >", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgGreaterThanOrEqualTo(String value) {
            addCriterion("businessImg >=", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgLessThan(String value) {
            addCriterion("businessImg <", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgLessThanOrEqualTo(String value) {
            addCriterion("businessImg <=", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgLike(String value) {
            addCriterion("businessImg like", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgNotLike(String value) {
            addCriterion("businessImg not like", value, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgIn(List<String> values) {
            addCriterion("businessImg in", values, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgNotIn(List<String> values) {
            addCriterion("businessImg not in", values, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgBetween(String value1, String value2) {
            addCriterion("businessImg between", value1, value2, "businessimg");
            return (Criteria) this;
        }

        public Criteria andBusinessimgNotBetween(String value1, String value2) {
            addCriterion("businessImg not between", value1, value2, "businessimg");
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