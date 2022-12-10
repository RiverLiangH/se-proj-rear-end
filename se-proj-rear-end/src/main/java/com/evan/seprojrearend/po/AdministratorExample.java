package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("AD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("AD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(BigDecimal value) {
            addCriterion("AD_ID =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(BigDecimal value) {
            addCriterion("AD_ID <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(BigDecimal value) {
            addCriterion("AD_ID >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_ID >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(BigDecimal value) {
            addCriterion("AD_ID <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_ID <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<BigDecimal> values) {
            addCriterion("AD_ID in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<BigDecimal> values) {
            addCriterion("AD_ID not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_ID between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_ID not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(BigDecimal value) {
            addCriterion("SCHOOL_ID >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(BigDecimal value) {
            addCriterion("SCHOOL_ID <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHOOL_ID <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<BigDecimal> values) {
            addCriterion("SCHOOL_ID in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHOOL_ID not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHOOL_ID between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHOOL_ID not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNull() {
            addCriterion("MAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andMailAddressIsNotNull() {
            addCriterion("MAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andMailAddressEqualTo(String value) {
            addCriterion("MAIL_ADDRESS =", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotEqualTo(String value) {
            addCriterion("MAIL_ADDRESS <>", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThan(String value) {
            addCriterion("MAIL_ADDRESS >", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL_ADDRESS >=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThan(String value) {
            addCriterion("MAIL_ADDRESS <", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLessThanOrEqualTo(String value) {
            addCriterion("MAIL_ADDRESS <=", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressLike(String value) {
            addCriterion("MAIL_ADDRESS like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotLike(String value) {
            addCriterion("MAIL_ADDRESS not like", value, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressIn(List<String> values) {
            addCriterion("MAIL_ADDRESS in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotIn(List<String> values) {
            addCriterion("MAIL_ADDRESS not in", values, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressBetween(String value1, String value2) {
            addCriterion("MAIL_ADDRESS between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andMailAddressNotBetween(String value1, String value2) {
            addCriterion("MAIL_ADDRESS not between", value1, value2, "mailAddress");
            return (Criteria) this;
        }

        public Criteria andIsBondIsNull() {
            addCriterion("IS_BOND is null");
            return (Criteria) this;
        }

        public Criteria andIsBondIsNotNull() {
            addCriterion("IS_BOND is not null");
            return (Criteria) this;
        }

        public Criteria andIsBondEqualTo(BigDecimal value) {
            addCriterion("IS_BOND =", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotEqualTo(BigDecimal value) {
            addCriterion("IS_BOND <>", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondGreaterThan(BigDecimal value) {
            addCriterion("IS_BOND >", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_BOND >=", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondLessThan(BigDecimal value) {
            addCriterion("IS_BOND <", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_BOND <=", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondIn(List<BigDecimal> values) {
            addCriterion("IS_BOND in", values, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotIn(List<BigDecimal> values) {
            addCriterion("IS_BOND not in", values, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_BOND between", value1, value2, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_BOND not between", value1, value2, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(BigDecimal value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(BigDecimal value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<BigDecimal> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<BigDecimal> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
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