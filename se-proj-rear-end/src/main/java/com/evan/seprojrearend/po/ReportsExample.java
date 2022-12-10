package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportsExample() {
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

        public Criteria andExperimentIdIsNull() {
            addCriterion("EXPERIMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIsNotNull() {
            addCriterion("EXPERIMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID =", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <>", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThan(BigDecimal value) {
            addCriterion("EXPERIMENT_ID >", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID >=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThan(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPERIMENT_ID <=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIn(List<BigDecimal> values) {
            addCriterion("EXPERIMENT_ID in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotIn(List<BigDecimal> values) {
            addCriterion("EXPERIMENT_ID not in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPERIMENT_ID between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPERIMENT_ID not between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("STUDENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("STUDENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(BigDecimal value) {
            addCriterion("STUDENT_ID =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(BigDecimal value) {
            addCriterion("STUDENT_ID <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(BigDecimal value) {
            addCriterion("STUDENT_ID >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STUDENT_ID >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(BigDecimal value) {
            addCriterion("STUDENT_ID <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STUDENT_ID <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<BigDecimal> values) {
            addCriterion("STUDENT_ID in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<BigDecimal> values) {
            addCriterion("STUDENT_ID not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STUDENT_ID between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STUDENT_ID not between", value1, value2, "studentId");
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

        public Criteria andFinDataIsNull() {
            addCriterion("FIN_DATA is null");
            return (Criteria) this;
        }

        public Criteria andFinDataIsNotNull() {
            addCriterion("FIN_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andFinDataEqualTo(Date value) {
            addCriterion("FIN_DATA =", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataNotEqualTo(Date value) {
            addCriterion("FIN_DATA <>", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataGreaterThan(Date value) {
            addCriterion("FIN_DATA >", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataGreaterThanOrEqualTo(Date value) {
            addCriterion("FIN_DATA >=", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataLessThan(Date value) {
            addCriterion("FIN_DATA <", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataLessThanOrEqualTo(Date value) {
            addCriterion("FIN_DATA <=", value, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataIn(List<Date> values) {
            addCriterion("FIN_DATA in", values, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataNotIn(List<Date> values) {
            addCriterion("FIN_DATA not in", values, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataBetween(Date value1, Date value2) {
            addCriterion("FIN_DATA between", value1, value2, "finData");
            return (Criteria) this;
        }

        public Criteria andFinDataNotBetween(Date value1, Date value2) {
            addCriterion("FIN_DATA not between", value1, value2, "finData");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(BigDecimal value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(BigDecimal value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(BigDecimal value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(BigDecimal value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<BigDecimal> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<BigDecimal> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNull() {
            addCriterion("REPORT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNotNull() {
            addCriterion("REPORT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReportAddressEqualTo(String value) {
            addCriterion("REPORT_ADDRESS =", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotEqualTo(String value) {
            addCriterion("REPORT_ADDRESS <>", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThan(String value) {
            addCriterion("REPORT_ADDRESS >", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ADDRESS >=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThan(String value) {
            addCriterion("REPORT_ADDRESS <", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ADDRESS <=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLike(String value) {
            addCriterion("REPORT_ADDRESS like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotLike(String value) {
            addCriterion("REPORT_ADDRESS not like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressIn(List<String> values) {
            addCriterion("REPORT_ADDRESS in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotIn(List<String> values) {
            addCriterion("REPORT_ADDRESS not in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressBetween(String value1, String value2) {
            addCriterion("REPORT_ADDRESS between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotBetween(String value1, String value2) {
            addCriterion("REPORT_ADDRESS not between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(BigDecimal value) {
            addCriterion("TEACHER_ID >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(BigDecimal value) {
            addCriterion("TEACHER_ID <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEACHER_ID <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<BigDecimal> values) {
            addCriterion("TEACHER_ID in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<BigDecimal> values) {
            addCriterion("TEACHER_ID not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHER_ID between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEACHER_ID not between", value1, value2, "teacherId");
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