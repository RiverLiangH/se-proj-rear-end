package com.evan.seprojrearend.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("COURSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("COURSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(BigDecimal value) {
            addCriterion("COURSE_ID >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(BigDecimal value) {
            addCriterion("COURSE_ID <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COURSE_ID <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<BigDecimal> values) {
            addCriterion("COURSE_ID not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COURSE_ID not between", value1, value2, "courseId");
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

        public Criteria andCourseNameIsNull() {
            addCriterion("COURSE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("COURSE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("COURSE_NAME =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("COURSE_NAME <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("COURSE_NAME >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("COURSE_NAME <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("COURSE_NAME <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("COURSE_NAME like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("COURSE_NAME not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("COURSE_NAME in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("COURSE_NAME not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("COURSE_NAME between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("COURSE_NAME not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdIsNull() {
            addCriterion("RES_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdIsNotNull() {
            addCriterion("RES_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdEqualTo(BigDecimal value) {
            addCriterion("RES_TEACHER_ID =", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdNotEqualTo(BigDecimal value) {
            addCriterion("RES_TEACHER_ID <>", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdGreaterThan(BigDecimal value) {
            addCriterion("RES_TEACHER_ID >", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RES_TEACHER_ID >=", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdLessThan(BigDecimal value) {
            addCriterion("RES_TEACHER_ID <", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RES_TEACHER_ID <=", value, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdIn(List<BigDecimal> values) {
            addCriterion("RES_TEACHER_ID in", values, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdNotIn(List<BigDecimal> values) {
            addCriterion("RES_TEACHER_ID not in", values, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RES_TEACHER_ID between", value1, value2, "resTeacherId");
            return (Criteria) this;
        }

        public Criteria andResTeacherIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RES_TEACHER_ID not between", value1, value2, "resTeacherId");
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

        public Criteria andCourseOutlineIsNull() {
            addCriterion("COURSE_OUTLINE is null");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineIsNotNull() {
            addCriterion("COURSE_OUTLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineEqualTo(String value) {
            addCriterion("COURSE_OUTLINE =", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotEqualTo(String value) {
            addCriterion("COURSE_OUTLINE <>", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineGreaterThan(String value) {
            addCriterion("COURSE_OUTLINE >", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineGreaterThanOrEqualTo(String value) {
            addCriterion("COURSE_OUTLINE >=", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLessThan(String value) {
            addCriterion("COURSE_OUTLINE <", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLessThanOrEqualTo(String value) {
            addCriterion("COURSE_OUTLINE <=", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineLike(String value) {
            addCriterion("COURSE_OUTLINE like", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotLike(String value) {
            addCriterion("COURSE_OUTLINE not like", value, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineIn(List<String> values) {
            addCriterion("COURSE_OUTLINE in", values, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotIn(List<String> values) {
            addCriterion("COURSE_OUTLINE not in", values, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineBetween(String value1, String value2) {
            addCriterion("COURSE_OUTLINE between", value1, value2, "courseOutline");
            return (Criteria) this;
        }

        public Criteria andCourseOutlineNotBetween(String value1, String value2) {
            addCriterion("COURSE_OUTLINE not between", value1, value2, "courseOutline");
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