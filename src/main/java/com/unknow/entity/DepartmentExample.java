package com.unknow.entity;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartmentSerialIsNull() {
            addCriterion("department_serial is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialIsNotNull() {
            addCriterion("department_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialEqualTo(String value) {
            addCriterion("department_serial =", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialNotEqualTo(String value) {
            addCriterion("department_serial <>", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialGreaterThan(String value) {
            addCriterion("department_serial >", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialGreaterThanOrEqualTo(String value) {
            addCriterion("department_serial >=", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialLessThan(String value) {
            addCriterion("department_serial <", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialLessThanOrEqualTo(String value) {
            addCriterion("department_serial <=", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialLike(String value) {
            addCriterion("department_serial like", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialNotLike(String value) {
            addCriterion("department_serial not like", value, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialIn(List<String> values) {
            addCriterion("department_serial in", values, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialNotIn(List<String> values) {
            addCriterion("department_serial not in", values, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialBetween(String value1, String value2) {
            addCriterion("department_serial between", value1, value2, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentSerialNotBetween(String value1, String value2) {
            addCriterion("department_serial not between", value1, value2, "departmentSerial");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameIsNull() {
            addCriterion("department_allname is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameIsNotNull() {
            addCriterion("department_allname is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameEqualTo(String value) {
            addCriterion("department_allname =", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameNotEqualTo(String value) {
            addCriterion("department_allname <>", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameGreaterThan(String value) {
            addCriterion("department_allname >", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameGreaterThanOrEqualTo(String value) {
            addCriterion("department_allname >=", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameLessThan(String value) {
            addCriterion("department_allname <", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameLessThanOrEqualTo(String value) {
            addCriterion("department_allname <=", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameLike(String value) {
            addCriterion("department_allname like", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameNotLike(String value) {
            addCriterion("department_allname not like", value, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameIn(List<String> values) {
            addCriterion("department_allname in", values, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameNotIn(List<String> values) {
            addCriterion("department_allname not in", values, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameBetween(String value1, String value2) {
            addCriterion("department_allname between", value1, value2, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentAllnameNotBetween(String value1, String value2) {
            addCriterion("department_allname not between", value1, value2, "departmentAllname");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonIsNull() {
            addCriterion("department_person is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonIsNotNull() {
            addCriterion("department_person is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonEqualTo(String value) {
            addCriterion("department_person =", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonNotEqualTo(String value) {
            addCriterion("department_person <>", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonGreaterThan(String value) {
            addCriterion("department_person >", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonGreaterThanOrEqualTo(String value) {
            addCriterion("department_person >=", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonLessThan(String value) {
            addCriterion("department_person <", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonLessThanOrEqualTo(String value) {
            addCriterion("department_person <=", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonLike(String value) {
            addCriterion("department_person like", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonNotLike(String value) {
            addCriterion("department_person not like", value, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonIn(List<String> values) {
            addCriterion("department_person in", values, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonNotIn(List<String> values) {
            addCriterion("department_person not in", values, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonBetween(String value1, String value2) {
            addCriterion("department_person between", value1, value2, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentPersonNotBetween(String value1, String value2) {
            addCriterion("department_person not between", value1, value2, "departmentPerson");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelIsNull() {
            addCriterion("department_tel is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelIsNotNull() {
            addCriterion("department_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelEqualTo(String value) {
            addCriterion("department_tel =", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelNotEqualTo(String value) {
            addCriterion("department_tel <>", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelGreaterThan(String value) {
            addCriterion("department_tel >", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelGreaterThanOrEqualTo(String value) {
            addCriterion("department_tel >=", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelLessThan(String value) {
            addCriterion("department_tel <", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelLessThanOrEqualTo(String value) {
            addCriterion("department_tel <=", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelLike(String value) {
            addCriterion("department_tel like", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelNotLike(String value) {
            addCriterion("department_tel not like", value, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelIn(List<String> values) {
            addCriterion("department_tel in", values, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelNotIn(List<String> values) {
            addCriterion("department_tel not in", values, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelBetween(String value1, String value2) {
            addCriterion("department_tel between", value1, value2, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentTelNotBetween(String value1, String value2) {
            addCriterion("department_tel not between", value1, value2, "departmentTel");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoIsNull() {
            addCriterion("department_memo is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoIsNotNull() {
            addCriterion("department_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoEqualTo(String value) {
            addCriterion("department_memo =", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoNotEqualTo(String value) {
            addCriterion("department_memo <>", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoGreaterThan(String value) {
            addCriterion("department_memo >", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoGreaterThanOrEqualTo(String value) {
            addCriterion("department_memo >=", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoLessThan(String value) {
            addCriterion("department_memo <", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoLessThanOrEqualTo(String value) {
            addCriterion("department_memo <=", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoLike(String value) {
            addCriterion("department_memo like", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoNotLike(String value) {
            addCriterion("department_memo not like", value, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoIn(List<String> values) {
            addCriterion("department_memo in", values, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoNotIn(List<String> values) {
            addCriterion("department_memo not in", values, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoBetween(String value1, String value2) {
            addCriterion("department_memo between", value1, value2, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDepartmentMemoNotBetween(String value1, String value2) {
            addCriterion("department_memo not between", value1, value2, "departmentMemo");
            return (Criteria) this;
        }

        public Criteria andDanweiCountIsNull() {
            addCriterion("danwei_count is null");
            return (Criteria) this;
        }

        public Criteria andDanweiCountIsNotNull() {
            addCriterion("danwei_count is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiCountEqualTo(Integer value) {
            addCriterion("danwei_count =", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountNotEqualTo(Integer value) {
            addCriterion("danwei_count <>", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountGreaterThan(Integer value) {
            addCriterion("danwei_count >", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("danwei_count >=", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountLessThan(Integer value) {
            addCriterion("danwei_count <", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountLessThanOrEqualTo(Integer value) {
            addCriterion("danwei_count <=", value, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountIn(List<Integer> values) {
            addCriterion("danwei_count in", values, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountNotIn(List<Integer> values) {
            addCriterion("danwei_count not in", values, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountBetween(Integer value1, Integer value2) {
            addCriterion("danwei_count between", value1, value2, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andDanweiCountNotBetween(Integer value1, Integer value2) {
            addCriterion("danwei_count not between", value1, value2, "danweiCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountIsNull() {
            addCriterion("bumen_count is null");
            return (Criteria) this;
        }

        public Criteria andBumenCountIsNotNull() {
            addCriterion("bumen_count is not null");
            return (Criteria) this;
        }

        public Criteria andBumenCountEqualTo(Integer value) {
            addCriterion("bumen_count =", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountNotEqualTo(Integer value) {
            addCriterion("bumen_count <>", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountGreaterThan(Integer value) {
            addCriterion("bumen_count >", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bumen_count >=", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountLessThan(Integer value) {
            addCriterion("bumen_count <", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountLessThanOrEqualTo(Integer value) {
            addCriterion("bumen_count <=", value, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountIn(List<Integer> values) {
            addCriterion("bumen_count in", values, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountNotIn(List<Integer> values) {
            addCriterion("bumen_count not in", values, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountBetween(Integer value1, Integer value2) {
            addCriterion("bumen_count between", value1, value2, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andBumenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bumen_count not between", value1, value2, "bumenCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountIsNull() {
            addCriterion("jigou_count is null");
            return (Criteria) this;
        }

        public Criteria andJigouCountIsNotNull() {
            addCriterion("jigou_count is not null");
            return (Criteria) this;
        }

        public Criteria andJigouCountEqualTo(Integer value) {
            addCriterion("jigou_count =", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountNotEqualTo(Integer value) {
            addCriterion("jigou_count <>", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountGreaterThan(Integer value) {
            addCriterion("jigou_count >", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("jigou_count >=", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountLessThan(Integer value) {
            addCriterion("jigou_count <", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountLessThanOrEqualTo(Integer value) {
            addCriterion("jigou_count <=", value, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountIn(List<Integer> values) {
            addCriterion("jigou_count in", values, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountNotIn(List<Integer> values) {
            addCriterion("jigou_count not in", values, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountBetween(Integer value1, Integer value2) {
            addCriterion("jigou_count between", value1, value2, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andJigouCountNotBetween(Integer value1, Integer value2) {
            addCriterion("jigou_count not between", value1, value2, "jigouCount");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellIsNull() {
            addCriterion("department_spell is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellIsNotNull() {
            addCriterion("department_spell is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellEqualTo(String value) {
            addCriterion("department_spell =", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellNotEqualTo(String value) {
            addCriterion("department_spell <>", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellGreaterThan(String value) {
            addCriterion("department_spell >", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellGreaterThanOrEqualTo(String value) {
            addCriterion("department_spell >=", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellLessThan(String value) {
            addCriterion("department_spell <", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellLessThanOrEqualTo(String value) {
            addCriterion("department_spell <=", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellLike(String value) {
            addCriterion("department_spell like", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellNotLike(String value) {
            addCriterion("department_spell not like", value, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellIn(List<String> values) {
            addCriterion("department_spell in", values, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellNotIn(List<String> values) {
            addCriterion("department_spell not in", values, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellBetween(String value1, String value2) {
            addCriterion("department_spell between", value1, value2, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentSpellNotBetween(String value1, String value2) {
            addCriterion("department_spell not between", value1, value2, "departmentSpell");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("department_code not between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeIsNull() {
            addCriterion("department_zhcode is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeIsNotNull() {
            addCriterion("department_zhcode is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeEqualTo(String value) {
            addCriterion("department_zhcode =", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeNotEqualTo(String value) {
            addCriterion("department_zhcode <>", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeGreaterThan(String value) {
            addCriterion("department_zhcode >", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_zhcode >=", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeLessThan(String value) {
            addCriterion("department_zhcode <", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeLessThanOrEqualTo(String value) {
            addCriterion("department_zhcode <=", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeLike(String value) {
            addCriterion("department_zhcode like", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeNotLike(String value) {
            addCriterion("department_zhcode not like", value, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeIn(List<String> values) {
            addCriterion("department_zhcode in", values, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeNotIn(List<String> values) {
            addCriterion("department_zhcode not in", values, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeBetween(String value1, String value2) {
            addCriterion("department_zhcode between", value1, value2, "departmentZhcode");
            return (Criteria) this;
        }

        public Criteria andDepartmentZhcodeNotBetween(String value1, String value2) {
            addCriterion("department_zhcode not between", value1, value2, "departmentZhcode");
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