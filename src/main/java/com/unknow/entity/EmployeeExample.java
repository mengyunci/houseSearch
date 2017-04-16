package com.unknow.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmployeeSerialIsNull() {
            addCriterion("employee_serial is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialIsNotNull() {
            addCriterion("employee_serial is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialEqualTo(String value) {
            addCriterion("employee_serial =", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotEqualTo(String value) {
            addCriterion("employee_serial <>", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialGreaterThan(String value) {
            addCriterion("employee_serial >", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialGreaterThanOrEqualTo(String value) {
            addCriterion("employee_serial >=", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLessThan(String value) {
            addCriterion("employee_serial <", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLessThanOrEqualTo(String value) {
            addCriterion("employee_serial <=", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialLike(String value) {
            addCriterion("employee_serial like", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotLike(String value) {
            addCriterion("employee_serial not like", value, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialIn(List<String> values) {
            addCriterion("employee_serial in", values, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotIn(List<String> values) {
            addCriterion("employee_serial not in", values, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialBetween(String value1, String value2) {
            addCriterion("employee_serial between", value1, value2, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeSerialNotBetween(String value1, String value2) {
            addCriterion("employee_serial not between", value1, value2, "employeeSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialIsNull() {
            addCriterion("filiation_serial is null");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialIsNotNull() {
            addCriterion("filiation_serial is not null");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialEqualTo(String value) {
            addCriterion("filiation_serial =", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialNotEqualTo(String value) {
            addCriterion("filiation_serial <>", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialGreaterThan(String value) {
            addCriterion("filiation_serial >", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialGreaterThanOrEqualTo(String value) {
            addCriterion("filiation_serial >=", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialLessThan(String value) {
            addCriterion("filiation_serial <", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialLessThanOrEqualTo(String value) {
            addCriterion("filiation_serial <=", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialLike(String value) {
            addCriterion("filiation_serial like", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialNotLike(String value) {
            addCriterion("filiation_serial not like", value, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialIn(List<String> values) {
            addCriterion("filiation_serial in", values, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialNotIn(List<String> values) {
            addCriterion("filiation_serial not in", values, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialBetween(String value1, String value2) {
            addCriterion("filiation_serial between", value1, value2, "filiationSerial");
            return (Criteria) this;
        }

        public Criteria andFiliationSerialNotBetween(String value1, String value2) {
            addCriterion("filiation_serial not between", value1, value2, "filiationSerial");
            return (Criteria) this;
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

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellIsNull() {
            addCriterion("employee_spell is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellIsNotNull() {
            addCriterion("employee_spell is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellEqualTo(String value) {
            addCriterion("employee_spell =", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellNotEqualTo(String value) {
            addCriterion("employee_spell <>", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellGreaterThan(String value) {
            addCriterion("employee_spell >", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellGreaterThanOrEqualTo(String value) {
            addCriterion("employee_spell >=", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellLessThan(String value) {
            addCriterion("employee_spell <", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellLessThanOrEqualTo(String value) {
            addCriterion("employee_spell <=", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellLike(String value) {
            addCriterion("employee_spell like", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellNotLike(String value) {
            addCriterion("employee_spell not like", value, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellIn(List<String> values) {
            addCriterion("employee_spell in", values, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellNotIn(List<String> values) {
            addCriterion("employee_spell not in", values, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellBetween(String value1, String value2) {
            addCriterion("employee_spell between", value1, value2, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andEmployeeSpellNotBetween(String value1, String value2) {
            addCriterion("employee_spell not between", value1, value2, "employeeSpell");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialIsNull() {
            addCriterion("credentials_serial is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialIsNotNull() {
            addCriterion("credentials_serial is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialEqualTo(String value) {
            addCriterion("credentials_serial =", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialNotEqualTo(String value) {
            addCriterion("credentials_serial <>", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialGreaterThan(String value) {
            addCriterion("credentials_serial >", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_serial >=", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialLessThan(String value) {
            addCriterion("credentials_serial <", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialLessThanOrEqualTo(String value) {
            addCriterion("credentials_serial <=", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialLike(String value) {
            addCriterion("credentials_serial like", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialNotLike(String value) {
            addCriterion("credentials_serial not like", value, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialIn(List<String> values) {
            addCriterion("credentials_serial in", values, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialNotIn(List<String> values) {
            addCriterion("credentials_serial not in", values, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialBetween(String value1, String value2) {
            addCriterion("credentials_serial between", value1, value2, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andCredentialsSerialNotBetween(String value1, String value2) {
            addCriterion("credentials_serial not between", value1, value2, "credentialsSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialIsNull() {
            addCriterion("employee_jdserial is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialIsNotNull() {
            addCriterion("employee_jdserial is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialEqualTo(String value) {
            addCriterion("employee_jdserial =", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialNotEqualTo(String value) {
            addCriterion("employee_jdserial <>", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialGreaterThan(String value) {
            addCriterion("employee_jdserial >", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialGreaterThanOrEqualTo(String value) {
            addCriterion("employee_jdserial >=", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialLessThan(String value) {
            addCriterion("employee_jdserial <", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialLessThanOrEqualTo(String value) {
            addCriterion("employee_jdserial <=", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialLike(String value) {
            addCriterion("employee_jdserial like", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialNotLike(String value) {
            addCriterion("employee_jdserial not like", value, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialIn(List<String> values) {
            addCriterion("employee_jdserial in", values, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialNotIn(List<String> values) {
            addCriterion("employee_jdserial not in", values, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialBetween(String value1, String value2) {
            addCriterion("employee_jdserial between", value1, value2, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdserialNotBetween(String value1, String value2) {
            addCriterion("employee_jdserial not between", value1, value2, "employeeJdserial");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("employee_id like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("employee_id not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNull() {
            addCriterion("employee_birth is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIsNotNull() {
            addCriterion("employee_birth is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthEqualTo(Date value) {
            addCriterion("employee_birth =", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotEqualTo(Date value) {
            addCriterion("employee_birth <>", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThan(Date value) {
            addCriterion("employee_birth >", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_birth >=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThan(Date value) {
            addCriterion("employee_birth <", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthLessThanOrEqualTo(Date value) {
            addCriterion("employee_birth <=", value, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthIn(List<Date> values) {
            addCriterion("employee_birth in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotIn(List<Date> values) {
            addCriterion("employee_birth not in", values, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthBetween(Date value1, Date value2) {
            addCriterion("employee_birth between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthNotBetween(Date value1, Date value2) {
            addCriterion("employee_birth not between", value1, value2, "employeeBirth");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNull() {
            addCriterion("employee_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNotNull() {
            addCriterion("employee_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexEqualTo(Boolean value) {
            addCriterion("employee_sex =", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotEqualTo(Boolean value) {
            addCriterion("employee_sex <>", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThan(Boolean value) {
            addCriterion("employee_sex >", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employee_sex >=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThan(Boolean value) {
            addCriterion("employee_sex <", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThanOrEqualTo(Boolean value) {
            addCriterion("employee_sex <=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIn(List<Boolean> values) {
            addCriterion("employee_sex in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotIn(List<Boolean> values) {
            addCriterion("employee_sex not in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_sex between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_sex not between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNull() {
            addCriterion("nation_code is null");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNotNull() {
            addCriterion("nation_code is not null");
            return (Criteria) this;
        }

        public Criteria andNationCodeEqualTo(String value) {
            addCriterion("nation_code =", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotEqualTo(String value) {
            addCriterion("nation_code <>", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThan(String value) {
            addCriterion("nation_code >", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nation_code >=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThan(String value) {
            addCriterion("nation_code <", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThanOrEqualTo(String value) {
            addCriterion("nation_code <=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLike(String value) {
            addCriterion("nation_code like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotLike(String value) {
            addCriterion("nation_code not like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeIn(List<String> values) {
            addCriterion("nation_code in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotIn(List<String> values) {
            addCriterion("nation_code not in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeBetween(String value1, String value2) {
            addCriterion("nation_code between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotBetween(String value1, String value2) {
            addCriterion("nation_code not between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeIsNull() {
            addCriterion("polity_code is null");
            return (Criteria) this;
        }

        public Criteria andPolityCodeIsNotNull() {
            addCriterion("polity_code is not null");
            return (Criteria) this;
        }

        public Criteria andPolityCodeEqualTo(String value) {
            addCriterion("polity_code =", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeNotEqualTo(String value) {
            addCriterion("polity_code <>", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeGreaterThan(String value) {
            addCriterion("polity_code >", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("polity_code >=", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeLessThan(String value) {
            addCriterion("polity_code <", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeLessThanOrEqualTo(String value) {
            addCriterion("polity_code <=", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeLike(String value) {
            addCriterion("polity_code like", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeNotLike(String value) {
            addCriterion("polity_code not like", value, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeIn(List<String> values) {
            addCriterion("polity_code in", values, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeNotIn(List<String> values) {
            addCriterion("polity_code not in", values, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeBetween(String value1, String value2) {
            addCriterion("polity_code between", value1, value2, "polityCode");
            return (Criteria) this;
        }

        public Criteria andPolityCodeNotBetween(String value1, String value2) {
            addCriterion("polity_code not between", value1, value2, "polityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeIsNull() {
            addCriterion("deformity_code is null");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeIsNotNull() {
            addCriterion("deformity_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeEqualTo(String value) {
            addCriterion("deformity_code =", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeNotEqualTo(String value) {
            addCriterion("deformity_code <>", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeGreaterThan(String value) {
            addCriterion("deformity_code >", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deformity_code >=", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeLessThan(String value) {
            addCriterion("deformity_code <", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeLessThanOrEqualTo(String value) {
            addCriterion("deformity_code <=", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeLike(String value) {
            addCriterion("deformity_code like", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeNotLike(String value) {
            addCriterion("deformity_code not like", value, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeIn(List<String> values) {
            addCriterion("deformity_code in", values, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeNotIn(List<String> values) {
            addCriterion("deformity_code not in", values, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeBetween(String value1, String value2) {
            addCriterion("deformity_code between", value1, value2, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andDeformityCodeNotBetween(String value1, String value2) {
            addCriterion("deformity_code not between", value1, value2, "deformityCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressIsNull() {
            addCriterion("employee_degress is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressIsNotNull() {
            addCriterion("employee_degress is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressEqualTo(String value) {
            addCriterion("employee_degress =", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressNotEqualTo(String value) {
            addCriterion("employee_degress <>", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressGreaterThan(String value) {
            addCriterion("employee_degress >", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressGreaterThanOrEqualTo(String value) {
            addCriterion("employee_degress >=", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressLessThan(String value) {
            addCriterion("employee_degress <", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressLessThanOrEqualTo(String value) {
            addCriterion("employee_degress <=", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressLike(String value) {
            addCriterion("employee_degress like", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressNotLike(String value) {
            addCriterion("employee_degress not like", value, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressIn(List<String> values) {
            addCriterion("employee_degress in", values, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressNotIn(List<String> values) {
            addCriterion("employee_degress not in", values, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressBetween(String value1, String value2) {
            addCriterion("employee_degress between", value1, value2, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeDegressNotBetween(String value1, String value2) {
            addCriterion("employee_degress not between", value1, value2, "employeeDegress");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIsNull() {
            addCriterion("employee_state is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIsNotNull() {
            addCriterion("employee_state is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateEqualTo(String value) {
            addCriterion("employee_state =", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotEqualTo(String value) {
            addCriterion("employee_state <>", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThan(String value) {
            addCriterion("employee_state >", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThanOrEqualTo(String value) {
            addCriterion("employee_state >=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThan(String value) {
            addCriterion("employee_state <", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThanOrEqualTo(String value) {
            addCriterion("employee_state <=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLike(String value) {
            addCriterion("employee_state like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotLike(String value) {
            addCriterion("employee_state not like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIn(List<String> values) {
            addCriterion("employee_state in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotIn(List<String> values) {
            addCriterion("employee_state not in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateBetween(String value1, String value2) {
            addCriterion("employee_state between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotBetween(String value1, String value2) {
            addCriterion("employee_state not between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageIsNull() {
            addCriterion("employee_marriage is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageIsNotNull() {
            addCriterion("employee_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageEqualTo(String value) {
            addCriterion("employee_marriage =", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageNotEqualTo(String value) {
            addCriterion("employee_marriage <>", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageGreaterThan(String value) {
            addCriterion("employee_marriage >", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("employee_marriage >=", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageLessThan(String value) {
            addCriterion("employee_marriage <", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageLessThanOrEqualTo(String value) {
            addCriterion("employee_marriage <=", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageLike(String value) {
            addCriterion("employee_marriage like", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageNotLike(String value) {
            addCriterion("employee_marriage not like", value, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageIn(List<String> values) {
            addCriterion("employee_marriage in", values, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageNotIn(List<String> values) {
            addCriterion("employee_marriage not in", values, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageBetween(String value1, String value2) {
            addCriterion("employee_marriage between", value1, value2, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeMarriageNotBetween(String value1, String value2) {
            addCriterion("employee_marriage not between", value1, value2, "employeeMarriage");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employee_code is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employee_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(Boolean value) {
            addCriterion("employee_code =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(Boolean value) {
            addCriterion("employee_code <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(Boolean value) {
            addCriterion("employee_code >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("employee_code >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(Boolean value) {
            addCriterion("employee_code <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(Boolean value) {
            addCriterion("employee_code <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<Boolean> values) {
            addCriterion("employee_code in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<Boolean> values) {
            addCriterion("employee_code not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_code between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("employee_code not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyIsNull() {
            addCriterion("employee_academy is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyIsNotNull() {
            addCriterion("employee_academy is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyEqualTo(String value) {
            addCriterion("employee_academy =", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyNotEqualTo(String value) {
            addCriterion("employee_academy <>", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyGreaterThan(String value) {
            addCriterion("employee_academy >", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("employee_academy >=", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyLessThan(String value) {
            addCriterion("employee_academy <", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyLessThanOrEqualTo(String value) {
            addCriterion("employee_academy <=", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyLike(String value) {
            addCriterion("employee_academy like", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyNotLike(String value) {
            addCriterion("employee_academy not like", value, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyIn(List<String> values) {
            addCriterion("employee_academy in", values, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyNotIn(List<String> values) {
            addCriterion("employee_academy not in", values, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyBetween(String value1, String value2) {
            addCriterion("employee_academy between", value1, value2, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeAcademyNotBetween(String value1, String value2) {
            addCriterion("employee_academy not between", value1, value2, "employeeAcademy");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateIsNull() {
            addCriterion("employee_graduate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateIsNotNull() {
            addCriterion("employee_graduate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateEqualTo(Date value) {
            addCriterion("employee_graduate =", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateNotEqualTo(Date value) {
            addCriterion("employee_graduate <>", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateGreaterThan(Date value) {
            addCriterion("employee_graduate >", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_graduate >=", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateLessThan(Date value) {
            addCriterion("employee_graduate <", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateLessThanOrEqualTo(Date value) {
            addCriterion("employee_graduate <=", value, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateIn(List<Date> values) {
            addCriterion("employee_graduate in", values, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateNotIn(List<Date> values) {
            addCriterion("employee_graduate not in", values, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateBetween(Date value1, Date value2) {
            addCriterion("employee_graduate between", value1, value2, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeGraduateNotBetween(Date value1, Date value2) {
            addCriterion("employee_graduate not between", value1, value2, "employeeGraduate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterIsNull() {
            addCriterion("employee_enter is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterIsNotNull() {
            addCriterion("employee_enter is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterEqualTo(Date value) {
            addCriterion("employee_enter =", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterNotEqualTo(Date value) {
            addCriterion("employee_enter <>", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterGreaterThan(Date value) {
            addCriterion("employee_enter >", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_enter >=", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterLessThan(Date value) {
            addCriterion("employee_enter <", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterLessThanOrEqualTo(Date value) {
            addCriterion("employee_enter <=", value, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterIn(List<Date> values) {
            addCriterion("employee_enter in", values, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterNotIn(List<Date> values) {
            addCriterion("employee_enter not in", values, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterBetween(Date value1, Date value2) {
            addCriterion("employee_enter between", value1, value2, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeEnterNotBetween(Date value1, Date value2) {
            addCriterion("employee_enter not between", value1, value2, "employeeEnter");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkIsNull() {
            addCriterion("employee_work is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkIsNotNull() {
            addCriterion("employee_work is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkEqualTo(Date value) {
            addCriterion("employee_work =", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkNotEqualTo(Date value) {
            addCriterion("employee_work <>", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkGreaterThan(Date value) {
            addCriterion("employee_work >", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_work >=", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkLessThan(Date value) {
            addCriterion("employee_work <", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkLessThanOrEqualTo(Date value) {
            addCriterion("employee_work <=", value, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkIn(List<Date> values) {
            addCriterion("employee_work in", values, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkNotIn(List<Date> values) {
            addCriterion("employee_work not in", values, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkBetween(Date value1, Date value2) {
            addCriterion("employee_work between", value1, value2, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeWorkNotBetween(Date value1, Date value2) {
            addCriterion("employee_work not between", value1, value2, "employeeWork");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIsNull() {
            addCriterion("employee_memo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIsNotNull() {
            addCriterion("employee_memo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoEqualTo(String value) {
            addCriterion("employee_memo =", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotEqualTo(String value) {
            addCriterion("employee_memo <>", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoGreaterThan(String value) {
            addCriterion("employee_memo >", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_memo >=", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLessThan(String value) {
            addCriterion("employee_memo <", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLessThanOrEqualTo(String value) {
            addCriterion("employee_memo <=", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoLike(String value) {
            addCriterion("employee_memo like", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotLike(String value) {
            addCriterion("employee_memo not like", value, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoIn(List<String> values) {
            addCriterion("employee_memo in", values, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotIn(List<String> values) {
            addCriterion("employee_memo not in", values, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoBetween(String value1, String value2) {
            addCriterion("employee_memo between", value1, value2, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeMemoNotBetween(String value1, String value2) {
            addCriterion("employee_memo not between", value1, value2, "employeeMemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengIsNull() {
            addCriterion("employee_zhicheng is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengIsNotNull() {
            addCriterion("employee_zhicheng is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengEqualTo(String value) {
            addCriterion("employee_zhicheng =", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengNotEqualTo(String value) {
            addCriterion("employee_zhicheng <>", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengGreaterThan(String value) {
            addCriterion("employee_zhicheng >", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zhicheng >=", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLessThan(String value) {
            addCriterion("employee_zhicheng <", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLessThanOrEqualTo(String value) {
            addCriterion("employee_zhicheng <=", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLike(String value) {
            addCriterion("employee_zhicheng like", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengNotLike(String value) {
            addCriterion("employee_zhicheng not like", value, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengIn(List<String> values) {
            addCriterion("employee_zhicheng in", values, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengNotIn(List<String> values) {
            addCriterion("employee_zhicheng not in", values, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengBetween(String value1, String value2) {
            addCriterion("employee_zhicheng between", value1, value2, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengNotBetween(String value1, String value2) {
            addCriterion("employee_zhicheng not between", value1, value2, "employeeZhicheng");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuIsNull() {
            addCriterion("employee_zhiwu is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuIsNotNull() {
            addCriterion("employee_zhiwu is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuEqualTo(String value) {
            addCriterion("employee_zhiwu =", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuNotEqualTo(String value) {
            addCriterion("employee_zhiwu <>", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuGreaterThan(String value) {
            addCriterion("employee_zhiwu >", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zhiwu >=", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLessThan(String value) {
            addCriterion("employee_zhiwu <", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLessThanOrEqualTo(String value) {
            addCriterion("employee_zhiwu <=", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLike(String value) {
            addCriterion("employee_zhiwu like", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuNotLike(String value) {
            addCriterion("employee_zhiwu not like", value, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuIn(List<String> values) {
            addCriterion("employee_zhiwu in", values, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuNotIn(List<String> values) {
            addCriterion("employee_zhiwu not in", values, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuBetween(String value1, String value2) {
            addCriterion("employee_zhiwu between", value1, value2, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuNotBetween(String value1, String value2) {
            addCriterion("employee_zhiwu not between", value1, value2, "employeeZhiwu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuIsNull() {
            addCriterion("employee_tuixiu is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuIsNotNull() {
            addCriterion("employee_tuixiu is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuEqualTo(Date value) {
            addCriterion("employee_tuixiu =", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuNotEqualTo(Date value) {
            addCriterion("employee_tuixiu <>", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuGreaterThan(Date value) {
            addCriterion("employee_tuixiu >", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_tuixiu >=", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuLessThan(Date value) {
            addCriterion("employee_tuixiu <", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuLessThanOrEqualTo(Date value) {
            addCriterion("employee_tuixiu <=", value, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuIn(List<Date> values) {
            addCriterion("employee_tuixiu in", values, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuNotIn(List<Date> values) {
            addCriterion("employee_tuixiu not in", values, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuBetween(Date value1, Date value2) {
            addCriterion("employee_tuixiu between", value1, value2, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeTuixiuNotBetween(Date value1, Date value2) {
            addCriterion("employee_tuixiu not between", value1, value2, "employeeTuixiu");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIsNull() {
            addCriterion("employee_age is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIsNotNull() {
            addCriterion("employee_age is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeEqualTo(Integer value) {
            addCriterion("employee_age =", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotEqualTo(Integer value) {
            addCriterion("employee_age <>", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeGreaterThan(Integer value) {
            addCriterion("employee_age >", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_age >=", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeLessThan(Integer value) {
            addCriterion("employee_age <", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeLessThanOrEqualTo(Integer value) {
            addCriterion("employee_age <=", value, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeIn(List<Integer> values) {
            addCriterion("employee_age in", values, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotIn(List<Integer> values) {
            addCriterion("employee_age not in", values, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeBetween(Integer value1, Integer value2) {
            addCriterion("employee_age between", value1, value2, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeeAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_age not between", value1, value2, "employeeAge");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("employee_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("employee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("employee_phone =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("employee_phone <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("employee_phone >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employee_phone >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("employee_phone <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("employee_phone <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("employee_phone like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("employee_phone not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("employee_phone in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("employee_phone not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("employee_phone between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("employee_phone not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelIsNull() {
            addCriterion("employee_mobiletel is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelIsNotNull() {
            addCriterion("employee_mobiletel is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelEqualTo(String value) {
            addCriterion("employee_mobiletel =", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelNotEqualTo(String value) {
            addCriterion("employee_mobiletel <>", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelGreaterThan(String value) {
            addCriterion("employee_mobiletel >", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelGreaterThanOrEqualTo(String value) {
            addCriterion("employee_mobiletel >=", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelLessThan(String value) {
            addCriterion("employee_mobiletel <", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelLessThanOrEqualTo(String value) {
            addCriterion("employee_mobiletel <=", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelLike(String value) {
            addCriterion("employee_mobiletel like", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelNotLike(String value) {
            addCriterion("employee_mobiletel not like", value, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelIn(List<String> values) {
            addCriterion("employee_mobiletel in", values, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelNotIn(List<String> values) {
            addCriterion("employee_mobiletel not in", values, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelBetween(String value1, String value2) {
            addCriterion("employee_mobiletel between", value1, value2, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeMobiletelNotBetween(String value1, String value2) {
            addCriterion("employee_mobiletel not between", value1, value2, "employeeMobiletel");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoIsNull() {
            addCriterion("employee_caiwuhao is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoIsNotNull() {
            addCriterion("employee_caiwuhao is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoEqualTo(String value) {
            addCriterion("employee_caiwuhao =", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoNotEqualTo(String value) {
            addCriterion("employee_caiwuhao <>", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoGreaterThan(String value) {
            addCriterion("employee_caiwuhao >", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_caiwuhao >=", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoLessThan(String value) {
            addCriterion("employee_caiwuhao <", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoLessThanOrEqualTo(String value) {
            addCriterion("employee_caiwuhao <=", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoLike(String value) {
            addCriterion("employee_caiwuhao like", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoNotLike(String value) {
            addCriterion("employee_caiwuhao not like", value, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoIn(List<String> values) {
            addCriterion("employee_caiwuhao in", values, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoNotIn(List<String> values) {
            addCriterion("employee_caiwuhao not in", values, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoBetween(String value1, String value2) {
            addCriterion("employee_caiwuhao between", value1, value2, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeCaiwuhaoNotBetween(String value1, String value2) {
            addCriterion("employee_caiwuhao not between", value1, value2, "employeeCaiwuhao");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleIsNull() {
            addCriterion("employee_double is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleIsNotNull() {
            addCriterion("employee_double is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleEqualTo(String value) {
            addCriterion("employee_double =", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleNotEqualTo(String value) {
            addCriterion("employee_double <>", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleGreaterThan(String value) {
            addCriterion("employee_double >", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleGreaterThanOrEqualTo(String value) {
            addCriterion("employee_double >=", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleLessThan(String value) {
            addCriterion("employee_double <", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleLessThanOrEqualTo(String value) {
            addCriterion("employee_double <=", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleLike(String value) {
            addCriterion("employee_double like", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleNotLike(String value) {
            addCriterion("employee_double not like", value, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleIn(List<String> values) {
            addCriterion("employee_double in", values, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleNotIn(List<String> values) {
            addCriterion("employee_double not in", values, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleBetween(String value1, String value2) {
            addCriterion("employee_double between", value1, value2, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeDoubleNotBetween(String value1, String value2) {
            addCriterion("employee_double not between", value1, value2, "employeeDouble");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsIsNull() {
            addCriterion("employee_zfzgxs is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsIsNotNull() {
            addCriterion("employee_zfzgxs is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsEqualTo(BigDecimal value) {
            addCriterion("employee_zfzgxs =", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsNotEqualTo(BigDecimal value) {
            addCriterion("employee_zfzgxs <>", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsGreaterThan(BigDecimal value) {
            addCriterion("employee_zfzgxs >", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zfzgxs >=", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsLessThan(BigDecimal value) {
            addCriterion("employee_zfzgxs <", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zfzgxs <=", value, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsIn(List<BigDecimal> values) {
            addCriterion("employee_zfzgxs in", values, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsNotIn(List<BigDecimal> values) {
            addCriterion("employee_zfzgxs not in", values, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zfzgxs between", value1, value2, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfzgxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zfzgxs not between", value1, value2, "employeeZfzgxs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzIsNull() {
            addCriterion("emp_fb_gzbz is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzIsNotNull() {
            addCriterion("emp_fb_gzbz is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gzbz =", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gzbz <>", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_gzbz >", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gzbz >=", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzLessThan(BigDecimal value) {
            addCriterion("emp_fb_gzbz <", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gzbz <=", value, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gzbz in", values, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gzbz not in", values, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gzbz between", value1, value2, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbGzbzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gzbz not between", value1, value2, "empFbGzbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzIsNull() {
            addCriterion("emp_fb_zfbtmjbz is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzIsNotNull() {
            addCriterion("emp_fb_zfbtmjbz is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzEqualTo(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz =", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz <>", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz >", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz >=", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzLessThan(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz <", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_zfbtmjbz <=", value, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzIn(List<BigDecimal> values) {
            addCriterion("emp_fb_zfbtmjbz in", values, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_zfbtmjbz not in", values, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_zfbtmjbz between", value1, value2, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbZfbtmjbzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_zfbtmjbz not between", value1, value2, "empFbZfbtmjbz");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjIsNull() {
            addCriterion("emp_fb_symj is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjIsNotNull() {
            addCriterion("emp_fb_symj is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjEqualTo(BigDecimal value) {
            addCriterion("emp_fb_symj =", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_symj <>", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_symj >", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_symj >=", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjLessThan(BigDecimal value) {
            addCriterion("emp_fb_symj <", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_symj <=", value, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjIn(List<BigDecimal> values) {
            addCriterion("emp_fb_symj in", values, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_symj not in", values, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_symj between", value1, value2, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSymjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_symj not between", value1, value2, "empFbSymj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjIsNull() {
            addCriterion("emp_fb_qcmj is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjIsNotNull() {
            addCriterion("emp_fb_qcmj is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjEqualTo(BigDecimal value) {
            addCriterion("emp_fb_qcmj =", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_qcmj <>", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_qcmj >", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_qcmj >=", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjLessThan(BigDecimal value) {
            addCriterion("emp_fb_qcmj <", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_qcmj <=", value, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjIn(List<BigDecimal> values) {
            addCriterion("emp_fb_qcmj in", values, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_qcmj not in", values, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_qcmj between", value1, value2, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbQcmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_qcmj not between", value1, value2, "empFbQcmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkIsNull() {
            addCriterion("emp_fb_sfqk is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkIsNotNull() {
            addCriterion("emp_fb_sfqk is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkEqualTo(BigDecimal value) {
            addCriterion("emp_fb_sfqk =", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_sfqk <>", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_sfqk >", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_sfqk >=", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkLessThan(BigDecimal value) {
            addCriterion("emp_fb_sfqk <", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_sfqk <=", value, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkIn(List<BigDecimal> values) {
            addCriterion("emp_fb_sfqk in", values, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_sfqk not in", values, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_sfqk between", value1, value2, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbSfqkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_sfqk not between", value1, value2, "empFbSfqk");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglIsNull() {
            addCriterion("emp_fb_gjjqgl is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglIsNotNull() {
            addCriterion("emp_fb_gjjqgl is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl =", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl <>", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl >", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl >=", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglLessThan(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl <", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgl <=", value, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gjjqgl in", values, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gjjqgl not in", values, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gjjqgl between", value1, value2, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqglNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gjjqgl not between", value1, value2, "empFbGjjqgl");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsIsNull() {
            addCriterion("emp_fb_gjjqgljs is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsIsNotNull() {
            addCriterion("emp_fb_gjjqgljs is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs =", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs <>", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs >", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs >=", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsLessThan(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs <", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_gjjqgljs <=", value, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gjjqgljs in", values, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_gjjqgljs not in", values, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gjjqgljs between", value1, value2, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbGjjqgljsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_gjjqgljs not between", value1, value2, "empFbGjjqgljs");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtIsNull() {
            addCriterion("emp_fb_aybt is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtIsNotNull() {
            addCriterion("emp_fb_aybt is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtEqualTo(BigDecimal value) {
            addCriterion("emp_fb_aybt =", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_aybt <>", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_aybt >", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_aybt >=", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtLessThan(BigDecimal value) {
            addCriterion("emp_fb_aybt <", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_aybt <=", value, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtIn(List<BigDecimal> values) {
            addCriterion("emp_fb_aybt in", values, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_aybt not in", values, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_aybt between", value1, value2, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbAybtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_aybt not between", value1, value2, "empFbAybt");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjIsNull() {
            addCriterion("emp_fb_ybhj is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjIsNotNull() {
            addCriterion("emp_fb_ybhj is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjEqualTo(BigDecimal value) {
            addCriterion("emp_fb_ybhj =", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_ybhj <>", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_ybhj >", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_ybhj >=", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjLessThan(BigDecimal value) {
            addCriterion("emp_fb_ybhj <", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_ybhj <=", value, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjIn(List<BigDecimal> values) {
            addCriterion("emp_fb_ybhj in", values, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_ybhj not in", values, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_ybhj between", value1, value2, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbYbhjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_ybhj not between", value1, value2, "empFbYbhj");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtIsNull() {
            addCriterion("emp_fb_wfycxbt is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtIsNotNull() {
            addCriterion("emp_fb_wfycxbt is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt =", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt <>", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt >", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt >=", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtLessThan(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt <", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wfycxbt <=", value, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtIn(List<BigDecimal> values) {
            addCriterion("emp_fb_wfycxbt in", values, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_wfycxbt not in", values, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_wfycxbt between", value1, value2, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWfycxbtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_wfycxbt not between", value1, value2, "empFbWfycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtIsNull() {
            addCriterion("emp_fb_wdbycxbt is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtIsNotNull() {
            addCriterion("emp_fb_wdbycxbt is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt =", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt <>", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt >", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt >=", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtLessThan(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt <", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_wdbycxbt <=", value, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtIn(List<BigDecimal> values) {
            addCriterion("emp_fb_wdbycxbt in", values, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_wdbycxbt not in", values, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_wdbycxbt between", value1, value2, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbWdbycxbtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_wdbycxbt not between", value1, value2, "empFbWdbycxbt");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjIsNull() {
            addCriterion("emp_fb_hj is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjIsNotNull() {
            addCriterion("emp_fb_hj is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjEqualTo(BigDecimal value) {
            addCriterion("emp_fb_hj =", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_hj <>", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_hj >", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_hj >=", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjLessThan(BigDecimal value) {
            addCriterion("emp_fb_hj <", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_hj <=", value, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjIn(List<BigDecimal> values) {
            addCriterion("emp_fb_hj in", values, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_hj not in", values, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_hj between", value1, value2, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbHjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_hj not between", value1, value2, "empFbHj");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhIsNull() {
            addCriterion("emp_fb_fh is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhIsNotNull() {
            addCriterion("emp_fb_fh is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhEqualTo(String value) {
            addCriterion("emp_fb_fh =", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhNotEqualTo(String value) {
            addCriterion("emp_fb_fh <>", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhGreaterThan(String value) {
            addCriterion("emp_fb_fh >", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhGreaterThanOrEqualTo(String value) {
            addCriterion("emp_fb_fh >=", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhLessThan(String value) {
            addCriterion("emp_fb_fh <", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhLessThanOrEqualTo(String value) {
            addCriterion("emp_fb_fh <=", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhLike(String value) {
            addCriterion("emp_fb_fh like", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhNotLike(String value) {
            addCriterion("emp_fb_fh not like", value, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhIn(List<String> values) {
            addCriterion("emp_fb_fh in", values, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhNotIn(List<String> values) {
            addCriterion("emp_fb_fh not in", values, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhBetween(String value1, String value2) {
            addCriterion("emp_fb_fh between", value1, value2, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbFhNotBetween(String value1, String value2) {
            addCriterion("emp_fb_fh not between", value1, value2, "empFbFh");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjIsNull() {
            addCriterion("emp_fb_jzmj is null");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjIsNotNull() {
            addCriterion("emp_fb_jzmj is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjEqualTo(BigDecimal value) {
            addCriterion("emp_fb_jzmj =", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjNotEqualTo(BigDecimal value) {
            addCriterion("emp_fb_jzmj <>", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjGreaterThan(BigDecimal value) {
            addCriterion("emp_fb_jzmj >", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_jzmj >=", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjLessThan(BigDecimal value) {
            addCriterion("emp_fb_jzmj <", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_fb_jzmj <=", value, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjIn(List<BigDecimal> values) {
            addCriterion("emp_fb_jzmj in", values, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjNotIn(List<BigDecimal> values) {
            addCriterion("emp_fb_jzmj not in", values, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_jzmj between", value1, value2, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpFbJzmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_fb_jzmj not between", value1, value2, "empFbJzmj");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIsNull() {
            addCriterion("emp_pwd is null");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIsNotNull() {
            addCriterion("emp_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPwdEqualTo(String value) {
            addCriterion("emp_pwd =", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotEqualTo(String value) {
            addCriterion("emp_pwd <>", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdGreaterThan(String value) {
            addCriterion("emp_pwd >", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_pwd >=", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLessThan(String value) {
            addCriterion("emp_pwd <", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLessThanOrEqualTo(String value) {
            addCriterion("emp_pwd <=", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdLike(String value) {
            addCriterion("emp_pwd like", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotLike(String value) {
            addCriterion("emp_pwd not like", value, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdIn(List<String> values) {
            addCriterion("emp_pwd in", values, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotIn(List<String> values) {
            addCriterion("emp_pwd not in", values, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdBetween(String value1, String value2) {
            addCriterion("emp_pwd between", value1, value2, "empPwd");
            return (Criteria) this;
        }

        public Criteria andEmpPwdNotBetween(String value1, String value2) {
            addCriterion("emp_pwd not between", value1, value2, "empPwd");
            return (Criteria) this;
        }

        public Criteria andPwdFlagIsNull() {
            addCriterion("pwd_flag is null");
            return (Criteria) this;
        }

        public Criteria andPwdFlagIsNotNull() {
            addCriterion("pwd_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPwdFlagEqualTo(String value) {
            addCriterion("pwd_flag =", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagNotEqualTo(String value) {
            addCriterion("pwd_flag <>", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagGreaterThan(String value) {
            addCriterion("pwd_flag >", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagGreaterThanOrEqualTo(String value) {
            addCriterion("pwd_flag >=", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagLessThan(String value) {
            addCriterion("pwd_flag <", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagLessThanOrEqualTo(String value) {
            addCriterion("pwd_flag <=", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagLike(String value) {
            addCriterion("pwd_flag like", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagNotLike(String value) {
            addCriterion("pwd_flag not like", value, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagIn(List<String> values) {
            addCriterion("pwd_flag in", values, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagNotIn(List<String> values) {
            addCriterion("pwd_flag not in", values, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagBetween(String value1, String value2) {
            addCriterion("pwd_flag between", value1, value2, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andPwdFlagNotBetween(String value1, String value2) {
            addCriterion("pwd_flag not between", value1, value2, "pwdFlag");
            return (Criteria) this;
        }

        public Criteria andZjbtIsNull() {
            addCriterion("zjbt is null");
            return (Criteria) this;
        }

        public Criteria andZjbtIsNotNull() {
            addCriterion("zjbt is not null");
            return (Criteria) this;
        }

        public Criteria andZjbtEqualTo(BigDecimal value) {
            addCriterion("zjbt =", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtNotEqualTo(BigDecimal value) {
            addCriterion("zjbt <>", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtGreaterThan(BigDecimal value) {
            addCriterion("zjbt >", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zjbt >=", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtLessThan(BigDecimal value) {
            addCriterion("zjbt <", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zjbt <=", value, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtIn(List<BigDecimal> values) {
            addCriterion("zjbt in", values, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtNotIn(List<BigDecimal> values) {
            addCriterion("zjbt not in", values, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zjbt between", value1, value2, "zjbt");
            return (Criteria) this;
        }

        public Criteria andZjbtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zjbt not between", value1, value2, "zjbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyIsNull() {
            addCriterion("employee_wfyy is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyIsNotNull() {
            addCriterion("employee_wfyy is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyEqualTo(String value) {
            addCriterion("employee_wfyy =", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyNotEqualTo(String value) {
            addCriterion("employee_wfyy <>", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyGreaterThan(String value) {
            addCriterion("employee_wfyy >", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wfyy >=", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyLessThan(String value) {
            addCriterion("employee_wfyy <", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyLessThanOrEqualTo(String value) {
            addCriterion("employee_wfyy <=", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyLike(String value) {
            addCriterion("employee_wfyy like", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyNotLike(String value) {
            addCriterion("employee_wfyy not like", value, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyIn(List<String> values) {
            addCriterion("employee_wfyy in", values, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyNotIn(List<String> values) {
            addCriterion("employee_wfyy not in", values, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyBetween(String value1, String value2) {
            addCriterion("employee_wfyy between", value1, value2, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeWfyyNotBetween(String value1, String value2) {
            addCriterion("employee_wfyy not between", value1, value2, "employeeWfyy");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfIsNull() {
            addCriterion("employee_ffjf is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfIsNotNull() {
            addCriterion("employee_ffjf is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfEqualTo(BigDecimal value) {
            addCriterion("employee_ffjf =", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfNotEqualTo(BigDecimal value) {
            addCriterion("employee_ffjf <>", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfGreaterThan(BigDecimal value) {
            addCriterion("employee_ffjf >", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_ffjf >=", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfLessThan(BigDecimal value) {
            addCriterion("employee_ffjf <", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_ffjf <=", value, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfIn(List<BigDecimal> values) {
            addCriterion("employee_ffjf in", values, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfNotIn(List<BigDecimal> values) {
            addCriterion("employee_ffjf not in", values, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_ffjf between", value1, value2, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFfjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_ffjf not between", value1, value2, "employeeFfjf");
            return (Criteria) this;
        }

        public Criteria andPmcIsNull() {
            addCriterion("pmc is null");
            return (Criteria) this;
        }

        public Criteria andPmcIsNotNull() {
            addCriterion("pmc is not null");
            return (Criteria) this;
        }

        public Criteria andPmcEqualTo(Integer value) {
            addCriterion("pmc =", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcNotEqualTo(Integer value) {
            addCriterion("pmc <>", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcGreaterThan(Integer value) {
            addCriterion("pmc >", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pmc >=", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcLessThan(Integer value) {
            addCriterion("pmc <", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcLessThanOrEqualTo(Integer value) {
            addCriterion("pmc <=", value, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcIn(List<Integer> values) {
            addCriterion("pmc in", values, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcNotIn(List<Integer> values) {
            addCriterion("pmc not in", values, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcBetween(Integer value1, Integer value2) {
            addCriterion("pmc between", value1, value2, "pmc");
            return (Criteria) this;
        }

        public Criteria andPmcNotBetween(Integer value1, Integer value2) {
            addCriterion("pmc not between", value1, value2, "pmc");
            return (Criteria) this;
        }

        public Criteria andHmcIsNull() {
            addCriterion("hmc is null");
            return (Criteria) this;
        }

        public Criteria andHmcIsNotNull() {
            addCriterion("hmc is not null");
            return (Criteria) this;
        }

        public Criteria andHmcEqualTo(Integer value) {
            addCriterion("hmc =", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcNotEqualTo(Integer value) {
            addCriterion("hmc <>", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcGreaterThan(Integer value) {
            addCriterion("hmc >", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcGreaterThanOrEqualTo(Integer value) {
            addCriterion("hmc >=", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcLessThan(Integer value) {
            addCriterion("hmc <", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcLessThanOrEqualTo(Integer value) {
            addCriterion("hmc <=", value, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcIn(List<Integer> values) {
            addCriterion("hmc in", values, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcNotIn(List<Integer> values) {
            addCriterion("hmc not in", values, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcBetween(Integer value1, Integer value2) {
            addCriterion("hmc between", value1, value2, "hmc");
            return (Criteria) this;
        }

        public Criteria andHmcNotBetween(Integer value1, Integer value2) {
            addCriterion("hmc not between", value1, value2, "hmc");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjIsNull() {
            addCriterion("employee_sssj is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjIsNotNull() {
            addCriterion("employee_sssj is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjEqualTo(Date value) {
            addCriterion("employee_sssj =", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjNotEqualTo(Date value) {
            addCriterion("employee_sssj <>", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjGreaterThan(Date value) {
            addCriterion("employee_sssj >", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_sssj >=", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjLessThan(Date value) {
            addCriterion("employee_sssj <", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjLessThanOrEqualTo(Date value) {
            addCriterion("employee_sssj <=", value, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjIn(List<Date> values) {
            addCriterion("employee_sssj in", values, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjNotIn(List<Date> values) {
            addCriterion("employee_sssj not in", values, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjBetween(Date value1, Date value2) {
            addCriterion("employee_sssj between", value1, value2, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andEmployeeSssjNotBetween(Date value1, Date value2) {
            addCriterion("employee_sssj not between", value1, value2, "employeeSssj");
            return (Criteria) this;
        }

        public Criteria andLysjIsNull() {
            addCriterion("lysj is null");
            return (Criteria) this;
        }

        public Criteria andLysjIsNotNull() {
            addCriterion("lysj is not null");
            return (Criteria) this;
        }

        public Criteria andLysjEqualTo(Date value) {
            addCriterion("lysj =", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjNotEqualTo(Date value) {
            addCriterion("lysj <>", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjGreaterThan(Date value) {
            addCriterion("lysj >", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjGreaterThanOrEqualTo(Date value) {
            addCriterion("lysj >=", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjLessThan(Date value) {
            addCriterion("lysj <", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjLessThanOrEqualTo(Date value) {
            addCriterion("lysj <=", value, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjIn(List<Date> values) {
            addCriterion("lysj in", values, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjNotIn(List<Date> values) {
            addCriterion("lysj not in", values, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjBetween(Date value1, Date value2) {
            addCriterion("lysj between", value1, value2, "lysj");
            return (Criteria) this;
        }

        public Criteria andLysjNotBetween(Date value1, Date value2) {
            addCriterion("lysj not between", value1, value2, "lysj");
            return (Criteria) this;
        }

        public Criteria andZhsjIsNull() {
            addCriterion("zhsj is null");
            return (Criteria) this;
        }

        public Criteria andZhsjIsNotNull() {
            addCriterion("zhsj is not null");
            return (Criteria) this;
        }

        public Criteria andZhsjEqualTo(Date value) {
            addCriterion("zhsj =", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjNotEqualTo(Date value) {
            addCriterion("zhsj <>", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjGreaterThan(Date value) {
            addCriterion("zhsj >", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjGreaterThanOrEqualTo(Date value) {
            addCriterion("zhsj >=", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjLessThan(Date value) {
            addCriterion("zhsj <", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjLessThanOrEqualTo(Date value) {
            addCriterion("zhsj <=", value, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjIn(List<Date> values) {
            addCriterion("zhsj in", values, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjNotIn(List<Date> values) {
            addCriterion("zhsj not in", values, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjBetween(Date value1, Date value2) {
            addCriterion("zhsj between", value1, value2, "zhsj");
            return (Criteria) this;
        }

        public Criteria andZhsjNotBetween(Date value1, Date value2) {
            addCriterion("zhsj not between", value1, value2, "zhsj");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialIsNull() {
            addCriterion("rsbz_serial is null");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialIsNotNull() {
            addCriterion("rsbz_serial is not null");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialEqualTo(String value) {
            addCriterion("rsbz_serial =", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialNotEqualTo(String value) {
            addCriterion("rsbz_serial <>", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialGreaterThan(String value) {
            addCriterion("rsbz_serial >", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialGreaterThanOrEqualTo(String value) {
            addCriterion("rsbz_serial >=", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialLessThan(String value) {
            addCriterion("rsbz_serial <", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialLessThanOrEqualTo(String value) {
            addCriterion("rsbz_serial <=", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialLike(String value) {
            addCriterion("rsbz_serial like", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialNotLike(String value) {
            addCriterion("rsbz_serial not like", value, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialIn(List<String> values) {
            addCriterion("rsbz_serial in", values, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialNotIn(List<String> values) {
            addCriterion("rsbz_serial not in", values, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialBetween(String value1, String value2) {
            addCriterion("rsbz_serial between", value1, value2, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andRsbzSerialNotBetween(String value1, String value2) {
            addCriterion("rsbz_serial not between", value1, value2, "rsbzSerial");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevIsNull() {
            addCriterion("employee_zhicheng_lev is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevIsNotNull() {
            addCriterion("employee_zhicheng_lev is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevEqualTo(String value) {
            addCriterion("employee_zhicheng_lev =", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevNotEqualTo(String value) {
            addCriterion("employee_zhicheng_lev <>", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevGreaterThan(String value) {
            addCriterion("employee_zhicheng_lev >", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zhicheng_lev >=", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevLessThan(String value) {
            addCriterion("employee_zhicheng_lev <", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevLessThanOrEqualTo(String value) {
            addCriterion("employee_zhicheng_lev <=", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevLike(String value) {
            addCriterion("employee_zhicheng_lev like", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevNotLike(String value) {
            addCriterion("employee_zhicheng_lev not like", value, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevIn(List<String> values) {
            addCriterion("employee_zhicheng_lev in", values, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevNotIn(List<String> values) {
            addCriterion("employee_zhicheng_lev not in", values, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevBetween(String value1, String value2) {
            addCriterion("employee_zhicheng_lev between", value1, value2, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhichengLevNotBetween(String value1, String value2) {
            addCriterion("employee_zhicheng_lev not between", value1, value2, "employeeZhichengLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevIsNull() {
            addCriterion("employee_zhiwu_lev is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevIsNotNull() {
            addCriterion("employee_zhiwu_lev is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevEqualTo(String value) {
            addCriterion("employee_zhiwu_lev =", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevNotEqualTo(String value) {
            addCriterion("employee_zhiwu_lev <>", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevGreaterThan(String value) {
            addCriterion("employee_zhiwu_lev >", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zhiwu_lev >=", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevLessThan(String value) {
            addCriterion("employee_zhiwu_lev <", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevLessThanOrEqualTo(String value) {
            addCriterion("employee_zhiwu_lev <=", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevLike(String value) {
            addCriterion("employee_zhiwu_lev like", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevNotLike(String value) {
            addCriterion("employee_zhiwu_lev not like", value, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevIn(List<String> values) {
            addCriterion("employee_zhiwu_lev in", values, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevNotIn(List<String> values) {
            addCriterion("employee_zhiwu_lev not in", values, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevBetween(String value1, String value2) {
            addCriterion("employee_zhiwu_lev between", value1, value2, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andEmployeeZhiwuLevNotBetween(String value1, String value2) {
            addCriterion("employee_zhiwu_lev not between", value1, value2, "employeeZhiwuLev");
            return (Criteria) this;
        }

        public Criteria andIsselectIsNull() {
            addCriterion("isselect is null");
            return (Criteria) this;
        }

        public Criteria andIsselectIsNotNull() {
            addCriterion("isselect is not null");
            return (Criteria) this;
        }

        public Criteria andIsselectEqualTo(String value) {
            addCriterion("isselect =", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectNotEqualTo(String value) {
            addCriterion("isselect <>", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectGreaterThan(String value) {
            addCriterion("isselect >", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectGreaterThanOrEqualTo(String value) {
            addCriterion("isselect >=", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectLessThan(String value) {
            addCriterion("isselect <", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectLessThanOrEqualTo(String value) {
            addCriterion("isselect <=", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectLike(String value) {
            addCriterion("isselect like", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectNotLike(String value) {
            addCriterion("isselect not like", value, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectIn(List<String> values) {
            addCriterion("isselect in", values, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectNotIn(List<String> values) {
            addCriterion("isselect not in", values, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectBetween(String value1, String value2) {
            addCriterion("isselect between", value1, value2, "isselect");
            return (Criteria) this;
        }

        public Criteria andIsselectNotBetween(String value1, String value2) {
            addCriterion("isselect not between", value1, value2, "isselect");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNull() {
            addCriterion("olddept is null");
            return (Criteria) this;
        }

        public Criteria andOlddeptIsNotNull() {
            addCriterion("olddept is not null");
            return (Criteria) this;
        }

        public Criteria andOlddeptEqualTo(String value) {
            addCriterion("olddept =", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotEqualTo(String value) {
            addCriterion("olddept <>", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThan(String value) {
            addCriterion("olddept >", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptGreaterThanOrEqualTo(String value) {
            addCriterion("olddept >=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThan(String value) {
            addCriterion("olddept <", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLessThanOrEqualTo(String value) {
            addCriterion("olddept <=", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptLike(String value) {
            addCriterion("olddept like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotLike(String value) {
            addCriterion("olddept not like", value, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptIn(List<String> values) {
            addCriterion("olddept in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotIn(List<String> values) {
            addCriterion("olddept not in", values, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptBetween(String value1, String value2) {
            addCriterion("olddept between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andOlddeptNotBetween(String value1, String value2) {
            addCriterion("olddept not between", value1, value2, "olddept");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjIsNull() {
            addCriterion("employee_gjj is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjIsNotNull() {
            addCriterion("employee_gjj is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjEqualTo(BigDecimal value) {
            addCriterion("employee_gjj =", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjNotEqualTo(BigDecimal value) {
            addCriterion("employee_gjj <>", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjGreaterThan(BigDecimal value) {
            addCriterion("employee_gjj >", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_gjj >=", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjLessThan(BigDecimal value) {
            addCriterion("employee_gjj <", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_gjj <=", value, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjIn(List<BigDecimal> values) {
            addCriterion("employee_gjj in", values, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjNotIn(List<BigDecimal> values) {
            addCriterion("employee_gjj not in", values, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_gjj between", value1, value2, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_gjj not between", value1, value2, "employeeGjj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjIsNull() {
            addCriterion("employee_gjjsj is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjIsNotNull() {
            addCriterion("employee_gjjsj is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjEqualTo(Date value) {
            addCriterion("employee_gjjsj =", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjNotEqualTo(Date value) {
            addCriterion("employee_gjjsj <>", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjGreaterThan(Date value) {
            addCriterion("employee_gjjsj >", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_gjjsj >=", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjLessThan(Date value) {
            addCriterion("employee_gjjsj <", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjLessThanOrEqualTo(Date value) {
            addCriterion("employee_gjjsj <=", value, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjIn(List<Date> values) {
            addCriterion("employee_gjjsj in", values, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjNotIn(List<Date> values) {
            addCriterion("employee_gjjsj not in", values, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjBetween(Date value1, Date value2) {
            addCriterion("employee_gjjsj between", value1, value2, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeGjjsjNotBetween(Date value1, Date value2) {
            addCriterion("employee_gjjsj not between", value1, value2, "employeeGjjsj");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszIsNull() {
            addCriterion("employee_hksz is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszIsNotNull() {
            addCriterion("employee_hksz is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszEqualTo(String value) {
            addCriterion("employee_hksz =", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszNotEqualTo(String value) {
            addCriterion("employee_hksz <>", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszGreaterThan(String value) {
            addCriterion("employee_hksz >", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszGreaterThanOrEqualTo(String value) {
            addCriterion("employee_hksz >=", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszLessThan(String value) {
            addCriterion("employee_hksz <", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszLessThanOrEqualTo(String value) {
            addCriterion("employee_hksz <=", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszLike(String value) {
            addCriterion("employee_hksz like", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszNotLike(String value) {
            addCriterion("employee_hksz not like", value, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszIn(List<String> values) {
            addCriterion("employee_hksz in", values, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszNotIn(List<String> values) {
            addCriterion("employee_hksz not in", values, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszBetween(String value1, String value2) {
            addCriterion("employee_hksz between", value1, value2, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeHkszNotBetween(String value1, String value2) {
            addCriterion("employee_hksz not between", value1, value2, "employeeHksz");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("employee_email is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("employee_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("employee_email =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("employee_email <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("employee_email >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("employee_email >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("employee_email <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("employee_email <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("employee_email like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("employee_email not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("employee_email in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("employee_email not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("employee_email between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("employee_email not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeIsNull() {
            addCriterion("employee_dwcode is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeIsNotNull() {
            addCriterion("employee_dwcode is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeEqualTo(String value) {
            addCriterion("employee_dwcode =", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeNotEqualTo(String value) {
            addCriterion("employee_dwcode <>", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeGreaterThan(String value) {
            addCriterion("employee_dwcode >", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_dwcode >=", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeLessThan(String value) {
            addCriterion("employee_dwcode <", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeLessThanOrEqualTo(String value) {
            addCriterion("employee_dwcode <=", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeLike(String value) {
            addCriterion("employee_dwcode like", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeNotLike(String value) {
            addCriterion("employee_dwcode not like", value, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeIn(List<String> values) {
            addCriterion("employee_dwcode in", values, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeNotIn(List<String> values) {
            addCriterion("employee_dwcode not in", values, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeBetween(String value1, String value2) {
            addCriterion("employee_dwcode between", value1, value2, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeDwcodeNotBetween(String value1, String value2) {
            addCriterion("employee_dwcode not between", value1, value2, "employeeDwcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeIsNull() {
            addCriterion("employee_wife is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeIsNotNull() {
            addCriterion("employee_wife is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeEqualTo(String value) {
            addCriterion("employee_wife =", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeNotEqualTo(String value) {
            addCriterion("employee_wife <>", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeGreaterThan(String value) {
            addCriterion("employee_wife >", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wife >=", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeLessThan(String value) {
            addCriterion("employee_wife <", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeLessThanOrEqualTo(String value) {
            addCriterion("employee_wife <=", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeLike(String value) {
            addCriterion("employee_wife like", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeNotLike(String value) {
            addCriterion("employee_wife not like", value, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeIn(List<String> values) {
            addCriterion("employee_wife in", values, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeNotIn(List<String> values) {
            addCriterion("employee_wife not in", values, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeBetween(String value1, String value2) {
            addCriterion("employee_wife between", value1, value2, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeNotBetween(String value1, String value2) {
            addCriterion("employee_wife not between", value1, value2, "employeeWife");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhIsNull() {
            addCriterion("employee_wifegzh is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhIsNotNull() {
            addCriterion("employee_wifegzh is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhEqualTo(String value) {
            addCriterion("employee_wifegzh =", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhNotEqualTo(String value) {
            addCriterion("employee_wifegzh <>", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhGreaterThan(String value) {
            addCriterion("employee_wifegzh >", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wifegzh >=", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhLessThan(String value) {
            addCriterion("employee_wifegzh <", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhLessThanOrEqualTo(String value) {
            addCriterion("employee_wifegzh <=", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhLike(String value) {
            addCriterion("employee_wifegzh like", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhNotLike(String value) {
            addCriterion("employee_wifegzh not like", value, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhIn(List<String> values) {
            addCriterion("employee_wifegzh in", values, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhNotIn(List<String> values) {
            addCriterion("employee_wifegzh not in", values, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhBetween(String value1, String value2) {
            addCriterion("employee_wifegzh between", value1, value2, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifegzhNotBetween(String value1, String value2) {
            addCriterion("employee_wifegzh not between", value1, value2, "employeeWifegzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameIsNull() {
            addCriterion("employee_wifename is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameIsNotNull() {
            addCriterion("employee_wifename is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameEqualTo(String value) {
            addCriterion("employee_wifename =", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameNotEqualTo(String value) {
            addCriterion("employee_wifename <>", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameGreaterThan(String value) {
            addCriterion("employee_wifename >", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wifename >=", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameLessThan(String value) {
            addCriterion("employee_wifename <", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameLessThanOrEqualTo(String value) {
            addCriterion("employee_wifename <=", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameLike(String value) {
            addCriterion("employee_wifename like", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameNotLike(String value) {
            addCriterion("employee_wifename not like", value, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameIn(List<String> values) {
            addCriterion("employee_wifename in", values, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameNotIn(List<String> values) {
            addCriterion("employee_wifename not in", values, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameBetween(String value1, String value2) {
            addCriterion("employee_wifename between", value1, value2, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifenameNotBetween(String value1, String value2) {
            addCriterion("employee_wifename not between", value1, value2, "employeeWifename");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellIsNull() {
            addCriterion("employee_wifespell is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellIsNotNull() {
            addCriterion("employee_wifespell is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellEqualTo(String value) {
            addCriterion("employee_wifespell =", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellNotEqualTo(String value) {
            addCriterion("employee_wifespell <>", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellGreaterThan(String value) {
            addCriterion("employee_wifespell >", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wifespell >=", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellLessThan(String value) {
            addCriterion("employee_wifespell <", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellLessThanOrEqualTo(String value) {
            addCriterion("employee_wifespell <=", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellLike(String value) {
            addCriterion("employee_wifespell like", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellNotLike(String value) {
            addCriterion("employee_wifespell not like", value, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellIn(List<String> values) {
            addCriterion("employee_wifespell in", values, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellNotIn(List<String> values) {
            addCriterion("employee_wifespell not in", values, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellBetween(String value1, String value2) {
            addCriterion("employee_wifespell between", value1, value2, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifespellNotBetween(String value1, String value2) {
            addCriterion("employee_wifespell not between", value1, value2, "employeeWifespell");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitIsNull() {
            addCriterion("employee_wifeunit is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitIsNotNull() {
            addCriterion("employee_wifeunit is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitEqualTo(String value) {
            addCriterion("employee_wifeunit =", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitNotEqualTo(String value) {
            addCriterion("employee_wifeunit <>", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitGreaterThan(String value) {
            addCriterion("employee_wifeunit >", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitGreaterThanOrEqualTo(String value) {
            addCriterion("employee_wifeunit >=", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitLessThan(String value) {
            addCriterion("employee_wifeunit <", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitLessThanOrEqualTo(String value) {
            addCriterion("employee_wifeunit <=", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitLike(String value) {
            addCriterion("employee_wifeunit like", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitNotLike(String value) {
            addCriterion("employee_wifeunit not like", value, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitIn(List<String> values) {
            addCriterion("employee_wifeunit in", values, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitNotIn(List<String> values) {
            addCriterion("employee_wifeunit not in", values, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitBetween(String value1, String value2) {
            addCriterion("employee_wifeunit between", value1, value2, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeWifeunitNotBetween(String value1, String value2) {
            addCriterion("employee_wifeunit not between", value1, value2, "employeeWifeunit");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffIsNull() {
            addCriterion("employee_houseff is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffIsNotNull() {
            addCriterion("employee_houseff is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffEqualTo(String value) {
            addCriterion("employee_houseff =", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffNotEqualTo(String value) {
            addCriterion("employee_houseff <>", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffGreaterThan(String value) {
            addCriterion("employee_houseff >", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffGreaterThanOrEqualTo(String value) {
            addCriterion("employee_houseff >=", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffLessThan(String value) {
            addCriterion("employee_houseff <", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffLessThanOrEqualTo(String value) {
            addCriterion("employee_houseff <=", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffLike(String value) {
            addCriterion("employee_houseff like", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffNotLike(String value) {
            addCriterion("employee_houseff not like", value, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffIn(List<String> values) {
            addCriterion("employee_houseff in", values, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffNotIn(List<String> values) {
            addCriterion("employee_houseff not in", values, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffBetween(String value1, String value2) {
            addCriterion("employee_houseff between", value1, value2, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeHouseffNotBetween(String value1, String value2) {
            addCriterion("employee_houseff not between", value1, value2, "employeeHouseff");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateIsNull() {
            addCriterion("employee_kinddate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateIsNotNull() {
            addCriterion("employee_kinddate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateEqualTo(Date value) {
            addCriterion("employee_kinddate =", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateNotEqualTo(Date value) {
            addCriterion("employee_kinddate <>", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateGreaterThan(Date value) {
            addCriterion("employee_kinddate >", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_kinddate >=", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateLessThan(Date value) {
            addCriterion("employee_kinddate <", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateLessThanOrEqualTo(Date value) {
            addCriterion("employee_kinddate <=", value, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateIn(List<Date> values) {
            addCriterion("employee_kinddate in", values, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateNotIn(List<Date> values) {
            addCriterion("employee_kinddate not in", values, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateBetween(Date value1, Date value2) {
            addCriterion("employee_kinddate between", value1, value2, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeKinddateNotBetween(Date value1, Date value2) {
            addCriterion("employee_kinddate not between", value1, value2, "employeeKinddate");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfIsNull() {
            addCriterion("employee_fdzf is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfIsNotNull() {
            addCriterion("employee_fdzf is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfEqualTo(String value) {
            addCriterion("employee_fdzf =", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfNotEqualTo(String value) {
            addCriterion("employee_fdzf <>", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfGreaterThan(String value) {
            addCriterion("employee_fdzf >", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfGreaterThanOrEqualTo(String value) {
            addCriterion("employee_fdzf >=", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfLessThan(String value) {
            addCriterion("employee_fdzf <", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfLessThanOrEqualTo(String value) {
            addCriterion("employee_fdzf <=", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfLike(String value) {
            addCriterion("employee_fdzf like", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfNotLike(String value) {
            addCriterion("employee_fdzf not like", value, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfIn(List<String> values) {
            addCriterion("employee_fdzf in", values, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfNotIn(List<String> values) {
            addCriterion("employee_fdzf not in", values, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfBetween(String value1, String value2) {
            addCriterion("employee_fdzf between", value1, value2, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeFdzfNotBetween(String value1, String value2) {
            addCriterion("employee_fdzf not between", value1, value2, "employeeFdzf");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatIsNull() {
            addCriterion("employee_zfbtstat is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatIsNotNull() {
            addCriterion("employee_zfbtstat is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatEqualTo(String value) {
            addCriterion("employee_zfbtstat =", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatNotEqualTo(String value) {
            addCriterion("employee_zfbtstat <>", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatGreaterThan(String value) {
            addCriterion("employee_zfbtstat >", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zfbtstat >=", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatLessThan(String value) {
            addCriterion("employee_zfbtstat <", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatLessThanOrEqualTo(String value) {
            addCriterion("employee_zfbtstat <=", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatLike(String value) {
            addCriterion("employee_zfbtstat like", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatNotLike(String value) {
            addCriterion("employee_zfbtstat not like", value, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatIn(List<String> values) {
            addCriterion("employee_zfbtstat in", values, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatNotIn(List<String> values) {
            addCriterion("employee_zfbtstat not in", values, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatBetween(String value1, String value2) {
            addCriterion("employee_zfbtstat between", value1, value2, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfbtstatNotBetween(String value1, String value2) {
            addCriterion("employee_zfbtstat not between", value1, value2, "employeeZfbtstat");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhIsNull() {
            addCriterion("employee_yhzh is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhIsNotNull() {
            addCriterion("employee_yhzh is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhEqualTo(String value) {
            addCriterion("employee_yhzh =", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhNotEqualTo(String value) {
            addCriterion("employee_yhzh <>", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhGreaterThan(String value) {
            addCriterion("employee_yhzh >", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("employee_yhzh >=", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhLessThan(String value) {
            addCriterion("employee_yhzh <", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhLessThanOrEqualTo(String value) {
            addCriterion("employee_yhzh <=", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhLike(String value) {
            addCriterion("employee_yhzh like", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhNotLike(String value) {
            addCriterion("employee_yhzh not like", value, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhIn(List<String> values) {
            addCriterion("employee_yhzh in", values, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhNotIn(List<String> values) {
            addCriterion("employee_yhzh not in", values, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhBetween(String value1, String value2) {
            addCriterion("employee_yhzh between", value1, value2, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzhNotBetween(String value1, String value2) {
            addCriterion("employee_yhzh not between", value1, value2, "employeeYhzh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhIsNull() {
            addCriterion("employee_khyh is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhIsNotNull() {
            addCriterion("employee_khyh is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhEqualTo(String value) {
            addCriterion("employee_khyh =", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhNotEqualTo(String value) {
            addCriterion("employee_khyh <>", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhGreaterThan(String value) {
            addCriterion("employee_khyh >", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhGreaterThanOrEqualTo(String value) {
            addCriterion("employee_khyh >=", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhLessThan(String value) {
            addCriterion("employee_khyh <", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhLessThanOrEqualTo(String value) {
            addCriterion("employee_khyh <=", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhLike(String value) {
            addCriterion("employee_khyh like", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhNotLike(String value) {
            addCriterion("employee_khyh not like", value, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhIn(List<String> values) {
            addCriterion("employee_khyh in", values, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhNotIn(List<String> values) {
            addCriterion("employee_khyh not in", values, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhBetween(String value1, String value2) {
            addCriterion("employee_khyh between", value1, value2, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyhNotBetween(String value1, String value2) {
            addCriterion("employee_khyh not between", value1, value2, "employeeKhyh");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeIsNull() {
            addCriterion("employee_ycxbtje is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeIsNotNull() {
            addCriterion("employee_ycxbtje is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeEqualTo(BigDecimal value) {
            addCriterion("employee_ycxbtje =", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeNotEqualTo(BigDecimal value) {
            addCriterion("employee_ycxbtje <>", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeGreaterThan(BigDecimal value) {
            addCriterion("employee_ycxbtje >", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_ycxbtje >=", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeLessThan(BigDecimal value) {
            addCriterion("employee_ycxbtje <", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_ycxbtje <=", value, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeIn(List<BigDecimal> values) {
            addCriterion("employee_ycxbtje in", values, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeNotIn(List<BigDecimal> values) {
            addCriterion("employee_ycxbtje not in", values, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_ycxbtje between", value1, value2, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxbtjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_ycxbtje not between", value1, value2, "employeeYcxbtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateIsNull() {
            addCriterion("employee_ycxdate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateIsNotNull() {
            addCriterion("employee_ycxdate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateEqualTo(Date value) {
            addCriterion("employee_ycxdate =", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateNotEqualTo(Date value) {
            addCriterion("employee_ycxdate <>", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateGreaterThan(Date value) {
            addCriterion("employee_ycxdate >", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_ycxdate >=", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateLessThan(Date value) {
            addCriterion("employee_ycxdate <", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateLessThanOrEqualTo(Date value) {
            addCriterion("employee_ycxdate <=", value, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateIn(List<Date> values) {
            addCriterion("employee_ycxdate in", values, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateNotIn(List<Date> values) {
            addCriterion("employee_ycxdate not in", values, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateBetween(Date value1, Date value2) {
            addCriterion("employee_ycxdate between", value1, value2, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeYcxdateNotBetween(Date value1, Date value2) {
            addCriterion("employee_ycxdate not between", value1, value2, "employeeYcxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeIsNull() {
            addCriterion("employee_xqcode is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeIsNotNull() {
            addCriterion("employee_xqcode is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeEqualTo(String value) {
            addCriterion("employee_xqcode =", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeNotEqualTo(String value) {
            addCriterion("employee_xqcode <>", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeGreaterThan(String value) {
            addCriterion("employee_xqcode >", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeGreaterThanOrEqualTo(String value) {
            addCriterion("employee_xqcode >=", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeLessThan(String value) {
            addCriterion("employee_xqcode <", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeLessThanOrEqualTo(String value) {
            addCriterion("employee_xqcode <=", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeLike(String value) {
            addCriterion("employee_xqcode like", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeNotLike(String value) {
            addCriterion("employee_xqcode not like", value, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeIn(List<String> values) {
            addCriterion("employee_xqcode in", values, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeNotIn(List<String> values) {
            addCriterion("employee_xqcode not in", values, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeBetween(String value1, String value2) {
            addCriterion("employee_xqcode between", value1, value2, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeXqcodeNotBetween(String value1, String value2) {
            addCriterion("employee_xqcode not between", value1, value2, "employeeXqcode");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeIsNull() {
            addCriterion("employee_zybtje is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeIsNotNull() {
            addCriterion("employee_zybtje is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeEqualTo(BigDecimal value) {
            addCriterion("employee_zybtje =", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeNotEqualTo(BigDecimal value) {
            addCriterion("employee_zybtje <>", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeGreaterThan(BigDecimal value) {
            addCriterion("employee_zybtje >", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zybtje >=", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeLessThan(BigDecimal value) {
            addCriterion("employee_zybtje <", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zybtje <=", value, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeIn(List<BigDecimal> values) {
            addCriterion("employee_zybtje in", values, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeNotIn(List<BigDecimal> values) {
            addCriterion("employee_zybtje not in", values, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zybtje between", value1, value2, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZybtjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zybtje not between", value1, value2, "employeeZybtje");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwIsNull() {
            addCriterion("employee_zw is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwIsNotNull() {
            addCriterion("employee_zw is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwEqualTo(String value) {
            addCriterion("employee_zw =", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwNotEqualTo(String value) {
            addCriterion("employee_zw <>", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwGreaterThan(String value) {
            addCriterion("employee_zw >", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zw >=", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwLessThan(String value) {
            addCriterion("employee_zw <", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwLessThanOrEqualTo(String value) {
            addCriterion("employee_zw <=", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwLike(String value) {
            addCriterion("employee_zw like", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwNotLike(String value) {
            addCriterion("employee_zw not like", value, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwIn(List<String> values) {
            addCriterion("employee_zw in", values, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwNotIn(List<String> values) {
            addCriterion("employee_zw not in", values, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwBetween(String value1, String value2) {
            addCriterion("employee_zw between", value1, value2, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZwNotBetween(String value1, String value2) {
            addCriterion("employee_zw not between", value1, value2, "employeeZw");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcIsNull() {
            addCriterion("employee_zc is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcIsNotNull() {
            addCriterion("employee_zc is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcEqualTo(String value) {
            addCriterion("employee_zc =", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcNotEqualTo(String value) {
            addCriterion("employee_zc <>", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcGreaterThan(String value) {
            addCriterion("employee_zc >", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zc >=", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcLessThan(String value) {
            addCriterion("employee_zc <", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcLessThanOrEqualTo(String value) {
            addCriterion("employee_zc <=", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcLike(String value) {
            addCriterion("employee_zc like", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcNotLike(String value) {
            addCriterion("employee_zc not like", value, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcIn(List<String> values) {
            addCriterion("employee_zc in", values, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcNotIn(List<String> values) {
            addCriterion("employee_zc not in", values, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcBetween(String value1, String value2) {
            addCriterion("employee_zc between", value1, value2, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcNotBetween(String value1, String value2) {
            addCriterion("employee_zc not between", value1, value2, "employeeZc");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoIsNull() {
            addCriterion("employee_yhmemo is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoIsNotNull() {
            addCriterion("employee_yhmemo is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoEqualTo(String value) {
            addCriterion("employee_yhmemo =", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoNotEqualTo(String value) {
            addCriterion("employee_yhmemo <>", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoGreaterThan(String value) {
            addCriterion("employee_yhmemo >", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoGreaterThanOrEqualTo(String value) {
            addCriterion("employee_yhmemo >=", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoLessThan(String value) {
            addCriterion("employee_yhmemo <", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoLessThanOrEqualTo(String value) {
            addCriterion("employee_yhmemo <=", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoLike(String value) {
            addCriterion("employee_yhmemo like", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoNotLike(String value) {
            addCriterion("employee_yhmemo not like", value, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoIn(List<String> values) {
            addCriterion("employee_yhmemo in", values, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoNotIn(List<String> values) {
            addCriterion("employee_yhmemo not in", values, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoBetween(String value1, String value2) {
            addCriterion("employee_yhmemo between", value1, value2, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemoNotBetween(String value1, String value2) {
            addCriterion("employee_yhmemo not between", value1, value2, "employeeYhmemo");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateIsNull() {
            addCriterion("employee_sxdate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateIsNotNull() {
            addCriterion("employee_sxdate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateEqualTo(Date value) {
            addCriterion("employee_sxdate =", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateNotEqualTo(Date value) {
            addCriterion("employee_sxdate <>", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateGreaterThan(Date value) {
            addCriterion("employee_sxdate >", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_sxdate >=", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateLessThan(Date value) {
            addCriterion("employee_sxdate <", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateLessThanOrEqualTo(Date value) {
            addCriterion("employee_sxdate <=", value, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateIn(List<Date> values) {
            addCriterion("employee_sxdate in", values, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateNotIn(List<Date> values) {
            addCriterion("employee_sxdate not in", values, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateBetween(Date value1, Date value2) {
            addCriterion("employee_sxdate between", value1, value2, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeSxdateNotBetween(Date value1, Date value2) {
            addCriterion("employee_sxdate not between", value1, value2, "employeeSxdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznIsNull() {
            addCriterion("employee_dszn is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznIsNotNull() {
            addCriterion("employee_dszn is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznEqualTo(String value) {
            addCriterion("employee_dszn =", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznNotEqualTo(String value) {
            addCriterion("employee_dszn <>", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznGreaterThan(String value) {
            addCriterion("employee_dszn >", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznGreaterThanOrEqualTo(String value) {
            addCriterion("employee_dszn >=", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznLessThan(String value) {
            addCriterion("employee_dszn <", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznLessThanOrEqualTo(String value) {
            addCriterion("employee_dszn <=", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznLike(String value) {
            addCriterion("employee_dszn like", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznNotLike(String value) {
            addCriterion("employee_dszn not like", value, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznIn(List<String> values) {
            addCriterion("employee_dszn in", values, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznNotIn(List<String> values) {
            addCriterion("employee_dszn not in", values, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznBetween(String value1, String value2) {
            addCriterion("employee_dszn between", value1, value2, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeDsznNotBetween(String value1, String value2) {
            addCriterion("employee_dszn not between", value1, value2, "employeeDszn");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlIsNull() {
            addCriterion("employee_zgxl is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlIsNotNull() {
            addCriterion("employee_zgxl is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlEqualTo(String value) {
            addCriterion("employee_zgxl =", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlNotEqualTo(String value) {
            addCriterion("employee_zgxl <>", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlGreaterThan(String value) {
            addCriterion("employee_zgxl >", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlGreaterThanOrEqualTo(String value) {
            addCriterion("employee_zgxl >=", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlLessThan(String value) {
            addCriterion("employee_zgxl <", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlLessThanOrEqualTo(String value) {
            addCriterion("employee_zgxl <=", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlLike(String value) {
            addCriterion("employee_zgxl like", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlNotLike(String value) {
            addCriterion("employee_zgxl not like", value, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlIn(List<String> values) {
            addCriterion("employee_zgxl in", values, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlNotIn(List<String> values) {
            addCriterion("employee_zgxl not in", values, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlBetween(String value1, String value2) {
            addCriterion("employee_zgxl between", value1, value2, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeZgxlNotBetween(String value1, String value2) {
            addCriterion("employee_zgxl not between", value1, value2, "employeeZgxl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldIsNull() {
            addCriterion("employee_jdglold is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldIsNotNull() {
            addCriterion("employee_jdglold is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldEqualTo(BigDecimal value) {
            addCriterion("employee_jdglold =", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldNotEqualTo(BigDecimal value) {
            addCriterion("employee_jdglold <>", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldGreaterThan(BigDecimal value) {
            addCriterion("employee_jdglold >", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdglold >=", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldLessThan(BigDecimal value) {
            addCriterion("employee_jdglold <", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdglold <=", value, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldIn(List<BigDecimal> values) {
            addCriterion("employee_jdglold in", values, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldNotIn(List<BigDecimal> values) {
            addCriterion("employee_jdglold not in", values, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdglold between", value1, value2, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdgloldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdglold not between", value1, value2, "employeeJdglold");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewIsNull() {
            addCriterion("employee_jdglnew is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewIsNotNull() {
            addCriterion("employee_jdglnew is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewEqualTo(BigDecimal value) {
            addCriterion("employee_jdglnew =", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewNotEqualTo(BigDecimal value) {
            addCriterion("employee_jdglnew <>", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewGreaterThan(BigDecimal value) {
            addCriterion("employee_jdglnew >", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdglnew >=", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewLessThan(BigDecimal value) {
            addCriterion("employee_jdglnew <", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdglnew <=", value, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewIn(List<BigDecimal> values) {
            addCriterion("employee_jdglnew in", values, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewNotIn(List<BigDecimal> values) {
            addCriterion("employee_jdglnew not in", values, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdglnew between", value1, value2, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglnewNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdglnew not between", value1, value2, "employeeJdglnew");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtIsNull() {
            addCriterion("employee_zyxhbt is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtIsNotNull() {
            addCriterion("employee_zyxhbt is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtEqualTo(BigDecimal value) {
            addCriterion("employee_zyxhbt =", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtNotEqualTo(BigDecimal value) {
            addCriterion("employee_zyxhbt <>", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtGreaterThan(BigDecimal value) {
            addCriterion("employee_zyxhbt >", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zyxhbt >=", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtLessThan(BigDecimal value) {
            addCriterion("employee_zyxhbt <", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zyxhbt <=", value, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtIn(List<BigDecimal> values) {
            addCriterion("employee_zyxhbt in", values, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtNotIn(List<BigDecimal> values) {
            addCriterion("employee_zyxhbt not in", values, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zyxhbt between", value1, value2, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeZyxhbtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zyxhbt not between", value1, value2, "employeeZyxhbt");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeIsNull() {
            addCriterion("employee_tfje is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeIsNotNull() {
            addCriterion("employee_tfje is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeEqualTo(BigDecimal value) {
            addCriterion("employee_tfje =", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeNotEqualTo(BigDecimal value) {
            addCriterion("employee_tfje <>", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeGreaterThan(BigDecimal value) {
            addCriterion("employee_tfje >", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_tfje >=", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeLessThan(BigDecimal value) {
            addCriterion("employee_tfje <", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_tfje <=", value, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeIn(List<BigDecimal> values) {
            addCriterion("employee_tfje in", values, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeNotIn(List<BigDecimal> values) {
            addCriterion("employee_tfje not in", values, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_tfje between", value1, value2, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeTfjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_tfje not between", value1, value2, "employeeTfje");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateIsNull() {
            addCriterion("employee_statedate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateIsNotNull() {
            addCriterion("employee_statedate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateEqualTo(Date value) {
            addCriterion("employee_statedate =", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateNotEqualTo(Date value) {
            addCriterion("employee_statedate <>", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateGreaterThan(Date value) {
            addCriterion("employee_statedate >", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_statedate >=", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateLessThan(Date value) {
            addCriterion("employee_statedate <", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateLessThanOrEqualTo(Date value) {
            addCriterion("employee_statedate <=", value, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateIn(List<Date> values) {
            addCriterion("employee_statedate in", values, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateNotIn(List<Date> values) {
            addCriterion("employee_statedate not in", values, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateBetween(Date value1, Date value2) {
            addCriterion("employee_statedate between", value1, value2, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStatedateNotBetween(Date value1, Date value2) {
            addCriterion("employee_statedate not between", value1, value2, "employeeStatedate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjIsNull() {
            addCriterion("employee_zfmj is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjIsNotNull() {
            addCriterion("employee_zfmj is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjEqualTo(BigDecimal value) {
            addCriterion("employee_zfmj =", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjNotEqualTo(BigDecimal value) {
            addCriterion("employee_zfmj <>", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjGreaterThan(BigDecimal value) {
            addCriterion("employee_zfmj >", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zfmj >=", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjLessThan(BigDecimal value) {
            addCriterion("employee_zfmj <", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_zfmj <=", value, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjIn(List<BigDecimal> values) {
            addCriterion("employee_zfmj in", values, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjNotIn(List<BigDecimal> values) {
            addCriterion("employee_zfmj not in", values, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zfmj between", value1, value2, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeZfmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_zfmj not between", value1, value2, "employeeZfmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaIsNull() {
            addCriterion("employee_uarea is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaIsNotNull() {
            addCriterion("employee_uarea is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaEqualTo(BigDecimal value) {
            addCriterion("employee_uarea =", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaNotEqualTo(BigDecimal value) {
            addCriterion("employee_uarea <>", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaGreaterThan(BigDecimal value) {
            addCriterion("employee_uarea >", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_uarea >=", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaLessThan(BigDecimal value) {
            addCriterion("employee_uarea <", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_uarea <=", value, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaIn(List<BigDecimal> values) {
            addCriterion("employee_uarea in", values, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaNotIn(List<BigDecimal> values) {
            addCriterion("employee_uarea not in", values, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_uarea between", value1, value2, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeUareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_uarea not between", value1, value2, "employeeUarea");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2IsNull() {
            addCriterion("employee_yhzh2 is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2IsNotNull() {
            addCriterion("employee_yhzh2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2EqualTo(String value) {
            addCriterion("employee_yhzh2 =", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2NotEqualTo(String value) {
            addCriterion("employee_yhzh2 <>", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2GreaterThan(String value) {
            addCriterion("employee_yhzh2 >", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2GreaterThanOrEqualTo(String value) {
            addCriterion("employee_yhzh2 >=", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2LessThan(String value) {
            addCriterion("employee_yhzh2 <", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2LessThanOrEqualTo(String value) {
            addCriterion("employee_yhzh2 <=", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2Like(String value) {
            addCriterion("employee_yhzh2 like", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2NotLike(String value) {
            addCriterion("employee_yhzh2 not like", value, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2In(List<String> values) {
            addCriterion("employee_yhzh2 in", values, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2NotIn(List<String> values) {
            addCriterion("employee_yhzh2 not in", values, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2Between(String value1, String value2) {
            addCriterion("employee_yhzh2 between", value1, value2, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhzh2NotBetween(String value1, String value2) {
            addCriterion("employee_yhzh2 not between", value1, value2, "employeeYhzh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2IsNull() {
            addCriterion("employee_khyh2 is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2IsNotNull() {
            addCriterion("employee_khyh2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2EqualTo(String value) {
            addCriterion("employee_khyh2 =", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2NotEqualTo(String value) {
            addCriterion("employee_khyh2 <>", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2GreaterThan(String value) {
            addCriterion("employee_khyh2 >", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2GreaterThanOrEqualTo(String value) {
            addCriterion("employee_khyh2 >=", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2LessThan(String value) {
            addCriterion("employee_khyh2 <", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2LessThanOrEqualTo(String value) {
            addCriterion("employee_khyh2 <=", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2Like(String value) {
            addCriterion("employee_khyh2 like", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2NotLike(String value) {
            addCriterion("employee_khyh2 not like", value, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2In(List<String> values) {
            addCriterion("employee_khyh2 in", values, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2NotIn(List<String> values) {
            addCriterion("employee_khyh2 not in", values, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2Between(String value1, String value2) {
            addCriterion("employee_khyh2 between", value1, value2, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeKhyh2NotBetween(String value1, String value2) {
            addCriterion("employee_khyh2 not between", value1, value2, "employeeKhyh2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2IsNull() {
            addCriterion("employee_yhmemo2 is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2IsNotNull() {
            addCriterion("employee_yhmemo2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2EqualTo(String value) {
            addCriterion("employee_yhmemo2 =", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2NotEqualTo(String value) {
            addCriterion("employee_yhmemo2 <>", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2GreaterThan(String value) {
            addCriterion("employee_yhmemo2 >", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2GreaterThanOrEqualTo(String value) {
            addCriterion("employee_yhmemo2 >=", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2LessThan(String value) {
            addCriterion("employee_yhmemo2 <", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2LessThanOrEqualTo(String value) {
            addCriterion("employee_yhmemo2 <=", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2Like(String value) {
            addCriterion("employee_yhmemo2 like", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2NotLike(String value) {
            addCriterion("employee_yhmemo2 not like", value, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2In(List<String> values) {
            addCriterion("employee_yhmemo2 in", values, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2NotIn(List<String> values) {
            addCriterion("employee_yhmemo2 not in", values, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2Between(String value1, String value2) {
            addCriterion("employee_yhmemo2 between", value1, value2, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeYhmemo2NotBetween(String value1, String value2) {
            addCriterion("employee_yhmemo2 not between", value1, value2, "employeeYhmemo2");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateIsNull() {
            addCriterion("employee_zcdate is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateIsNotNull() {
            addCriterion("employee_zcdate is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateEqualTo(Date value) {
            addCriterion("employee_zcdate =", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateNotEqualTo(Date value) {
            addCriterion("employee_zcdate <>", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateGreaterThan(Date value) {
            addCriterion("employee_zcdate >", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("employee_zcdate >=", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateLessThan(Date value) {
            addCriterion("employee_zcdate <", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateLessThanOrEqualTo(Date value) {
            addCriterion("employee_zcdate <=", value, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateIn(List<Date> values) {
            addCriterion("employee_zcdate in", values, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateNotIn(List<Date> values) {
            addCriterion("employee_zcdate not in", values, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateBetween(Date value1, Date value2) {
            addCriterion("employee_zcdate between", value1, value2, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeeZcdateNotBetween(Date value1, Date value2) {
            addCriterion("employee_zcdate not between", value1, value2, "employeeZcdate");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjIsNull() {
            addCriterion("employee_pofwmj is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjIsNotNull() {
            addCriterion("employee_pofwmj is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjEqualTo(BigDecimal value) {
            addCriterion("employee_pofwmj =", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjNotEqualTo(BigDecimal value) {
            addCriterion("employee_pofwmj <>", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjGreaterThan(BigDecimal value) {
            addCriterion("employee_pofwmj >", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_pofwmj >=", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjLessThan(BigDecimal value) {
            addCriterion("employee_pofwmj <", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_pofwmj <=", value, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjIn(List<BigDecimal> values) {
            addCriterion("employee_pofwmj in", values, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjNotIn(List<BigDecimal> values) {
            addCriterion("employee_pofwmj not in", values, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_pofwmj between", value1, value2, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeePofwmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_pofwmj not between", value1, value2, "employeePofwmj");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglIsNull() {
            addCriterion("employee_jdgl is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglIsNotNull() {
            addCriterion("employee_jdgl is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglEqualTo(BigDecimal value) {
            addCriterion("employee_jdgl =", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglNotEqualTo(BigDecimal value) {
            addCriterion("employee_jdgl <>", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglGreaterThan(BigDecimal value) {
            addCriterion("employee_jdgl >", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdgl >=", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglLessThan(BigDecimal value) {
            addCriterion("employee_jdgl <", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_jdgl <=", value, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglIn(List<BigDecimal> values) {
            addCriterion("employee_jdgl in", values, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglNotIn(List<BigDecimal> values) {
            addCriterion("employee_jdgl not in", values, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdgl between", value1, value2, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeJdglNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_jdgl not between", value1, value2, "employeeJdgl");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbIsNull() {
            addCriterion("employee_rylb is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbIsNotNull() {
            addCriterion("employee_rylb is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbEqualTo(String value) {
            addCriterion("employee_rylb =", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbNotEqualTo(String value) {
            addCriterion("employee_rylb <>", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbGreaterThan(String value) {
            addCriterion("employee_rylb >", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbGreaterThanOrEqualTo(String value) {
            addCriterion("employee_rylb >=", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbLessThan(String value) {
            addCriterion("employee_rylb <", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbLessThanOrEqualTo(String value) {
            addCriterion("employee_rylb <=", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbLike(String value) {
            addCriterion("employee_rylb like", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbNotLike(String value) {
            addCriterion("employee_rylb not like", value, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbIn(List<String> values) {
            addCriterion("employee_rylb in", values, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbNotIn(List<String> values) {
            addCriterion("employee_rylb not in", values, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbBetween(String value1, String value2) {
            addCriterion("employee_rylb between", value1, value2, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeRylbNotBetween(String value1, String value2) {
            addCriterion("employee_rylb not between", value1, value2, "employeeRylb");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholIsNull() {
            addCriterion("employee_telphol is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholIsNotNull() {
            addCriterion("employee_telphol is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholEqualTo(String value) {
            addCriterion("employee_telphol =", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholNotEqualTo(String value) {
            addCriterion("employee_telphol <>", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholGreaterThan(String value) {
            addCriterion("employee_telphol >", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholGreaterThanOrEqualTo(String value) {
            addCriterion("employee_telphol >=", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholLessThan(String value) {
            addCriterion("employee_telphol <", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholLessThanOrEqualTo(String value) {
            addCriterion("employee_telphol <=", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholLike(String value) {
            addCriterion("employee_telphol like", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholNotLike(String value) {
            addCriterion("employee_telphol not like", value, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholIn(List<String> values) {
            addCriterion("employee_telphol in", values, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholNotIn(List<String> values) {
            addCriterion("employee_telphol not in", values, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholBetween(String value1, String value2) {
            addCriterion("employee_telphol between", value1, value2, "employeeTelphol");
            return (Criteria) this;
        }

        public Criteria andEmployeeTelpholNotBetween(String value1, String value2) {
            addCriterion("employee_telphol not between", value1, value2, "employeeTelphol");
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